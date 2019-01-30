package de.seronet_projekt.xtend.ROS.generator

import com.google.inject.Inject
import org.xtend.smartsoft.generator.component.SmartComponentExtension
import org.xtend.smartsoft.generator.component.SmartComponent
import static extension de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionUtils.*
import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection
import rosInterfacesPool.RosPublisher
import rosInterfacesPool.RosSubscriber
import rosInterfacesPool.RosSrvClient
import rosInterfacesPool.RosSrvServer

class ROS_ComponentExtension {
	@Inject extension CopyrightHelpers
	@Inject extension SmartComponentExtension
	@Inject extension SmartComponent
	@Inject extension ROS_Callbacks
	
	def String getRosPortBaseClassHeaderFile(ExtendsComponent comp) '''«comp.name»RosPortBaseClass.hh'''
	def String getRosPortExtensionHeaderFilename(ExtendsComponent component) '''«component.name»RosPortExtension.hh'''
	def String getRosPortExtensionSourceFilename(ExtendsComponent component) '''«component.name»RosPortExtension.cc'''
	
	def compileRosPortBaseClassHeader(ExtendsComponent comp) 
	'''
	«getCopyright()»
	
	#ifndef ROS_PORT_BASE_CLASS_H_
	#define ROS_PORT_BASE_CLASS_H_
	
	#include <ros/ros.h>
	
	class «comp.name»RosPortBaseClass {
	public:
		«comp.name»RosPortBaseClass() { };
		virtual ~«comp.name»RosPortBaseClass() { }
		
		«FOR port: comp.ports»
		«port.rosType» «port.name»;
		«ENDFOR»
	};
	
	#endif // ROS_PORT_BASE_CLASS_H_
	'''
	
	def compileRosPortExtensionHeader(ExtendsComponent comp)
	'''
	«getCopyright()»
	
	#ifndef ROS_PORT_COMPONENT_EXTENSION_H_
	#define ROS_PORT_COMPONENT_EXTENSION_H_
	
	#include "«comp.rosPortBaseClassHeaderFile»"
	#include "«comp.rosPortCallbacksUserClassHeaderFile»"
	
	#include "«comp.component.componentExtensionHeaderFilename»"
	
	// include component's main class
	#include "«comp.component.compHeaderFilename»"
	
	class «comp.name»RosPortExtension : public «comp.name»Extension, public «comp.name»RosPortBaseClass
	{
	private:
		ros::NodeHandle *nh;
		
		«comp.name»RosPortCallbacks *callbacksPtr;
		
		virtual int extensionExecution() override;
	public:
		«comp.name»RosPortExtension();
		virtual ~«comp.name»RosPortExtension();
	
		virtual void loadParameters(const SmartACE::SmartIniParameter &parameter);
		virtual void initialize(«comp.name» *component, int argc, char* argv[]) override;
		virtual int onStartup() override;

		«FOR port: comp.ports»
		inline «port.rosType»* get«port.name.toFirstUpper»Ptr() {
			return &«port.name»;
		}
		«ENDFOR»

		virtual int onShutdown(const std::chrono::steady_clock::duration &timeoutTime=std::chrono::seconds(2)) override;
		virtual void destroy() override;
	};
	
	#endif /* ROS_PORT_COMPONENT_EXTENSION_H_ */
	'''
	
	
	def compileRosPortExtensionSource(ExtendsComponent component)
	'''
	«getCopyright()»
	
	#include "«component.rosPortExtensionHeaderFilename»"
	
	// statically create a global PlainOpcUa«component.name»Extension instance
	static «component.name»RosPortExtension ros_port_extension;
	
	«component.name»RosPortExtension::«component.name»RosPortExtension()
	:	«component.name»Extension("«component.name»RosPortExtension")
	{
		nh = 0;
		callbacksPtr = 0;
	}
	
	«component.name»RosPortExtension::~«component.name»RosPortExtension()
	{  }
	
	void «component.name»RosPortExtension::loadParameters(const SmartACE::SmartIniParameter &parameter)
	{  }
	
	void «component.name»RosPortExtension::initialize(«component.name» *component, int argc, char* argv[])
	{
		ros::init(argc, argv, "«component.name»", ros::init_options::NoSigintHandler);
		nh = new ros::NodeHandle();
		
		callbacksPtr = new «component.name»RosPortCallbacks();
		
		component->rosPorts = this;
		
		«FOR port: component.ports»
		«port.compilePortCreation»
		«ENDFOR»
	}
	
	int «component.name»RosPortExtension::onStartup()
	{
		return startExtensionThread();
	}
	
	int «component.name»RosPortExtension::extensionExecution()
	{
		ros::spin();
		return 0;
	}
	
	int «component.name»RosPortExtension::onShutdown(const std::chrono::steady_clock::duration &timeoutTime)
	{
		ros::shutdown();
		return stopExtensionThread(timeoutTime);
	}
	
	void «component.name»RosPortExtension::destroy()
	{
		delete nh;
		delete callbacksPtr;
	}
	'''
	
	def getRosType(RosPortSelection sel) {
		val port = sel.port
		switch (port) {
			RosPublisher: '''ros::Publisher'''
			RosSubscriber: '''ros::Subscriber'''
			RosSrvClient: '''ros::ServiceClient'''
			RosSrvServer: '''ros::ServiceServer'''
		}
	}
	
	def compilePortCreation(RosPortSelection sel) {
		val port = sel.port
		switch (port) {
			RosPublisher: '''«port.name» = nh->advertise<«sel.packageString»::«sel.messageString»>("«port.topicName»", 10);'''
			RosSubscriber: '''«port.name» = nh->subscribe("«port.topicName»", 10, &«(sel.eContainer as ExtendsComponent).name»RosPortCallbacks::«sel.name»_cb, callbacksPtr);'''
			RosSrvClient: '''«port.name» = nh->serviceClient<«sel.packageString»::«sel.messageString»>("«port.srvName»");'''
			RosSrvServer: '''«port.name» = nh->advertiseService("«port.srvName»", &«(sel.eContainer as ExtendsComponent).name»RosPortCallbacks::«port.name»_cb, callbacksPtr);'''
		}
	}
}
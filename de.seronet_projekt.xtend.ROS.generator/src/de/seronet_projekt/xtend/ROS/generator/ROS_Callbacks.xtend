package de.seronet_projekt.xtend.ROS.generator

import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent
import com.google.inject.Inject
import static extension de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionUtils.*
import rosInterfacesPool.RosSubscriber
import rosInterfacesPool.RosSrvServer
import org.xtend.smartsoft.generator.component.SmartComponent

class ROS_Callbacks {
	@Inject extension CopyrightHelpers;
	@Inject extension SmartComponent;
	
	def getRosPortCallbacksInterfaceHeaderFile(ExtendsComponent comp) {
		comp.name+"RosPortCallbacksInterface.hh"
	}
	
	def getRosPortCallbacksUserClassHeaderFile(ExtendsComponent comp) {
		comp.name+"RosPortCallbacks.hh"
	}
	def getRosPortCallbacksUserClassSourceFile(ExtendsComponent comp) {
		comp.name+"RosPortCallbacks.cc"
	}
	
	def compileRosPortCallbacksInterfaceHeader(ExtendsComponent comp) 
	'''
	«getCopyright()»
	
	#ifndef ROS_PORT_CALLBACKS_INTERFACE_H_
	#define ROS_PORT_CALLBACKS_INTERFACE_H_
	
	#include <ros/ros.h>
	
	«FOR port: comp.ports»
	#include <«port.packageString»/«port.messageString».h>
	«ENDFOR»
	
	class «comp.name»RosPortCallbacksInterface {
	public:
		«comp.name»RosPortCallbacksInterface() { };
		virtual ~«comp.name»RosPortCallbacksInterface() { }
		
		«FOR sub: comp.ports.filter[it.port instanceof RosSubscriber]»
			virtual void «sub.name»_cb (const «sub.packageString»::«sub.messageString»::ConstPtr &msg) = 0;
			
		«ENDFOR»
		«FOR srvClient: comp.ports.filter[it.port instanceof RosSrvServer]»
			virtual bool «srvClient.name»_cb («srvClient.packageString»::«srvClient.messageString»::Request &req, «srvClient.packageString»::«srvClient.messageString»::Response &res) = 0;
			
		«ENDFOR»
	};
	
	#endif // ROS_PORT_CALLBACKS_INTERFACE_H_
	'''
	
	def compileRosPortCallbacksUserClassHeader(ExtendsComponent comp) 
	'''
	«getCopyright()»
	
	#ifndef ROS_PORT_CALLBACKS_H_
	#define ROS_PORT_CALLBACKS_H_
	
	#include "«comp.rosPortCallbacksInterfaceHeaderFile»"
	
	class «comp.name»RosPortCallbacks : public «comp.name»RosPortCallbacksInterface {
	public:
		«comp.name»RosPortCallbacks();
		virtual ~«comp.name»RosPortCallbacks();
		
		«FOR sub: comp.ports.filter[it.port instanceof RosSubscriber]»
			virtual void «sub.name»_cb (const «sub.packageString»::«sub.messageString»::ConstPtr &msg) override;
			
		«ENDFOR»
		«FOR srvClient: comp.ports.filter[it.port instanceof RosSrvServer]»
			virtual bool «srvClient.name»_cb («srvClient.packageString»::«srvClient.messageString»::Request &req, «srvClient.packageString»::«srvClient.messageString»::Response &res) override;
			
		«ENDFOR»
	};
	
	#endif // ROS_PORT_CALLBACKS_H_
	'''
	
	def compileRosPortCallbacksUserClassSource(ExtendsComponent comp) 
	'''
	«getCopyright()»
	
	#include "«comp.rosPortCallbacksUserClassHeaderFile»"
	
	// include component's main class
	#include "«comp.component.compHeaderFilename»"
	
	«comp.name»RosPortCallbacks::«comp.name»RosPortCallbacks() {  }
	
	«comp.name»RosPortCallbacks::~«comp.name»RosPortCallbacks() {  }
	
	«FOR sub: comp.ports.filter[it.port instanceof RosSubscriber]»
		void «comp.name»RosPortCallbacks::«sub.name»_cb (const «sub.packageString»::«sub.messageString»::ConstPtr &msg)
		{
			//FIXME: implement this upcall method, use "COMP->" to access the component's class members
		}
		
	«ENDFOR»
	
	«FOR srvClient: comp.ports.filter[it.port instanceof RosSrvServer]»
		bool «comp.name»RosPortCallbacks::«srvClient.name»_cb («srvClient.packageString»::«srvClient.messageString»::Request &req, «srvClient.packageString»::«srvClient.messageString»::Response &res)
		{
			//FIXME: implement this method, use "COMP->" to access the component's class members
			return true;
		}
		
	«ENDFOR»
	'''
}
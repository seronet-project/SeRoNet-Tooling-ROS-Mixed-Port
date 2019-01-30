package de.seronet_projekt.xtend.ROS.generator

import com.google.inject.Inject
import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent
import static extension de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionUtils.*
import rosInterfacesPool.RosSrvClient
import rosInterfacesPool.RosPublisher
import rosInterfacesPool.RosSubscriber
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection
import rosInterfacesPool.RosSrvServer

class ROS_main {
	@Inject extension CopyrightHelpers;
	
	def getRosMainFilename(ExtendsComponent comp) { comp.component.name+".cpp" }
	
	def compileRosMain(ExtendsComponent comp) 
	'''
		«copyright»
		
		#include <ros/ros.h>
		«FOR port: comp.ports»
		#include <«port.packageString»/«port.messageString».h>
		«ENDFOR»
		
		«FOR srvClient: comp.ports.filter[it.port instanceof RosSrvServer]»
			bool  «srvClient.name»_cb («srvClient.packageString»::«srvClient.messageString»::Request &req, «srvClient.packageString»::«srvClient.messageString»::Response &res){
			  return true;
			}
			
		«ENDFOR»
		
		«FOR pub: comp.ports.filter[it.port instanceof RosSubscriber]»
			void  «pub.name»_cb (const «pub.packageString»::«pub.messageString»::ConstPtr &msg) {
				
			}
			
		«ENDFOR»
		
		int main(int argc, char **argv)
		{
			ros::init(argc, argv, "ros_gateway");
			ros::NodeHandle n;
			
			«FOR port: comp.ports»
				«port.compilePortSelection»
			«ENDFOR»
			
			ros::spin();
		
			return 0;
		}
	'''
	
	def compilePortSelection(RosPortSelection sel) {
		val port = sel.port
		switch (port) {
			RosPublisher: '''ros::Publisher «port.name»_pub = n.advertise<«sel.packageString»::«sel.messageString»>("«port.topicName»", 10);'''
			RosSubscriber: '''ros::Subscriber «port.name»_sub = n.subscribe("«port.topicName»", 10, «sel.name»_cb);'''
			RosSrvClient: '''ros::ServiceClient «port.name» = n.serviceClient<«sel.packageString»::«sel.messageString»>("«port.srvName»");'''
			RosSrvServer: '''ros::ServiceServer «port.name» = n.advertiseService("«port.srvName»", «port.name»_cb);'''
		}
	}
}
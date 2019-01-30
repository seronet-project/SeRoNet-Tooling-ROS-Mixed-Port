package de.seronet_projekt.xtend.ROS.generator

import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent
import static extension de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionUtils.*

class ROS_package {
	def compileRosPackage(ExtendsComponent comp) 
	'''
	<?xml version="1.0"?>
	<package format="2">
	  <name>ros_«comp.name.toLowerCase»</name>
	  <version>0.0.0</version>
	  <description>The ros_«comp.name.toLowerCase» package</description>
	
	  <!-- One maintainer tag required, multiple allowed, one person per tag -->
	  <!-- Example:  -->
	  <!-- <maintainer email="jane.doe@example.com">Jane Doe</maintainer> -->
	  <maintainer email="alexej@todo.todo">alexej</maintainer>
	
	
	  <!-- One license tag required, multiple allowed, one license per tag -->
	  <!-- Commonly used license strings: -->
	  <!--   BSD, MIT, Boost Software License, GPLv2, GPLv3, LGPLv2.1, LGPLv3 -->
	  <license>BSD3</license>
	
	
	  <!-- Url tags are optional, but multiple are allowed, one per tag -->
	  <!-- Optional attribute type can be: website, bugtracker, or repository -->
	  <!-- Example: -->
	  <!-- <url type="website">http://wiki.ros.org/system_test</url> -->
	
	
	  <!-- Author tags are optional, multiple are allowed, one per tag -->
	  <!-- Authors do not have to be maintainers, but could be -->
	  <!-- Example: -->
	  <!-- <author email="jane.doe@example.com">Jane Doe</author> -->
	
	
	  <!-- The *depend tags are used to specify dependencies -->
	  <!-- Dependencies can be catkin packages or system dependencies -->
	  <!-- Examples: -->
	  <!-- Use depend as a shortcut for packages that are both build and exec dependencies -->
	  <!--   <depend>roscpp</depend> -->
	  <!--   Note that this is equivalent to the following: -->
	  <!--   <build_depend>roscpp</build_depend> -->
	  <!--   <exec_depend>roscpp</exec_depend> -->
	  <!-- Use build_depend for packages you need at compile time: -->
	  <!--   <build_depend>message_generation</build_depend> -->
	  <!-- Use build_export_depend for packages you need in order to build against this package: -->
	  <!--   <build_export_depend>message_generation</build_export_depend> -->
	  <!-- Use buildtool_depend for build tool packages: -->
	  <!--   <buildtool_depend>catkin</buildtool_depend> -->
	  <!-- Use exec_depend for packages you need at runtime: -->
	  <!--   <exec_depend>message_runtime</exec_depend> -->
	  <!-- Use test_depend for packages you need only for testing: -->
	  <!--   <test_depend>gtest</test_depend> -->
	  <!-- Use doc_depend for packages you need only for building documentation: -->
	  <!--   <doc_depend>doxygen</doc_depend> -->
	  <buildtool_depend>catkin</buildtool_depend>
	  <build_depend>roscpp</build_depend>
	  <build_depend>rospy</build_depend>
	  «FOR pack: comp.allPackageStrings»
	  <build_depend>«pack»</build_depend>
	  «ENDFOR»
	  <build_export_depend>roscpp</build_export_depend>
	  <build_export_depend>rospy</build_export_depend>
	  «FOR pack: comp.allPackageStrings»
	  <build_export_depend>«pack»</build_export_depend>
	  «ENDFOR»
	  <exec_depend>roscpp</exec_depend>
	  <exec_depend>rospy</exec_depend>
	  «FOR pack: comp.allPackageStrings»
	  <exec_depend>«pack»</exec_depend>
  	  «ENDFOR»
	
	
	  <!-- The export tag contains other, unspecified, tags -->
	  <export>
	    <!-- Other tools can request additional information be placed here -->
	
	  </export>
	</package>
	'''
}
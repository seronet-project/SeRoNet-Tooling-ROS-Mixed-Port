package de.seronet_projekt.xtend.ROS.generator

import com.google.inject.Inject
import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent
import static extension de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionUtils.*


class ROS_CMake {
	@Inject extension CopyrightHelpers;
	@Inject extension ROS_ComponentExtension;
	@Inject extension ROS_Callbacks;
	
	def compileRosCMake(ExtendsComponent comp) 
	'''
	«copyrightHash»
	# %Tag(FULLTEXT)%
	cmake_minimum_required(VERSION 2.8.3)
	project(ros_«comp.name.toLowerCase»)
	
	## Find catkin and any catkin packages
	find_package(catkin REQUIRED COMPONENTS roscpp rospy «FOR pack: comp.allPackageStrings» «pack»«ENDFOR» genmsg)
	
	## Declare ROS messages and services
	#add_message_files(FILES Num.msg)
	#add_service_files(FILES AddTwoInts.srv)
	
	## Generate added messages and services
	#generate_messages(DEPENDENCIES std_msgs)
	
	## Declare a catkin package
	catkin_package()
	
	## Build talker and listener
	# include_directories(include ${catkin_INCLUDE_DIRS})
	LIST(APPEND LOCAL_INCLUDES ${catkin_INCLUDE_DIRS})
	LIST(APPEND LOCAL_INCLUDES ${CMAKE_CURRENT_SOURCE_DIR})
	LIST(APPEND LOCAL_INCLUDES ${CMAKE_CURRENT_SOURCE_DIR}/../src)
	set(ROS_INCLUDES ${LOCAL_INCLUDES} PARENT_SCOPE)
	
	LIST(APPEND SRCS ${CMAKE_CURRENT_SOURCE_DIR}/«comp.rosPortExtensionSourceFilename»)
	LIST(APPEND SRCS ${CMAKE_CURRENT_SOURCE_DIR}/../src/«comp.rosPortCallbacksUserClassSourceFile»)
	
	set(ROS_SRCS ${SRCS} PARENT_SCOPE)
	
	set(ROS_LIBS ${catkin_LIBRARIES} PARENT_SCOPE)
	
	#ADD_LIBRARY(ROS«comp.name» STATIC ${CMAKE_CURRENT_SOURCE_DIR}/«comp.rosPortExtensionSourceFilename»)
	#target_link_libraries(ROS«comp.name» ${catkin_LIBRARIES})
	#set_property(TARGET ROS«comp.name» PROPERTY CXX_STANDARD 11)
	#target_include_directories(ROS«comp.name» PUBLIC
	#  $<BUILD_INTERFACE:${CMAKE_CURRENT_SOURCE_DIR}>
	#)
	#add_dependencies(system_test beginner_tutorials_generate_messages_cpp)
	
	# %EndTag(FULLTEXT)%
	'''
}
package de.seronet_projekt.xtend.ROS.generator.ext

import org.xtend.smartsoft.generator.component.ComponentGeneratorExtension
import org.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path

class ROSComponentGeneratorExtensionImpl implements ComponentGeneratorExtension {
	override getExtensionName(ComponentDefinition component) {
		component.name+"ROSExtension"
	}
	
	def Boolean hasRosPortSelection(ComponentDefinition component) {
		val compModelUri = component.eResource.URI.trimFileExtension
		val rosPortSelectionModelURI = compModelUri.appendFileExtension("componentRosPorts")
		var String pathString = "";
		for(var i=1; i<rosPortSelectionModelURI.segmentCount; i=i+1) {
			pathString = pathString + "/" + rosPortSelectionModelURI.segment(i)
		}
		val root = ResourcesPlugin.getWorkspace().root;
		val path = new Path(pathString);
		// check if the model file exists
		return root.exists(path)
	}
	
	override getHeaderIncludes(ComponentDefinition component)
	'''
	«IF component.hasRosPortSelection»
	#include "«component.name»RosPortBaseClass.hh"
	«ENDIF»
	'''
	
	override getClassMemberDefinition(ComponentDefinition component) 
	'''
	«IF component.hasRosPortSelection»
	«component.name»RosPortBaseClass *rosPorts;
	«ENDIF»
	'''
	
	override getClassMemberConstruction(ComponentDefinition component)
	'''
	«IF component.hasRosPortSelection»
	rosPorts = 0;
	«ENDIF»
	'''
	
	override getCMakeIncludes(ComponentDefinition component) 
	'''
		GET_FILENAME_COMPONENT(ROS_DIR "${PROJECT_SOURCE_DIR}/../ROS" REALPATH)
		IF(EXISTS ${ROS_DIR})
		ADD_SUBDIRECTORY(${ROS_DIR}/src-gen/ ${PROJECT_BINARY_DIR}/ROS)
		LIST(APPEND FURTHER_SRCS ${ROS_SRCS})
		INCLUDE_DIRECTORIES(${ROS_INCLUDES})
		ENDIF(EXISTS ${ROS_DIR})
	'''
	
	override getCMakeTargetConfiguration(ComponentDefinition component) 
	'''
		IF(EXISTS ${ROS_DIR})
		TARGET_LINK_LIBRARIES(${PROJECT_NAME} ${ROS_LIBS})
		ENDIF(EXISTS ${ROS_DIR})
	'''
	
}
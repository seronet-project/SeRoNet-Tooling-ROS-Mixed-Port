package de.seronet_projekt.xtend.ROS.generator.ext

import org.xtend.smartsoft.generator.component.ActivityGeneratorExtension
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.seronetExtension.MixedPortROSLink
import com.google.inject.Inject
import de.seronet_projekt.xtend.ROS.generator.MixedPortROSGenHelpers
import org.ecore.component.componentDefinition.ComponentDefinition
import rosInterfacesPool.RosSubscriber

class ROSActivityGeneratorExtensionImpl implements ActivityGeneratorExtension {
	@Inject extension MixedPortROSGenHelpers;
	
	override getExtensionName() {
		"RosActivityGeneratorExtension"
	}
	
	override getHeaderIncludes(Activity activity) 
	'''
		«FOR link: activity.links.filter(MixedPortROSLink)»
		#include <«link.mixedportros.packageString»/«link.mixedportros.messageString».h>
		«ENDFOR»
	'''
	
	override getClassMemberPublicDefinition(Activity activity) 
	'''
	«FOR sub: activity.links.filter(MixedPortROSLink).map[mixedportros].filter[it.port instanceof RosSubscriber]»
	void «sub.name»_cb (const «sub.packageString»::«sub.messageString»::ConstPtr &msg);
	«ENDFOR»
	'''
	
	override getSourceImplementation(Activity activity) 
	'''
	«FOR sub: activity.links.filter(MixedPortROSLink).map[mixedportros].filter[it.port instanceof RosSubscriber]»
	void «activity.name.toFirstUpper»Core::«sub.name»_cb (const «sub.packageString»::«sub.messageString»::ConstPtr &msg) {
		// implement this method
	}
	«ENDFOR»
	'''
	
	def getComponent(Activity activity) {
		return (activity.eContainer as ComponentDefinition)
	}
}
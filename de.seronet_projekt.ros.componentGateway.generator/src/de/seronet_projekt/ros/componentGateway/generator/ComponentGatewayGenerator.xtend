package de.seronet_projekt.ros.componentGateway.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import componentInterface.ComponentInterface
import org.eclipse.xtext.generator.IOutputConfigurationProvider
import org.eclipse.xtext.generator.OutputConfiguration
import java.util.Set

class CustomOutputProvider implements IOutputConfigurationProvider {
	public final static String DEFAULT_OUTPUT = "DEFAULT_OUTPUT"
	

	override Set<OutputConfiguration> getOutputConfigurations() {
		var OutputConfiguration default_config = new OutputConfiguration(DEFAULT_OUTPUT)
		default_config.setDescription("DEFAULT_OUTPUT");
		default_config.setOutputDirectory("./src-gen/");
		default_config.setOverrideExistingResources(true);
		default_config.setCreateOutputDirectory(true);
		default_config.setCleanUpDerivedResources(true);
		default_config.setSetDerivedProperty(true);
		return newHashSet(default_config)
	}
}

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ComponentGatewayGenerator extends AbstractGenerator {

 	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (componentinterface : resource.allContents.toIterable.filter(ComponentInterface)){
				fsa.generateFile(componentinterface.name+".gateway.rosinterfacespool",CustomOutputProvider::DEFAULT_OUTPUT,componentinterface.compile)
		}
	}
		
	def compile (ComponentInterface componentinterface)
	'''
RosInterfacesPool {
	«FOR pub:componentinterface.rospublisher»
	RosSubscriber «checkname(pub.name)» { topicName "«pub.name»" type "«pub.publisher.message.package.name».«pub.publisher.message.name»" }
	«ENDFOR»
	«FOR sub:componentinterface.rossubscriber»
	RosPublisher «checkname(sub.name)» { topicName "«sub.name»" type "«sub.subscriber.message.package.name».«sub.subscriber.message.name»" }
	«ENDFOR»
	«FOR srvserver:componentinterface.rosserviceserver»
	RosSrvClient «checkname(srvserver.name)» { srvName "«srvserver.name»" type "«srvserver.srvserver.service.package.name».«srvserver.srvserver.service.name»" }
	«ENDFOR»
	«FOR srvclient:componentinterface.rosserviceclient»
	RosSrvServer «checkname(srvclient.name)» { srvName "«srvclient.name»" type "«srvclient.srvclient.service.name».«srvclient.srvclient.name»" }
	«ENDFOR»
}
	'''


def String checkname(String name){
	if (name.contains("/"))
		return name.replace("/","_")
	else
		return name
}	
}
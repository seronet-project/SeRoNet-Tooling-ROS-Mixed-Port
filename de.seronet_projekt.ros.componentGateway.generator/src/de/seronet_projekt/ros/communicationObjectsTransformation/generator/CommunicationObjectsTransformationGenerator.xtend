package de.seronet_projekt.ros.communicationObjectsTransformation.generator

import de.seronet_projekt.ros.componentGateway.generator.CustomOutputProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import primitives.impl.ArrayTopicSpecRefImpl
import primitives.impl.TopicSpecRefImpl
import primitives.impl.boolArrayImpl
import primitives.impl.boolImpl
import primitives.impl.float32ArrayImpl
import primitives.impl.float32Impl
import primitives.impl.float64ArrayImpl
import primitives.impl.float64Impl
import primitives.impl.int16ArrayImpl
import primitives.impl.int16Impl
import primitives.impl.int32ArrayImpl
import primitives.impl.int32Impl
import primitives.impl.int64ArrayImpl
import primitives.impl.int64Impl
import primitives.impl.int8ArrayImpl
import primitives.impl.int8Impl
import primitives.impl.stringArrayImpl
import primitives.impl.stringImpl
import primitives.impl.uint16ArrayImpl
import primitives.impl.uint16Impl
import primitives.impl.uint32ArrayImpl
import primitives.impl.uint32Impl
import primitives.impl.uint64ArrayImpl
import primitives.impl.uint64Impl
import primitives.impl.uint8ArrayImpl
import primitives.impl.uint8Impl
import ros.PackageSet
import ros.impl.ActionSpecImpl
import ros.impl.ServiceSpecImpl
import ros.impl.TopicSpecImpl

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CommunicationObjectsTransformationGenerator extends AbstractGenerator {
 	String resourcepath
 	String repositoryName
 	//String pkg_name
	//String pkg_crossref
	String name_crossref
	String data_name
	Class<? extends EObject> rostypeClass


 	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
 		//if (resource.allContents.toString.contains("spec")){ 			
 			for (package : resource.allContents.toIterable.filter(PackageSet)){
 				resourcepath = resource.URI.toString()
 				repositoryName = resourcepath.substring(resourcepath.lastIndexOf("/"),resourcepath.lastIndexOf(".ros"))
				fsa.generateFile(repositoryName+".types",CustomOutputProvider::DEFAULT_OUTPUT,package.compile_communication_objects)
			}
 		}//}

		
	def compile_communication_objects (PackageSet rosPackages)
	'''
«FOR rosPackage:rosPackages.package»
CommObjectsRepository «rosPackage.name» version 1.0.0 {
	«FOR Spec:rosPackage.spec»
		«IF Spec.class==TopicSpecImpl»
		CommObject «Spec.name» {
			«FOR message:Spec.eContents()»
				«FOR msg_part:message.eContents»
					«IF ((getData(msg_part.toString())).length > 0) && (mapROStoSR2(msg_part.eContents().get(0)).length > 0)»
					«getData(msg_part.toString())» : «mapROStoSR2(msg_part.eContents().get(0))»
					«ENDIF»
				«ENDFOR»
			«ENDFOR»
		}
		«ENDIF»
		«IF Spec.class==ServiceSpecImpl»
		«ENDIF»
		«IF Spec.class==ActionSpecImpl»
		«ENDIF»
«ENDFOR»
}
«ENDFOR»
'''
	def String getData(String msg_part){
		//TODO: implement this case as Enumeration for SeRoNet
		data_name = msg_part.substring(msg_part.toString().indexOf("Data:")+6,msg_part.toString().length-1)
		if (!data_name.contains("=")){
			return data_name
		} else{
			return ""
		}
	}
	def String mapROStoSR2 (EObject rostype){
		rostypeClass = rostype.class
		if (rostypeClass == uint8Impl){
			return "UInt8"
		}
		if (rostypeClass == uint16Impl){
			return "UInt16"
		}
		if (rostypeClass == uint64Impl){
			return "UInt64"
		}
		if (rostypeClass == int8Impl){
			return "Int8"
		}
		if (rostypeClass == int16Impl){
			return "Int16"
		}
		if (rostypeClass == uint32Impl){
			return "UInt32"
		}
		if (rostypeClass == int32Impl){
			return "Int32"
		}
		if (rostypeClass == int64Impl){
			return "Int64"
		}
		if (rostypeClass == float32Impl){
			return "Float"
		}
		if (rostypeClass == float64Impl){
			return "Double"
		}
		if (rostypeClass == stringImpl){
			return "String"
		}
		if (rostypeClass == boolImpl){
			return "Boolean"
		}
		if (rostypeClass == uint8ArrayImpl){
			return "UInt8[*]"
		}
		if (rostypeClass == uint16ArrayImpl){
			return "UInt16[*]"
		}
		if (rostypeClass == uint64ArrayImpl){
			return "UInt64[*]"
		}
		if (rostypeClass == int8ArrayImpl){
			return "Int8[*]"
		}
		if (rostypeClass == int16ArrayImpl){
			return "Int16[*]"
		}
		if (rostypeClass == uint32ArrayImpl){
			return "UInt32[*]"
		}
		if (rostypeClass == int32ArrayImpl){
			return "Int32[*]"
		}
		if (rostypeClass == int64ArrayImpl){
			return "Int64[*]"
		}
		if (rostypeClass == float32ArrayImpl){
			return "Float[*]"
		}
		if (rostypeClass == float64ArrayImpl){
			return "Double[*]"
		}
		if (rostypeClass == stringArrayImpl){
			return "String[*]"
		}
		if (rostypeClass == boolArrayImpl){
			return "Boolean[*]"
		}
		if (rostypeClass == TopicSpecRefImpl){
			//pkg_crossref = rostype.eCrossReferences.get(0).eContainer.toString()
			name_crossref = rostype.eCrossReferences.toString()
			//if ( pkg_name == pkg_crossref ){
			return name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))
			//} else{
			//	return pkg_crossref.substring(pkg_crossref.indexOf("name:")+6,pkg_crossref.indexOf(")]"))+"/"+name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))
			//}
		}
		if (rostypeClass == ArrayTopicSpecRefImpl){
			name_crossref = rostype.eCrossReferences.toString()
			return name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))+"[*]"
		} else {
			return ""
		}

	}
}

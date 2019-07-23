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
import ros.Package
import ros.PackageSet
import ros.impl.ActionSpecImpl
import ros.impl.ServiceSpecImpl
import ros.impl.TopicSpecImpl
import java.util.Arrays

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CommunicationObjectsTransformationGenerator extends AbstractGenerator {
 	String resourcepath
 	String repositoryName
 	//String pkg_name
	String pkg_crossref
	String name_crossref
	String data_name
	Class<? extends EObject> rostypeClass



 	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
 		//if (resource.allContents.toString.contains("spec")){ 			
 			for (packages : resource.allContents.toIterable.filter(PackageSet)){
 				resourcepath = resource.URI.toString()
 				repositoryName = resourcepath.substring(resourcepath.lastIndexOf("/")+1,resourcepath.lastIndexOf(".ros"))
 				for (package : packages.package){
					fsa.generateFile(package.name+".types",CustomOutputProvider::DEFAULT_OUTPUT,package.compile_communication_objects_to_type)
				}
				fsa.generateFile(repositoryName+".services",CustomOutputProvider::DEFAULT_OUTPUT,compile_communication_objects_to_services(packages,repositoryName))
				
			}
 		}//}

		
	def compile_communication_objects_to_type (Package rosPackage)
	'''
CommObjectsRepository «rosPackage.name» version 1.0.0 {
	«FOR Spec:rosPackage.spec»
	«IF !Arrays.asList("UInt8","UInt16","UInt64","Int8","Int16","UInt32","Int32","Int64","Float","Double","String","Boolean").contains(Spec.name)»
	«IF Spec.class==TopicSpecImpl && Spec.eContents.length >0»
	CommObject «Spec.name» {
		«FOR message:Spec.eContents()»
		«FOR msg_part:message.eContents»
		«IF ((getData(msg_part.toString())).length > 0) && (mapROStoSR2(msg_part.eContents().get(0), rosPackage.name).length > 0)»
		«getData(msg_part.toString())» : «mapROStoSR2(msg_part.eContents().get(0), rosPackage.name)»
	«ENDIF»
	«ENDFOR»
	«ENDFOR»
	}
	
	«ENDIF»
	«IF Spec.class==ServiceSpecImpl && Spec.eContents.length >0»
	CommObject «Spec.name»Request {
		«FOR msg_part:Spec.eContents.get(0).eContents»
		«IF ((getData(msg_part.toString())).length > 0) && (mapROStoSR2(msg_part.eContents().get(0), rosPackage.name).length > 0 )»
		«getData(msg_part.toString())» : «mapROStoSR2(msg_part.eContents().get(0), rosPackage.name)»
	«ENDIF»
	«ENDFOR»
	}
	CommObject «Spec.name»Response {
		«FOR msg_part:Spec.eContents.get(1).eContents»
		«IF ((getData(msg_part.toString())).length > 0) && (mapROStoSR2(msg_part.eContents().get(0), rosPackage.name).length > 0 )»
		«getData(msg_part.toString())» : «mapROStoSR2(msg_part.eContents().get(0), rosPackage.name)»
	«ENDIF»
	«ENDFOR»
	}
	
	«ENDIF»
	«IF Spec.class==ActionSpecImpl»
	«ENDIF»
	«ENDIF»
	«ENDFOR»
}
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
	def String mapROStoSR2 (EObject rostype, String pkg_name){
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
		if (rostypeClass == TopicSpecRefImpl ){
			pkg_crossref = rostype.eCrossReferences.get(0).eContainer.toString()
			name_crossref = rostype.eCrossReferences.toString()
			if (pkg_name == pkg_crossref.substring(pkg_crossref.indexOf("name:")+6,pkg_crossref.indexOf(")"))){
				return name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))
			} else{
				return pkg_crossref.substring(pkg_crossref.indexOf("name:")+6,pkg_crossref.indexOf(")"))+"."+name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))
			}
		}
		if (rostypeClass == ArrayTopicSpecRefImpl){
			pkg_crossref = rostype.eCrossReferences.get(0).eContainer.toString()
			name_crossref = rostype.eCrossReferences.toString()
			if (pkg_name == pkg_crossref.substring(pkg_crossref.indexOf("name:")+6,pkg_crossref.indexOf(")"))){
				return name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))+"[*]"
			} else{
				return pkg_crossref.substring(pkg_crossref.indexOf("name:")+6,pkg_crossref.indexOf(")"))+"."+name_crossref.substring(name_crossref.indexOf("name:")+6,name_crossref.indexOf(")]"))+"[*]"
			} 
		} else {
			return ""
		}

	}
	def compile_communication_objects_to_services(PackageSet rosPackages, String RepoName)
		'''
ServiceDefRepository «RepoName» version 1.0 {

	«FOR rosPackage:rosPackages.package»
	«FOR Spec:rosPackage.spec»
	«IF !Arrays.asList("UInt8","UInt16","UInt64","Int8","Int16","UInt32","Int32","Int64","Float","Double","String","Boolean").contains(Spec.name)»
	«IF Spec.class==TopicSpecImpl  && Spec.eContents.length >0»
	ForkingServiceDefinition  «Spec.name»Service {
		PushPattern <DataType=«rosPackage.name».«Spec.name»>
	}

	«ENDIF»
	«IF Spec.class==ServiceSpecImpl  && Spec.eContents.length >0»
	RequestAnswerServiceDefinition «Spec.name»QueryService {
		QueryPattern <
			RequestType = «rosPackage.name».«Spec.name»Request
			AnswerType = «rosPackage.name».«Spec.name»Response
		>
	}

			«ENDIF»
			«ENDIF»
			«ENDFOR»
		«ENDFOR»

}
		'''
}

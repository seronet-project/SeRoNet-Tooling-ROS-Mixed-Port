//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
// Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
//
// 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
// 
// 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the 
//    documentation and/or other materials provided with the distribution.
// 
// 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this 
//    software without specific prior written permission.
// 
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, 
// THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS 
// BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
// POSSIBILITY OF SUCH DAMAGE.
//
//--------------------------------------------------------------------------

package de.seronet_projekt.xtend.ROS.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent

class ROSGeneratorImpl extends AbstractGenerator {
	@Inject extension ROS_CMake;
	@Inject extension ROS_package;
	@Inject extension ROS_ComponentExtension;
	@Inject extension ROS_Callbacks;
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(comp: input.allContents.toIterable.filter(ExtendsComponent)) {
			// generate the callback interface header
			fsa.generateFile(comp.rosPortCallbacksInterfaceHeaderFile, comp.compileRosPortCallbacksInterfaceHeader)
			// generate once the callback user-implementation class
			fsa.generateFile(comp.rosPortCallbacksUserClassHeaderFile, ExtendedOutputConfigurationProvider::SRC_OUTPUT, comp.compileRosPortCallbacksUserClassHeader)
			fsa.generateFile(comp.rosPortCallbacksUserClassSourceFile, ExtendedOutputConfigurationProvider::SRC_OUTPUT, comp.compileRosPortCallbacksUserClassSource)
			
			// generate the Component Extension C++ class
			fsa.generateFile(comp.rosPortBaseClassHeaderFile, comp.compileRosPortBaseClassHeader)
			fsa.generateFile(comp.rosPortExtensionHeaderFilename, comp.compileRosPortExtensionHeader)
			fsa.generateFile(comp.rosPortExtensionSourceFilename, comp.compileRosPortExtensionSource)
			
			// generate the CMakeLists.txt
			fsa.generateFile("CMakeLists.txt", comp.compileRosCMake)
			fsa.generateFile("package.xml", comp.compileRosPackage)
		}
	}
	
}
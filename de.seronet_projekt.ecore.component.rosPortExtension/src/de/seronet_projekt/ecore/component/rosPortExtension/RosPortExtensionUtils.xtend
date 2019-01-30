//===================================================================================
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package de.seronet_projekt.ecore.component.rosPortExtension

import rosInterfacesPool.RosTopic
import rosInterfacesPool.RosService
import java.util.Collection

class RosPortExtensionUtils {
	def static String getName(RosPortSelection rps) {
		rps.port.name
	}
	
	def static String getTypeString(RosPortSelection rps) {
		val p = rps.port
		switch(p) {
			RosTopic: p.type
			RosService: p.type
		}
	}
	
	def static String getMessageString(RosPortSelection rps) {
		val typeString = rps.typeString
		val dot_idx = typeString.indexOf('.')
		if(dot_idx > 0) {
			return typeString.substring(dot_idx+1)
		}
		return typeString
	}
	
	def static String getPackageString(RosPortSelection rps) {
		val typeString = rps.typeString
		val dot_idx = typeString.indexOf('.')
		if(dot_idx > 0) {
			return typeString.substring(0, dot_idx)
		}
		return typeString
	}
	
	def static Collection<String> getAllPackageStrings(ExtendsComponent comp) {
		return comp.ports.map[it.packageString];
	}
	
	def static String getName(ExtendsComponent comp) {
		return comp.component.name
	}
}
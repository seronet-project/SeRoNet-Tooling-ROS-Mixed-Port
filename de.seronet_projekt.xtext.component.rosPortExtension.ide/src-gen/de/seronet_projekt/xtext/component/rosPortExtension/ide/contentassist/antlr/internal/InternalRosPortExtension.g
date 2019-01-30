//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
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
grammar InternalRosPortExtension;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.seronet_projekt.xtext.component.rosPortExtension.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.seronet_projekt.xtext.component.rosPortExtension.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.seronet_projekt.xtext.component.rosPortExtension.services.RosPortExtensionGrammarAccess;

}
@parser::members {
	private RosPortExtensionGrammarAccess grammarAccess;

	public void setGrammarAccess(RosPortExtensionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleExtendsComponent
entryRuleExtendsComponent
:
{ before(grammarAccess.getExtendsComponentRule()); }
	 ruleExtendsComponent
{ after(grammarAccess.getExtendsComponentRule()); } 
	 EOF 
;

// Rule ExtendsComponent
ruleExtendsComponent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExtendsComponentAccess().getGroup()); }
		(rule__ExtendsComponent__Group__0)
		{ after(grammarAccess.getExtendsComponentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFQN
entryRuleFQN
:
{ before(grammarAccess.getFQNRule()); }
	 ruleFQN
{ after(grammarAccess.getFQNRule()); } 
	 EOF 
;

// Rule FQN
ruleFQN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFQNAccess().getGroup()); }
		(rule__FQN__Group__0)
		{ after(grammarAccess.getFQNAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRosPortSelection
entryRuleRosPortSelection
:
{ before(grammarAccess.getRosPortSelectionRule()); }
	 ruleRosPortSelection
{ after(grammarAccess.getRosPortSelectionRule()); } 
	 EOF 
;

// Rule RosPortSelection
ruleRosPortSelection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRosPortSelectionAccess().getGroup()); }
		(rule__RosPortSelection__Group__0)
		{ after(grammarAccess.getRosPortSelectionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendsComponent__Group__0__Impl
	rule__ExtendsComponent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendsComponentAccess().getExtendsComponentKeyword_0()); }
	'ExtendsComponent'
	{ after(grammarAccess.getExtendsComponentAccess().getExtendsComponentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendsComponent__Group__1__Impl
	rule__ExtendsComponent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendsComponentAccess().getComponentAssignment_1()); }
	(rule__ExtendsComponent__ComponentAssignment_1)
	{ after(grammarAccess.getExtendsComponentAccess().getComponentAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendsComponent__Group__2__Impl
	rule__ExtendsComponent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendsComponentAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getExtendsComponentAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendsComponent__Group__3__Impl
	rule__ExtendsComponent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendsComponentAccess().getPortsAssignment_3()); }
	(rule__ExtendsComponent__PortsAssignment_3)*
	{ after(grammarAccess.getExtendsComponentAccess().getPortsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExtendsComponent__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExtendsComponentAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getExtendsComponentAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__0__Impl
	rule__FQN__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getGroup_1()); }
	(rule__FQN__Group_1__0)?
	{ after(grammarAccess.getFQNAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FQN__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__0__Impl
	rule__FQN__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FQN__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FQN__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RosPortSelection__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosPortSelection__Group__0__Impl
	rule__RosPortSelection__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RosPortSelection__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosPortSelectionAccess().getRosPortSelectionKeyword_0()); }
	'RosPortSelection'
	{ after(grammarAccess.getRosPortSelectionAccess().getRosPortSelectionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosPortSelection__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosPortSelection__Group__1__Impl
	rule__RosPortSelection__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RosPortSelection__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosPortSelectionAccess().getPortAssignment_1()); }
	(rule__RosPortSelection__PortAssignment_1)
	{ after(grammarAccess.getRosPortSelectionAccess().getPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosPortSelection__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RosPortSelection__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RosPortSelection__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRosPortSelectionAccess().getSemicolonKeyword_2()); }
	(';')?
	{ after(grammarAccess.getRosPortSelectionAccess().getSemicolonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExtendsComponent__ComponentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExtendsComponent__PortsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExtendsComponentAccess().getPortsRosPortSelectionParserRuleCall_3_0()); }
		ruleRosPortSelection
		{ after(grammarAccess.getExtendsComponentAccess().getPortsRosPortSelectionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RosPortSelection__PortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceFQNParserRuleCall_1_0_1()); }
			ruleFQN
			{ after(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceFQNParserRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

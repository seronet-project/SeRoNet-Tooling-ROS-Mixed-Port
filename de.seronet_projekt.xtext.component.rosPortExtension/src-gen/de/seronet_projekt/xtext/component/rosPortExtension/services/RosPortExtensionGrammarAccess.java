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
package de.seronet_projekt.xtext.component.rosPortExtension.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class RosPortExtensionGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ExtendsComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.seronet_projekt.xtext.component.rosPortExtension.RosPortExtension.ExtendsComponent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendsComponentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cComponentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cComponentComponentDefinitionCrossReference_1_0 = (CrossReference)cComponentAssignment_1.eContents().get(0);
		private final RuleCall cComponentComponentDefinitionIDTerminalRuleCall_1_0_1 = (RuleCall)cComponentComponentDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPortsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPortsRosPortSelectionParserRuleCall_3_0 = (RuleCall)cPortsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ExtendsComponent:
		//	'ExtendsComponent' component=[componentDefinition::ComponentDefinition]
		//	'{'
		//	ports+=RosPortSelection*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'ExtendsComponent' component=[componentDefinition::ComponentDefinition] '{' ports+=RosPortSelection* '}'
		public Group getGroup() { return cGroup; }
		
		//'ExtendsComponent'
		public Keyword getExtendsComponentKeyword_0() { return cExtendsComponentKeyword_0; }
		
		//component=[componentDefinition::ComponentDefinition]
		public Assignment getComponentAssignment_1() { return cComponentAssignment_1; }
		
		//[componentDefinition::ComponentDefinition]
		public CrossReference getComponentComponentDefinitionCrossReference_1_0() { return cComponentComponentDefinitionCrossReference_1_0; }
		
		//ID
		public RuleCall getComponentComponentDefinitionIDTerminalRuleCall_1_0_1() { return cComponentComponentDefinitionIDTerminalRuleCall_1_0_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//ports+=RosPortSelection*
		public Assignment getPortsAssignment_3() { return cPortsAssignment_3; }
		
		//RosPortSelection
		public RuleCall getPortsRosPortSelectionParserRuleCall_3_0() { return cPortsRosPortSelectionParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.seronet_projekt.xtext.component.rosPortExtension.RosPortExtension.FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//FQN:
		//	ID ('.' ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class RosPortSelectionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.seronet_projekt.xtext.component.rosPortExtension.RosPortExtension.RosPortSelection");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRosPortSelectionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortRosInterfaceCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortRosInterfaceFQNParserRuleCall_1_0_1 = (RuleCall)cPortRosInterfaceCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RosPortSelection:
		//	'RosPortSelection' port=[rosInterfacesPool::RosInterface|FQN] ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'RosPortSelection' port=[rosInterfacesPool::RosInterface|FQN] ';'?
		public Group getGroup() { return cGroup; }
		
		//'RosPortSelection'
		public Keyword getRosPortSelectionKeyword_0() { return cRosPortSelectionKeyword_0; }
		
		//port=[rosInterfacesPool::RosInterface|FQN]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[rosInterfacesPool::RosInterface|FQN]
		public CrossReference getPortRosInterfaceCrossReference_1_0() { return cPortRosInterfaceCrossReference_1_0; }
		
		//FQN
		public RuleCall getPortRosInterfaceFQNParserRuleCall_1_0_1() { return cPortRosInterfaceFQNParserRuleCall_1_0_1; }
		
		//';'?
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	
	
	private final ExtendsComponentElements pExtendsComponent;
	private final FQNElements pFQN;
	private final RosPortSelectionElements pRosPortSelection;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public RosPortExtensionGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pExtendsComponent = new ExtendsComponentElements();
		this.pFQN = new FQNElements();
		this.pRosPortSelection = new RosPortSelectionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.seronet_projekt.xtext.component.rosPortExtension.RosPortExtension".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//ExtendsComponent:
	//	'ExtendsComponent' component=[componentDefinition::ComponentDefinition]
	//	'{'
	//	ports+=RosPortSelection*
	//	'}';
	public ExtendsComponentElements getExtendsComponentAccess() {
		return pExtendsComponent;
	}
	
	public ParserRule getExtendsComponentRule() {
		return getExtendsComponentAccess().getRule();
	}
	
	//FQN:
	//	ID ('.' ID)?;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}
	
	//RosPortSelection:
	//	'RosPortSelection' port=[rosInterfacesPool::RosInterface|FQN] ';'?;
	public RosPortSelectionElements getRosPortSelectionAccess() {
		return pRosPortSelection;
	}
	
	public ParserRule getRosPortSelectionRule() {
		return getRosPortSelectionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

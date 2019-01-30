package de.seronet_projekt.xtext.component.rosPortExtension.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.seronet_projekt.xtext.component.rosPortExtension.services.RosPortExtensionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosPortExtensionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ExtendsComponent'", "'{'", "'}'", "'.'", "'RosPortSelection'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRosPortExtensionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosPortExtensionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosPortExtensionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosPortExtension.g"; }



     	private RosPortExtensionGrammarAccess grammarAccess;

        public InternalRosPortExtensionParser(TokenStream input, RosPortExtensionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ExtendsComponent";
       	}

       	@Override
       	protected RosPortExtensionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExtendsComponent"
    // InternalRosPortExtension.g:105:1: entryRuleExtendsComponent returns [EObject current=null] : iv_ruleExtendsComponent= ruleExtendsComponent EOF ;
    public final EObject entryRuleExtendsComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtendsComponent = null;


        try {
            // InternalRosPortExtension.g:105:57: (iv_ruleExtendsComponent= ruleExtendsComponent EOF )
            // InternalRosPortExtension.g:106:2: iv_ruleExtendsComponent= ruleExtendsComponent EOF
            {
             newCompositeNode(grammarAccess.getExtendsComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtendsComponent=ruleExtendsComponent();

            state._fsp--;

             current =iv_ruleExtendsComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendsComponent"


    // $ANTLR start "ruleExtendsComponent"
    // InternalRosPortExtension.g:112:1: ruleExtendsComponent returns [EObject current=null] : (otherlv_0= 'ExtendsComponent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleRosPortSelection ) )* otherlv_4= '}' ) ;
    public final EObject ruleExtendsComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ports_3_0 = null;



        	enterRule();

        try {
            // InternalRosPortExtension.g:118:2: ( (otherlv_0= 'ExtendsComponent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleRosPortSelection ) )* otherlv_4= '}' ) )
            // InternalRosPortExtension.g:119:2: (otherlv_0= 'ExtendsComponent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleRosPortSelection ) )* otherlv_4= '}' )
            {
            // InternalRosPortExtension.g:119:2: (otherlv_0= 'ExtendsComponent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleRosPortSelection ) )* otherlv_4= '}' )
            // InternalRosPortExtension.g:120:3: otherlv_0= 'ExtendsComponent' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( (lv_ports_3_0= ruleRosPortSelection ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendsComponentAccess().getExtendsComponentKeyword_0());
            		
            // InternalRosPortExtension.g:124:3: ( (otherlv_1= RULE_ID ) )
            // InternalRosPortExtension.g:125:4: (otherlv_1= RULE_ID )
            {
            // InternalRosPortExtension.g:125:4: (otherlv_1= RULE_ID )
            // InternalRosPortExtension.g:126:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendsComponentRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendsComponentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosPortExtension.g:141:3: ( (lv_ports_3_0= ruleRosPortSelection ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRosPortExtension.g:142:4: (lv_ports_3_0= ruleRosPortSelection )
            	    {
            	    // InternalRosPortExtension.g:142:4: (lv_ports_3_0= ruleRosPortSelection )
            	    // InternalRosPortExtension.g:143:5: lv_ports_3_0= ruleRosPortSelection
            	    {

            	    					newCompositeNode(grammarAccess.getExtendsComponentAccess().getPortsRosPortSelectionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_ports_3_0=ruleRosPortSelection();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExtendsComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ports",
            	    						lv_ports_3_0,
            	    						"de.seronet_projekt.xtext.component.rosPortExtension.RosPortExtension.RosPortSelection");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExtendsComponentAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendsComponent"


    // $ANTLR start "entryRuleFQN"
    // InternalRosPortExtension.g:168:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalRosPortExtension.g:168:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalRosPortExtension.g:169:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalRosPortExtension.g:175:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRosPortExtension.g:181:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalRosPortExtension.g:182:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalRosPortExtension.g:182:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalRosPortExtension.g:183:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalRosPortExtension.g:190:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosPortExtension.g:191:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,14,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleRosPortSelection"
    // InternalRosPortExtension.g:208:1: entryRuleRosPortSelection returns [EObject current=null] : iv_ruleRosPortSelection= ruleRosPortSelection EOF ;
    public final EObject entryRuleRosPortSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPortSelection = null;


        try {
            // InternalRosPortExtension.g:208:57: (iv_ruleRosPortSelection= ruleRosPortSelection EOF )
            // InternalRosPortExtension.g:209:2: iv_ruleRosPortSelection= ruleRosPortSelection EOF
            {
             newCompositeNode(grammarAccess.getRosPortSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosPortSelection=ruleRosPortSelection();

            state._fsp--;

             current =iv_ruleRosPortSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosPortSelection"


    // $ANTLR start "ruleRosPortSelection"
    // InternalRosPortExtension.g:215:1: ruleRosPortSelection returns [EObject current=null] : (otherlv_0= 'RosPortSelection' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) ;
    public final EObject ruleRosPortSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalRosPortExtension.g:221:2: ( (otherlv_0= 'RosPortSelection' ( ( ruleFQN ) ) (otherlv_2= ';' )? ) )
            // InternalRosPortExtension.g:222:2: (otherlv_0= 'RosPortSelection' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            {
            // InternalRosPortExtension.g:222:2: (otherlv_0= 'RosPortSelection' ( ( ruleFQN ) ) (otherlv_2= ';' )? )
            // InternalRosPortExtension.g:223:3: otherlv_0= 'RosPortSelection' ( ( ruleFQN ) ) (otherlv_2= ';' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRosPortSelectionAccess().getRosPortSelectionKeyword_0());
            		
            // InternalRosPortExtension.g:227:3: ( ( ruleFQN ) )
            // InternalRosPortExtension.g:228:4: ( ruleFQN )
            {
            // InternalRosPortExtension.g:228:4: ( ruleFQN )
            // InternalRosPortExtension.g:229:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPortSelectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosPortExtension.g:243:3: (otherlv_2= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosPortExtension.g:244:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getRosPortSelectionAccess().getSemicolonKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosPortSelection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});

}
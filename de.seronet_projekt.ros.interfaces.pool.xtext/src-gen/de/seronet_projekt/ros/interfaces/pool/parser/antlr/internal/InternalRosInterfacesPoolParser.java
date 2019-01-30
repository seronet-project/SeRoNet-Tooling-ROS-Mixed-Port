package de.seronet_projekt.ros.interfaces.pool.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.seronet_projekt.ros.interfaces.pool.services.RosInterfacesPoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosInterfacesPoolParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosInterfacesPool'", "'{'", "'}'", "'RosPublisher'", "'topicName'", "'type'", "'RosSubscriber'", "'RosSrvServer'", "'srvName'", "'RosSrvClient'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalRosInterfacesPoolParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosInterfacesPoolParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosInterfacesPoolParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosInterfacesPool.g"; }



     	private RosInterfacesPoolGrammarAccess grammarAccess;

        public InternalRosInterfacesPoolParser(TokenStream input, RosInterfacesPoolGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RosInterfacesPool";
       	}

       	@Override
       	protected RosInterfacesPoolGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRosInterfacesPool"
    // InternalRosInterfacesPool.g:64:1: entryRuleRosInterfacesPool returns [EObject current=null] : iv_ruleRosInterfacesPool= ruleRosInterfacesPool EOF ;
    public final EObject entryRuleRosInterfacesPool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosInterfacesPool = null;


        try {
            // InternalRosInterfacesPool.g:64:58: (iv_ruleRosInterfacesPool= ruleRosInterfacesPool EOF )
            // InternalRosInterfacesPool.g:65:2: iv_ruleRosInterfacesPool= ruleRosInterfacesPool EOF
            {
             newCompositeNode(grammarAccess.getRosInterfacesPoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosInterfacesPool=ruleRosInterfacesPool();

            state._fsp--;

             current =iv_ruleRosInterfacesPool; 
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
    // $ANTLR end "entryRuleRosInterfacesPool"


    // $ANTLR start "ruleRosInterfacesPool"
    // InternalRosInterfacesPool.g:71:1: ruleRosInterfacesPool returns [EObject current=null] : ( () otherlv_1= 'RosInterfacesPool' otherlv_2= '{' ( (lv_interfaces_3_0= ruleRosInterface ) )* otherlv_4= '}' ) ;
    public final EObject ruleRosInterfacesPool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_interfaces_3_0 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:77:2: ( ( () otherlv_1= 'RosInterfacesPool' otherlv_2= '{' ( (lv_interfaces_3_0= ruleRosInterface ) )* otherlv_4= '}' ) )
            // InternalRosInterfacesPool.g:78:2: ( () otherlv_1= 'RosInterfacesPool' otherlv_2= '{' ( (lv_interfaces_3_0= ruleRosInterface ) )* otherlv_4= '}' )
            {
            // InternalRosInterfacesPool.g:78:2: ( () otherlv_1= 'RosInterfacesPool' otherlv_2= '{' ( (lv_interfaces_3_0= ruleRosInterface ) )* otherlv_4= '}' )
            // InternalRosInterfacesPool.g:79:3: () otherlv_1= 'RosInterfacesPool' otherlv_2= '{' ( (lv_interfaces_3_0= ruleRosInterface ) )* otherlv_4= '}'
            {
            // InternalRosInterfacesPool.g:79:3: ()
            // InternalRosInterfacesPool.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRosInterfacesPoolAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRosInterfacesPool.g:94:3: ( (lv_interfaces_3_0= ruleRosInterface ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||(LA1_0>=17 && LA1_0<=18)||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRosInterfacesPool.g:95:4: (lv_interfaces_3_0= ruleRosInterface )
            	    {
            	    // InternalRosInterfacesPool.g:95:4: (lv_interfaces_3_0= ruleRosInterface )
            	    // InternalRosInterfacesPool.g:96:5: lv_interfaces_3_0= ruleRosInterface
            	    {

            	    					newCompositeNode(grammarAccess.getRosInterfacesPoolAccess().getInterfacesRosInterfaceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_interfaces_3_0=ruleRosInterface();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRosInterfacesPoolRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaces",
            	    						lv_interfaces_3_0,
            	    						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.RosInterface");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRosInterfacesPoolAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRosInterfacesPool"


    // $ANTLR start "entryRuleRosInterface"
    // InternalRosInterfacesPool.g:121:1: entryRuleRosInterface returns [EObject current=null] : iv_ruleRosInterface= ruleRosInterface EOF ;
    public final EObject entryRuleRosInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosInterface = null;


        try {
            // InternalRosInterfacesPool.g:121:53: (iv_ruleRosInterface= ruleRosInterface EOF )
            // InternalRosInterfacesPool.g:122:2: iv_ruleRosInterface= ruleRosInterface EOF
            {
             newCompositeNode(grammarAccess.getRosInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosInterface=ruleRosInterface();

            state._fsp--;

             current =iv_ruleRosInterface; 
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
    // $ANTLR end "entryRuleRosInterface"


    // $ANTLR start "ruleRosInterface"
    // InternalRosInterfacesPool.g:128:1: ruleRosInterface returns [EObject current=null] : (this_RosTopic_0= ruleRosTopic | this_RosService_1= ruleRosService ) ;
    public final EObject ruleRosInterface() throws RecognitionException {
        EObject current = null;

        EObject this_RosTopic_0 = null;

        EObject this_RosService_1 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:134:2: ( (this_RosTopic_0= ruleRosTopic | this_RosService_1= ruleRosService ) )
            // InternalRosInterfacesPool.g:135:2: (this_RosTopic_0= ruleRosTopic | this_RosService_1= ruleRosService )
            {
            // InternalRosInterfacesPool.g:135:2: (this_RosTopic_0= ruleRosTopic | this_RosService_1= ruleRosService )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||LA2_0==17) ) {
                alt2=1;
            }
            else if ( (LA2_0==18||LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosInterfacesPool.g:136:3: this_RosTopic_0= ruleRosTopic
                    {

                    			newCompositeNode(grammarAccess.getRosInterfaceAccess().getRosTopicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosTopic_0=ruleRosTopic();

                    state._fsp--;


                    			current = this_RosTopic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:145:3: this_RosService_1= ruleRosService
                    {

                    			newCompositeNode(grammarAccess.getRosInterfaceAccess().getRosServiceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosService_1=ruleRosService();

                    state._fsp--;


                    			current = this_RosService_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleRosInterface"


    // $ANTLR start "entryRuleRosTopic"
    // InternalRosInterfacesPool.g:157:1: entryRuleRosTopic returns [EObject current=null] : iv_ruleRosTopic= ruleRosTopic EOF ;
    public final EObject entryRuleRosTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosTopic = null;


        try {
            // InternalRosInterfacesPool.g:157:49: (iv_ruleRosTopic= ruleRosTopic EOF )
            // InternalRosInterfacesPool.g:158:2: iv_ruleRosTopic= ruleRosTopic EOF
            {
             newCompositeNode(grammarAccess.getRosTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosTopic=ruleRosTopic();

            state._fsp--;

             current =iv_ruleRosTopic; 
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
    // $ANTLR end "entryRuleRosTopic"


    // $ANTLR start "ruleRosTopic"
    // InternalRosInterfacesPool.g:164:1: ruleRosTopic returns [EObject current=null] : (this_RosPublisher_0= ruleRosPublisher | this_RosSubscriber_1= ruleRosSubscriber ) ;
    public final EObject ruleRosTopic() throws RecognitionException {
        EObject current = null;

        EObject this_RosPublisher_0 = null;

        EObject this_RosSubscriber_1 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:170:2: ( (this_RosPublisher_0= ruleRosPublisher | this_RosSubscriber_1= ruleRosSubscriber ) )
            // InternalRosInterfacesPool.g:171:2: (this_RosPublisher_0= ruleRosPublisher | this_RosSubscriber_1= ruleRosSubscriber )
            {
            // InternalRosInterfacesPool.g:171:2: (this_RosPublisher_0= ruleRosPublisher | this_RosSubscriber_1= ruleRosSubscriber )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosInterfacesPool.g:172:3: this_RosPublisher_0= ruleRosPublisher
                    {

                    			newCompositeNode(grammarAccess.getRosTopicAccess().getRosPublisherParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosPublisher_0=ruleRosPublisher();

                    state._fsp--;


                    			current = this_RosPublisher_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:181:3: this_RosSubscriber_1= ruleRosSubscriber
                    {

                    			newCompositeNode(grammarAccess.getRosTopicAccess().getRosSubscriberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosSubscriber_1=ruleRosSubscriber();

                    state._fsp--;


                    			current = this_RosSubscriber_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleRosTopic"


    // $ANTLR start "entryRuleRosService"
    // InternalRosInterfacesPool.g:193:1: entryRuleRosService returns [EObject current=null] : iv_ruleRosService= ruleRosService EOF ;
    public final EObject entryRuleRosService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosService = null;


        try {
            // InternalRosInterfacesPool.g:193:51: (iv_ruleRosService= ruleRosService EOF )
            // InternalRosInterfacesPool.g:194:2: iv_ruleRosService= ruleRosService EOF
            {
             newCompositeNode(grammarAccess.getRosServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosService=ruleRosService();

            state._fsp--;

             current =iv_ruleRosService; 
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
    // $ANTLR end "entryRuleRosService"


    // $ANTLR start "ruleRosService"
    // InternalRosInterfacesPool.g:200:1: ruleRosService returns [EObject current=null] : (this_RosSrvServer_0= ruleRosSrvServer | this_RosSrvClient_1= ruleRosSrvClient ) ;
    public final EObject ruleRosService() throws RecognitionException {
        EObject current = null;

        EObject this_RosSrvServer_0 = null;

        EObject this_RosSrvClient_1 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:206:2: ( (this_RosSrvServer_0= ruleRosSrvServer | this_RosSrvClient_1= ruleRosSrvClient ) )
            // InternalRosInterfacesPool.g:207:2: (this_RosSrvServer_0= ruleRosSrvServer | this_RosSrvClient_1= ruleRosSrvClient )
            {
            // InternalRosInterfacesPool.g:207:2: (this_RosSrvServer_0= ruleRosSrvServer | this_RosSrvClient_1= ruleRosSrvClient )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosInterfacesPool.g:208:3: this_RosSrvServer_0= ruleRosSrvServer
                    {

                    			newCompositeNode(grammarAccess.getRosServiceAccess().getRosSrvServerParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosSrvServer_0=ruleRosSrvServer();

                    state._fsp--;


                    			current = this_RosSrvServer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:217:3: this_RosSrvClient_1= ruleRosSrvClient
                    {

                    			newCompositeNode(grammarAccess.getRosServiceAccess().getRosSrvClientParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosSrvClient_1=ruleRosSrvClient();

                    state._fsp--;


                    			current = this_RosSrvClient_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleRosService"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalRosInterfacesPool.g:229:1: entryRuleRosPublisher returns [EObject current=null] : iv_ruleRosPublisher= ruleRosPublisher EOF ;
    public final EObject entryRuleRosPublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisher = null;


        try {
            // InternalRosInterfacesPool.g:229:53: (iv_ruleRosPublisher= ruleRosPublisher EOF )
            // InternalRosInterfacesPool.g:230:2: iv_ruleRosPublisher= ruleRosPublisher EOF
            {
             newCompositeNode(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisher=ruleRosPublisher();

            state._fsp--;

             current =iv_ruleRosPublisher; 
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
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalRosInterfacesPool.g:236:1: ruleRosPublisher returns [EObject current=null] : (otherlv_0= 'RosPublisher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleRosPublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_topicName_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:242:2: ( (otherlv_0= 'RosPublisher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosInterfacesPool.g:243:2: (otherlv_0= 'RosPublisher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosInterfacesPool.g:243:2: (otherlv_0= 'RosPublisher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            // InternalRosInterfacesPool.g:244:3: otherlv_0= 'RosPublisher' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_0());
            		
            // InternalRosInterfacesPool.g:248:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRosInterfacesPool.g:249:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRosInterfacesPool.g:249:4: (lv_name_1_0= RULE_ID )
            // InternalRosInterfacesPool.g:250:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRosPublisherAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRosPublisherAccess().getTopicNameKeyword_3());
            		
            // InternalRosInterfacesPool.g:274:3: ( (lv_topicName_4_0= ruleEString ) )
            // InternalRosInterfacesPool.g:275:4: (lv_topicName_4_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:275:4: (lv_topicName_4_0= ruleEString )
            // InternalRosInterfacesPool.g:276:5: lv_topicName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getTopicNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_topicName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosPublisherRule());
            					}
            					set(
            						current,
            						"topicName",
            						lv_topicName_4_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRosPublisherAccess().getTypeKeyword_5());
            		
            // InternalRosInterfacesPool.g:297:3: ( (lv_type_6_0= ruleEString ) )
            // InternalRosInterfacesPool.g:298:4: (lv_type_6_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:298:4: (lv_type_6_0= ruleEString )
            // InternalRosInterfacesPool.g:299:5: lv_type_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosPublisherAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosPublisherRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalRosInterfacesPool.g:324:1: entryRuleRosSubscriber returns [EObject current=null] : iv_ruleRosSubscriber= ruleRosSubscriber EOF ;
    public final EObject entryRuleRosSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriber = null;


        try {
            // InternalRosInterfacesPool.g:324:54: (iv_ruleRosSubscriber= ruleRosSubscriber EOF )
            // InternalRosInterfacesPool.g:325:2: iv_ruleRosSubscriber= ruleRosSubscriber EOF
            {
             newCompositeNode(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriber=ruleRosSubscriber();

            state._fsp--;

             current =iv_ruleRosSubscriber; 
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
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalRosInterfacesPool.g:331:1: ruleRosSubscriber returns [EObject current=null] : (otherlv_0= 'RosSubscriber' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleRosSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_topicName_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:337:2: ( (otherlv_0= 'RosSubscriber' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosInterfacesPool.g:338:2: (otherlv_0= 'RosSubscriber' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosInterfacesPool.g:338:2: (otherlv_0= 'RosSubscriber' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            // InternalRosInterfacesPool.g:339:3: otherlv_0= 'RosSubscriber' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'topicName' ( (lv_topicName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_0());
            		
            // InternalRosInterfacesPool.g:343:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRosInterfacesPool.g:344:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRosInterfacesPool.g:344:4: (lv_name_1_0= RULE_ID )
            // InternalRosInterfacesPool.g:345:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRosSubscriberAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSubscriberAccess().getTopicNameKeyword_3());
            		
            // InternalRosInterfacesPool.g:369:3: ( (lv_topicName_4_0= ruleEString ) )
            // InternalRosInterfacesPool.g:370:4: (lv_topicName_4_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:370:4: (lv_topicName_4_0= ruleEString )
            // InternalRosInterfacesPool.g:371:5: lv_topicName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getTopicNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_topicName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
            					}
            					set(
            						current,
            						"topicName",
            						lv_topicName_4_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRosSubscriberAccess().getTypeKeyword_5());
            		
            // InternalRosInterfacesPool.g:392:3: ( (lv_type_6_0= ruleEString ) )
            // InternalRosInterfacesPool.g:393:4: (lv_type_6_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:393:4: (lv_type_6_0= ruleEString )
            // InternalRosInterfacesPool.g:394:5: lv_type_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSubscriberAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSubscriberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosSrvServer"
    // InternalRosInterfacesPool.g:419:1: entryRuleRosSrvServer returns [EObject current=null] : iv_ruleRosSrvServer= ruleRosSrvServer EOF ;
    public final EObject entryRuleRosSrvServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSrvServer = null;


        try {
            // InternalRosInterfacesPool.g:419:53: (iv_ruleRosSrvServer= ruleRosSrvServer EOF )
            // InternalRosInterfacesPool.g:420:2: iv_ruleRosSrvServer= ruleRosSrvServer EOF
            {
             newCompositeNode(grammarAccess.getRosSrvServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSrvServer=ruleRosSrvServer();

            state._fsp--;

             current =iv_ruleRosSrvServer; 
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
    // $ANTLR end "entryRuleRosSrvServer"


    // $ANTLR start "ruleRosSrvServer"
    // InternalRosInterfacesPool.g:426:1: ruleRosSrvServer returns [EObject current=null] : (otherlv_0= 'RosSrvServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleRosSrvServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_srvName_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:432:2: ( (otherlv_0= 'RosSrvServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosInterfacesPool.g:433:2: (otherlv_0= 'RosSrvServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosInterfacesPool.g:433:2: (otherlv_0= 'RosSrvServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            // InternalRosInterfacesPool.g:434:3: otherlv_0= 'RosSrvServer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRosSrvServerAccess().getRosSrvServerKeyword_0());
            		
            // InternalRosInterfacesPool.g:438:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRosInterfacesPool.g:439:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRosInterfacesPool.g:439:4: (lv_name_1_0= RULE_ID )
            // InternalRosInterfacesPool.g:440:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRosSrvServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSrvServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSrvServerAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSrvServerAccess().getSrvNameKeyword_3());
            		
            // InternalRosInterfacesPool.g:464:3: ( (lv_srvName_4_0= ruleEString ) )
            // InternalRosInterfacesPool.g:465:4: (lv_srvName_4_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:465:4: (lv_srvName_4_0= ruleEString )
            // InternalRosInterfacesPool.g:466:5: lv_srvName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSrvServerAccess().getSrvNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_srvName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSrvServerRule());
            					}
            					set(
            						current,
            						"srvName",
            						lv_srvName_4_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRosSrvServerAccess().getTypeKeyword_5());
            		
            // InternalRosInterfacesPool.g:487:3: ( (lv_type_6_0= ruleEString ) )
            // InternalRosInterfacesPool.g:488:4: (lv_type_6_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:488:4: (lv_type_6_0= ruleEString )
            // InternalRosInterfacesPool.g:489:5: lv_type_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSrvServerAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSrvServerRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRosSrvServerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosSrvServer"


    // $ANTLR start "entryRuleRosSrvClient"
    // InternalRosInterfacesPool.g:514:1: entryRuleRosSrvClient returns [EObject current=null] : iv_ruleRosSrvClient= ruleRosSrvClient EOF ;
    public final EObject entryRuleRosSrvClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSrvClient = null;


        try {
            // InternalRosInterfacesPool.g:514:53: (iv_ruleRosSrvClient= ruleRosSrvClient EOF )
            // InternalRosInterfacesPool.g:515:2: iv_ruleRosSrvClient= ruleRosSrvClient EOF
            {
             newCompositeNode(grammarAccess.getRosSrvClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSrvClient=ruleRosSrvClient();

            state._fsp--;

             current =iv_ruleRosSrvClient; 
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
    // $ANTLR end "entryRuleRosSrvClient"


    // $ANTLR start "ruleRosSrvClient"
    // InternalRosInterfacesPool.g:521:1: ruleRosSrvClient returns [EObject current=null] : (otherlv_0= 'RosSrvClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleRosSrvClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_srvName_4_0 = null;

        AntlrDatatypeRuleToken lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalRosInterfacesPool.g:527:2: ( (otherlv_0= 'RosSrvClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // InternalRosInterfacesPool.g:528:2: (otherlv_0= 'RosSrvClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // InternalRosInterfacesPool.g:528:2: (otherlv_0= 'RosSrvClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}' )
            // InternalRosInterfacesPool.g:529:3: otherlv_0= 'RosSrvClient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'srvName' ( (lv_srvName_4_0= ruleEString ) ) otherlv_5= 'type' ( (lv_type_6_0= ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRosSrvClientAccess().getRosSrvClientKeyword_0());
            		
            // InternalRosInterfacesPool.g:533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRosInterfacesPool.g:534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRosInterfacesPool.g:534:4: (lv_name_1_0= RULE_ID )
            // InternalRosInterfacesPool.g:535:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRosSrvClientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSrvClientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRosSrvClientAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRosSrvClientAccess().getSrvNameKeyword_3());
            		
            // InternalRosInterfacesPool.g:559:3: ( (lv_srvName_4_0= ruleEString ) )
            // InternalRosInterfacesPool.g:560:4: (lv_srvName_4_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:560:4: (lv_srvName_4_0= ruleEString )
            // InternalRosInterfacesPool.g:561:5: lv_srvName_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSrvClientAccess().getSrvNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_srvName_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSrvClientRule());
            					}
            					set(
            						current,
            						"srvName",
            						lv_srvName_4_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getRosSrvClientAccess().getTypeKeyword_5());
            		
            // InternalRosInterfacesPool.g:582:3: ( (lv_type_6_0= ruleEString ) )
            // InternalRosInterfacesPool.g:583:4: (lv_type_6_0= ruleEString )
            {
            // InternalRosInterfacesPool.g:583:4: (lv_type_6_0= ruleEString )
            // InternalRosInterfacesPool.g:584:5: lv_type_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSrvClientAccess().getTypeEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosSrvClientRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_6_0,
            						"de.seronet_projekt.ros.interfaces.pool.RosInterfacesPool.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRosSrvClientAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRosSrvClient"


    // $ANTLR start "entryRuleEString"
    // InternalRosInterfacesPool.g:609:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosInterfacesPool.g:609:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosInterfacesPool.g:610:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosInterfacesPool.g:616:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRosInterfacesPool.g:622:2: (this_STRING_0= RULE_STRING )
            // InternalRosInterfacesPool.g:623:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000166000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});

}
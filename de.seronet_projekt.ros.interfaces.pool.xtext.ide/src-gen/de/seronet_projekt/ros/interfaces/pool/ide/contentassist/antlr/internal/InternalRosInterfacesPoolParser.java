package de.seronet_projekt.ros.interfaces.pool.ide.contentassist.antlr.internal;

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
import de.seronet_projekt.ros.interfaces.pool.services.RosInterfacesPoolGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosInterfacesPoolParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosInterfacesPool'", "'{'", "'}'", "'RosPublisher'", "'topicName'", "'type'", "'RosSubscriber'", "'RosSrvServer'", "'srvName'", "'RosSrvClient'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
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

    	public void setGrammarAccess(RosInterfacesPoolGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRosInterfacesPool"
    // InternalRosInterfacesPool.g:53:1: entryRuleRosInterfacesPool : ruleRosInterfacesPool EOF ;
    public final void entryRuleRosInterfacesPool() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:54:1: ( ruleRosInterfacesPool EOF )
            // InternalRosInterfacesPool.g:55:1: ruleRosInterfacesPool EOF
            {
             before(grammarAccess.getRosInterfacesPoolRule()); 
            pushFollow(FOLLOW_1);
            ruleRosInterfacesPool();

            state._fsp--;

             after(grammarAccess.getRosInterfacesPoolRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosInterfacesPool"


    // $ANTLR start "ruleRosInterfacesPool"
    // InternalRosInterfacesPool.g:62:1: ruleRosInterfacesPool : ( ( rule__RosInterfacesPool__Group__0 ) ) ;
    public final void ruleRosInterfacesPool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:66:2: ( ( ( rule__RosInterfacesPool__Group__0 ) ) )
            // InternalRosInterfacesPool.g:67:2: ( ( rule__RosInterfacesPool__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:67:2: ( ( rule__RosInterfacesPool__Group__0 ) )
            // InternalRosInterfacesPool.g:68:3: ( rule__RosInterfacesPool__Group__0 )
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getGroup()); 
            // InternalRosInterfacesPool.g:69:3: ( rule__RosInterfacesPool__Group__0 )
            // InternalRosInterfacesPool.g:69:4: rule__RosInterfacesPool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosInterfacesPool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfacesPoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosInterfacesPool"


    // $ANTLR start "entryRuleRosInterface"
    // InternalRosInterfacesPool.g:78:1: entryRuleRosInterface : ruleRosInterface EOF ;
    public final void entryRuleRosInterface() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:79:1: ( ruleRosInterface EOF )
            // InternalRosInterfacesPool.g:80:1: ruleRosInterface EOF
            {
             before(grammarAccess.getRosInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosInterface();

            state._fsp--;

             after(grammarAccess.getRosInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosInterface"


    // $ANTLR start "ruleRosInterface"
    // InternalRosInterfacesPool.g:87:1: ruleRosInterface : ( ( rule__RosInterface__Alternatives ) ) ;
    public final void ruleRosInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:91:2: ( ( ( rule__RosInterface__Alternatives ) ) )
            // InternalRosInterfacesPool.g:92:2: ( ( rule__RosInterface__Alternatives ) )
            {
            // InternalRosInterfacesPool.g:92:2: ( ( rule__RosInterface__Alternatives ) )
            // InternalRosInterfacesPool.g:93:3: ( rule__RosInterface__Alternatives )
            {
             before(grammarAccess.getRosInterfaceAccess().getAlternatives()); 
            // InternalRosInterfacesPool.g:94:3: ( rule__RosInterface__Alternatives )
            // InternalRosInterfacesPool.g:94:4: rule__RosInterface__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RosInterface__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRosInterfaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosInterface"


    // $ANTLR start "entryRuleRosTopic"
    // InternalRosInterfacesPool.g:103:1: entryRuleRosTopic : ruleRosTopic EOF ;
    public final void entryRuleRosTopic() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:104:1: ( ruleRosTopic EOF )
            // InternalRosInterfacesPool.g:105:1: ruleRosTopic EOF
            {
             before(grammarAccess.getRosTopicRule()); 
            pushFollow(FOLLOW_1);
            ruleRosTopic();

            state._fsp--;

             after(grammarAccess.getRosTopicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosTopic"


    // $ANTLR start "ruleRosTopic"
    // InternalRosInterfacesPool.g:112:1: ruleRosTopic : ( ( rule__RosTopic__Alternatives ) ) ;
    public final void ruleRosTopic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:116:2: ( ( ( rule__RosTopic__Alternatives ) ) )
            // InternalRosInterfacesPool.g:117:2: ( ( rule__RosTopic__Alternatives ) )
            {
            // InternalRosInterfacesPool.g:117:2: ( ( rule__RosTopic__Alternatives ) )
            // InternalRosInterfacesPool.g:118:3: ( rule__RosTopic__Alternatives )
            {
             before(grammarAccess.getRosTopicAccess().getAlternatives()); 
            // InternalRosInterfacesPool.g:119:3: ( rule__RosTopic__Alternatives )
            // InternalRosInterfacesPool.g:119:4: rule__RosTopic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RosTopic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRosTopicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosTopic"


    // $ANTLR start "entryRuleRosService"
    // InternalRosInterfacesPool.g:128:1: entryRuleRosService : ruleRosService EOF ;
    public final void entryRuleRosService() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:129:1: ( ruleRosService EOF )
            // InternalRosInterfacesPool.g:130:1: ruleRosService EOF
            {
             before(grammarAccess.getRosServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRosService();

            state._fsp--;

             after(grammarAccess.getRosServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosService"


    // $ANTLR start "ruleRosService"
    // InternalRosInterfacesPool.g:137:1: ruleRosService : ( ( rule__RosService__Alternatives ) ) ;
    public final void ruleRosService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:141:2: ( ( ( rule__RosService__Alternatives ) ) )
            // InternalRosInterfacesPool.g:142:2: ( ( rule__RosService__Alternatives ) )
            {
            // InternalRosInterfacesPool.g:142:2: ( ( rule__RosService__Alternatives ) )
            // InternalRosInterfacesPool.g:143:3: ( rule__RosService__Alternatives )
            {
             before(grammarAccess.getRosServiceAccess().getAlternatives()); 
            // InternalRosInterfacesPool.g:144:3: ( rule__RosService__Alternatives )
            // InternalRosInterfacesPool.g:144:4: rule__RosService__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RosService__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRosServiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosService"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalRosInterfacesPool.g:153:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:154:1: ( ruleRosPublisher EOF )
            // InternalRosInterfacesPool.g:155:1: ruleRosPublisher EOF
            {
             before(grammarAccess.getRosPublisherRule()); 
            pushFollow(FOLLOW_1);
            ruleRosPublisher();

            state._fsp--;

             after(grammarAccess.getRosPublisherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosPublisher"


    // $ANTLR start "ruleRosPublisher"
    // InternalRosInterfacesPool.g:162:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:166:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalRosInterfacesPool.g:167:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:167:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalRosInterfacesPool.g:168:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalRosInterfacesPool.g:169:3: ( rule__RosPublisher__Group__0 )
            // InternalRosInterfacesPool.g:169:4: rule__RosPublisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosPublisher"


    // $ANTLR start "entryRuleRosSubscriber"
    // InternalRosInterfacesPool.g:178:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:179:1: ( ruleRosSubscriber EOF )
            // InternalRosInterfacesPool.g:180:1: ruleRosSubscriber EOF
            {
             before(grammarAccess.getRosSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSubscriber();

            state._fsp--;

             after(grammarAccess.getRosSubscriberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosSubscriber"


    // $ANTLR start "ruleRosSubscriber"
    // InternalRosInterfacesPool.g:187:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:191:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalRosInterfacesPool.g:192:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:192:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalRosInterfacesPool.g:193:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalRosInterfacesPool.g:194:3: ( rule__RosSubscriber__Group__0 )
            // InternalRosInterfacesPool.g:194:4: rule__RosSubscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSubscriber"


    // $ANTLR start "entryRuleRosSrvServer"
    // InternalRosInterfacesPool.g:203:1: entryRuleRosSrvServer : ruleRosSrvServer EOF ;
    public final void entryRuleRosSrvServer() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:204:1: ( ruleRosSrvServer EOF )
            // InternalRosInterfacesPool.g:205:1: ruleRosSrvServer EOF
            {
             before(grammarAccess.getRosSrvServerRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSrvServer();

            state._fsp--;

             after(grammarAccess.getRosSrvServerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosSrvServer"


    // $ANTLR start "ruleRosSrvServer"
    // InternalRosInterfacesPool.g:212:1: ruleRosSrvServer : ( ( rule__RosSrvServer__Group__0 ) ) ;
    public final void ruleRosSrvServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:216:2: ( ( ( rule__RosSrvServer__Group__0 ) ) )
            // InternalRosInterfacesPool.g:217:2: ( ( rule__RosSrvServer__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:217:2: ( ( rule__RosSrvServer__Group__0 ) )
            // InternalRosInterfacesPool.g:218:3: ( rule__RosSrvServer__Group__0 )
            {
             before(grammarAccess.getRosSrvServerAccess().getGroup()); 
            // InternalRosInterfacesPool.g:219:3: ( rule__RosSrvServer__Group__0 )
            // InternalRosInterfacesPool.g:219:4: rule__RosSrvServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSrvServer"


    // $ANTLR start "entryRuleRosSrvClient"
    // InternalRosInterfacesPool.g:228:1: entryRuleRosSrvClient : ruleRosSrvClient EOF ;
    public final void entryRuleRosSrvClient() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:229:1: ( ruleRosSrvClient EOF )
            // InternalRosInterfacesPool.g:230:1: ruleRosSrvClient EOF
            {
             before(grammarAccess.getRosSrvClientRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSrvClient();

            state._fsp--;

             after(grammarAccess.getRosSrvClientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosSrvClient"


    // $ANTLR start "ruleRosSrvClient"
    // InternalRosInterfacesPool.g:237:1: ruleRosSrvClient : ( ( rule__RosSrvClient__Group__0 ) ) ;
    public final void ruleRosSrvClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:241:2: ( ( ( rule__RosSrvClient__Group__0 ) ) )
            // InternalRosInterfacesPool.g:242:2: ( ( rule__RosSrvClient__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:242:2: ( ( rule__RosSrvClient__Group__0 ) )
            // InternalRosInterfacesPool.g:243:3: ( rule__RosSrvClient__Group__0 )
            {
             before(grammarAccess.getRosSrvClientAccess().getGroup()); 
            // InternalRosInterfacesPool.g:244:3: ( rule__RosSrvClient__Group__0 )
            // InternalRosInterfacesPool.g:244:4: rule__RosSrvClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSrvClient"


    // $ANTLR start "entryRuleEString"
    // InternalRosInterfacesPool.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:254:1: ( ruleEString EOF )
            // InternalRosInterfacesPool.g:255:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosInterfacesPool.g:262:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:266:2: ( ( RULE_STRING ) )
            // InternalRosInterfacesPool.g:267:2: ( RULE_STRING )
            {
            // InternalRosInterfacesPool.g:267:2: ( RULE_STRING )
            // InternalRosInterfacesPool.g:268:3: RULE_STRING
            {
             before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__RosInterface__Alternatives"
    // InternalRosInterfacesPool.g:277:1: rule__RosInterface__Alternatives : ( ( ruleRosTopic ) | ( ruleRosService ) );
    public final void rule__RosInterface__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:281:1: ( ( ruleRosTopic ) | ( ruleRosService ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==18||LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosInterfacesPool.g:282:2: ( ruleRosTopic )
                    {
                    // InternalRosInterfacesPool.g:282:2: ( ruleRosTopic )
                    // InternalRosInterfacesPool.g:283:3: ruleRosTopic
                    {
                     before(grammarAccess.getRosInterfaceAccess().getRosTopicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRosTopic();

                    state._fsp--;

                     after(grammarAccess.getRosInterfaceAccess().getRosTopicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:288:2: ( ruleRosService )
                    {
                    // InternalRosInterfacesPool.g:288:2: ( ruleRosService )
                    // InternalRosInterfacesPool.g:289:3: ruleRosService
                    {
                     before(grammarAccess.getRosInterfaceAccess().getRosServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRosService();

                    state._fsp--;

                     after(grammarAccess.getRosInterfaceAccess().getRosServiceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterface__Alternatives"


    // $ANTLR start "rule__RosTopic__Alternatives"
    // InternalRosInterfacesPool.g:298:1: rule__RosTopic__Alternatives : ( ( ruleRosPublisher ) | ( ruleRosSubscriber ) );
    public final void rule__RosTopic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:302:1: ( ( ruleRosPublisher ) | ( ruleRosSubscriber ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosInterfacesPool.g:303:2: ( ruleRosPublisher )
                    {
                    // InternalRosInterfacesPool.g:303:2: ( ruleRosPublisher )
                    // InternalRosInterfacesPool.g:304:3: ruleRosPublisher
                    {
                     before(grammarAccess.getRosTopicAccess().getRosPublisherParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRosPublisher();

                    state._fsp--;

                     after(grammarAccess.getRosTopicAccess().getRosPublisherParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:309:2: ( ruleRosSubscriber )
                    {
                    // InternalRosInterfacesPool.g:309:2: ( ruleRosSubscriber )
                    // InternalRosInterfacesPool.g:310:3: ruleRosSubscriber
                    {
                     before(grammarAccess.getRosTopicAccess().getRosSubscriberParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRosSubscriber();

                    state._fsp--;

                     after(grammarAccess.getRosTopicAccess().getRosSubscriberParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosTopic__Alternatives"


    // $ANTLR start "rule__RosService__Alternatives"
    // InternalRosInterfacesPool.g:319:1: rule__RosService__Alternatives : ( ( ruleRosSrvServer ) | ( ruleRosSrvClient ) );
    public final void rule__RosService__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:323:1: ( ( ruleRosSrvServer ) | ( ruleRosSrvClient ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosInterfacesPool.g:324:2: ( ruleRosSrvServer )
                    {
                    // InternalRosInterfacesPool.g:324:2: ( ruleRosSrvServer )
                    // InternalRosInterfacesPool.g:325:3: ruleRosSrvServer
                    {
                     before(grammarAccess.getRosServiceAccess().getRosSrvServerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRosSrvServer();

                    state._fsp--;

                     after(grammarAccess.getRosServiceAccess().getRosSrvServerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:330:2: ( ruleRosSrvClient )
                    {
                    // InternalRosInterfacesPool.g:330:2: ( ruleRosSrvClient )
                    // InternalRosInterfacesPool.g:331:3: ruleRosSrvClient
                    {
                     before(grammarAccess.getRosServiceAccess().getRosSrvClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRosSrvClient();

                    state._fsp--;

                     after(grammarAccess.getRosServiceAccess().getRosSrvClientParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosService__Alternatives"


    // $ANTLR start "rule__RosInterfacesPool__Group__0"
    // InternalRosInterfacesPool.g:340:1: rule__RosInterfacesPool__Group__0 : rule__RosInterfacesPool__Group__0__Impl rule__RosInterfacesPool__Group__1 ;
    public final void rule__RosInterfacesPool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:344:1: ( rule__RosInterfacesPool__Group__0__Impl rule__RosInterfacesPool__Group__1 )
            // InternalRosInterfacesPool.g:345:2: rule__RosInterfacesPool__Group__0__Impl rule__RosInterfacesPool__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosInterfacesPool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterfacesPool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__0"


    // $ANTLR start "rule__RosInterfacesPool__Group__0__Impl"
    // InternalRosInterfacesPool.g:352:1: rule__RosInterfacesPool__Group__0__Impl : ( () ) ;
    public final void rule__RosInterfacesPool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:356:1: ( ( () ) )
            // InternalRosInterfacesPool.g:357:1: ( () )
            {
            // InternalRosInterfacesPool.g:357:1: ( () )
            // InternalRosInterfacesPool.g:358:2: ()
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolAction_0()); 
            // InternalRosInterfacesPool.g:359:2: ()
            // InternalRosInterfacesPool.g:359:3: 
            {
            }

             after(grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__0__Impl"


    // $ANTLR start "rule__RosInterfacesPool__Group__1"
    // InternalRosInterfacesPool.g:367:1: rule__RosInterfacesPool__Group__1 : rule__RosInterfacesPool__Group__1__Impl rule__RosInterfacesPool__Group__2 ;
    public final void rule__RosInterfacesPool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:371:1: ( rule__RosInterfacesPool__Group__1__Impl rule__RosInterfacesPool__Group__2 )
            // InternalRosInterfacesPool.g:372:2: rule__RosInterfacesPool__Group__1__Impl rule__RosInterfacesPool__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosInterfacesPool__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterfacesPool__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__1"


    // $ANTLR start "rule__RosInterfacesPool__Group__1__Impl"
    // InternalRosInterfacesPool.g:379:1: rule__RosInterfacesPool__Group__1__Impl : ( 'RosInterfacesPool' ) ;
    public final void rule__RosInterfacesPool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:383:1: ( ( 'RosInterfacesPool' ) )
            // InternalRosInterfacesPool.g:384:1: ( 'RosInterfacesPool' )
            {
            // InternalRosInterfacesPool.g:384:1: ( 'RosInterfacesPool' )
            // InternalRosInterfacesPool.g:385:2: 'RosInterfacesPool'
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__1__Impl"


    // $ANTLR start "rule__RosInterfacesPool__Group__2"
    // InternalRosInterfacesPool.g:394:1: rule__RosInterfacesPool__Group__2 : rule__RosInterfacesPool__Group__2__Impl rule__RosInterfacesPool__Group__3 ;
    public final void rule__RosInterfacesPool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:398:1: ( rule__RosInterfacesPool__Group__2__Impl rule__RosInterfacesPool__Group__3 )
            // InternalRosInterfacesPool.g:399:2: rule__RosInterfacesPool__Group__2__Impl rule__RosInterfacesPool__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RosInterfacesPool__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterfacesPool__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__2"


    // $ANTLR start "rule__RosInterfacesPool__Group__2__Impl"
    // InternalRosInterfacesPool.g:406:1: rule__RosInterfacesPool__Group__2__Impl : ( '{' ) ;
    public final void rule__RosInterfacesPool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:410:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:411:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:411:1: ( '{' )
            // InternalRosInterfacesPool.g:412:2: '{'
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosInterfacesPoolAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__2__Impl"


    // $ANTLR start "rule__RosInterfacesPool__Group__3"
    // InternalRosInterfacesPool.g:421:1: rule__RosInterfacesPool__Group__3 : rule__RosInterfacesPool__Group__3__Impl rule__RosInterfacesPool__Group__4 ;
    public final void rule__RosInterfacesPool__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:425:1: ( rule__RosInterfacesPool__Group__3__Impl rule__RosInterfacesPool__Group__4 )
            // InternalRosInterfacesPool.g:426:2: rule__RosInterfacesPool__Group__3__Impl rule__RosInterfacesPool__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RosInterfacesPool__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosInterfacesPool__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__3"


    // $ANTLR start "rule__RosInterfacesPool__Group__3__Impl"
    // InternalRosInterfacesPool.g:433:1: rule__RosInterfacesPool__Group__3__Impl : ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* ) ;
    public final void rule__RosInterfacesPool__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:437:1: ( ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* ) )
            // InternalRosInterfacesPool.g:438:1: ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* )
            {
            // InternalRosInterfacesPool.g:438:1: ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* )
            // InternalRosInterfacesPool.g:439:2: ( rule__RosInterfacesPool__InterfacesAssignment_3 )*
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getInterfacesAssignment_3()); 
            // InternalRosInterfacesPool.g:440:2: ( rule__RosInterfacesPool__InterfacesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||(LA4_0>=17 && LA4_0<=18)||LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRosInterfacesPool.g:440:3: rule__RosInterfacesPool__InterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RosInterfacesPool__InterfacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRosInterfacesPoolAccess().getInterfacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__3__Impl"


    // $ANTLR start "rule__RosInterfacesPool__Group__4"
    // InternalRosInterfacesPool.g:448:1: rule__RosInterfacesPool__Group__4 : rule__RosInterfacesPool__Group__4__Impl ;
    public final void rule__RosInterfacesPool__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:452:1: ( rule__RosInterfacesPool__Group__4__Impl )
            // InternalRosInterfacesPool.g:453:2: rule__RosInterfacesPool__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosInterfacesPool__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__4"


    // $ANTLR start "rule__RosInterfacesPool__Group__4__Impl"
    // InternalRosInterfacesPool.g:459:1: rule__RosInterfacesPool__Group__4__Impl : ( '}' ) ;
    public final void rule__RosInterfacesPool__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:463:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:464:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:464:1: ( '}' )
            // InternalRosInterfacesPool.g:465:2: '}'
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosInterfacesPoolAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__Group__4__Impl"


    // $ANTLR start "rule__RosPublisher__Group__0"
    // InternalRosInterfacesPool.g:475:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:479:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalRosInterfacesPool.g:480:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosPublisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__0"


    // $ANTLR start "rule__RosPublisher__Group__0__Impl"
    // InternalRosInterfacesPool.g:487:1: rule__RosPublisher__Group__0__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:491:1: ( ( 'RosPublisher' ) )
            // InternalRosInterfacesPool.g:492:1: ( 'RosPublisher' )
            {
            // InternalRosInterfacesPool.g:492:1: ( 'RosPublisher' )
            // InternalRosInterfacesPool.g:493:2: 'RosPublisher'
            {
             before(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRosPublisherKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__0__Impl"


    // $ANTLR start "rule__RosPublisher__Group__1"
    // InternalRosInterfacesPool.g:502:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:506:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalRosInterfacesPool.g:507:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosPublisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__1"


    // $ANTLR start "rule__RosPublisher__Group__1__Impl"
    // InternalRosInterfacesPool.g:514:1: rule__RosPublisher__Group__1__Impl : ( ( rule__RosPublisher__NameAssignment_1 ) ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:518:1: ( ( ( rule__RosPublisher__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:519:1: ( ( rule__RosPublisher__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:519:1: ( ( rule__RosPublisher__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:520:2: ( rule__RosPublisher__NameAssignment_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:521:2: ( rule__RosPublisher__NameAssignment_1 )
            // InternalRosInterfacesPool.g:521:3: rule__RosPublisher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__1__Impl"


    // $ANTLR start "rule__RosPublisher__Group__2"
    // InternalRosInterfacesPool.g:529:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:533:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalRosInterfacesPool.g:534:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RosPublisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__2"


    // $ANTLR start "rule__RosPublisher__Group__2__Impl"
    // InternalRosInterfacesPool.g:541:1: rule__RosPublisher__Group__2__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:545:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:546:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:546:1: ( '{' )
            // InternalRosInterfacesPool.g:547:2: '{'
            {
             before(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__2__Impl"


    // $ANTLR start "rule__RosPublisher__Group__3"
    // InternalRosInterfacesPool.g:556:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:560:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalRosInterfacesPool.g:561:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RosPublisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__3"


    // $ANTLR start "rule__RosPublisher__Group__3__Impl"
    // InternalRosInterfacesPool.g:568:1: rule__RosPublisher__Group__3__Impl : ( 'topicName' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:572:1: ( ( 'topicName' ) )
            // InternalRosInterfacesPool.g:573:1: ( 'topicName' )
            {
            // InternalRosInterfacesPool.g:573:1: ( 'topicName' )
            // InternalRosInterfacesPool.g:574:2: 'topicName'
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getTopicNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__3__Impl"


    // $ANTLR start "rule__RosPublisher__Group__4"
    // InternalRosInterfacesPool.g:583:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:587:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalRosInterfacesPool.g:588:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RosPublisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__4"


    // $ANTLR start "rule__RosPublisher__Group__4__Impl"
    // InternalRosInterfacesPool.g:595:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__TopicNameAssignment_4 ) ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:599:1: ( ( ( rule__RosPublisher__TopicNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:600:1: ( ( rule__RosPublisher__TopicNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:600:1: ( ( rule__RosPublisher__TopicNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:601:2: ( rule__RosPublisher__TopicNameAssignment_4 )
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameAssignment_4()); 
            // InternalRosInterfacesPool.g:602:2: ( rule__RosPublisher__TopicNameAssignment_4 )
            // InternalRosInterfacesPool.g:602:3: rule__RosPublisher__TopicNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__TopicNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getTopicNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__4__Impl"


    // $ANTLR start "rule__RosPublisher__Group__5"
    // InternalRosInterfacesPool.g:610:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:614:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalRosInterfacesPool.g:615:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RosPublisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__5"


    // $ANTLR start "rule__RosPublisher__Group__5__Impl"
    // InternalRosInterfacesPool.g:622:1: rule__RosPublisher__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:626:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:627:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:627:1: ( 'type' )
            // InternalRosInterfacesPool.g:628:2: 'type'
            {
             before(grammarAccess.getRosPublisherAccess().getTypeKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__5__Impl"


    // $ANTLR start "rule__RosPublisher__Group__6"
    // InternalRosInterfacesPool.g:637:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:641:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalRosInterfacesPool.g:642:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RosPublisher__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__6"


    // $ANTLR start "rule__RosPublisher__Group__6__Impl"
    // InternalRosInterfacesPool.g:649:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__TypeAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:653:1: ( ( ( rule__RosPublisher__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:654:1: ( ( rule__RosPublisher__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:654:1: ( ( rule__RosPublisher__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:655:2: ( rule__RosPublisher__TypeAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:656:2: ( rule__RosPublisher__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:656:3: rule__RosPublisher__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosPublisherAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__6__Impl"


    // $ANTLR start "rule__RosPublisher__Group__7"
    // InternalRosInterfacesPool.g:664:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:668:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalRosInterfacesPool.g:669:2: rule__RosPublisher__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPublisher__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__7"


    // $ANTLR start "rule__RosPublisher__Group__7__Impl"
    // InternalRosInterfacesPool.g:675:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:679:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:680:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:680:1: ( '}' )
            // InternalRosInterfacesPool.g:681:2: '}'
            {
             before(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__Group__7__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__0"
    // InternalRosInterfacesPool.g:691:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:695:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalRosInterfacesPool.g:696:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosSubscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__0"


    // $ANTLR start "rule__RosSubscriber__Group__0__Impl"
    // InternalRosInterfacesPool.g:703:1: rule__RosSubscriber__Group__0__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:707:1: ( ( 'RosSubscriber' ) )
            // InternalRosInterfacesPool.g:708:1: ( 'RosSubscriber' )
            {
            // InternalRosInterfacesPool.g:708:1: ( 'RosSubscriber' )
            // InternalRosInterfacesPool.g:709:2: 'RosSubscriber'
            {
             before(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRosSubscriberKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__0__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__1"
    // InternalRosInterfacesPool.g:718:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:722:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalRosInterfacesPool.g:723:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSubscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__1"


    // $ANTLR start "rule__RosSubscriber__Group__1__Impl"
    // InternalRosInterfacesPool.g:730:1: rule__RosSubscriber__Group__1__Impl : ( ( rule__RosSubscriber__NameAssignment_1 ) ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:734:1: ( ( ( rule__RosSubscriber__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:735:1: ( ( rule__RosSubscriber__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:735:1: ( ( rule__RosSubscriber__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:736:2: ( rule__RosSubscriber__NameAssignment_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:737:2: ( rule__RosSubscriber__NameAssignment_1 )
            // InternalRosInterfacesPool.g:737:3: rule__RosSubscriber__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__1__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__2"
    // InternalRosInterfacesPool.g:745:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:749:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalRosInterfacesPool.g:750:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__RosSubscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__2"


    // $ANTLR start "rule__RosSubscriber__Group__2__Impl"
    // InternalRosInterfacesPool.g:757:1: rule__RosSubscriber__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:761:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:762:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:762:1: ( '{' )
            // InternalRosInterfacesPool.g:763:2: '{'
            {
             before(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__2__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__3"
    // InternalRosInterfacesPool.g:772:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:776:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalRosInterfacesPool.g:777:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RosSubscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__3"


    // $ANTLR start "rule__RosSubscriber__Group__3__Impl"
    // InternalRosInterfacesPool.g:784:1: rule__RosSubscriber__Group__3__Impl : ( 'topicName' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:788:1: ( ( 'topicName' ) )
            // InternalRosInterfacesPool.g:789:1: ( 'topicName' )
            {
            // InternalRosInterfacesPool.g:789:1: ( 'topicName' )
            // InternalRosInterfacesPool.g:790:2: 'topicName'
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getTopicNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__3__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__4"
    // InternalRosInterfacesPool.g:799:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:803:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalRosInterfacesPool.g:804:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RosSubscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__4"


    // $ANTLR start "rule__RosSubscriber__Group__4__Impl"
    // InternalRosInterfacesPool.g:811:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__TopicNameAssignment_4 ) ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:815:1: ( ( ( rule__RosSubscriber__TopicNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:816:1: ( ( rule__RosSubscriber__TopicNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:816:1: ( ( rule__RosSubscriber__TopicNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:817:2: ( rule__RosSubscriber__TopicNameAssignment_4 )
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameAssignment_4()); 
            // InternalRosInterfacesPool.g:818:2: ( rule__RosSubscriber__TopicNameAssignment_4 )
            // InternalRosInterfacesPool.g:818:3: rule__RosSubscriber__TopicNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__TopicNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getTopicNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__4__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__5"
    // InternalRosInterfacesPool.g:826:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:830:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalRosInterfacesPool.g:831:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RosSubscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__5"


    // $ANTLR start "rule__RosSubscriber__Group__5__Impl"
    // InternalRosInterfacesPool.g:838:1: rule__RosSubscriber__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:842:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:843:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:843:1: ( 'type' )
            // InternalRosInterfacesPool.g:844:2: 'type'
            {
             before(grammarAccess.getRosSubscriberAccess().getTypeKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__5__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__6"
    // InternalRosInterfacesPool.g:853:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:857:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalRosInterfacesPool.g:858:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RosSubscriber__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__6"


    // $ANTLR start "rule__RosSubscriber__Group__6__Impl"
    // InternalRosInterfacesPool.g:865:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__TypeAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:869:1: ( ( ( rule__RosSubscriber__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:870:1: ( ( rule__RosSubscriber__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:870:1: ( ( rule__RosSubscriber__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:871:2: ( rule__RosSubscriber__TypeAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:872:2: ( rule__RosSubscriber__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:872:3: rule__RosSubscriber__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosSubscriberAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__6__Impl"


    // $ANTLR start "rule__RosSubscriber__Group__7"
    // InternalRosInterfacesPool.g:880:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:884:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalRosInterfacesPool.g:885:2: rule__RosSubscriber__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSubscriber__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__7"


    // $ANTLR start "rule__RosSubscriber__Group__7__Impl"
    // InternalRosInterfacesPool.g:891:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:895:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:896:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:896:1: ( '}' )
            // InternalRosInterfacesPool.g:897:2: '}'
            {
             before(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__Group__7__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__0"
    // InternalRosInterfacesPool.g:907:1: rule__RosSrvServer__Group__0 : rule__RosSrvServer__Group__0__Impl rule__RosSrvServer__Group__1 ;
    public final void rule__RosSrvServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:911:1: ( rule__RosSrvServer__Group__0__Impl rule__RosSrvServer__Group__1 )
            // InternalRosInterfacesPool.g:912:2: rule__RosSrvServer__Group__0__Impl rule__RosSrvServer__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosSrvServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__0"


    // $ANTLR start "rule__RosSrvServer__Group__0__Impl"
    // InternalRosInterfacesPool.g:919:1: rule__RosSrvServer__Group__0__Impl : ( 'RosSrvServer' ) ;
    public final void rule__RosSrvServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:923:1: ( ( 'RosSrvServer' ) )
            // InternalRosInterfacesPool.g:924:1: ( 'RosSrvServer' )
            {
            // InternalRosInterfacesPool.g:924:1: ( 'RosSrvServer' )
            // InternalRosInterfacesPool.g:925:2: 'RosSrvServer'
            {
             before(grammarAccess.getRosSrvServerAccess().getRosSrvServerKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSrvServerAccess().getRosSrvServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__0__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__1"
    // InternalRosInterfacesPool.g:934:1: rule__RosSrvServer__Group__1 : rule__RosSrvServer__Group__1__Impl rule__RosSrvServer__Group__2 ;
    public final void rule__RosSrvServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:938:1: ( rule__RosSrvServer__Group__1__Impl rule__RosSrvServer__Group__2 )
            // InternalRosInterfacesPool.g:939:2: rule__RosSrvServer__Group__1__Impl rule__RosSrvServer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSrvServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__1"


    // $ANTLR start "rule__RosSrvServer__Group__1__Impl"
    // InternalRosInterfacesPool.g:946:1: rule__RosSrvServer__Group__1__Impl : ( ( rule__RosSrvServer__NameAssignment_1 ) ) ;
    public final void rule__RosSrvServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:950:1: ( ( ( rule__RosSrvServer__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:951:1: ( ( rule__RosSrvServer__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:951:1: ( ( rule__RosSrvServer__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:952:2: ( rule__RosSrvServer__NameAssignment_1 )
            {
             before(grammarAccess.getRosSrvServerAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:953:2: ( rule__RosSrvServer__NameAssignment_1 )
            // InternalRosInterfacesPool.g:953:3: rule__RosSrvServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__1__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__2"
    // InternalRosInterfacesPool.g:961:1: rule__RosSrvServer__Group__2 : rule__RosSrvServer__Group__2__Impl rule__RosSrvServer__Group__3 ;
    public final void rule__RosSrvServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:965:1: ( rule__RosSrvServer__Group__2__Impl rule__RosSrvServer__Group__3 )
            // InternalRosInterfacesPool.g:966:2: rule__RosSrvServer__Group__2__Impl rule__RosSrvServer__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RosSrvServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__2"


    // $ANTLR start "rule__RosSrvServer__Group__2__Impl"
    // InternalRosInterfacesPool.g:973:1: rule__RosSrvServer__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSrvServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:977:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:978:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:978:1: ( '{' )
            // InternalRosInterfacesPool.g:979:2: '{'
            {
             before(grammarAccess.getRosSrvServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSrvServerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__2__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__3"
    // InternalRosInterfacesPool.g:988:1: rule__RosSrvServer__Group__3 : rule__RosSrvServer__Group__3__Impl rule__RosSrvServer__Group__4 ;
    public final void rule__RosSrvServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:992:1: ( rule__RosSrvServer__Group__3__Impl rule__RosSrvServer__Group__4 )
            // InternalRosInterfacesPool.g:993:2: rule__RosSrvServer__Group__3__Impl rule__RosSrvServer__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RosSrvServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__3"


    // $ANTLR start "rule__RosSrvServer__Group__3__Impl"
    // InternalRosInterfacesPool.g:1000:1: rule__RosSrvServer__Group__3__Impl : ( 'srvName' ) ;
    public final void rule__RosSrvServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1004:1: ( ( 'srvName' ) )
            // InternalRosInterfacesPool.g:1005:1: ( 'srvName' )
            {
            // InternalRosInterfacesPool.g:1005:1: ( 'srvName' )
            // InternalRosInterfacesPool.g:1006:2: 'srvName'
            {
             before(grammarAccess.getRosSrvServerAccess().getSrvNameKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRosSrvServerAccess().getSrvNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__3__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__4"
    // InternalRosInterfacesPool.g:1015:1: rule__RosSrvServer__Group__4 : rule__RosSrvServer__Group__4__Impl rule__RosSrvServer__Group__5 ;
    public final void rule__RosSrvServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1019:1: ( rule__RosSrvServer__Group__4__Impl rule__RosSrvServer__Group__5 )
            // InternalRosInterfacesPool.g:1020:2: rule__RosSrvServer__Group__4__Impl rule__RosSrvServer__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RosSrvServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__4"


    // $ANTLR start "rule__RosSrvServer__Group__4__Impl"
    // InternalRosInterfacesPool.g:1027:1: rule__RosSrvServer__Group__4__Impl : ( ( rule__RosSrvServer__SrvNameAssignment_4 ) ) ;
    public final void rule__RosSrvServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1031:1: ( ( ( rule__RosSrvServer__SrvNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:1032:1: ( ( rule__RosSrvServer__SrvNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:1032:1: ( ( rule__RosSrvServer__SrvNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:1033:2: ( rule__RosSrvServer__SrvNameAssignment_4 )
            {
             before(grammarAccess.getRosSrvServerAccess().getSrvNameAssignment_4()); 
            // InternalRosInterfacesPool.g:1034:2: ( rule__RosSrvServer__SrvNameAssignment_4 )
            // InternalRosInterfacesPool.g:1034:3: rule__RosSrvServer__SrvNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvServer__SrvNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvServerAccess().getSrvNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__4__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__5"
    // InternalRosInterfacesPool.g:1042:1: rule__RosSrvServer__Group__5 : rule__RosSrvServer__Group__5__Impl rule__RosSrvServer__Group__6 ;
    public final void rule__RosSrvServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1046:1: ( rule__RosSrvServer__Group__5__Impl rule__RosSrvServer__Group__6 )
            // InternalRosInterfacesPool.g:1047:2: rule__RosSrvServer__Group__5__Impl rule__RosSrvServer__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RosSrvServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__5"


    // $ANTLR start "rule__RosSrvServer__Group__5__Impl"
    // InternalRosInterfacesPool.g:1054:1: rule__RosSrvServer__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosSrvServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1058:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:1059:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:1059:1: ( 'type' )
            // InternalRosInterfacesPool.g:1060:2: 'type'
            {
             before(grammarAccess.getRosSrvServerAccess().getTypeKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSrvServerAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__5__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__6"
    // InternalRosInterfacesPool.g:1069:1: rule__RosSrvServer__Group__6 : rule__RosSrvServer__Group__6__Impl rule__RosSrvServer__Group__7 ;
    public final void rule__RosSrvServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1073:1: ( rule__RosSrvServer__Group__6__Impl rule__RosSrvServer__Group__7 )
            // InternalRosInterfacesPool.g:1074:2: rule__RosSrvServer__Group__6__Impl rule__RosSrvServer__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RosSrvServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__6"


    // $ANTLR start "rule__RosSrvServer__Group__6__Impl"
    // InternalRosInterfacesPool.g:1081:1: rule__RosSrvServer__Group__6__Impl : ( ( rule__RosSrvServer__TypeAssignment_6 ) ) ;
    public final void rule__RosSrvServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1085:1: ( ( ( rule__RosSrvServer__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:1086:1: ( ( rule__RosSrvServer__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:1086:1: ( ( rule__RosSrvServer__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:1087:2: ( rule__RosSrvServer__TypeAssignment_6 )
            {
             before(grammarAccess.getRosSrvServerAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:1088:2: ( rule__RosSrvServer__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:1088:3: rule__RosSrvServer__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvServer__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvServerAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__6__Impl"


    // $ANTLR start "rule__RosSrvServer__Group__7"
    // InternalRosInterfacesPool.g:1096:1: rule__RosSrvServer__Group__7 : rule__RosSrvServer__Group__7__Impl ;
    public final void rule__RosSrvServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1100:1: ( rule__RosSrvServer__Group__7__Impl )
            // InternalRosInterfacesPool.g:1101:2: rule__RosSrvServer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvServer__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__7"


    // $ANTLR start "rule__RosSrvServer__Group__7__Impl"
    // InternalRosInterfacesPool.g:1107:1: rule__RosSrvServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSrvServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1111:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:1112:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:1112:1: ( '}' )
            // InternalRosInterfacesPool.g:1113:2: '}'
            {
             before(grammarAccess.getRosSrvServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSrvServerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__Group__7__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__0"
    // InternalRosInterfacesPool.g:1123:1: rule__RosSrvClient__Group__0 : rule__RosSrvClient__Group__0__Impl rule__RosSrvClient__Group__1 ;
    public final void rule__RosSrvClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1127:1: ( rule__RosSrvClient__Group__0__Impl rule__RosSrvClient__Group__1 )
            // InternalRosInterfacesPool.g:1128:2: rule__RosSrvClient__Group__0__Impl rule__RosSrvClient__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosSrvClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__0"


    // $ANTLR start "rule__RosSrvClient__Group__0__Impl"
    // InternalRosInterfacesPool.g:1135:1: rule__RosSrvClient__Group__0__Impl : ( 'RosSrvClient' ) ;
    public final void rule__RosSrvClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1139:1: ( ( 'RosSrvClient' ) )
            // InternalRosInterfacesPool.g:1140:1: ( 'RosSrvClient' )
            {
            // InternalRosInterfacesPool.g:1140:1: ( 'RosSrvClient' )
            // InternalRosInterfacesPool.g:1141:2: 'RosSrvClient'
            {
             before(grammarAccess.getRosSrvClientAccess().getRosSrvClientKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRosSrvClientAccess().getRosSrvClientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__0__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__1"
    // InternalRosInterfacesPool.g:1150:1: rule__RosSrvClient__Group__1 : rule__RosSrvClient__Group__1__Impl rule__RosSrvClient__Group__2 ;
    public final void rule__RosSrvClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1154:1: ( rule__RosSrvClient__Group__1__Impl rule__RosSrvClient__Group__2 )
            // InternalRosInterfacesPool.g:1155:2: rule__RosSrvClient__Group__1__Impl rule__RosSrvClient__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSrvClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__1"


    // $ANTLR start "rule__RosSrvClient__Group__1__Impl"
    // InternalRosInterfacesPool.g:1162:1: rule__RosSrvClient__Group__1__Impl : ( ( rule__RosSrvClient__NameAssignment_1 ) ) ;
    public final void rule__RosSrvClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1166:1: ( ( ( rule__RosSrvClient__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:1167:1: ( ( rule__RosSrvClient__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:1167:1: ( ( rule__RosSrvClient__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:1168:2: ( rule__RosSrvClient__NameAssignment_1 )
            {
             before(grammarAccess.getRosSrvClientAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:1169:2: ( rule__RosSrvClient__NameAssignment_1 )
            // InternalRosInterfacesPool.g:1169:3: rule__RosSrvClient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvClient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvClientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__1__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__2"
    // InternalRosInterfacesPool.g:1177:1: rule__RosSrvClient__Group__2 : rule__RosSrvClient__Group__2__Impl rule__RosSrvClient__Group__3 ;
    public final void rule__RosSrvClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1181:1: ( rule__RosSrvClient__Group__2__Impl rule__RosSrvClient__Group__3 )
            // InternalRosInterfacesPool.g:1182:2: rule__RosSrvClient__Group__2__Impl rule__RosSrvClient__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__RosSrvClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__2"


    // $ANTLR start "rule__RosSrvClient__Group__2__Impl"
    // InternalRosInterfacesPool.g:1189:1: rule__RosSrvClient__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSrvClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1193:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:1194:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:1194:1: ( '{' )
            // InternalRosInterfacesPool.g:1195:2: '{'
            {
             before(grammarAccess.getRosSrvClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSrvClientAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__2__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__3"
    // InternalRosInterfacesPool.g:1204:1: rule__RosSrvClient__Group__3 : rule__RosSrvClient__Group__3__Impl rule__RosSrvClient__Group__4 ;
    public final void rule__RosSrvClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1208:1: ( rule__RosSrvClient__Group__3__Impl rule__RosSrvClient__Group__4 )
            // InternalRosInterfacesPool.g:1209:2: rule__RosSrvClient__Group__3__Impl rule__RosSrvClient__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RosSrvClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__3"


    // $ANTLR start "rule__RosSrvClient__Group__3__Impl"
    // InternalRosInterfacesPool.g:1216:1: rule__RosSrvClient__Group__3__Impl : ( 'srvName' ) ;
    public final void rule__RosSrvClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1220:1: ( ( 'srvName' ) )
            // InternalRosInterfacesPool.g:1221:1: ( 'srvName' )
            {
            // InternalRosInterfacesPool.g:1221:1: ( 'srvName' )
            // InternalRosInterfacesPool.g:1222:2: 'srvName'
            {
             before(grammarAccess.getRosSrvClientAccess().getSrvNameKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRosSrvClientAccess().getSrvNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__3__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__4"
    // InternalRosInterfacesPool.g:1231:1: rule__RosSrvClient__Group__4 : rule__RosSrvClient__Group__4__Impl rule__RosSrvClient__Group__5 ;
    public final void rule__RosSrvClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1235:1: ( rule__RosSrvClient__Group__4__Impl rule__RosSrvClient__Group__5 )
            // InternalRosInterfacesPool.g:1236:2: rule__RosSrvClient__Group__4__Impl rule__RosSrvClient__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RosSrvClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__4"


    // $ANTLR start "rule__RosSrvClient__Group__4__Impl"
    // InternalRosInterfacesPool.g:1243:1: rule__RosSrvClient__Group__4__Impl : ( ( rule__RosSrvClient__SrvNameAssignment_4 ) ) ;
    public final void rule__RosSrvClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1247:1: ( ( ( rule__RosSrvClient__SrvNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:1248:1: ( ( rule__RosSrvClient__SrvNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:1248:1: ( ( rule__RosSrvClient__SrvNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:1249:2: ( rule__RosSrvClient__SrvNameAssignment_4 )
            {
             before(grammarAccess.getRosSrvClientAccess().getSrvNameAssignment_4()); 
            // InternalRosInterfacesPool.g:1250:2: ( rule__RosSrvClient__SrvNameAssignment_4 )
            // InternalRosInterfacesPool.g:1250:3: rule__RosSrvClient__SrvNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvClient__SrvNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvClientAccess().getSrvNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__4__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__5"
    // InternalRosInterfacesPool.g:1258:1: rule__RosSrvClient__Group__5 : rule__RosSrvClient__Group__5__Impl rule__RosSrvClient__Group__6 ;
    public final void rule__RosSrvClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1262:1: ( rule__RosSrvClient__Group__5__Impl rule__RosSrvClient__Group__6 )
            // InternalRosInterfacesPool.g:1263:2: rule__RosSrvClient__Group__5__Impl rule__RosSrvClient__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RosSrvClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__5"


    // $ANTLR start "rule__RosSrvClient__Group__5__Impl"
    // InternalRosInterfacesPool.g:1270:1: rule__RosSrvClient__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosSrvClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1274:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:1275:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:1275:1: ( 'type' )
            // InternalRosInterfacesPool.g:1276:2: 'type'
            {
             before(grammarAccess.getRosSrvClientAccess().getTypeKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSrvClientAccess().getTypeKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__5__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__6"
    // InternalRosInterfacesPool.g:1285:1: rule__RosSrvClient__Group__6 : rule__RosSrvClient__Group__6__Impl rule__RosSrvClient__Group__7 ;
    public final void rule__RosSrvClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1289:1: ( rule__RosSrvClient__Group__6__Impl rule__RosSrvClient__Group__7 )
            // InternalRosInterfacesPool.g:1290:2: rule__RosSrvClient__Group__6__Impl rule__RosSrvClient__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RosSrvClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__6"


    // $ANTLR start "rule__RosSrvClient__Group__6__Impl"
    // InternalRosInterfacesPool.g:1297:1: rule__RosSrvClient__Group__6__Impl : ( ( rule__RosSrvClient__TypeAssignment_6 ) ) ;
    public final void rule__RosSrvClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1301:1: ( ( ( rule__RosSrvClient__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:1302:1: ( ( rule__RosSrvClient__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:1302:1: ( ( rule__RosSrvClient__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:1303:2: ( rule__RosSrvClient__TypeAssignment_6 )
            {
             before(grammarAccess.getRosSrvClientAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:1304:2: ( rule__RosSrvClient__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:1304:3: rule__RosSrvClient__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvClient__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosSrvClientAccess().getTypeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__6__Impl"


    // $ANTLR start "rule__RosSrvClient__Group__7"
    // InternalRosInterfacesPool.g:1312:1: rule__RosSrvClient__Group__7 : rule__RosSrvClient__Group__7__Impl ;
    public final void rule__RosSrvClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1316:1: ( rule__RosSrvClient__Group__7__Impl )
            // InternalRosInterfacesPool.g:1317:2: rule__RosSrvClient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSrvClient__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__7"


    // $ANTLR start "rule__RosSrvClient__Group__7__Impl"
    // InternalRosInterfacesPool.g:1323:1: rule__RosSrvClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSrvClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1327:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:1328:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:1328:1: ( '}' )
            // InternalRosInterfacesPool.g:1329:2: '}'
            {
             before(grammarAccess.getRosSrvClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSrvClientAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__Group__7__Impl"


    // $ANTLR start "rule__RosInterfacesPool__InterfacesAssignment_3"
    // InternalRosInterfacesPool.g:1339:1: rule__RosInterfacesPool__InterfacesAssignment_3 : ( ruleRosInterface ) ;
    public final void rule__RosInterfacesPool__InterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1343:1: ( ( ruleRosInterface ) )
            // InternalRosInterfacesPool.g:1344:2: ( ruleRosInterface )
            {
            // InternalRosInterfacesPool.g:1344:2: ( ruleRosInterface )
            // InternalRosInterfacesPool.g:1345:3: ruleRosInterface
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getInterfacesRosInterfaceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRosInterface();

            state._fsp--;

             after(grammarAccess.getRosInterfacesPoolAccess().getInterfacesRosInterfaceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosInterfacesPool__InterfacesAssignment_3"


    // $ANTLR start "rule__RosPublisher__NameAssignment_1"
    // InternalRosInterfacesPool.g:1354:1: rule__RosPublisher__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosPublisher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1358:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1359:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1359:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1360:3: RULE_ID
            {
             before(grammarAccess.getRosPublisherAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRosPublisherAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__NameAssignment_1"


    // $ANTLR start "rule__RosPublisher__TopicNameAssignment_4"
    // InternalRosInterfacesPool.g:1369:1: rule__RosPublisher__TopicNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosPublisher__TopicNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1373:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1374:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1374:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1375:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getTopicNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__TopicNameAssignment_4"


    // $ANTLR start "rule__RosPublisher__TypeAssignment_6"
    // InternalRosInterfacesPool.g:1384:1: rule__RosPublisher__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosPublisher__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1388:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1389:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1389:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1390:3: ruleEString
            {
             before(grammarAccess.getRosPublisherAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosPublisherAccess().getTypeEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosPublisher__TypeAssignment_6"


    // $ANTLR start "rule__RosSubscriber__NameAssignment_1"
    // InternalRosInterfacesPool.g:1399:1: rule__RosSubscriber__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosSubscriber__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1403:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1404:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1404:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1405:3: RULE_ID
            {
             before(grammarAccess.getRosSubscriberAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRosSubscriberAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__NameAssignment_1"


    // $ANTLR start "rule__RosSubscriber__TopicNameAssignment_4"
    // InternalRosInterfacesPool.g:1414:1: rule__RosSubscriber__TopicNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSubscriber__TopicNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1418:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1419:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1419:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1420:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getTopicNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__TopicNameAssignment_4"


    // $ANTLR start "rule__RosSubscriber__TypeAssignment_6"
    // InternalRosInterfacesPool.g:1429:1: rule__RosSubscriber__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosSubscriber__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1433:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1434:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1434:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1435:3: ruleEString
            {
             before(grammarAccess.getRosSubscriberAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSubscriberAccess().getTypeEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSubscriber__TypeAssignment_6"


    // $ANTLR start "rule__RosSrvServer__NameAssignment_1"
    // InternalRosInterfacesPool.g:1444:1: rule__RosSrvServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosSrvServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1448:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1449:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1449:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1450:3: RULE_ID
            {
             before(grammarAccess.getRosSrvServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRosSrvServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__NameAssignment_1"


    // $ANTLR start "rule__RosSrvServer__SrvNameAssignment_4"
    // InternalRosInterfacesPool.g:1459:1: rule__RosSrvServer__SrvNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSrvServer__SrvNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1463:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1464:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1464:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1465:3: ruleEString
            {
             before(grammarAccess.getRosSrvServerAccess().getSrvNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSrvServerAccess().getSrvNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__SrvNameAssignment_4"


    // $ANTLR start "rule__RosSrvServer__TypeAssignment_6"
    // InternalRosInterfacesPool.g:1474:1: rule__RosSrvServer__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosSrvServer__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1478:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1479:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1479:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1480:3: ruleEString
            {
             before(grammarAccess.getRosSrvServerAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSrvServerAccess().getTypeEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvServer__TypeAssignment_6"


    // $ANTLR start "rule__RosSrvClient__NameAssignment_1"
    // InternalRosInterfacesPool.g:1489:1: rule__RosSrvClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosSrvClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1493:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1494:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1494:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1495:3: RULE_ID
            {
             before(grammarAccess.getRosSrvClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRosSrvClientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__NameAssignment_1"


    // $ANTLR start "rule__RosSrvClient__SrvNameAssignment_4"
    // InternalRosInterfacesPool.g:1504:1: rule__RosSrvClient__SrvNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSrvClient__SrvNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1508:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1509:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1509:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1510:3: ruleEString
            {
             before(grammarAccess.getRosSrvClientAccess().getSrvNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSrvClientAccess().getSrvNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__SrvNameAssignment_4"


    // $ANTLR start "rule__RosSrvClient__TypeAssignment_6"
    // InternalRosInterfacesPool.g:1519:1: rule__RosSrvClient__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosSrvClient__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1523:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1524:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1524:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1525:3: ruleEString
            {
             before(grammarAccess.getRosSrvClientAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSrvClientAccess().getTypeEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSrvClient__TypeAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000166000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000164002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});

}
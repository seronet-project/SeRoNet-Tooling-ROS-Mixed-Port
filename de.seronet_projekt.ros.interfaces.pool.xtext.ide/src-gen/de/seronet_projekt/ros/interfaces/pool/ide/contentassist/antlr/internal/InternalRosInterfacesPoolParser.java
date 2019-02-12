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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosInterfacesPool'", "'{'", "'}'", "'RosPublisher'", "'topicName'", "'type'", "'RosSubscriber'", "'RosSrvServer'", "'srvName'", "'RosSrvClient'", "'RosActionServer'", "'actionName'", "'RosActionClient'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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


    // $ANTLR start "entryRuleRosAction"
    // InternalRosInterfacesPool.g:153:1: entryRuleRosAction : ruleRosAction EOF ;
    public final void entryRuleRosAction() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:154:1: ( ruleRosAction EOF )
            // InternalRosInterfacesPool.g:155:1: ruleRosAction EOF
            {
             before(grammarAccess.getRosActionRule()); 
            pushFollow(FOLLOW_1);
            ruleRosAction();

            state._fsp--;

             after(grammarAccess.getRosActionRule()); 
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
    // $ANTLR end "entryRuleRosAction"


    // $ANTLR start "ruleRosAction"
    // InternalRosInterfacesPool.g:162:1: ruleRosAction : ( ( rule__RosAction__Alternatives ) ) ;
    public final void ruleRosAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:166:2: ( ( ( rule__RosAction__Alternatives ) ) )
            // InternalRosInterfacesPool.g:167:2: ( ( rule__RosAction__Alternatives ) )
            {
            // InternalRosInterfacesPool.g:167:2: ( ( rule__RosAction__Alternatives ) )
            // InternalRosInterfacesPool.g:168:3: ( rule__RosAction__Alternatives )
            {
             before(grammarAccess.getRosActionAccess().getAlternatives()); 
            // InternalRosInterfacesPool.g:169:3: ( rule__RosAction__Alternatives )
            // InternalRosInterfacesPool.g:169:4: rule__RosAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RosAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRosActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRosAction"


    // $ANTLR start "entryRuleRosPublisher"
    // InternalRosInterfacesPool.g:178:1: entryRuleRosPublisher : ruleRosPublisher EOF ;
    public final void entryRuleRosPublisher() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:179:1: ( ruleRosPublisher EOF )
            // InternalRosInterfacesPool.g:180:1: ruleRosPublisher EOF
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
    // InternalRosInterfacesPool.g:187:1: ruleRosPublisher : ( ( rule__RosPublisher__Group__0 ) ) ;
    public final void ruleRosPublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:191:2: ( ( ( rule__RosPublisher__Group__0 ) ) )
            // InternalRosInterfacesPool.g:192:2: ( ( rule__RosPublisher__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:192:2: ( ( rule__RosPublisher__Group__0 ) )
            // InternalRosInterfacesPool.g:193:3: ( rule__RosPublisher__Group__0 )
            {
             before(grammarAccess.getRosPublisherAccess().getGroup()); 
            // InternalRosInterfacesPool.g:194:3: ( rule__RosPublisher__Group__0 )
            // InternalRosInterfacesPool.g:194:4: rule__RosPublisher__Group__0
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
    // InternalRosInterfacesPool.g:203:1: entryRuleRosSubscriber : ruleRosSubscriber EOF ;
    public final void entryRuleRosSubscriber() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:204:1: ( ruleRosSubscriber EOF )
            // InternalRosInterfacesPool.g:205:1: ruleRosSubscriber EOF
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
    // InternalRosInterfacesPool.g:212:1: ruleRosSubscriber : ( ( rule__RosSubscriber__Group__0 ) ) ;
    public final void ruleRosSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:216:2: ( ( ( rule__RosSubscriber__Group__0 ) ) )
            // InternalRosInterfacesPool.g:217:2: ( ( rule__RosSubscriber__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:217:2: ( ( rule__RosSubscriber__Group__0 ) )
            // InternalRosInterfacesPool.g:218:3: ( rule__RosSubscriber__Group__0 )
            {
             before(grammarAccess.getRosSubscriberAccess().getGroup()); 
            // InternalRosInterfacesPool.g:219:3: ( rule__RosSubscriber__Group__0 )
            // InternalRosInterfacesPool.g:219:4: rule__RosSubscriber__Group__0
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
    // InternalRosInterfacesPool.g:228:1: entryRuleRosSrvServer : ruleRosSrvServer EOF ;
    public final void entryRuleRosSrvServer() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:229:1: ( ruleRosSrvServer EOF )
            // InternalRosInterfacesPool.g:230:1: ruleRosSrvServer EOF
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
    // InternalRosInterfacesPool.g:237:1: ruleRosSrvServer : ( ( rule__RosSrvServer__Group__0 ) ) ;
    public final void ruleRosSrvServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:241:2: ( ( ( rule__RosSrvServer__Group__0 ) ) )
            // InternalRosInterfacesPool.g:242:2: ( ( rule__RosSrvServer__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:242:2: ( ( rule__RosSrvServer__Group__0 ) )
            // InternalRosInterfacesPool.g:243:3: ( rule__RosSrvServer__Group__0 )
            {
             before(grammarAccess.getRosSrvServerAccess().getGroup()); 
            // InternalRosInterfacesPool.g:244:3: ( rule__RosSrvServer__Group__0 )
            // InternalRosInterfacesPool.g:244:4: rule__RosSrvServer__Group__0
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
    // InternalRosInterfacesPool.g:253:1: entryRuleRosSrvClient : ruleRosSrvClient EOF ;
    public final void entryRuleRosSrvClient() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:254:1: ( ruleRosSrvClient EOF )
            // InternalRosInterfacesPool.g:255:1: ruleRosSrvClient EOF
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
    // InternalRosInterfacesPool.g:262:1: ruleRosSrvClient : ( ( rule__RosSrvClient__Group__0 ) ) ;
    public final void ruleRosSrvClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:266:2: ( ( ( rule__RosSrvClient__Group__0 ) ) )
            // InternalRosInterfacesPool.g:267:2: ( ( rule__RosSrvClient__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:267:2: ( ( rule__RosSrvClient__Group__0 ) )
            // InternalRosInterfacesPool.g:268:3: ( rule__RosSrvClient__Group__0 )
            {
             before(grammarAccess.getRosSrvClientAccess().getGroup()); 
            // InternalRosInterfacesPool.g:269:3: ( rule__RosSrvClient__Group__0 )
            // InternalRosInterfacesPool.g:269:4: rule__RosSrvClient__Group__0
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


    // $ANTLR start "entryRuleRosActionServer"
    // InternalRosInterfacesPool.g:278:1: entryRuleRosActionServer : ruleRosActionServer EOF ;
    public final void entryRuleRosActionServer() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:279:1: ( ruleRosActionServer EOF )
            // InternalRosInterfacesPool.g:280:1: ruleRosActionServer EOF
            {
             before(grammarAccess.getRosActionServerRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionServer();

            state._fsp--;

             after(grammarAccess.getRosActionServerRule()); 
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
    // $ANTLR end "entryRuleRosActionServer"


    // $ANTLR start "ruleRosActionServer"
    // InternalRosInterfacesPool.g:287:1: ruleRosActionServer : ( ( rule__RosActionServer__Group__0 ) ) ;
    public final void ruleRosActionServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:291:2: ( ( ( rule__RosActionServer__Group__0 ) ) )
            // InternalRosInterfacesPool.g:292:2: ( ( rule__RosActionServer__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:292:2: ( ( rule__RosActionServer__Group__0 ) )
            // InternalRosInterfacesPool.g:293:3: ( rule__RosActionServer__Group__0 )
            {
             before(grammarAccess.getRosActionServerAccess().getGroup()); 
            // InternalRosInterfacesPool.g:294:3: ( rule__RosActionServer__Group__0 )
            // InternalRosInterfacesPool.g:294:4: rule__RosActionServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getGroup()); 

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
    // $ANTLR end "ruleRosActionServer"


    // $ANTLR start "entryRuleRosActionClient"
    // InternalRosInterfacesPool.g:303:1: entryRuleRosActionClient : ruleRosActionClient EOF ;
    public final void entryRuleRosActionClient() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:304:1: ( ruleRosActionClient EOF )
            // InternalRosInterfacesPool.g:305:1: ruleRosActionClient EOF
            {
             before(grammarAccess.getRosActionClientRule()); 
            pushFollow(FOLLOW_1);
            ruleRosActionClient();

            state._fsp--;

             after(grammarAccess.getRosActionClientRule()); 
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
    // $ANTLR end "entryRuleRosActionClient"


    // $ANTLR start "ruleRosActionClient"
    // InternalRosInterfacesPool.g:312:1: ruleRosActionClient : ( ( rule__RosActionClient__Group__0 ) ) ;
    public final void ruleRosActionClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:316:2: ( ( ( rule__RosActionClient__Group__0 ) ) )
            // InternalRosInterfacesPool.g:317:2: ( ( rule__RosActionClient__Group__0 ) )
            {
            // InternalRosInterfacesPool.g:317:2: ( ( rule__RosActionClient__Group__0 ) )
            // InternalRosInterfacesPool.g:318:3: ( rule__RosActionClient__Group__0 )
            {
             before(grammarAccess.getRosActionClientAccess().getGroup()); 
            // InternalRosInterfacesPool.g:319:3: ( rule__RosActionClient__Group__0 )
            // InternalRosInterfacesPool.g:319:4: rule__RosActionClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getGroup()); 

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
    // $ANTLR end "ruleRosActionClient"


    // $ANTLR start "entryRuleEString"
    // InternalRosInterfacesPool.g:328:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosInterfacesPool.g:329:1: ( ruleEString EOF )
            // InternalRosInterfacesPool.g:330:1: ruleEString EOF
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
    // InternalRosInterfacesPool.g:337:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:341:2: ( ( RULE_STRING ) )
            // InternalRosInterfacesPool.g:342:2: ( RULE_STRING )
            {
            // InternalRosInterfacesPool.g:342:2: ( RULE_STRING )
            // InternalRosInterfacesPool.g:343:3: RULE_STRING
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
    // InternalRosInterfacesPool.g:352:1: rule__RosInterface__Alternatives : ( ( ruleRosTopic ) | ( ruleRosService ) | ( ruleRosAction ) );
    public final void rule__RosInterface__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:356:1: ( ( ruleRosTopic ) | ( ruleRosService ) | ( ruleRosAction ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 14:
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
            case 20:
                {
                alt1=2;
                }
                break;
            case 21:
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRosInterfacesPool.g:357:2: ( ruleRosTopic )
                    {
                    // InternalRosInterfacesPool.g:357:2: ( ruleRosTopic )
                    // InternalRosInterfacesPool.g:358:3: ruleRosTopic
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
                    // InternalRosInterfacesPool.g:363:2: ( ruleRosService )
                    {
                    // InternalRosInterfacesPool.g:363:2: ( ruleRosService )
                    // InternalRosInterfacesPool.g:364:3: ruleRosService
                    {
                     before(grammarAccess.getRosInterfaceAccess().getRosServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRosService();

                    state._fsp--;

                     after(grammarAccess.getRosInterfaceAccess().getRosServiceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRosInterfacesPool.g:369:2: ( ruleRosAction )
                    {
                    // InternalRosInterfacesPool.g:369:2: ( ruleRosAction )
                    // InternalRosInterfacesPool.g:370:3: ruleRosAction
                    {
                     before(grammarAccess.getRosInterfaceAccess().getRosActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRosAction();

                    state._fsp--;

                     after(grammarAccess.getRosInterfaceAccess().getRosActionParserRuleCall_2()); 

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
    // InternalRosInterfacesPool.g:379:1: rule__RosTopic__Alternatives : ( ( ruleRosPublisher ) | ( ruleRosSubscriber ) );
    public final void rule__RosTopic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:383:1: ( ( ruleRosPublisher ) | ( ruleRosSubscriber ) )
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
                    // InternalRosInterfacesPool.g:384:2: ( ruleRosPublisher )
                    {
                    // InternalRosInterfacesPool.g:384:2: ( ruleRosPublisher )
                    // InternalRosInterfacesPool.g:385:3: ruleRosPublisher
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
                    // InternalRosInterfacesPool.g:390:2: ( ruleRosSubscriber )
                    {
                    // InternalRosInterfacesPool.g:390:2: ( ruleRosSubscriber )
                    // InternalRosInterfacesPool.g:391:3: ruleRosSubscriber
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
    // InternalRosInterfacesPool.g:400:1: rule__RosService__Alternatives : ( ( ruleRosSrvServer ) | ( ruleRosSrvClient ) );
    public final void rule__RosService__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:404:1: ( ( ruleRosSrvServer ) | ( ruleRosSrvClient ) )
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
                    // InternalRosInterfacesPool.g:405:2: ( ruleRosSrvServer )
                    {
                    // InternalRosInterfacesPool.g:405:2: ( ruleRosSrvServer )
                    // InternalRosInterfacesPool.g:406:3: ruleRosSrvServer
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
                    // InternalRosInterfacesPool.g:411:2: ( ruleRosSrvClient )
                    {
                    // InternalRosInterfacesPool.g:411:2: ( ruleRosSrvClient )
                    // InternalRosInterfacesPool.g:412:3: ruleRosSrvClient
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


    // $ANTLR start "rule__RosAction__Alternatives"
    // InternalRosInterfacesPool.g:421:1: rule__RosAction__Alternatives : ( ( ruleRosActionServer ) | ( ruleRosActionClient ) );
    public final void rule__RosAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:425:1: ( ( ruleRosActionServer ) | ( ruleRosActionClient ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==23) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosInterfacesPool.g:426:2: ( ruleRosActionServer )
                    {
                    // InternalRosInterfacesPool.g:426:2: ( ruleRosActionServer )
                    // InternalRosInterfacesPool.g:427:3: ruleRosActionServer
                    {
                     before(grammarAccess.getRosActionAccess().getRosActionServerParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRosActionServer();

                    state._fsp--;

                     after(grammarAccess.getRosActionAccess().getRosActionServerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosInterfacesPool.g:432:2: ( ruleRosActionClient )
                    {
                    // InternalRosInterfacesPool.g:432:2: ( ruleRosActionClient )
                    // InternalRosInterfacesPool.g:433:3: ruleRosActionClient
                    {
                     before(grammarAccess.getRosActionAccess().getRosActionClientParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRosActionClient();

                    state._fsp--;

                     after(grammarAccess.getRosActionAccess().getRosActionClientParserRuleCall_1()); 

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
    // $ANTLR end "rule__RosAction__Alternatives"


    // $ANTLR start "rule__RosInterfacesPool__Group__0"
    // InternalRosInterfacesPool.g:442:1: rule__RosInterfacesPool__Group__0 : rule__RosInterfacesPool__Group__0__Impl rule__RosInterfacesPool__Group__1 ;
    public final void rule__RosInterfacesPool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:446:1: ( rule__RosInterfacesPool__Group__0__Impl rule__RosInterfacesPool__Group__1 )
            // InternalRosInterfacesPool.g:447:2: rule__RosInterfacesPool__Group__0__Impl rule__RosInterfacesPool__Group__1
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
    // InternalRosInterfacesPool.g:454:1: rule__RosInterfacesPool__Group__0__Impl : ( () ) ;
    public final void rule__RosInterfacesPool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:458:1: ( ( () ) )
            // InternalRosInterfacesPool.g:459:1: ( () )
            {
            // InternalRosInterfacesPool.g:459:1: ( () )
            // InternalRosInterfacesPool.g:460:2: ()
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getRosInterfacesPoolAction_0()); 
            // InternalRosInterfacesPool.g:461:2: ()
            // InternalRosInterfacesPool.g:461:3: 
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
    // InternalRosInterfacesPool.g:469:1: rule__RosInterfacesPool__Group__1 : rule__RosInterfacesPool__Group__1__Impl rule__RosInterfacesPool__Group__2 ;
    public final void rule__RosInterfacesPool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:473:1: ( rule__RosInterfacesPool__Group__1__Impl rule__RosInterfacesPool__Group__2 )
            // InternalRosInterfacesPool.g:474:2: rule__RosInterfacesPool__Group__1__Impl rule__RosInterfacesPool__Group__2
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
    // InternalRosInterfacesPool.g:481:1: rule__RosInterfacesPool__Group__1__Impl : ( 'RosInterfacesPool' ) ;
    public final void rule__RosInterfacesPool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:485:1: ( ( 'RosInterfacesPool' ) )
            // InternalRosInterfacesPool.g:486:1: ( 'RosInterfacesPool' )
            {
            // InternalRosInterfacesPool.g:486:1: ( 'RosInterfacesPool' )
            // InternalRosInterfacesPool.g:487:2: 'RosInterfacesPool'
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
    // InternalRosInterfacesPool.g:496:1: rule__RosInterfacesPool__Group__2 : rule__RosInterfacesPool__Group__2__Impl rule__RosInterfacesPool__Group__3 ;
    public final void rule__RosInterfacesPool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:500:1: ( rule__RosInterfacesPool__Group__2__Impl rule__RosInterfacesPool__Group__3 )
            // InternalRosInterfacesPool.g:501:2: rule__RosInterfacesPool__Group__2__Impl rule__RosInterfacesPool__Group__3
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
    // InternalRosInterfacesPool.g:508:1: rule__RosInterfacesPool__Group__2__Impl : ( '{' ) ;
    public final void rule__RosInterfacesPool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:512:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:513:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:513:1: ( '{' )
            // InternalRosInterfacesPool.g:514:2: '{'
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
    // InternalRosInterfacesPool.g:523:1: rule__RosInterfacesPool__Group__3 : rule__RosInterfacesPool__Group__3__Impl rule__RosInterfacesPool__Group__4 ;
    public final void rule__RosInterfacesPool__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:527:1: ( rule__RosInterfacesPool__Group__3__Impl rule__RosInterfacesPool__Group__4 )
            // InternalRosInterfacesPool.g:528:2: rule__RosInterfacesPool__Group__3__Impl rule__RosInterfacesPool__Group__4
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
    // InternalRosInterfacesPool.g:535:1: rule__RosInterfacesPool__Group__3__Impl : ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* ) ;
    public final void rule__RosInterfacesPool__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:539:1: ( ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* ) )
            // InternalRosInterfacesPool.g:540:1: ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* )
            {
            // InternalRosInterfacesPool.g:540:1: ( ( rule__RosInterfacesPool__InterfacesAssignment_3 )* )
            // InternalRosInterfacesPool.g:541:2: ( rule__RosInterfacesPool__InterfacesAssignment_3 )*
            {
             before(grammarAccess.getRosInterfacesPoolAccess().getInterfacesAssignment_3()); 
            // InternalRosInterfacesPool.g:542:2: ( rule__RosInterfacesPool__InterfacesAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||(LA5_0>=17 && LA5_0<=18)||(LA5_0>=20 && LA5_0<=21)||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRosInterfacesPool.g:542:3: rule__RosInterfacesPool__InterfacesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RosInterfacesPool__InterfacesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalRosInterfacesPool.g:550:1: rule__RosInterfacesPool__Group__4 : rule__RosInterfacesPool__Group__4__Impl ;
    public final void rule__RosInterfacesPool__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:554:1: ( rule__RosInterfacesPool__Group__4__Impl )
            // InternalRosInterfacesPool.g:555:2: rule__RosInterfacesPool__Group__4__Impl
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
    // InternalRosInterfacesPool.g:561:1: rule__RosInterfacesPool__Group__4__Impl : ( '}' ) ;
    public final void rule__RosInterfacesPool__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:565:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:566:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:566:1: ( '}' )
            // InternalRosInterfacesPool.g:567:2: '}'
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
    // InternalRosInterfacesPool.g:577:1: rule__RosPublisher__Group__0 : rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 ;
    public final void rule__RosPublisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:581:1: ( rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1 )
            // InternalRosInterfacesPool.g:582:2: rule__RosPublisher__Group__0__Impl rule__RosPublisher__Group__1
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
    // InternalRosInterfacesPool.g:589:1: rule__RosPublisher__Group__0__Impl : ( 'RosPublisher' ) ;
    public final void rule__RosPublisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:593:1: ( ( 'RosPublisher' ) )
            // InternalRosInterfacesPool.g:594:1: ( 'RosPublisher' )
            {
            // InternalRosInterfacesPool.g:594:1: ( 'RosPublisher' )
            // InternalRosInterfacesPool.g:595:2: 'RosPublisher'
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
    // InternalRosInterfacesPool.g:604:1: rule__RosPublisher__Group__1 : rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 ;
    public final void rule__RosPublisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:608:1: ( rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2 )
            // InternalRosInterfacesPool.g:609:2: rule__RosPublisher__Group__1__Impl rule__RosPublisher__Group__2
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
    // InternalRosInterfacesPool.g:616:1: rule__RosPublisher__Group__1__Impl : ( ( rule__RosPublisher__NameAssignment_1 ) ) ;
    public final void rule__RosPublisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:620:1: ( ( ( rule__RosPublisher__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:621:1: ( ( rule__RosPublisher__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:621:1: ( ( rule__RosPublisher__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:622:2: ( rule__RosPublisher__NameAssignment_1 )
            {
             before(grammarAccess.getRosPublisherAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:623:2: ( rule__RosPublisher__NameAssignment_1 )
            // InternalRosInterfacesPool.g:623:3: rule__RosPublisher__NameAssignment_1
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
    // InternalRosInterfacesPool.g:631:1: rule__RosPublisher__Group__2 : rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 ;
    public final void rule__RosPublisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:635:1: ( rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3 )
            // InternalRosInterfacesPool.g:636:2: rule__RosPublisher__Group__2__Impl rule__RosPublisher__Group__3
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
    // InternalRosInterfacesPool.g:643:1: rule__RosPublisher__Group__2__Impl : ( '{' ) ;
    public final void rule__RosPublisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:647:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:648:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:648:1: ( '{' )
            // InternalRosInterfacesPool.g:649:2: '{'
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
    // InternalRosInterfacesPool.g:658:1: rule__RosPublisher__Group__3 : rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 ;
    public final void rule__RosPublisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:662:1: ( rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4 )
            // InternalRosInterfacesPool.g:663:2: rule__RosPublisher__Group__3__Impl rule__RosPublisher__Group__4
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
    // InternalRosInterfacesPool.g:670:1: rule__RosPublisher__Group__3__Impl : ( 'topicName' ) ;
    public final void rule__RosPublisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:674:1: ( ( 'topicName' ) )
            // InternalRosInterfacesPool.g:675:1: ( 'topicName' )
            {
            // InternalRosInterfacesPool.g:675:1: ( 'topicName' )
            // InternalRosInterfacesPool.g:676:2: 'topicName'
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
    // InternalRosInterfacesPool.g:685:1: rule__RosPublisher__Group__4 : rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 ;
    public final void rule__RosPublisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:689:1: ( rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5 )
            // InternalRosInterfacesPool.g:690:2: rule__RosPublisher__Group__4__Impl rule__RosPublisher__Group__5
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
    // InternalRosInterfacesPool.g:697:1: rule__RosPublisher__Group__4__Impl : ( ( rule__RosPublisher__TopicNameAssignment_4 ) ) ;
    public final void rule__RosPublisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:701:1: ( ( ( rule__RosPublisher__TopicNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:702:1: ( ( rule__RosPublisher__TopicNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:702:1: ( ( rule__RosPublisher__TopicNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:703:2: ( rule__RosPublisher__TopicNameAssignment_4 )
            {
             before(grammarAccess.getRosPublisherAccess().getTopicNameAssignment_4()); 
            // InternalRosInterfacesPool.g:704:2: ( rule__RosPublisher__TopicNameAssignment_4 )
            // InternalRosInterfacesPool.g:704:3: rule__RosPublisher__TopicNameAssignment_4
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
    // InternalRosInterfacesPool.g:712:1: rule__RosPublisher__Group__5 : rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 ;
    public final void rule__RosPublisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:716:1: ( rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6 )
            // InternalRosInterfacesPool.g:717:2: rule__RosPublisher__Group__5__Impl rule__RosPublisher__Group__6
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
    // InternalRosInterfacesPool.g:724:1: rule__RosPublisher__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosPublisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:728:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:729:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:729:1: ( 'type' )
            // InternalRosInterfacesPool.g:730:2: 'type'
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
    // InternalRosInterfacesPool.g:739:1: rule__RosPublisher__Group__6 : rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 ;
    public final void rule__RosPublisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:743:1: ( rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7 )
            // InternalRosInterfacesPool.g:744:2: rule__RosPublisher__Group__6__Impl rule__RosPublisher__Group__7
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
    // InternalRosInterfacesPool.g:751:1: rule__RosPublisher__Group__6__Impl : ( ( rule__RosPublisher__TypeAssignment_6 ) ) ;
    public final void rule__RosPublisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:755:1: ( ( ( rule__RosPublisher__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:756:1: ( ( rule__RosPublisher__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:756:1: ( ( rule__RosPublisher__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:757:2: ( rule__RosPublisher__TypeAssignment_6 )
            {
             before(grammarAccess.getRosPublisherAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:758:2: ( rule__RosPublisher__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:758:3: rule__RosPublisher__TypeAssignment_6
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
    // InternalRosInterfacesPool.g:766:1: rule__RosPublisher__Group__7 : rule__RosPublisher__Group__7__Impl ;
    public final void rule__RosPublisher__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:770:1: ( rule__RosPublisher__Group__7__Impl )
            // InternalRosInterfacesPool.g:771:2: rule__RosPublisher__Group__7__Impl
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
    // InternalRosInterfacesPool.g:777:1: rule__RosPublisher__Group__7__Impl : ( '}' ) ;
    public final void rule__RosPublisher__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:781:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:782:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:782:1: ( '}' )
            // InternalRosInterfacesPool.g:783:2: '}'
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
    // InternalRosInterfacesPool.g:793:1: rule__RosSubscriber__Group__0 : rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 ;
    public final void rule__RosSubscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:797:1: ( rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1 )
            // InternalRosInterfacesPool.g:798:2: rule__RosSubscriber__Group__0__Impl rule__RosSubscriber__Group__1
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
    // InternalRosInterfacesPool.g:805:1: rule__RosSubscriber__Group__0__Impl : ( 'RosSubscriber' ) ;
    public final void rule__RosSubscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:809:1: ( ( 'RosSubscriber' ) )
            // InternalRosInterfacesPool.g:810:1: ( 'RosSubscriber' )
            {
            // InternalRosInterfacesPool.g:810:1: ( 'RosSubscriber' )
            // InternalRosInterfacesPool.g:811:2: 'RosSubscriber'
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
    // InternalRosInterfacesPool.g:820:1: rule__RosSubscriber__Group__1 : rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 ;
    public final void rule__RosSubscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:824:1: ( rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2 )
            // InternalRosInterfacesPool.g:825:2: rule__RosSubscriber__Group__1__Impl rule__RosSubscriber__Group__2
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
    // InternalRosInterfacesPool.g:832:1: rule__RosSubscriber__Group__1__Impl : ( ( rule__RosSubscriber__NameAssignment_1 ) ) ;
    public final void rule__RosSubscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:836:1: ( ( ( rule__RosSubscriber__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:837:1: ( ( rule__RosSubscriber__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:837:1: ( ( rule__RosSubscriber__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:838:2: ( rule__RosSubscriber__NameAssignment_1 )
            {
             before(grammarAccess.getRosSubscriberAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:839:2: ( rule__RosSubscriber__NameAssignment_1 )
            // InternalRosInterfacesPool.g:839:3: rule__RosSubscriber__NameAssignment_1
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
    // InternalRosInterfacesPool.g:847:1: rule__RosSubscriber__Group__2 : rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 ;
    public final void rule__RosSubscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:851:1: ( rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3 )
            // InternalRosInterfacesPool.g:852:2: rule__RosSubscriber__Group__2__Impl rule__RosSubscriber__Group__3
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
    // InternalRosInterfacesPool.g:859:1: rule__RosSubscriber__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSubscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:863:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:864:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:864:1: ( '{' )
            // InternalRosInterfacesPool.g:865:2: '{'
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
    // InternalRosInterfacesPool.g:874:1: rule__RosSubscriber__Group__3 : rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 ;
    public final void rule__RosSubscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:878:1: ( rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4 )
            // InternalRosInterfacesPool.g:879:2: rule__RosSubscriber__Group__3__Impl rule__RosSubscriber__Group__4
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
    // InternalRosInterfacesPool.g:886:1: rule__RosSubscriber__Group__3__Impl : ( 'topicName' ) ;
    public final void rule__RosSubscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:890:1: ( ( 'topicName' ) )
            // InternalRosInterfacesPool.g:891:1: ( 'topicName' )
            {
            // InternalRosInterfacesPool.g:891:1: ( 'topicName' )
            // InternalRosInterfacesPool.g:892:2: 'topicName'
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
    // InternalRosInterfacesPool.g:901:1: rule__RosSubscriber__Group__4 : rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 ;
    public final void rule__RosSubscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:905:1: ( rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5 )
            // InternalRosInterfacesPool.g:906:2: rule__RosSubscriber__Group__4__Impl rule__RosSubscriber__Group__5
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
    // InternalRosInterfacesPool.g:913:1: rule__RosSubscriber__Group__4__Impl : ( ( rule__RosSubscriber__TopicNameAssignment_4 ) ) ;
    public final void rule__RosSubscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:917:1: ( ( ( rule__RosSubscriber__TopicNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:918:1: ( ( rule__RosSubscriber__TopicNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:918:1: ( ( rule__RosSubscriber__TopicNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:919:2: ( rule__RosSubscriber__TopicNameAssignment_4 )
            {
             before(grammarAccess.getRosSubscriberAccess().getTopicNameAssignment_4()); 
            // InternalRosInterfacesPool.g:920:2: ( rule__RosSubscriber__TopicNameAssignment_4 )
            // InternalRosInterfacesPool.g:920:3: rule__RosSubscriber__TopicNameAssignment_4
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
    // InternalRosInterfacesPool.g:928:1: rule__RosSubscriber__Group__5 : rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 ;
    public final void rule__RosSubscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:932:1: ( rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6 )
            // InternalRosInterfacesPool.g:933:2: rule__RosSubscriber__Group__5__Impl rule__RosSubscriber__Group__6
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
    // InternalRosInterfacesPool.g:940:1: rule__RosSubscriber__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosSubscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:944:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:945:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:945:1: ( 'type' )
            // InternalRosInterfacesPool.g:946:2: 'type'
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
    // InternalRosInterfacesPool.g:955:1: rule__RosSubscriber__Group__6 : rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 ;
    public final void rule__RosSubscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:959:1: ( rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7 )
            // InternalRosInterfacesPool.g:960:2: rule__RosSubscriber__Group__6__Impl rule__RosSubscriber__Group__7
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
    // InternalRosInterfacesPool.g:967:1: rule__RosSubscriber__Group__6__Impl : ( ( rule__RosSubscriber__TypeAssignment_6 ) ) ;
    public final void rule__RosSubscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:971:1: ( ( ( rule__RosSubscriber__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:972:1: ( ( rule__RosSubscriber__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:972:1: ( ( rule__RosSubscriber__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:973:2: ( rule__RosSubscriber__TypeAssignment_6 )
            {
             before(grammarAccess.getRosSubscriberAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:974:2: ( rule__RosSubscriber__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:974:3: rule__RosSubscriber__TypeAssignment_6
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
    // InternalRosInterfacesPool.g:982:1: rule__RosSubscriber__Group__7 : rule__RosSubscriber__Group__7__Impl ;
    public final void rule__RosSubscriber__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:986:1: ( rule__RosSubscriber__Group__7__Impl )
            // InternalRosInterfacesPool.g:987:2: rule__RosSubscriber__Group__7__Impl
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
    // InternalRosInterfacesPool.g:993:1: rule__RosSubscriber__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSubscriber__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:997:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:998:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:998:1: ( '}' )
            // InternalRosInterfacesPool.g:999:2: '}'
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
    // InternalRosInterfacesPool.g:1009:1: rule__RosSrvServer__Group__0 : rule__RosSrvServer__Group__0__Impl rule__RosSrvServer__Group__1 ;
    public final void rule__RosSrvServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1013:1: ( rule__RosSrvServer__Group__0__Impl rule__RosSrvServer__Group__1 )
            // InternalRosInterfacesPool.g:1014:2: rule__RosSrvServer__Group__0__Impl rule__RosSrvServer__Group__1
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
    // InternalRosInterfacesPool.g:1021:1: rule__RosSrvServer__Group__0__Impl : ( 'RosSrvServer' ) ;
    public final void rule__RosSrvServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1025:1: ( ( 'RosSrvServer' ) )
            // InternalRosInterfacesPool.g:1026:1: ( 'RosSrvServer' )
            {
            // InternalRosInterfacesPool.g:1026:1: ( 'RosSrvServer' )
            // InternalRosInterfacesPool.g:1027:2: 'RosSrvServer'
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
    // InternalRosInterfacesPool.g:1036:1: rule__RosSrvServer__Group__1 : rule__RosSrvServer__Group__1__Impl rule__RosSrvServer__Group__2 ;
    public final void rule__RosSrvServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1040:1: ( rule__RosSrvServer__Group__1__Impl rule__RosSrvServer__Group__2 )
            // InternalRosInterfacesPool.g:1041:2: rule__RosSrvServer__Group__1__Impl rule__RosSrvServer__Group__2
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
    // InternalRosInterfacesPool.g:1048:1: rule__RosSrvServer__Group__1__Impl : ( ( rule__RosSrvServer__NameAssignment_1 ) ) ;
    public final void rule__RosSrvServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1052:1: ( ( ( rule__RosSrvServer__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:1053:1: ( ( rule__RosSrvServer__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:1053:1: ( ( rule__RosSrvServer__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:1054:2: ( rule__RosSrvServer__NameAssignment_1 )
            {
             before(grammarAccess.getRosSrvServerAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:1055:2: ( rule__RosSrvServer__NameAssignment_1 )
            // InternalRosInterfacesPool.g:1055:3: rule__RosSrvServer__NameAssignment_1
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
    // InternalRosInterfacesPool.g:1063:1: rule__RosSrvServer__Group__2 : rule__RosSrvServer__Group__2__Impl rule__RosSrvServer__Group__3 ;
    public final void rule__RosSrvServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1067:1: ( rule__RosSrvServer__Group__2__Impl rule__RosSrvServer__Group__3 )
            // InternalRosInterfacesPool.g:1068:2: rule__RosSrvServer__Group__2__Impl rule__RosSrvServer__Group__3
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
    // InternalRosInterfacesPool.g:1075:1: rule__RosSrvServer__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSrvServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1079:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:1080:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:1080:1: ( '{' )
            // InternalRosInterfacesPool.g:1081:2: '{'
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
    // InternalRosInterfacesPool.g:1090:1: rule__RosSrvServer__Group__3 : rule__RosSrvServer__Group__3__Impl rule__RosSrvServer__Group__4 ;
    public final void rule__RosSrvServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1094:1: ( rule__RosSrvServer__Group__3__Impl rule__RosSrvServer__Group__4 )
            // InternalRosInterfacesPool.g:1095:2: rule__RosSrvServer__Group__3__Impl rule__RosSrvServer__Group__4
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
    // InternalRosInterfacesPool.g:1102:1: rule__RosSrvServer__Group__3__Impl : ( 'srvName' ) ;
    public final void rule__RosSrvServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1106:1: ( ( 'srvName' ) )
            // InternalRosInterfacesPool.g:1107:1: ( 'srvName' )
            {
            // InternalRosInterfacesPool.g:1107:1: ( 'srvName' )
            // InternalRosInterfacesPool.g:1108:2: 'srvName'
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
    // InternalRosInterfacesPool.g:1117:1: rule__RosSrvServer__Group__4 : rule__RosSrvServer__Group__4__Impl rule__RosSrvServer__Group__5 ;
    public final void rule__RosSrvServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1121:1: ( rule__RosSrvServer__Group__4__Impl rule__RosSrvServer__Group__5 )
            // InternalRosInterfacesPool.g:1122:2: rule__RosSrvServer__Group__4__Impl rule__RosSrvServer__Group__5
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
    // InternalRosInterfacesPool.g:1129:1: rule__RosSrvServer__Group__4__Impl : ( ( rule__RosSrvServer__SrvNameAssignment_4 ) ) ;
    public final void rule__RosSrvServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1133:1: ( ( ( rule__RosSrvServer__SrvNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:1134:1: ( ( rule__RosSrvServer__SrvNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:1134:1: ( ( rule__RosSrvServer__SrvNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:1135:2: ( rule__RosSrvServer__SrvNameAssignment_4 )
            {
             before(grammarAccess.getRosSrvServerAccess().getSrvNameAssignment_4()); 
            // InternalRosInterfacesPool.g:1136:2: ( rule__RosSrvServer__SrvNameAssignment_4 )
            // InternalRosInterfacesPool.g:1136:3: rule__RosSrvServer__SrvNameAssignment_4
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
    // InternalRosInterfacesPool.g:1144:1: rule__RosSrvServer__Group__5 : rule__RosSrvServer__Group__5__Impl rule__RosSrvServer__Group__6 ;
    public final void rule__RosSrvServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1148:1: ( rule__RosSrvServer__Group__5__Impl rule__RosSrvServer__Group__6 )
            // InternalRosInterfacesPool.g:1149:2: rule__RosSrvServer__Group__5__Impl rule__RosSrvServer__Group__6
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
    // InternalRosInterfacesPool.g:1156:1: rule__RosSrvServer__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosSrvServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1160:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:1161:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:1161:1: ( 'type' )
            // InternalRosInterfacesPool.g:1162:2: 'type'
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
    // InternalRosInterfacesPool.g:1171:1: rule__RosSrvServer__Group__6 : rule__RosSrvServer__Group__6__Impl rule__RosSrvServer__Group__7 ;
    public final void rule__RosSrvServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1175:1: ( rule__RosSrvServer__Group__6__Impl rule__RosSrvServer__Group__7 )
            // InternalRosInterfacesPool.g:1176:2: rule__RosSrvServer__Group__6__Impl rule__RosSrvServer__Group__7
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
    // InternalRosInterfacesPool.g:1183:1: rule__RosSrvServer__Group__6__Impl : ( ( rule__RosSrvServer__TypeAssignment_6 ) ) ;
    public final void rule__RosSrvServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1187:1: ( ( ( rule__RosSrvServer__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:1188:1: ( ( rule__RosSrvServer__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:1188:1: ( ( rule__RosSrvServer__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:1189:2: ( rule__RosSrvServer__TypeAssignment_6 )
            {
             before(grammarAccess.getRosSrvServerAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:1190:2: ( rule__RosSrvServer__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:1190:3: rule__RosSrvServer__TypeAssignment_6
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
    // InternalRosInterfacesPool.g:1198:1: rule__RosSrvServer__Group__7 : rule__RosSrvServer__Group__7__Impl ;
    public final void rule__RosSrvServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1202:1: ( rule__RosSrvServer__Group__7__Impl )
            // InternalRosInterfacesPool.g:1203:2: rule__RosSrvServer__Group__7__Impl
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
    // InternalRosInterfacesPool.g:1209:1: rule__RosSrvServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSrvServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1213:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:1214:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:1214:1: ( '}' )
            // InternalRosInterfacesPool.g:1215:2: '}'
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
    // InternalRosInterfacesPool.g:1225:1: rule__RosSrvClient__Group__0 : rule__RosSrvClient__Group__0__Impl rule__RosSrvClient__Group__1 ;
    public final void rule__RosSrvClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1229:1: ( rule__RosSrvClient__Group__0__Impl rule__RosSrvClient__Group__1 )
            // InternalRosInterfacesPool.g:1230:2: rule__RosSrvClient__Group__0__Impl rule__RosSrvClient__Group__1
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
    // InternalRosInterfacesPool.g:1237:1: rule__RosSrvClient__Group__0__Impl : ( 'RosSrvClient' ) ;
    public final void rule__RosSrvClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1241:1: ( ( 'RosSrvClient' ) )
            // InternalRosInterfacesPool.g:1242:1: ( 'RosSrvClient' )
            {
            // InternalRosInterfacesPool.g:1242:1: ( 'RosSrvClient' )
            // InternalRosInterfacesPool.g:1243:2: 'RosSrvClient'
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
    // InternalRosInterfacesPool.g:1252:1: rule__RosSrvClient__Group__1 : rule__RosSrvClient__Group__1__Impl rule__RosSrvClient__Group__2 ;
    public final void rule__RosSrvClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1256:1: ( rule__RosSrvClient__Group__1__Impl rule__RosSrvClient__Group__2 )
            // InternalRosInterfacesPool.g:1257:2: rule__RosSrvClient__Group__1__Impl rule__RosSrvClient__Group__2
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
    // InternalRosInterfacesPool.g:1264:1: rule__RosSrvClient__Group__1__Impl : ( ( rule__RosSrvClient__NameAssignment_1 ) ) ;
    public final void rule__RosSrvClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1268:1: ( ( ( rule__RosSrvClient__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:1269:1: ( ( rule__RosSrvClient__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:1269:1: ( ( rule__RosSrvClient__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:1270:2: ( rule__RosSrvClient__NameAssignment_1 )
            {
             before(grammarAccess.getRosSrvClientAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:1271:2: ( rule__RosSrvClient__NameAssignment_1 )
            // InternalRosInterfacesPool.g:1271:3: rule__RosSrvClient__NameAssignment_1
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
    // InternalRosInterfacesPool.g:1279:1: rule__RosSrvClient__Group__2 : rule__RosSrvClient__Group__2__Impl rule__RosSrvClient__Group__3 ;
    public final void rule__RosSrvClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1283:1: ( rule__RosSrvClient__Group__2__Impl rule__RosSrvClient__Group__3 )
            // InternalRosInterfacesPool.g:1284:2: rule__RosSrvClient__Group__2__Impl rule__RosSrvClient__Group__3
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
    // InternalRosInterfacesPool.g:1291:1: rule__RosSrvClient__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSrvClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1295:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:1296:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:1296:1: ( '{' )
            // InternalRosInterfacesPool.g:1297:2: '{'
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
    // InternalRosInterfacesPool.g:1306:1: rule__RosSrvClient__Group__3 : rule__RosSrvClient__Group__3__Impl rule__RosSrvClient__Group__4 ;
    public final void rule__RosSrvClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1310:1: ( rule__RosSrvClient__Group__3__Impl rule__RosSrvClient__Group__4 )
            // InternalRosInterfacesPool.g:1311:2: rule__RosSrvClient__Group__3__Impl rule__RosSrvClient__Group__4
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
    // InternalRosInterfacesPool.g:1318:1: rule__RosSrvClient__Group__3__Impl : ( 'srvName' ) ;
    public final void rule__RosSrvClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1322:1: ( ( 'srvName' ) )
            // InternalRosInterfacesPool.g:1323:1: ( 'srvName' )
            {
            // InternalRosInterfacesPool.g:1323:1: ( 'srvName' )
            // InternalRosInterfacesPool.g:1324:2: 'srvName'
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
    // InternalRosInterfacesPool.g:1333:1: rule__RosSrvClient__Group__4 : rule__RosSrvClient__Group__4__Impl rule__RosSrvClient__Group__5 ;
    public final void rule__RosSrvClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1337:1: ( rule__RosSrvClient__Group__4__Impl rule__RosSrvClient__Group__5 )
            // InternalRosInterfacesPool.g:1338:2: rule__RosSrvClient__Group__4__Impl rule__RosSrvClient__Group__5
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
    // InternalRosInterfacesPool.g:1345:1: rule__RosSrvClient__Group__4__Impl : ( ( rule__RosSrvClient__SrvNameAssignment_4 ) ) ;
    public final void rule__RosSrvClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1349:1: ( ( ( rule__RosSrvClient__SrvNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:1350:1: ( ( rule__RosSrvClient__SrvNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:1350:1: ( ( rule__RosSrvClient__SrvNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:1351:2: ( rule__RosSrvClient__SrvNameAssignment_4 )
            {
             before(grammarAccess.getRosSrvClientAccess().getSrvNameAssignment_4()); 
            // InternalRosInterfacesPool.g:1352:2: ( rule__RosSrvClient__SrvNameAssignment_4 )
            // InternalRosInterfacesPool.g:1352:3: rule__RosSrvClient__SrvNameAssignment_4
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
    // InternalRosInterfacesPool.g:1360:1: rule__RosSrvClient__Group__5 : rule__RosSrvClient__Group__5__Impl rule__RosSrvClient__Group__6 ;
    public final void rule__RosSrvClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1364:1: ( rule__RosSrvClient__Group__5__Impl rule__RosSrvClient__Group__6 )
            // InternalRosInterfacesPool.g:1365:2: rule__RosSrvClient__Group__5__Impl rule__RosSrvClient__Group__6
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
    // InternalRosInterfacesPool.g:1372:1: rule__RosSrvClient__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosSrvClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1376:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:1377:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:1377:1: ( 'type' )
            // InternalRosInterfacesPool.g:1378:2: 'type'
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
    // InternalRosInterfacesPool.g:1387:1: rule__RosSrvClient__Group__6 : rule__RosSrvClient__Group__6__Impl rule__RosSrvClient__Group__7 ;
    public final void rule__RosSrvClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1391:1: ( rule__RosSrvClient__Group__6__Impl rule__RosSrvClient__Group__7 )
            // InternalRosInterfacesPool.g:1392:2: rule__RosSrvClient__Group__6__Impl rule__RosSrvClient__Group__7
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
    // InternalRosInterfacesPool.g:1399:1: rule__RosSrvClient__Group__6__Impl : ( ( rule__RosSrvClient__TypeAssignment_6 ) ) ;
    public final void rule__RosSrvClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1403:1: ( ( ( rule__RosSrvClient__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:1404:1: ( ( rule__RosSrvClient__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:1404:1: ( ( rule__RosSrvClient__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:1405:2: ( rule__RosSrvClient__TypeAssignment_6 )
            {
             before(grammarAccess.getRosSrvClientAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:1406:2: ( rule__RosSrvClient__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:1406:3: rule__RosSrvClient__TypeAssignment_6
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
    // InternalRosInterfacesPool.g:1414:1: rule__RosSrvClient__Group__7 : rule__RosSrvClient__Group__7__Impl ;
    public final void rule__RosSrvClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1418:1: ( rule__RosSrvClient__Group__7__Impl )
            // InternalRosInterfacesPool.g:1419:2: rule__RosSrvClient__Group__7__Impl
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
    // InternalRosInterfacesPool.g:1425:1: rule__RosSrvClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSrvClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1429:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:1430:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:1430:1: ( '}' )
            // InternalRosInterfacesPool.g:1431:2: '}'
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


    // $ANTLR start "rule__RosActionServer__Group__0"
    // InternalRosInterfacesPool.g:1441:1: rule__RosActionServer__Group__0 : rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 ;
    public final void rule__RosActionServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1445:1: ( rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1 )
            // InternalRosInterfacesPool.g:1446:2: rule__RosActionServer__Group__0__Impl rule__RosActionServer__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosActionServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__1();

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
    // $ANTLR end "rule__RosActionServer__Group__0"


    // $ANTLR start "rule__RosActionServer__Group__0__Impl"
    // InternalRosInterfacesPool.g:1453:1: rule__RosActionServer__Group__0__Impl : ( 'RosActionServer' ) ;
    public final void rule__RosActionServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1457:1: ( ( 'RosActionServer' ) )
            // InternalRosInterfacesPool.g:1458:1: ( 'RosActionServer' )
            {
            // InternalRosInterfacesPool.g:1458:1: ( 'RosActionServer' )
            // InternalRosInterfacesPool.g:1459:2: 'RosActionServer'
            {
             before(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRosActionServerKeyword_0()); 

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
    // $ANTLR end "rule__RosActionServer__Group__0__Impl"


    // $ANTLR start "rule__RosActionServer__Group__1"
    // InternalRosInterfacesPool.g:1468:1: rule__RosActionServer__Group__1 : rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 ;
    public final void rule__RosActionServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1472:1: ( rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2 )
            // InternalRosInterfacesPool.g:1473:2: rule__RosActionServer__Group__1__Impl rule__RosActionServer__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosActionServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__2();

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
    // $ANTLR end "rule__RosActionServer__Group__1"


    // $ANTLR start "rule__RosActionServer__Group__1__Impl"
    // InternalRosInterfacesPool.g:1480:1: rule__RosActionServer__Group__1__Impl : ( ( rule__RosActionServer__NameAssignment_1 ) ) ;
    public final void rule__RosActionServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1484:1: ( ( ( rule__RosActionServer__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:1485:1: ( ( rule__RosActionServer__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:1485:1: ( ( rule__RosActionServer__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:1486:2: ( rule__RosActionServer__NameAssignment_1 )
            {
             before(grammarAccess.getRosActionServerAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:1487:2: ( rule__RosActionServer__NameAssignment_1 )
            // InternalRosInterfacesPool.g:1487:3: rule__RosActionServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RosActionServer__Group__1__Impl"


    // $ANTLR start "rule__RosActionServer__Group__2"
    // InternalRosInterfacesPool.g:1495:1: rule__RosActionServer__Group__2 : rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 ;
    public final void rule__RosActionServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1499:1: ( rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3 )
            // InternalRosInterfacesPool.g:1500:2: rule__RosActionServer__Group__2__Impl rule__RosActionServer__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RosActionServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__3();

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
    // $ANTLR end "rule__RosActionServer__Group__2"


    // $ANTLR start "rule__RosActionServer__Group__2__Impl"
    // InternalRosInterfacesPool.g:1507:1: rule__RosActionServer__Group__2__Impl : ( '{' ) ;
    public final void rule__RosActionServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1511:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:1512:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:1512:1: ( '{' )
            // InternalRosInterfacesPool.g:1513:2: '{'
            {
             before(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RosActionServer__Group__2__Impl"


    // $ANTLR start "rule__RosActionServer__Group__3"
    // InternalRosInterfacesPool.g:1522:1: rule__RosActionServer__Group__3 : rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 ;
    public final void rule__RosActionServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1526:1: ( rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4 )
            // InternalRosInterfacesPool.g:1527:2: rule__RosActionServer__Group__3__Impl rule__RosActionServer__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RosActionServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__4();

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
    // $ANTLR end "rule__RosActionServer__Group__3"


    // $ANTLR start "rule__RosActionServer__Group__3__Impl"
    // InternalRosInterfacesPool.g:1534:1: rule__RosActionServer__Group__3__Impl : ( 'actionName' ) ;
    public final void rule__RosActionServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1538:1: ( ( 'actionName' ) )
            // InternalRosInterfacesPool.g:1539:1: ( 'actionName' )
            {
            // InternalRosInterfacesPool.g:1539:1: ( 'actionName' )
            // InternalRosInterfacesPool.g:1540:2: 'actionName'
            {
             before(grammarAccess.getRosActionServerAccess().getActionNameKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getActionNameKeyword_3()); 

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
    // $ANTLR end "rule__RosActionServer__Group__3__Impl"


    // $ANTLR start "rule__RosActionServer__Group__4"
    // InternalRosInterfacesPool.g:1549:1: rule__RosActionServer__Group__4 : rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 ;
    public final void rule__RosActionServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1553:1: ( rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5 )
            // InternalRosInterfacesPool.g:1554:2: rule__RosActionServer__Group__4__Impl rule__RosActionServer__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RosActionServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__5();

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
    // $ANTLR end "rule__RosActionServer__Group__4"


    // $ANTLR start "rule__RosActionServer__Group__4__Impl"
    // InternalRosInterfacesPool.g:1561:1: rule__RosActionServer__Group__4__Impl : ( ( rule__RosActionServer__ActionNameAssignment_4 ) ) ;
    public final void rule__RosActionServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1565:1: ( ( ( rule__RosActionServer__ActionNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:1566:1: ( ( rule__RosActionServer__ActionNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:1566:1: ( ( rule__RosActionServer__ActionNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:1567:2: ( rule__RosActionServer__ActionNameAssignment_4 )
            {
             before(grammarAccess.getRosActionServerAccess().getActionNameAssignment_4()); 
            // InternalRosInterfacesPool.g:1568:2: ( rule__RosActionServer__ActionNameAssignment_4 )
            // InternalRosInterfacesPool.g:1568:3: rule__RosActionServer__ActionNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__ActionNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getActionNameAssignment_4()); 

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
    // $ANTLR end "rule__RosActionServer__Group__4__Impl"


    // $ANTLR start "rule__RosActionServer__Group__5"
    // InternalRosInterfacesPool.g:1576:1: rule__RosActionServer__Group__5 : rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 ;
    public final void rule__RosActionServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1580:1: ( rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6 )
            // InternalRosInterfacesPool.g:1581:2: rule__RosActionServer__Group__5__Impl rule__RosActionServer__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RosActionServer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__6();

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
    // $ANTLR end "rule__RosActionServer__Group__5"


    // $ANTLR start "rule__RosActionServer__Group__5__Impl"
    // InternalRosInterfacesPool.g:1588:1: rule__RosActionServer__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosActionServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1592:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:1593:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:1593:1: ( 'type' )
            // InternalRosInterfacesPool.g:1594:2: 'type'
            {
             before(grammarAccess.getRosActionServerAccess().getTypeKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getTypeKeyword_5()); 

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
    // $ANTLR end "rule__RosActionServer__Group__5__Impl"


    // $ANTLR start "rule__RosActionServer__Group__6"
    // InternalRosInterfacesPool.g:1603:1: rule__RosActionServer__Group__6 : rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 ;
    public final void rule__RosActionServer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1607:1: ( rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7 )
            // InternalRosInterfacesPool.g:1608:2: rule__RosActionServer__Group__6__Impl rule__RosActionServer__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RosActionServer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__7();

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
    // $ANTLR end "rule__RosActionServer__Group__6"


    // $ANTLR start "rule__RosActionServer__Group__6__Impl"
    // InternalRosInterfacesPool.g:1615:1: rule__RosActionServer__Group__6__Impl : ( ( rule__RosActionServer__TypeAssignment_6 ) ) ;
    public final void rule__RosActionServer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1619:1: ( ( ( rule__RosActionServer__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:1620:1: ( ( rule__RosActionServer__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:1620:1: ( ( rule__RosActionServer__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:1621:2: ( rule__RosActionServer__TypeAssignment_6 )
            {
             before(grammarAccess.getRosActionServerAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:1622:2: ( rule__RosActionServer__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:1622:3: rule__RosActionServer__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosActionServerAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__RosActionServer__Group__6__Impl"


    // $ANTLR start "rule__RosActionServer__Group__7"
    // InternalRosInterfacesPool.g:1630:1: rule__RosActionServer__Group__7 : rule__RosActionServer__Group__7__Impl ;
    public final void rule__RosActionServer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1634:1: ( rule__RosActionServer__Group__7__Impl )
            // InternalRosInterfacesPool.g:1635:2: rule__RosActionServer__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionServer__Group__7__Impl();

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
    // $ANTLR end "rule__RosActionServer__Group__7"


    // $ANTLR start "rule__RosActionServer__Group__7__Impl"
    // InternalRosInterfacesPool.g:1641:1: rule__RosActionServer__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionServer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1645:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:1646:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:1646:1: ( '}' )
            // InternalRosInterfacesPool.g:1647:2: '}'
            {
             before(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__RosActionServer__Group__7__Impl"


    // $ANTLR start "rule__RosActionClient__Group__0"
    // InternalRosInterfacesPool.g:1657:1: rule__RosActionClient__Group__0 : rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 ;
    public final void rule__RosActionClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1661:1: ( rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1 )
            // InternalRosInterfacesPool.g:1662:2: rule__RosActionClient__Group__0__Impl rule__RosActionClient__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RosActionClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__1();

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
    // $ANTLR end "rule__RosActionClient__Group__0"


    // $ANTLR start "rule__RosActionClient__Group__0__Impl"
    // InternalRosInterfacesPool.g:1669:1: rule__RosActionClient__Group__0__Impl : ( 'RosActionClient' ) ;
    public final void rule__RosActionClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1673:1: ( ( 'RosActionClient' ) )
            // InternalRosInterfacesPool.g:1674:1: ( 'RosActionClient' )
            {
            // InternalRosInterfacesPool.g:1674:1: ( 'RosActionClient' )
            // InternalRosInterfacesPool.g:1675:2: 'RosActionClient'
            {
             before(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRosActionClientKeyword_0()); 

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
    // $ANTLR end "rule__RosActionClient__Group__0__Impl"


    // $ANTLR start "rule__RosActionClient__Group__1"
    // InternalRosInterfacesPool.g:1684:1: rule__RosActionClient__Group__1 : rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 ;
    public final void rule__RosActionClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1688:1: ( rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2 )
            // InternalRosInterfacesPool.g:1689:2: rule__RosActionClient__Group__1__Impl rule__RosActionClient__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosActionClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__2();

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
    // $ANTLR end "rule__RosActionClient__Group__1"


    // $ANTLR start "rule__RosActionClient__Group__1__Impl"
    // InternalRosInterfacesPool.g:1696:1: rule__RosActionClient__Group__1__Impl : ( ( rule__RosActionClient__NameAssignment_1 ) ) ;
    public final void rule__RosActionClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1700:1: ( ( ( rule__RosActionClient__NameAssignment_1 ) ) )
            // InternalRosInterfacesPool.g:1701:1: ( ( rule__RosActionClient__NameAssignment_1 ) )
            {
            // InternalRosInterfacesPool.g:1701:1: ( ( rule__RosActionClient__NameAssignment_1 ) )
            // InternalRosInterfacesPool.g:1702:2: ( rule__RosActionClient__NameAssignment_1 )
            {
             before(grammarAccess.getRosActionClientAccess().getNameAssignment_1()); 
            // InternalRosInterfacesPool.g:1703:2: ( rule__RosActionClient__NameAssignment_1 )
            // InternalRosInterfacesPool.g:1703:3: rule__RosActionClient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RosActionClient__Group__1__Impl"


    // $ANTLR start "rule__RosActionClient__Group__2"
    // InternalRosInterfacesPool.g:1711:1: rule__RosActionClient__Group__2 : rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 ;
    public final void rule__RosActionClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1715:1: ( rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3 )
            // InternalRosInterfacesPool.g:1716:2: rule__RosActionClient__Group__2__Impl rule__RosActionClient__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__RosActionClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__3();

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
    // $ANTLR end "rule__RosActionClient__Group__2"


    // $ANTLR start "rule__RosActionClient__Group__2__Impl"
    // InternalRosInterfacesPool.g:1723:1: rule__RosActionClient__Group__2__Impl : ( '{' ) ;
    public final void rule__RosActionClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1727:1: ( ( '{' ) )
            // InternalRosInterfacesPool.g:1728:1: ( '{' )
            {
            // InternalRosInterfacesPool.g:1728:1: ( '{' )
            // InternalRosInterfacesPool.g:1729:2: '{'
            {
             before(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RosActionClient__Group__2__Impl"


    // $ANTLR start "rule__RosActionClient__Group__3"
    // InternalRosInterfacesPool.g:1738:1: rule__RosActionClient__Group__3 : rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 ;
    public final void rule__RosActionClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1742:1: ( rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4 )
            // InternalRosInterfacesPool.g:1743:2: rule__RosActionClient__Group__3__Impl rule__RosActionClient__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__RosActionClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__4();

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
    // $ANTLR end "rule__RosActionClient__Group__3"


    // $ANTLR start "rule__RosActionClient__Group__3__Impl"
    // InternalRosInterfacesPool.g:1750:1: rule__RosActionClient__Group__3__Impl : ( 'actionName' ) ;
    public final void rule__RosActionClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1754:1: ( ( 'actionName' ) )
            // InternalRosInterfacesPool.g:1755:1: ( 'actionName' )
            {
            // InternalRosInterfacesPool.g:1755:1: ( 'actionName' )
            // InternalRosInterfacesPool.g:1756:2: 'actionName'
            {
             before(grammarAccess.getRosActionClientAccess().getActionNameKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getActionNameKeyword_3()); 

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
    // $ANTLR end "rule__RosActionClient__Group__3__Impl"


    // $ANTLR start "rule__RosActionClient__Group__4"
    // InternalRosInterfacesPool.g:1765:1: rule__RosActionClient__Group__4 : rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 ;
    public final void rule__RosActionClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1769:1: ( rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5 )
            // InternalRosInterfacesPool.g:1770:2: rule__RosActionClient__Group__4__Impl rule__RosActionClient__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__RosActionClient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__5();

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
    // $ANTLR end "rule__RosActionClient__Group__4"


    // $ANTLR start "rule__RosActionClient__Group__4__Impl"
    // InternalRosInterfacesPool.g:1777:1: rule__RosActionClient__Group__4__Impl : ( ( rule__RosActionClient__ActionNameAssignment_4 ) ) ;
    public final void rule__RosActionClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1781:1: ( ( ( rule__RosActionClient__ActionNameAssignment_4 ) ) )
            // InternalRosInterfacesPool.g:1782:1: ( ( rule__RosActionClient__ActionNameAssignment_4 ) )
            {
            // InternalRosInterfacesPool.g:1782:1: ( ( rule__RosActionClient__ActionNameAssignment_4 ) )
            // InternalRosInterfacesPool.g:1783:2: ( rule__RosActionClient__ActionNameAssignment_4 )
            {
             before(grammarAccess.getRosActionClientAccess().getActionNameAssignment_4()); 
            // InternalRosInterfacesPool.g:1784:2: ( rule__RosActionClient__ActionNameAssignment_4 )
            // InternalRosInterfacesPool.g:1784:3: rule__RosActionClient__ActionNameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__ActionNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getActionNameAssignment_4()); 

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
    // $ANTLR end "rule__RosActionClient__Group__4__Impl"


    // $ANTLR start "rule__RosActionClient__Group__5"
    // InternalRosInterfacesPool.g:1792:1: rule__RosActionClient__Group__5 : rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 ;
    public final void rule__RosActionClient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1796:1: ( rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6 )
            // InternalRosInterfacesPool.g:1797:2: rule__RosActionClient__Group__5__Impl rule__RosActionClient__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__RosActionClient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__6();

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
    // $ANTLR end "rule__RosActionClient__Group__5"


    // $ANTLR start "rule__RosActionClient__Group__5__Impl"
    // InternalRosInterfacesPool.g:1804:1: rule__RosActionClient__Group__5__Impl : ( 'type' ) ;
    public final void rule__RosActionClient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1808:1: ( ( 'type' ) )
            // InternalRosInterfacesPool.g:1809:1: ( 'type' )
            {
            // InternalRosInterfacesPool.g:1809:1: ( 'type' )
            // InternalRosInterfacesPool.g:1810:2: 'type'
            {
             before(grammarAccess.getRosActionClientAccess().getTypeKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getTypeKeyword_5()); 

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
    // $ANTLR end "rule__RosActionClient__Group__5__Impl"


    // $ANTLR start "rule__RosActionClient__Group__6"
    // InternalRosInterfacesPool.g:1819:1: rule__RosActionClient__Group__6 : rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 ;
    public final void rule__RosActionClient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1823:1: ( rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7 )
            // InternalRosInterfacesPool.g:1824:2: rule__RosActionClient__Group__6__Impl rule__RosActionClient__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__RosActionClient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__7();

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
    // $ANTLR end "rule__RosActionClient__Group__6"


    // $ANTLR start "rule__RosActionClient__Group__6__Impl"
    // InternalRosInterfacesPool.g:1831:1: rule__RosActionClient__Group__6__Impl : ( ( rule__RosActionClient__TypeAssignment_6 ) ) ;
    public final void rule__RosActionClient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1835:1: ( ( ( rule__RosActionClient__TypeAssignment_6 ) ) )
            // InternalRosInterfacesPool.g:1836:1: ( ( rule__RosActionClient__TypeAssignment_6 ) )
            {
            // InternalRosInterfacesPool.g:1836:1: ( ( rule__RosActionClient__TypeAssignment_6 ) )
            // InternalRosInterfacesPool.g:1837:2: ( rule__RosActionClient__TypeAssignment_6 )
            {
             before(grammarAccess.getRosActionClientAccess().getTypeAssignment_6()); 
            // InternalRosInterfacesPool.g:1838:2: ( rule__RosActionClient__TypeAssignment_6 )
            // InternalRosInterfacesPool.g:1838:3: rule__RosActionClient__TypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__TypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRosActionClientAccess().getTypeAssignment_6()); 

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
    // $ANTLR end "rule__RosActionClient__Group__6__Impl"


    // $ANTLR start "rule__RosActionClient__Group__7"
    // InternalRosInterfacesPool.g:1846:1: rule__RosActionClient__Group__7 : rule__RosActionClient__Group__7__Impl ;
    public final void rule__RosActionClient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1850:1: ( rule__RosActionClient__Group__7__Impl )
            // InternalRosInterfacesPool.g:1851:2: rule__RosActionClient__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosActionClient__Group__7__Impl();

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
    // $ANTLR end "rule__RosActionClient__Group__7"


    // $ANTLR start "rule__RosActionClient__Group__7__Impl"
    // InternalRosInterfacesPool.g:1857:1: rule__RosActionClient__Group__7__Impl : ( '}' ) ;
    public final void rule__RosActionClient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1861:1: ( ( '}' ) )
            // InternalRosInterfacesPool.g:1862:1: ( '}' )
            {
            // InternalRosInterfacesPool.g:1862:1: ( '}' )
            // InternalRosInterfacesPool.g:1863:2: '}'
            {
             before(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__RosActionClient__Group__7__Impl"


    // $ANTLR start "rule__RosInterfacesPool__InterfacesAssignment_3"
    // InternalRosInterfacesPool.g:1873:1: rule__RosInterfacesPool__InterfacesAssignment_3 : ( ruleRosInterface ) ;
    public final void rule__RosInterfacesPool__InterfacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1877:1: ( ( ruleRosInterface ) )
            // InternalRosInterfacesPool.g:1878:2: ( ruleRosInterface )
            {
            // InternalRosInterfacesPool.g:1878:2: ( ruleRosInterface )
            // InternalRosInterfacesPool.g:1879:3: ruleRosInterface
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
    // InternalRosInterfacesPool.g:1888:1: rule__RosPublisher__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosPublisher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1892:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1893:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1893:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1894:3: RULE_ID
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
    // InternalRosInterfacesPool.g:1903:1: rule__RosPublisher__TopicNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosPublisher__TopicNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1907:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1908:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1908:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1909:3: ruleEString
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
    // InternalRosInterfacesPool.g:1918:1: rule__RosPublisher__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosPublisher__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1922:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1923:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1923:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1924:3: ruleEString
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
    // InternalRosInterfacesPool.g:1933:1: rule__RosSubscriber__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosSubscriber__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1937:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1938:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1938:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1939:3: RULE_ID
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
    // InternalRosInterfacesPool.g:1948:1: rule__RosSubscriber__TopicNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSubscriber__TopicNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1952:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1953:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1953:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1954:3: ruleEString
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
    // InternalRosInterfacesPool.g:1963:1: rule__RosSubscriber__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosSubscriber__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1967:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1968:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1968:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1969:3: ruleEString
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
    // InternalRosInterfacesPool.g:1978:1: rule__RosSrvServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosSrvServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1982:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:1983:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:1983:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:1984:3: RULE_ID
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
    // InternalRosInterfacesPool.g:1993:1: rule__RosSrvServer__SrvNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSrvServer__SrvNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:1997:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:1998:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:1998:2: ( ruleEString )
            // InternalRosInterfacesPool.g:1999:3: ruleEString
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
    // InternalRosInterfacesPool.g:2008:1: rule__RosSrvServer__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosSrvServer__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2012:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2013:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2013:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2014:3: ruleEString
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
    // InternalRosInterfacesPool.g:2023:1: rule__RosSrvClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosSrvClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2027:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:2028:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:2028:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:2029:3: RULE_ID
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
    // InternalRosInterfacesPool.g:2038:1: rule__RosSrvClient__SrvNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosSrvClient__SrvNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2042:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2043:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2043:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2044:3: ruleEString
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
    // InternalRosInterfacesPool.g:2053:1: rule__RosSrvClient__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosSrvClient__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2057:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2058:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2058:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2059:3: ruleEString
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


    // $ANTLR start "rule__RosActionServer__NameAssignment_1"
    // InternalRosInterfacesPool.g:2068:1: rule__RosActionServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosActionServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2072:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:2073:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:2073:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:2074:3: RULE_ID
            {
             before(grammarAccess.getRosActionServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRosActionServerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RosActionServer__NameAssignment_1"


    // $ANTLR start "rule__RosActionServer__ActionNameAssignment_4"
    // InternalRosInterfacesPool.g:2083:1: rule__RosActionServer__ActionNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosActionServer__ActionNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2087:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2088:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2088:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2089:3: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getActionNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getActionNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RosActionServer__ActionNameAssignment_4"


    // $ANTLR start "rule__RosActionServer__TypeAssignment_6"
    // InternalRosInterfacesPool.g:2098:1: rule__RosActionServer__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosActionServer__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2102:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2103:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2103:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2104:3: ruleEString
            {
             before(grammarAccess.getRosActionServerAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionServerAccess().getTypeEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RosActionServer__TypeAssignment_6"


    // $ANTLR start "rule__RosActionClient__NameAssignment_1"
    // InternalRosInterfacesPool.g:2113:1: rule__RosActionClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RosActionClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2117:1: ( ( RULE_ID ) )
            // InternalRosInterfacesPool.g:2118:2: ( RULE_ID )
            {
            // InternalRosInterfacesPool.g:2118:2: ( RULE_ID )
            // InternalRosInterfacesPool.g:2119:3: RULE_ID
            {
             before(grammarAccess.getRosActionClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRosActionClientAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RosActionClient__NameAssignment_1"


    // $ANTLR start "rule__RosActionClient__ActionNameAssignment_4"
    // InternalRosInterfacesPool.g:2128:1: rule__RosActionClient__ActionNameAssignment_4 : ( ruleEString ) ;
    public final void rule__RosActionClient__ActionNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2132:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2133:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2133:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2134:3: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getActionNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getActionNameEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RosActionClient__ActionNameAssignment_4"


    // $ANTLR start "rule__RosActionClient__TypeAssignment_6"
    // InternalRosInterfacesPool.g:2143:1: rule__RosActionClient__TypeAssignment_6 : ( ruleEString ) ;
    public final void rule__RosActionClient__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosInterfacesPool.g:2147:1: ( ( ruleEString ) )
            // InternalRosInterfacesPool.g:2148:2: ( ruleEString )
            {
            // InternalRosInterfacesPool.g:2148:2: ( ruleEString )
            // InternalRosInterfacesPool.g:2149:3: ruleEString
            {
             before(grammarAccess.getRosActionClientAccess().getTypeEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosActionClientAccess().getTypeEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RosActionClient__TypeAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000B66000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000B64002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});

}
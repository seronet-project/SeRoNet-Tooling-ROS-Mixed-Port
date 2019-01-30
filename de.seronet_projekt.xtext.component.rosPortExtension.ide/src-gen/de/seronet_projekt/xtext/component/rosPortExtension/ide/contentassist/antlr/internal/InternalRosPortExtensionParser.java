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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosPortExtensionParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleExtendsComponent"
    // InternalRosPortExtension.g:94:1: entryRuleExtendsComponent : ruleExtendsComponent EOF ;
    public final void entryRuleExtendsComponent() throws RecognitionException {
        try {
            // InternalRosPortExtension.g:95:1: ( ruleExtendsComponent EOF )
            // InternalRosPortExtension.g:96:1: ruleExtendsComponent EOF
            {
             before(grammarAccess.getExtendsComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleExtendsComponent();

            state._fsp--;

             after(grammarAccess.getExtendsComponentRule()); 
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
    // $ANTLR end "entryRuleExtendsComponent"


    // $ANTLR start "ruleExtendsComponent"
    // InternalRosPortExtension.g:103:1: ruleExtendsComponent : ( ( rule__ExtendsComponent__Group__0 ) ) ;
    public final void ruleExtendsComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:107:2: ( ( ( rule__ExtendsComponent__Group__0 ) ) )
            // InternalRosPortExtension.g:108:2: ( ( rule__ExtendsComponent__Group__0 ) )
            {
            // InternalRosPortExtension.g:108:2: ( ( rule__ExtendsComponent__Group__0 ) )
            // InternalRosPortExtension.g:109:3: ( rule__ExtendsComponent__Group__0 )
            {
             before(grammarAccess.getExtendsComponentAccess().getGroup()); 
            // InternalRosPortExtension.g:110:3: ( rule__ExtendsComponent__Group__0 )
            // InternalRosPortExtension.g:110:4: rule__ExtendsComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendsComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleExtendsComponent"


    // $ANTLR start "entryRuleFQN"
    // InternalRosPortExtension.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalRosPortExtension.g:120:1: ( ruleFQN EOF )
            // InternalRosPortExtension.g:121:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalRosPortExtension.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalRosPortExtension.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalRosPortExtension.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalRosPortExtension.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalRosPortExtension.g:135:3: ( rule__FQN__Group__0 )
            // InternalRosPortExtension.g:135:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleRosPortSelection"
    // InternalRosPortExtension.g:144:1: entryRuleRosPortSelection : ruleRosPortSelection EOF ;
    public final void entryRuleRosPortSelection() throws RecognitionException {
        try {
            // InternalRosPortExtension.g:145:1: ( ruleRosPortSelection EOF )
            // InternalRosPortExtension.g:146:1: ruleRosPortSelection EOF
            {
             before(grammarAccess.getRosPortSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleRosPortSelection();

            state._fsp--;

             after(grammarAccess.getRosPortSelectionRule()); 
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
    // $ANTLR end "entryRuleRosPortSelection"


    // $ANTLR start "ruleRosPortSelection"
    // InternalRosPortExtension.g:153:1: ruleRosPortSelection : ( ( rule__RosPortSelection__Group__0 ) ) ;
    public final void ruleRosPortSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:157:2: ( ( ( rule__RosPortSelection__Group__0 ) ) )
            // InternalRosPortExtension.g:158:2: ( ( rule__RosPortSelection__Group__0 ) )
            {
            // InternalRosPortExtension.g:158:2: ( ( rule__RosPortSelection__Group__0 ) )
            // InternalRosPortExtension.g:159:3: ( rule__RosPortSelection__Group__0 )
            {
             before(grammarAccess.getRosPortSelectionAccess().getGroup()); 
            // InternalRosPortExtension.g:160:3: ( rule__RosPortSelection__Group__0 )
            // InternalRosPortExtension.g:160:4: rule__RosPortSelection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosPortSelection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosPortSelectionAccess().getGroup()); 

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
    // $ANTLR end "ruleRosPortSelection"


    // $ANTLR start "rule__ExtendsComponent__Group__0"
    // InternalRosPortExtension.g:168:1: rule__ExtendsComponent__Group__0 : rule__ExtendsComponent__Group__0__Impl rule__ExtendsComponent__Group__1 ;
    public final void rule__ExtendsComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:172:1: ( rule__ExtendsComponent__Group__0__Impl rule__ExtendsComponent__Group__1 )
            // InternalRosPortExtension.g:173:2: rule__ExtendsComponent__Group__0__Impl rule__ExtendsComponent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExtendsComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__Group__1();

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
    // $ANTLR end "rule__ExtendsComponent__Group__0"


    // $ANTLR start "rule__ExtendsComponent__Group__0__Impl"
    // InternalRosPortExtension.g:180:1: rule__ExtendsComponent__Group__0__Impl : ( 'ExtendsComponent' ) ;
    public final void rule__ExtendsComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:184:1: ( ( 'ExtendsComponent' ) )
            // InternalRosPortExtension.g:185:1: ( 'ExtendsComponent' )
            {
            // InternalRosPortExtension.g:185:1: ( 'ExtendsComponent' )
            // InternalRosPortExtension.g:186:2: 'ExtendsComponent'
            {
             before(grammarAccess.getExtendsComponentAccess().getExtendsComponentKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getExtendsComponentAccess().getExtendsComponentKeyword_0()); 

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
    // $ANTLR end "rule__ExtendsComponent__Group__0__Impl"


    // $ANTLR start "rule__ExtendsComponent__Group__1"
    // InternalRosPortExtension.g:195:1: rule__ExtendsComponent__Group__1 : rule__ExtendsComponent__Group__1__Impl rule__ExtendsComponent__Group__2 ;
    public final void rule__ExtendsComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:199:1: ( rule__ExtendsComponent__Group__1__Impl rule__ExtendsComponent__Group__2 )
            // InternalRosPortExtension.g:200:2: rule__ExtendsComponent__Group__1__Impl rule__ExtendsComponent__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExtendsComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__Group__2();

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
    // $ANTLR end "rule__ExtendsComponent__Group__1"


    // $ANTLR start "rule__ExtendsComponent__Group__1__Impl"
    // InternalRosPortExtension.g:207:1: rule__ExtendsComponent__Group__1__Impl : ( ( rule__ExtendsComponent__ComponentAssignment_1 ) ) ;
    public final void rule__ExtendsComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:211:1: ( ( ( rule__ExtendsComponent__ComponentAssignment_1 ) ) )
            // InternalRosPortExtension.g:212:1: ( ( rule__ExtendsComponent__ComponentAssignment_1 ) )
            {
            // InternalRosPortExtension.g:212:1: ( ( rule__ExtendsComponent__ComponentAssignment_1 ) )
            // InternalRosPortExtension.g:213:2: ( rule__ExtendsComponent__ComponentAssignment_1 )
            {
             before(grammarAccess.getExtendsComponentAccess().getComponentAssignment_1()); 
            // InternalRosPortExtension.g:214:2: ( rule__ExtendsComponent__ComponentAssignment_1 )
            // InternalRosPortExtension.g:214:3: rule__ExtendsComponent__ComponentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendsComponentAccess().getComponentAssignment_1()); 

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
    // $ANTLR end "rule__ExtendsComponent__Group__1__Impl"


    // $ANTLR start "rule__ExtendsComponent__Group__2"
    // InternalRosPortExtension.g:222:1: rule__ExtendsComponent__Group__2 : rule__ExtendsComponent__Group__2__Impl rule__ExtendsComponent__Group__3 ;
    public final void rule__ExtendsComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:226:1: ( rule__ExtendsComponent__Group__2__Impl rule__ExtendsComponent__Group__3 )
            // InternalRosPortExtension.g:227:2: rule__ExtendsComponent__Group__2__Impl rule__ExtendsComponent__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ExtendsComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__Group__3();

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
    // $ANTLR end "rule__ExtendsComponent__Group__2"


    // $ANTLR start "rule__ExtendsComponent__Group__2__Impl"
    // InternalRosPortExtension.g:234:1: rule__ExtendsComponent__Group__2__Impl : ( '{' ) ;
    public final void rule__ExtendsComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:238:1: ( ( '{' ) )
            // InternalRosPortExtension.g:239:1: ( '{' )
            {
            // InternalRosPortExtension.g:239:1: ( '{' )
            // InternalRosPortExtension.g:240:2: '{'
            {
             before(grammarAccess.getExtendsComponentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getExtendsComponentAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ExtendsComponent__Group__2__Impl"


    // $ANTLR start "rule__ExtendsComponent__Group__3"
    // InternalRosPortExtension.g:249:1: rule__ExtendsComponent__Group__3 : rule__ExtendsComponent__Group__3__Impl rule__ExtendsComponent__Group__4 ;
    public final void rule__ExtendsComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:253:1: ( rule__ExtendsComponent__Group__3__Impl rule__ExtendsComponent__Group__4 )
            // InternalRosPortExtension.g:254:2: rule__ExtendsComponent__Group__3__Impl rule__ExtendsComponent__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ExtendsComponent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__Group__4();

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
    // $ANTLR end "rule__ExtendsComponent__Group__3"


    // $ANTLR start "rule__ExtendsComponent__Group__3__Impl"
    // InternalRosPortExtension.g:261:1: rule__ExtendsComponent__Group__3__Impl : ( ( rule__ExtendsComponent__PortsAssignment_3 )* ) ;
    public final void rule__ExtendsComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:265:1: ( ( ( rule__ExtendsComponent__PortsAssignment_3 )* ) )
            // InternalRosPortExtension.g:266:1: ( ( rule__ExtendsComponent__PortsAssignment_3 )* )
            {
            // InternalRosPortExtension.g:266:1: ( ( rule__ExtendsComponent__PortsAssignment_3 )* )
            // InternalRosPortExtension.g:267:2: ( rule__ExtendsComponent__PortsAssignment_3 )*
            {
             before(grammarAccess.getExtendsComponentAccess().getPortsAssignment_3()); 
            // InternalRosPortExtension.g:268:2: ( rule__ExtendsComponent__PortsAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRosPortExtension.g:268:3: rule__ExtendsComponent__PortsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__ExtendsComponent__PortsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getExtendsComponentAccess().getPortsAssignment_3()); 

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
    // $ANTLR end "rule__ExtendsComponent__Group__3__Impl"


    // $ANTLR start "rule__ExtendsComponent__Group__4"
    // InternalRosPortExtension.g:276:1: rule__ExtendsComponent__Group__4 : rule__ExtendsComponent__Group__4__Impl ;
    public final void rule__ExtendsComponent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:280:1: ( rule__ExtendsComponent__Group__4__Impl )
            // InternalRosPortExtension.g:281:2: rule__ExtendsComponent__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExtendsComponent__Group__4__Impl();

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
    // $ANTLR end "rule__ExtendsComponent__Group__4"


    // $ANTLR start "rule__ExtendsComponent__Group__4__Impl"
    // InternalRosPortExtension.g:287:1: rule__ExtendsComponent__Group__4__Impl : ( '}' ) ;
    public final void rule__ExtendsComponent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:291:1: ( ( '}' ) )
            // InternalRosPortExtension.g:292:1: ( '}' )
            {
            // InternalRosPortExtension.g:292:1: ( '}' )
            // InternalRosPortExtension.g:293:2: '}'
            {
             before(grammarAccess.getExtendsComponentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExtendsComponentAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__ExtendsComponent__Group__4__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalRosPortExtension.g:303:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:307:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalRosPortExtension.g:308:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

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
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalRosPortExtension.g:315:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:319:1: ( ( RULE_ID ) )
            // InternalRosPortExtension.g:320:1: ( RULE_ID )
            {
            // InternalRosPortExtension.g:320:1: ( RULE_ID )
            // InternalRosPortExtension.g:321:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalRosPortExtension.g:330:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:334:1: ( rule__FQN__Group__1__Impl )
            // InternalRosPortExtension.g:335:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

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
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalRosPortExtension.g:341:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )? ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:345:1: ( ( ( rule__FQN__Group_1__0 )? ) )
            // InternalRosPortExtension.g:346:1: ( ( rule__FQN__Group_1__0 )? )
            {
            // InternalRosPortExtension.g:346:1: ( ( rule__FQN__Group_1__0 )? )
            // InternalRosPortExtension.g:347:2: ( rule__FQN__Group_1__0 )?
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalRosPortExtension.g:348:2: ( rule__FQN__Group_1__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosPortExtension.g:348:3: rule__FQN__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FQN__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFQNAccess().getGroup_1()); 

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
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalRosPortExtension.g:357:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:361:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalRosPortExtension.g:362:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

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
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalRosPortExtension.g:369:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:373:1: ( ( '.' ) )
            // InternalRosPortExtension.g:374:1: ( '.' )
            {
            // InternalRosPortExtension.g:374:1: ( '.' )
            // InternalRosPortExtension.g:375:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalRosPortExtension.g:384:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:388:1: ( rule__FQN__Group_1__1__Impl )
            // InternalRosPortExtension.g:389:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

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
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalRosPortExtension.g:395:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:399:1: ( ( RULE_ID ) )
            // InternalRosPortExtension.g:400:1: ( RULE_ID )
            {
            // InternalRosPortExtension.g:400:1: ( RULE_ID )
            // InternalRosPortExtension.g:401:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__RosPortSelection__Group__0"
    // InternalRosPortExtension.g:411:1: rule__RosPortSelection__Group__0 : rule__RosPortSelection__Group__0__Impl rule__RosPortSelection__Group__1 ;
    public final void rule__RosPortSelection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:415:1: ( rule__RosPortSelection__Group__0__Impl rule__RosPortSelection__Group__1 )
            // InternalRosPortExtension.g:416:2: rule__RosPortSelection__Group__0__Impl rule__RosPortSelection__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosPortSelection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPortSelection__Group__1();

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
    // $ANTLR end "rule__RosPortSelection__Group__0"


    // $ANTLR start "rule__RosPortSelection__Group__0__Impl"
    // InternalRosPortExtension.g:423:1: rule__RosPortSelection__Group__0__Impl : ( 'RosPortSelection' ) ;
    public final void rule__RosPortSelection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:427:1: ( ( 'RosPortSelection' ) )
            // InternalRosPortExtension.g:428:1: ( 'RosPortSelection' )
            {
            // InternalRosPortExtension.g:428:1: ( 'RosPortSelection' )
            // InternalRosPortExtension.g:429:2: 'RosPortSelection'
            {
             before(grammarAccess.getRosPortSelectionAccess().getRosPortSelectionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosPortSelectionAccess().getRosPortSelectionKeyword_0()); 

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
    // $ANTLR end "rule__RosPortSelection__Group__0__Impl"


    // $ANTLR start "rule__RosPortSelection__Group__1"
    // InternalRosPortExtension.g:438:1: rule__RosPortSelection__Group__1 : rule__RosPortSelection__Group__1__Impl rule__RosPortSelection__Group__2 ;
    public final void rule__RosPortSelection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:442:1: ( rule__RosPortSelection__Group__1__Impl rule__RosPortSelection__Group__2 )
            // InternalRosPortExtension.g:443:2: rule__RosPortSelection__Group__1__Impl rule__RosPortSelection__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__RosPortSelection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosPortSelection__Group__2();

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
    // $ANTLR end "rule__RosPortSelection__Group__1"


    // $ANTLR start "rule__RosPortSelection__Group__1__Impl"
    // InternalRosPortExtension.g:450:1: rule__RosPortSelection__Group__1__Impl : ( ( rule__RosPortSelection__PortAssignment_1 ) ) ;
    public final void rule__RosPortSelection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:454:1: ( ( ( rule__RosPortSelection__PortAssignment_1 ) ) )
            // InternalRosPortExtension.g:455:1: ( ( rule__RosPortSelection__PortAssignment_1 ) )
            {
            // InternalRosPortExtension.g:455:1: ( ( rule__RosPortSelection__PortAssignment_1 ) )
            // InternalRosPortExtension.g:456:2: ( rule__RosPortSelection__PortAssignment_1 )
            {
             before(grammarAccess.getRosPortSelectionAccess().getPortAssignment_1()); 
            // InternalRosPortExtension.g:457:2: ( rule__RosPortSelection__PortAssignment_1 )
            // InternalRosPortExtension.g:457:3: rule__RosPortSelection__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosPortSelection__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosPortSelectionAccess().getPortAssignment_1()); 

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
    // $ANTLR end "rule__RosPortSelection__Group__1__Impl"


    // $ANTLR start "rule__RosPortSelection__Group__2"
    // InternalRosPortExtension.g:465:1: rule__RosPortSelection__Group__2 : rule__RosPortSelection__Group__2__Impl ;
    public final void rule__RosPortSelection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:469:1: ( rule__RosPortSelection__Group__2__Impl )
            // InternalRosPortExtension.g:470:2: rule__RosPortSelection__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosPortSelection__Group__2__Impl();

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
    // $ANTLR end "rule__RosPortSelection__Group__2"


    // $ANTLR start "rule__RosPortSelection__Group__2__Impl"
    // InternalRosPortExtension.g:476:1: rule__RosPortSelection__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RosPortSelection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:480:1: ( ( ( ';' )? ) )
            // InternalRosPortExtension.g:481:1: ( ( ';' )? )
            {
            // InternalRosPortExtension.g:481:1: ( ( ';' )? )
            // InternalRosPortExtension.g:482:2: ( ';' )?
            {
             before(grammarAccess.getRosPortSelectionAccess().getSemicolonKeyword_2()); 
            // InternalRosPortExtension.g:483:2: ( ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosPortExtension.g:483:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRosPortSelectionAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__RosPortSelection__Group__2__Impl"


    // $ANTLR start "rule__ExtendsComponent__ComponentAssignment_1"
    // InternalRosPortExtension.g:492:1: rule__ExtendsComponent__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ExtendsComponent__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:496:1: ( ( ( RULE_ID ) ) )
            // InternalRosPortExtension.g:497:2: ( ( RULE_ID ) )
            {
            // InternalRosPortExtension.g:497:2: ( ( RULE_ID ) )
            // InternalRosPortExtension.g:498:3: ( RULE_ID )
            {
             before(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionCrossReference_1_0()); 
            // InternalRosPortExtension.g:499:3: ( RULE_ID )
            // InternalRosPortExtension.g:500:4: RULE_ID
            {
             before(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getExtendsComponentAccess().getComponentComponentDefinitionCrossReference_1_0()); 

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
    // $ANTLR end "rule__ExtendsComponent__ComponentAssignment_1"


    // $ANTLR start "rule__ExtendsComponent__PortsAssignment_3"
    // InternalRosPortExtension.g:511:1: rule__ExtendsComponent__PortsAssignment_3 : ( ruleRosPortSelection ) ;
    public final void rule__ExtendsComponent__PortsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:515:1: ( ( ruleRosPortSelection ) )
            // InternalRosPortExtension.g:516:2: ( ruleRosPortSelection )
            {
            // InternalRosPortExtension.g:516:2: ( ruleRosPortSelection )
            // InternalRosPortExtension.g:517:3: ruleRosPortSelection
            {
             before(grammarAccess.getExtendsComponentAccess().getPortsRosPortSelectionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRosPortSelection();

            state._fsp--;

             after(grammarAccess.getExtendsComponentAccess().getPortsRosPortSelectionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ExtendsComponent__PortsAssignment_3"


    // $ANTLR start "rule__RosPortSelection__PortAssignment_1"
    // InternalRosPortExtension.g:526:1: rule__RosPortSelection__PortAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__RosPortSelection__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosPortExtension.g:530:1: ( ( ( ruleFQN ) ) )
            // InternalRosPortExtension.g:531:2: ( ( ruleFQN ) )
            {
            // InternalRosPortExtension.g:531:2: ( ( ruleFQN ) )
            // InternalRosPortExtension.g:532:3: ( ruleFQN )
            {
             before(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceCrossReference_1_0()); 
            // InternalRosPortExtension.g:533:3: ( ruleFQN )
            // InternalRosPortExtension.g:534:4: ruleFQN
            {
             before(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRosPortSelectionAccess().getPortRosInterfaceCrossReference_1_0()); 

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
    // $ANTLR end "rule__RosPortSelection__PortAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}
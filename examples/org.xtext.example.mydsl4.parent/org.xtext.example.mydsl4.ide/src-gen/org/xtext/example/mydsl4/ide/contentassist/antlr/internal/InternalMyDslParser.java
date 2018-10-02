package org.xtext.example.mydsl4.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'*'", "'('", "')'", "'-'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:54:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:55:1: ( ruleExpression EOF )
            // InternalMyDsl.g:56:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:63:1: ruleExpression : ( ruleSum ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:67:2: ( ( ruleSum ) )
            // InternalMyDsl.g:68:2: ( ruleSum )
            {
            // InternalMyDsl.g:68:2: ( ruleSum )
            // InternalMyDsl.g:69:3: ruleSum
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getSumParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getSumParserRuleCall()); 
            }

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleSum"
    // InternalMyDsl.g:79:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalMyDsl.g:80:1: ( ruleSum EOF )
            // InternalMyDsl.g:81:1: ruleSum EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalMyDsl.g:88:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:92:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalMyDsl.g:93:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalMyDsl.g:93:2: ( ( rule__Sum__Group__0 ) )
            // InternalMyDsl.g:94:3: ( rule__Sum__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getGroup()); 
            }
            // InternalMyDsl.g:95:3: ( rule__Sum__Group__0 )
            // InternalMyDsl.g:95:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMul"
    // InternalMyDsl.g:104:1: entryRuleMul : ruleMul EOF ;
    public final void entryRuleMul() throws RecognitionException {
        try {
            // InternalMyDsl.g:105:1: ( ruleMul EOF )
            // InternalMyDsl.g:106:1: ruleMul EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMul();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMul"


    // $ANTLR start "ruleMul"
    // InternalMyDsl.g:113:1: ruleMul : ( ( rule__Mul__Group__0 ) ) ;
    public final void ruleMul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:117:2: ( ( ( rule__Mul__Group__0 ) ) )
            // InternalMyDsl.g:118:2: ( ( rule__Mul__Group__0 ) )
            {
            // InternalMyDsl.g:118:2: ( ( rule__Mul__Group__0 ) )
            // InternalMyDsl.g:119:3: ( rule__Mul__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getGroup()); 
            }
            // InternalMyDsl.g:120:3: ( rule__Mul__Group__0 )
            // InternalMyDsl.g:120:4: rule__Mul__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleMul"


    // $ANTLR start "entryRuleTerminal"
    // InternalMyDsl.g:129:1: entryRuleTerminal : ruleTerminal EOF ;
    public final void entryRuleTerminal() throws RecognitionException {
        try {
            // InternalMyDsl.g:130:1: ( ruleTerminal EOF )
            // InternalMyDsl.g:131:1: ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalMyDsl.g:138:1: ruleTerminal : ( ( rule__Terminal__Alternatives ) ) ;
    public final void ruleTerminal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:142:2: ( ( ( rule__Terminal__Alternatives ) ) )
            // InternalMyDsl.g:143:2: ( ( rule__Terminal__Alternatives ) )
            {
            // InternalMyDsl.g:143:2: ( ( rule__Terminal__Alternatives ) )
            // InternalMyDsl.g:144:3: ( rule__Terminal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getAlternatives()); 
            }
            // InternalMyDsl.g:145:3: ( rule__Terminal__Alternatives )
            // InternalMyDsl.g:145:4: rule__Terminal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNeg"
    // InternalMyDsl.g:154:1: entryRuleNeg : ruleNeg EOF ;
    public final void entryRuleNeg() throws RecognitionException {
        try {
            // InternalMyDsl.g:155:1: ( ruleNeg EOF )
            // InternalMyDsl.g:156:1: ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNeg();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNeg"


    // $ANTLR start "ruleNeg"
    // InternalMyDsl.g:163:1: ruleNeg : ( ( rule__Neg__Group__0 ) ) ;
    public final void ruleNeg() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:167:2: ( ( ( rule__Neg__Group__0 ) ) )
            // InternalMyDsl.g:168:2: ( ( rule__Neg__Group__0 ) )
            {
            // InternalMyDsl.g:168:2: ( ( rule__Neg__Group__0 ) )
            // InternalMyDsl.g:169:3: ( rule__Neg__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getGroup()); 
            }
            // InternalMyDsl.g:170:3: ( rule__Neg__Group__0 )
            // InternalMyDsl.g:170:4: rule__Neg__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Neg__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleNeg"


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:179:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:180:1: ( ruleLiteral EOF )
            // InternalMyDsl.g:181:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:188:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:192:2: ( ( ( rule__Literal__Group__0 ) ) )
            // InternalMyDsl.g:193:2: ( ( rule__Literal__Group__0 ) )
            {
            // InternalMyDsl.g:193:2: ( ( rule__Literal__Group__0 ) )
            // InternalMyDsl.g:194:3: ( rule__Literal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getGroup()); 
            }
            // InternalMyDsl.g:195:3: ( rule__Literal__Group__0 )
            // InternalMyDsl.g:195:4: rule__Literal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleELong"
    // InternalMyDsl.g:204:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalMyDsl.g:205:1: ( ruleELong EOF )
            // InternalMyDsl.g:206:1: ruleELong EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELongRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getELongRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalMyDsl.g:213:1: ruleELong : ( RULE_INT ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:217:2: ( ( RULE_INT ) )
            // InternalMyDsl.g:218:2: ( RULE_INT )
            {
            // InternalMyDsl.g:218:2: ( RULE_INT )
            // InternalMyDsl.g:219:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getELongAccess().getINTTerminalRuleCall()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getELongAccess().getINTTerminalRuleCall()); 
            }

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "rule__Terminal__Alternatives"
    // InternalMyDsl.g:228:1: rule__Terminal__Alternatives : ( ( ( rule__Terminal__Group_0__0 ) ) | ( ruleLiteral ) | ( ruleNeg ) );
    public final void rule__Terminal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:232:1: ( ( ( rule__Terminal__Group_0__0 ) ) | ( ruleLiteral ) | ( ruleNeg ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:233:2: ( ( rule__Terminal__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:233:2: ( ( rule__Terminal__Group_0__0 ) )
                    // InternalMyDsl.g:234:3: ( rule__Terminal__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getGroup_0()); 
                    }
                    // InternalMyDsl.g:235:3: ( rule__Terminal__Group_0__0 )
                    // InternalMyDsl.g:235:4: rule__Terminal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminal__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:239:2: ( ruleLiteral )
                    {
                    // InternalMyDsl.g:239:2: ( ruleLiteral )
                    // InternalMyDsl.g:240:3: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getLiteralParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:245:2: ( ruleNeg )
                    {
                    // InternalMyDsl.g:245:2: ( ruleNeg )
                    // InternalMyDsl.g:246:3: ruleNeg
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalAccess().getNegParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNeg();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalAccess().getNegParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Terminal__Alternatives"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalMyDsl.g:255:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:259:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalMyDsl.g:260:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sum__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalMyDsl.g:267:1: rule__Sum__Group__0__Impl : ( ruleMul ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:271:1: ( ( ruleMul ) )
            // InternalMyDsl.g:272:1: ( ruleMul )
            {
            // InternalMyDsl.g:272:1: ( ruleMul )
            // InternalMyDsl.g:273:2: ruleMul
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getMulParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMul();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getMulParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalMyDsl.g:282:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:286:1: ( rule__Sum__Group__1__Impl )
            // InternalMyDsl.g:287:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalMyDsl.g:293:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:297:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalMyDsl.g:298:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalMyDsl.g:298:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalMyDsl.g:299:2: ( rule__Sum__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:300:2: ( rule__Sum__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred3_InternalMyDsl()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:300:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // InternalMyDsl.g:309:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:313:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalMyDsl.g:314:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0"


    // $ANTLR start "rule__Sum__Group_1__0__Impl"
    // InternalMyDsl.g:321:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Group_1_0__0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:325:1: ( ( ( rule__Sum__Group_1_0__0 ) ) )
            // InternalMyDsl.g:326:1: ( ( rule__Sum__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:326:1: ( ( rule__Sum__Group_1_0__0 ) )
            // InternalMyDsl.g:327:2: ( rule__Sum__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getGroup_1_0()); 
            }
            // InternalMyDsl.g:328:2: ( rule__Sum__Group_1_0__0 )
            // InternalMyDsl.g:328:3: rule__Sum__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // InternalMyDsl.g:336:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:340:1: ( rule__Sum__Group_1__1__Impl )
            // InternalMyDsl.g:341:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1"


    // $ANTLR start "rule__Sum__Group_1__1__Impl"
    // InternalMyDsl.g:347:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RhsAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:351:1: ( ( ( rule__Sum__RhsAssignment_1_1 ) ) )
            // InternalMyDsl.g:352:1: ( ( rule__Sum__RhsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:352:1: ( ( rule__Sum__RhsAssignment_1_1 ) )
            // InternalMyDsl.g:353:2: ( rule__Sum__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getRhsAssignment_1_1()); 
            }
            // InternalMyDsl.g:354:2: ( rule__Sum__RhsAssignment_1_1 )
            // InternalMyDsl.g:354:3: rule__Sum__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sum__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getRhsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0__0"
    // InternalMyDsl.g:363:1: rule__Sum__Group_1_0__0 : rule__Sum__Group_1_0__0__Impl ;
    public final void rule__Sum__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:367:1: ( rule__Sum__Group_1_0__0__Impl )
            // InternalMyDsl.g:368:2: rule__Sum__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0__0"


    // $ANTLR start "rule__Sum__Group_1_0__0__Impl"
    // InternalMyDsl.g:374:1: rule__Sum__Group_1_0__0__Impl : ( ( rule__Sum__Group_1_0_0__0 ) ) ;
    public final void rule__Sum__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) )
            // InternalMyDsl.g:379:1: ( ( rule__Sum__Group_1_0_0__0 ) )
            {
            // InternalMyDsl.g:379:1: ( ( rule__Sum__Group_1_0_0__0 ) )
            // InternalMyDsl.g:380:2: ( rule__Sum__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
            }
            // InternalMyDsl.g:381:2: ( rule__Sum__Group_1_0_0__0 )
            // InternalMyDsl.g:381:3: rule__Sum__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__Sum__Group_1_0__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__0"
    // InternalMyDsl.g:390:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:394:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalMyDsl.g:395:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Sum__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0"


    // $ANTLR start "rule__Sum__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:402:1: rule__Sum__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( () ) )
            // InternalMyDsl.g:407:1: ( () )
            {
            // InternalMyDsl.g:407:1: ( () )
            // InternalMyDsl.g:408:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getSumLhsAction_1_0_0_0()); 
            }
            // InternalMyDsl.g:409:2: ()
            // InternalMyDsl.g:409:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getSumLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__1"
    // InternalMyDsl.g:417:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:422:2: rule__Sum__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1"


    // $ANTLR start "rule__Sum__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:428:1: rule__Sum__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:432:1: ( ( '+' ) )
            // InternalMyDsl.g:433:1: ( '+' )
            {
            // InternalMyDsl.g:433:1: ( '+' )
            // InternalMyDsl.g:434:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Sum__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Mul__Group__0"
    // InternalMyDsl.g:444:1: rule__Mul__Group__0 : rule__Mul__Group__0__Impl rule__Mul__Group__1 ;
    public final void rule__Mul__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( rule__Mul__Group__0__Impl rule__Mul__Group__1 )
            // InternalMyDsl.g:449:2: rule__Mul__Group__0__Impl rule__Mul__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Mul__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mul__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group__0"


    // $ANTLR start "rule__Mul__Group__0__Impl"
    // InternalMyDsl.g:456:1: rule__Mul__Group__0__Impl : ( ruleTerminal ) ;
    public final void rule__Mul__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( ( ruleTerminal ) )
            // InternalMyDsl.g:461:1: ( ruleTerminal )
            {
            // InternalMyDsl.g:461:1: ( ruleTerminal )
            // InternalMyDsl.g:462:2: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getTerminalParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getTerminalParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__Mul__Group__0__Impl"


    // $ANTLR start "rule__Mul__Group__1"
    // InternalMyDsl.g:471:1: rule__Mul__Group__1 : rule__Mul__Group__1__Impl ;
    public final void rule__Mul__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( rule__Mul__Group__1__Impl )
            // InternalMyDsl.g:476:2: rule__Mul__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group__1"


    // $ANTLR start "rule__Mul__Group__1__Impl"
    // InternalMyDsl.g:482:1: rule__Mul__Group__1__Impl : ( ( rule__Mul__Group_1__0 )* ) ;
    public final void rule__Mul__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:486:1: ( ( ( rule__Mul__Group_1__0 )* ) )
            // InternalMyDsl.g:487:1: ( ( rule__Mul__Group_1__0 )* )
            {
            // InternalMyDsl.g:487:1: ( ( rule__Mul__Group_1__0 )* )
            // InternalMyDsl.g:488:2: ( rule__Mul__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getGroup_1()); 
            }
            // InternalMyDsl.g:489:2: ( rule__Mul__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred4_InternalMyDsl()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:489:3: rule__Mul__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Mul__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Mul__Group__1__Impl"


    // $ANTLR start "rule__Mul__Group_1__0"
    // InternalMyDsl.g:498:1: rule__Mul__Group_1__0 : rule__Mul__Group_1__0__Impl rule__Mul__Group_1__1 ;
    public final void rule__Mul__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( rule__Mul__Group_1__0__Impl rule__Mul__Group_1__1 )
            // InternalMyDsl.g:503:2: rule__Mul__Group_1__0__Impl rule__Mul__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Mul__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1__0"


    // $ANTLR start "rule__Mul__Group_1__0__Impl"
    // InternalMyDsl.g:510:1: rule__Mul__Group_1__0__Impl : ( ( rule__Mul__Group_1_0__0 ) ) ;
    public final void rule__Mul__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ( rule__Mul__Group_1_0__0 ) ) )
            // InternalMyDsl.g:515:1: ( ( rule__Mul__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:515:1: ( ( rule__Mul__Group_1_0__0 ) )
            // InternalMyDsl.g:516:2: ( rule__Mul__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getGroup_1_0()); 
            }
            // InternalMyDsl.g:517:2: ( rule__Mul__Group_1_0__0 )
            // InternalMyDsl.g:517:3: rule__Mul__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getGroup_1_0()); 
            }

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
    // $ANTLR end "rule__Mul__Group_1__0__Impl"


    // $ANTLR start "rule__Mul__Group_1__1"
    // InternalMyDsl.g:525:1: rule__Mul__Group_1__1 : rule__Mul__Group_1__1__Impl ;
    public final void rule__Mul__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( rule__Mul__Group_1__1__Impl )
            // InternalMyDsl.g:530:2: rule__Mul__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1__1"


    // $ANTLR start "rule__Mul__Group_1__1__Impl"
    // InternalMyDsl.g:536:1: rule__Mul__Group_1__1__Impl : ( ( rule__Mul__RhsAssignment_1_1 ) ) ;
    public final void rule__Mul__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:540:1: ( ( ( rule__Mul__RhsAssignment_1_1 ) ) )
            // InternalMyDsl.g:541:1: ( ( rule__Mul__RhsAssignment_1_1 ) )
            {
            // InternalMyDsl.g:541:1: ( ( rule__Mul__RhsAssignment_1_1 ) )
            // InternalMyDsl.g:542:2: ( rule__Mul__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getRhsAssignment_1_1()); 
            }
            // InternalMyDsl.g:543:2: ( rule__Mul__RhsAssignment_1_1 )
            // InternalMyDsl.g:543:3: rule__Mul__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Mul__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getRhsAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Mul__Group_1__1__Impl"


    // $ANTLR start "rule__Mul__Group_1_0__0"
    // InternalMyDsl.g:552:1: rule__Mul__Group_1_0__0 : rule__Mul__Group_1_0__0__Impl ;
    public final void rule__Mul__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( rule__Mul__Group_1_0__0__Impl )
            // InternalMyDsl.g:557:2: rule__Mul__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_0__0"


    // $ANTLR start "rule__Mul__Group_1_0__0__Impl"
    // InternalMyDsl.g:563:1: rule__Mul__Group_1_0__0__Impl : ( ( rule__Mul__Group_1_0_0__0 ) ) ;
    public final void rule__Mul__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( ( rule__Mul__Group_1_0_0__0 ) ) )
            // InternalMyDsl.g:568:1: ( ( rule__Mul__Group_1_0_0__0 ) )
            {
            // InternalMyDsl.g:568:1: ( ( rule__Mul__Group_1_0_0__0 ) )
            // InternalMyDsl.g:569:2: ( rule__Mul__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getGroup_1_0_0()); 
            }
            // InternalMyDsl.g:570:2: ( rule__Mul__Group_1_0_0__0 )
            // InternalMyDsl.g:570:3: rule__Mul__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getGroup_1_0_0()); 
            }

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
    // $ANTLR end "rule__Mul__Group_1_0__0__Impl"


    // $ANTLR start "rule__Mul__Group_1_0_0__0"
    // InternalMyDsl.g:579:1: rule__Mul__Group_1_0_0__0 : rule__Mul__Group_1_0_0__0__Impl rule__Mul__Group_1_0_0__1 ;
    public final void rule__Mul__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( rule__Mul__Group_1_0_0__0__Impl rule__Mul__Group_1_0_0__1 )
            // InternalMyDsl.g:584:2: rule__Mul__Group_1_0_0__0__Impl rule__Mul__Group_1_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Mul__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_0_0__0"


    // $ANTLR start "rule__Mul__Group_1_0_0__0__Impl"
    // InternalMyDsl.g:591:1: rule__Mul__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Mul__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( () ) )
            // InternalMyDsl.g:596:1: ( () )
            {
            // InternalMyDsl.g:596:1: ( () )
            // InternalMyDsl.g:597:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getMulLhsAction_1_0_0_0()); 
            }
            // InternalMyDsl.g:598:2: ()
            // InternalMyDsl.g:598:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getMulLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Mul__Group_1_0_0__1"
    // InternalMyDsl.g:606:1: rule__Mul__Group_1_0_0__1 : rule__Mul__Group_1_0_0__1__Impl ;
    public final void rule__Mul__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( rule__Mul__Group_1_0_0__1__Impl )
            // InternalMyDsl.g:611:2: rule__Mul__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mul__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mul__Group_1_0_0__1"


    // $ANTLR start "rule__Mul__Group_1_0_0__1__Impl"
    // InternalMyDsl.g:617:1: rule__Mul__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Mul__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:621:1: ( ( '*' ) )
            // InternalMyDsl.g:622:1: ( '*' )
            {
            // InternalMyDsl.g:622:1: ( '*' )
            // InternalMyDsl.g:623:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getAsteriskKeyword_1_0_0_1()); 
            }

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
    // $ANTLR end "rule__Mul__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Terminal__Group_0__0"
    // InternalMyDsl.g:633:1: rule__Terminal__Group_0__0 : rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 ;
    public final void rule__Terminal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1 )
            // InternalMyDsl.g:638:2: rule__Terminal__Group_0__0__Impl rule__Terminal__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Terminal__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__0"


    // $ANTLR start "rule__Terminal__Group_0__0__Impl"
    // InternalMyDsl.g:645:1: rule__Terminal__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Terminal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( '(' ) )
            // InternalMyDsl.g:650:1: ( '(' )
            {
            // InternalMyDsl.g:650:1: ( '(' )
            // InternalMyDsl.g:651:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getLeftParenthesisKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_0__0__Impl"


    // $ANTLR start "rule__Terminal__Group_0__1"
    // InternalMyDsl.g:660:1: rule__Terminal__Group_0__1 : rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2 ;
    public final void rule__Terminal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2 )
            // InternalMyDsl.g:665:2: rule__Terminal__Group_0__1__Impl rule__Terminal__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Terminal__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__1"


    // $ANTLR start "rule__Terminal__Group_0__1__Impl"
    // InternalMyDsl.g:672:1: rule__Terminal__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Terminal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:677:1: ( ruleExpression )
            {
            // InternalMyDsl.g:677:1: ( ruleExpression )
            // InternalMyDsl.g:678:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getExpressionParserRuleCall_0_1()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_0__1__Impl"


    // $ANTLR start "rule__Terminal__Group_0__2"
    // InternalMyDsl.g:687:1: rule__Terminal__Group_0__2 : rule__Terminal__Group_0__2__Impl ;
    public final void rule__Terminal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__Terminal__Group_0__2__Impl )
            // InternalMyDsl.g:692:2: rule__Terminal__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminal__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminal__Group_0__2"


    // $ANTLR start "rule__Terminal__Group_0__2__Impl"
    // InternalMyDsl.g:698:1: rule__Terminal__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Terminal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:702:1: ( ( ')' ) )
            // InternalMyDsl.g:703:1: ( ')' )
            {
            // InternalMyDsl.g:703:1: ( ')' )
            // InternalMyDsl.g:704:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalAccess().getRightParenthesisKeyword_0_2()); 
            }

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
    // $ANTLR end "rule__Terminal__Group_0__2__Impl"


    // $ANTLR start "rule__Neg__Group__0"
    // InternalMyDsl.g:714:1: rule__Neg__Group__0 : rule__Neg__Group__0__Impl rule__Neg__Group__1 ;
    public final void rule__Neg__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__Neg__Group__0__Impl rule__Neg__Group__1 )
            // InternalMyDsl.g:719:2: rule__Neg__Group__0__Impl rule__Neg__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Neg__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Neg__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group__0"


    // $ANTLR start "rule__Neg__Group__0__Impl"
    // InternalMyDsl.g:726:1: rule__Neg__Group__0__Impl : ( () ) ;
    public final void rule__Neg__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( () ) )
            // InternalMyDsl.g:731:1: ( () )
            {
            // InternalMyDsl.g:731:1: ( () )
            // InternalMyDsl.g:732:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getNegAction_0()); 
            }
            // InternalMyDsl.g:733:2: ()
            // InternalMyDsl.g:733:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getNegAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group__0__Impl"


    // $ANTLR start "rule__Neg__Group__1"
    // InternalMyDsl.g:741:1: rule__Neg__Group__1 : rule__Neg__Group__1__Impl rule__Neg__Group__2 ;
    public final void rule__Neg__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__Neg__Group__1__Impl rule__Neg__Group__2 )
            // InternalMyDsl.g:746:2: rule__Neg__Group__1__Impl rule__Neg__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Neg__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Neg__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group__1"


    // $ANTLR start "rule__Neg__Group__1__Impl"
    // InternalMyDsl.g:753:1: rule__Neg__Group__1__Impl : ( '-' ) ;
    public final void rule__Neg__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( '-' ) )
            // InternalMyDsl.g:758:1: ( '-' )
            {
            // InternalMyDsl.g:758:1: ( '-' )
            // InternalMyDsl.g:759:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getHyphenMinusKeyword_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getHyphenMinusKeyword_1()); 
            }

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
    // $ANTLR end "rule__Neg__Group__1__Impl"


    // $ANTLR start "rule__Neg__Group__2"
    // InternalMyDsl.g:768:1: rule__Neg__Group__2 : rule__Neg__Group__2__Impl ;
    public final void rule__Neg__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__Neg__Group__2__Impl )
            // InternalMyDsl.g:773:2: rule__Neg__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Neg__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg__Group__2"


    // $ANTLR start "rule__Neg__Group__2__Impl"
    // InternalMyDsl.g:779:1: rule__Neg__Group__2__Impl : ( ( rule__Neg__ExpAssignment_2 ) ) ;
    public final void rule__Neg__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:783:1: ( ( ( rule__Neg__ExpAssignment_2 ) ) )
            // InternalMyDsl.g:784:1: ( ( rule__Neg__ExpAssignment_2 ) )
            {
            // InternalMyDsl.g:784:1: ( ( rule__Neg__ExpAssignment_2 ) )
            // InternalMyDsl.g:785:2: ( rule__Neg__ExpAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpAssignment_2()); 
            }
            // InternalMyDsl.g:786:2: ( rule__Neg__ExpAssignment_2 )
            // InternalMyDsl.g:786:3: rule__Neg__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Neg__ExpAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getExpAssignment_2()); 
            }

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
    // $ANTLR end "rule__Neg__Group__2__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // InternalMyDsl.g:795:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // InternalMyDsl.g:800:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Literal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Literal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0"


    // $ANTLR start "rule__Literal__Group__0__Impl"
    // InternalMyDsl.g:807:1: rule__Literal__Group__0__Impl : ( () ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( () ) )
            // InternalMyDsl.g:812:1: ( () )
            {
            // InternalMyDsl.g:812:1: ( () )
            // InternalMyDsl.g:813:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getLiteralAction_0()); 
            }
            // InternalMyDsl.g:814:2: ()
            // InternalMyDsl.g:814:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getLiteralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__0__Impl"


    // $ANTLR start "rule__Literal__Group__1"
    // InternalMyDsl.g:822:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__Literal__Group__1__Impl )
            // InternalMyDsl.g:827:2: rule__Literal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group__1"


    // $ANTLR start "rule__Literal__Group__1__Impl"
    // InternalMyDsl.g:833:1: rule__Literal__Group__1__Impl : ( ( rule__Literal__ValueAssignment_1 ) ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__Literal__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:838:1: ( ( rule__Literal__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:838:1: ( ( rule__Literal__ValueAssignment_1 ) )
            // InternalMyDsl.g:839:2: ( rule__Literal__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_1()); 
            }
            // InternalMyDsl.g:840:2: ( rule__Literal__ValueAssignment_1 )
            // InternalMyDsl.g:840:3: rule__Literal__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_1()); 
            }

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
    // $ANTLR end "rule__Literal__Group__1__Impl"


    // $ANTLR start "rule__Sum__RhsAssignment_1_1"
    // InternalMyDsl.g:849:1: rule__Sum__RhsAssignment_1_1 : ( ruleMul ) ;
    public final void rule__Sum__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( ruleMul ) )
            // InternalMyDsl.g:854:2: ( ruleMul )
            {
            // InternalMyDsl.g:854:2: ( ruleMul )
            // InternalMyDsl.g:855:3: ruleMul
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSumAccess().getRhsMulParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMul();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSumAccess().getRhsMulParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Sum__RhsAssignment_1_1"


    // $ANTLR start "rule__Mul__RhsAssignment_1_1"
    // InternalMyDsl.g:864:1: rule__Mul__RhsAssignment_1_1 : ( ruleTerminal ) ;
    public final void rule__Mul__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ruleTerminal ) )
            // InternalMyDsl.g:869:2: ( ruleTerminal )
            {
            // InternalMyDsl.g:869:2: ( ruleTerminal )
            // InternalMyDsl.g:870:3: ruleTerminal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMulAccess().getRhsTerminalParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMulAccess().getRhsTerminalParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end "rule__Mul__RhsAssignment_1_1"


    // $ANTLR start "rule__Neg__ExpAssignment_2"
    // InternalMyDsl.g:879:1: rule__Neg__ExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__Neg__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:884:2: ( ruleExpression )
            {
            // InternalMyDsl.g:884:2: ( ruleExpression )
            // InternalMyDsl.g:885:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegAccess().getExpExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegAccess().getExpExpressionParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Neg__ExpAssignment_2"


    // $ANTLR start "rule__Literal__ValueAssignment_1"
    // InternalMyDsl.g:894:1: rule__Literal__ValueAssignment_1 : ( ruleELong ) ;
    public final void rule__Literal__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( ruleELong ) )
            // InternalMyDsl.g:899:2: ( ruleELong )
            {
            // InternalMyDsl.g:899:2: ( ruleELong )
            // InternalMyDsl.g:900:3: ruleELong
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueELongParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueELongParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__Literal__ValueAssignment_1"

    // $ANTLR start synpred3_InternalMyDsl
    public final void synpred3_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:300:3: ( rule__Sum__Group_1__0 )
        // InternalMyDsl.g:300:3: rule__Sum__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Sum__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMyDsl

    // $ANTLR start synpred4_InternalMyDsl
    public final void synpred4_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:489:3: ( rule__Mul__Group_1__0 )
        // InternalMyDsl.g:489:3: rule__Mul__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Mul__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMyDsl

    // Delegated rules

    public final boolean synpred4_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});

}
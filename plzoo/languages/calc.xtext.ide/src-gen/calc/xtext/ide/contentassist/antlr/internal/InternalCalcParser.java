package calc.xtext.ide.contentassist.antlr.internal;

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
import calc.xtext.services.CalcGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCalcParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'/'", "'*'", "'('", "')'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalCalcParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCalcParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCalcParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCalc.g"; }


    	private CalcGrammarAccess grammarAccess;

    	public void setGrammarAccess(CalcGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStart"
    // InternalCalc.g:54:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // InternalCalc.g:55:1: ( ruleStart EOF )
            // InternalCalc.g:56:1: ruleStart EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStart();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartRule()); 
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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalCalc.g:63:1: ruleStart : ( ruleExpression ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:67:2: ( ( ruleExpression ) )
            // InternalCalc.g:68:2: ( ruleExpression )
            {
            // InternalCalc.g:68:2: ( ruleExpression )
            // InternalCalc.g:69:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStartAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStartAccess().getExpressionParserRuleCall()); 
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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleExpression"
    // InternalCalc.g:79:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalCalc.g:80:1: ( ruleExpression EOF )
            // InternalCalc.g:81:1: ruleExpression EOF
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
    // InternalCalc.g:88:1: ruleExpression : ( ruleMinus ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:92:2: ( ( ruleMinus ) )
            // InternalCalc.g:93:2: ( ruleMinus )
            {
            // InternalCalc.g:93:2: ( ruleMinus )
            // InternalCalc.g:94:3: ruleMinus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getMinusParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getMinusParserRuleCall()); 
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


    // $ANTLR start "entryRuleMinus"
    // InternalCalc.g:104:1: entryRuleMinus : ruleMinus EOF ;
    public final void entryRuleMinus() throws RecognitionException {
        try {
            // InternalCalc.g:105:1: ( ruleMinus EOF )
            // InternalCalc.g:106:1: ruleMinus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMinus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusRule()); 
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
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalCalc.g:113:1: ruleMinus : ( ( rule__Minus__Group__0 ) ) ;
    public final void ruleMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:117:2: ( ( ( rule__Minus__Group__0 ) ) )
            // InternalCalc.g:118:2: ( ( rule__Minus__Group__0 ) )
            {
            // InternalCalc.g:118:2: ( ( rule__Minus__Group__0 ) )
            // InternalCalc.g:119:3: ( rule__Minus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getGroup()); 
            }
            // InternalCalc.g:120:3: ( rule__Minus__Group__0 )
            // InternalCalc.g:120:4: rule__Minus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getGroup()); 
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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRulePlus"
    // InternalCalc.g:129:1: entryRulePlus : rulePlus EOF ;
    public final void entryRulePlus() throws RecognitionException {
        try {
            // InternalCalc.g:130:1: ( rulePlus EOF )
            // InternalCalc.g:131:1: rulePlus EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusRule()); 
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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalCalc.g:138:1: rulePlus : ( ( rule__Plus__Group__0 ) ) ;
    public final void rulePlus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:142:2: ( ( ( rule__Plus__Group__0 ) ) )
            // InternalCalc.g:143:2: ( ( rule__Plus__Group__0 ) )
            {
            // InternalCalc.g:143:2: ( ( rule__Plus__Group__0 ) )
            // InternalCalc.g:144:3: ( rule__Plus__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getGroup()); 
            }
            // InternalCalc.g:145:3: ( rule__Plus__Group__0 )
            // InternalCalc.g:145:4: rule__Plus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getGroup()); 
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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleDivide"
    // InternalCalc.g:154:1: entryRuleDivide : ruleDivide EOF ;
    public final void entryRuleDivide() throws RecognitionException {
        try {
            // InternalCalc.g:155:1: ( ruleDivide EOF )
            // InternalCalc.g:156:1: ruleDivide EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDivide();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideRule()); 
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
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalCalc.g:163:1: ruleDivide : ( ( rule__Divide__Group__0 ) ) ;
    public final void ruleDivide() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:167:2: ( ( ( rule__Divide__Group__0 ) ) )
            // InternalCalc.g:168:2: ( ( rule__Divide__Group__0 ) )
            {
            // InternalCalc.g:168:2: ( ( rule__Divide__Group__0 ) )
            // InternalCalc.g:169:3: ( rule__Divide__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getGroup()); 
            }
            // InternalCalc.g:170:3: ( rule__Divide__Group__0 )
            // InternalCalc.g:170:4: rule__Divide__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getGroup()); 
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
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleTimes"
    // InternalCalc.g:179:1: entryRuleTimes : ruleTimes EOF ;
    public final void entryRuleTimes() throws RecognitionException {
        try {
            // InternalCalc.g:180:1: ( ruleTimes EOF )
            // InternalCalc.g:181:1: ruleTimes EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTimes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesRule()); 
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
    // $ANTLR end "entryRuleTimes"


    // $ANTLR start "ruleTimes"
    // InternalCalc.g:188:1: ruleTimes : ( ( rule__Times__Group__0 ) ) ;
    public final void ruleTimes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:192:2: ( ( ( rule__Times__Group__0 ) ) )
            // InternalCalc.g:193:2: ( ( rule__Times__Group__0 ) )
            {
            // InternalCalc.g:193:2: ( ( rule__Times__Group__0 ) )
            // InternalCalc.g:194:3: ( rule__Times__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getGroup()); 
            }
            // InternalCalc.g:195:3: ( rule__Times__Group__0 )
            // InternalCalc.g:195:4: rule__Times__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getGroup()); 
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
    // $ANTLR end "ruleTimes"


    // $ANTLR start "entryRuleTerminals"
    // InternalCalc.g:204:1: entryRuleTerminals : ruleTerminals EOF ;
    public final void entryRuleTerminals() throws RecognitionException {
        try {
            // InternalCalc.g:205:1: ( ruleTerminals EOF )
            // InternalCalc.g:206:1: ruleTerminals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerminals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsRule()); 
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
    // $ANTLR end "entryRuleTerminals"


    // $ANTLR start "ruleTerminals"
    // InternalCalc.g:213:1: ruleTerminals : ( ( rule__Terminals__Alternatives ) ) ;
    public final void ruleTerminals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:217:2: ( ( ( rule__Terminals__Alternatives ) ) )
            // InternalCalc.g:218:2: ( ( rule__Terminals__Alternatives ) )
            {
            // InternalCalc.g:218:2: ( ( rule__Terminals__Alternatives ) )
            // InternalCalc.g:219:3: ( rule__Terminals__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getAlternatives()); 
            }
            // InternalCalc.g:220:3: ( rule__Terminals__Alternatives )
            // InternalCalc.g:220:4: rule__Terminals__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Terminals__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTerminals"


    // $ANTLR start "entryRuleNumeral"
    // InternalCalc.g:229:1: entryRuleNumeral : ruleNumeral EOF ;
    public final void entryRuleNumeral() throws RecognitionException {
        try {
            // InternalCalc.g:230:1: ( ruleNumeral EOF )
            // InternalCalc.g:231:1: ruleNumeral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumeral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeralRule()); 
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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // InternalCalc.g:238:1: ruleNumeral : ( ( rule__Numeral__Group__0 ) ) ;
    public final void ruleNumeral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:242:2: ( ( ( rule__Numeral__Group__0 ) ) )
            // InternalCalc.g:243:2: ( ( rule__Numeral__Group__0 ) )
            {
            // InternalCalc.g:243:2: ( ( rule__Numeral__Group__0 ) )
            // InternalCalc.g:244:3: ( rule__Numeral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeralAccess().getGroup()); 
            }
            // InternalCalc.g:245:3: ( rule__Numeral__Group__0 )
            // InternalCalc.g:245:4: rule__Numeral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Numeral__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeralAccess().getGroup()); 
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
    // $ANTLR end "ruleNumeral"


    // $ANTLR start "rule__Terminals__Alternatives"
    // InternalCalc.g:253:1: rule__Terminals__Alternatives : ( ( ( rule__Terminals__Group_0__0 ) ) | ( ( rule__Terminals__Group_1__0 ) ) | ( ruleNumeral ) );
    public final void rule__Terminals__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:257:1: ( ( ( rule__Terminals__Group_0__0 ) ) | ( ( rule__Terminals__Group_1__0 ) ) | ( ruleNumeral ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 11:
                {
                alt1=2;
                }
                break;
            case RULE_INT:
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
                    // InternalCalc.g:258:2: ( ( rule__Terminals__Group_0__0 ) )
                    {
                    // InternalCalc.g:258:2: ( ( rule__Terminals__Group_0__0 ) )
                    // InternalCalc.g:259:3: ( rule__Terminals__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalsAccess().getGroup_0()); 
                    }
                    // InternalCalc.g:260:3: ( rule__Terminals__Group_0__0 )
                    // InternalCalc.g:260:4: rule__Terminals__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminals__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalsAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalc.g:264:2: ( ( rule__Terminals__Group_1__0 ) )
                    {
                    // InternalCalc.g:264:2: ( ( rule__Terminals__Group_1__0 ) )
                    // InternalCalc.g:265:3: ( rule__Terminals__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalsAccess().getGroup_1()); 
                    }
                    // InternalCalc.g:266:3: ( rule__Terminals__Group_1__0 )
                    // InternalCalc.g:266:4: rule__Terminals__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Terminals__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalsAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalCalc.g:270:2: ( ruleNumeral )
                    {
                    // InternalCalc.g:270:2: ( ruleNumeral )
                    // InternalCalc.g:271:3: ruleNumeral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTerminalsAccess().getNumeralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumeral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTerminalsAccess().getNumeralParserRuleCall_2()); 
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
    // $ANTLR end "rule__Terminals__Alternatives"


    // $ANTLR start "rule__Minus__Group__0"
    // InternalCalc.g:280:1: rule__Minus__Group__0 : rule__Minus__Group__0__Impl rule__Minus__Group__1 ;
    public final void rule__Minus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:284:1: ( rule__Minus__Group__0__Impl rule__Minus__Group__1 )
            // InternalCalc.g:285:2: rule__Minus__Group__0__Impl rule__Minus__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Minus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Minus__Group__1();

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
    // $ANTLR end "rule__Minus__Group__0"


    // $ANTLR start "rule__Minus__Group__0__Impl"
    // InternalCalc.g:292:1: rule__Minus__Group__0__Impl : ( rulePlus ) ;
    public final void rule__Minus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:296:1: ( ( rulePlus ) )
            // InternalCalc.g:297:1: ( rulePlus )
            {
            // InternalCalc.g:297:1: ( rulePlus )
            // InternalCalc.g:298:2: rulePlus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getPlusParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getPlusParserRuleCall_0()); 
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
    // $ANTLR end "rule__Minus__Group__0__Impl"


    // $ANTLR start "rule__Minus__Group__1"
    // InternalCalc.g:307:1: rule__Minus__Group__1 : rule__Minus__Group__1__Impl ;
    public final void rule__Minus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:311:1: ( rule__Minus__Group__1__Impl )
            // InternalCalc.g:312:2: rule__Minus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group__1__Impl();

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
    // $ANTLR end "rule__Minus__Group__1"


    // $ANTLR start "rule__Minus__Group__1__Impl"
    // InternalCalc.g:318:1: rule__Minus__Group__1__Impl : ( ( rule__Minus__Group_1__0 )* ) ;
    public final void rule__Minus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:322:1: ( ( ( rule__Minus__Group_1__0 )* ) )
            // InternalCalc.g:323:1: ( ( rule__Minus__Group_1__0 )* )
            {
            // InternalCalc.g:323:1: ( ( rule__Minus__Group_1__0 )* )
            // InternalCalc.g:324:2: ( rule__Minus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getGroup_1()); 
            }
            // InternalCalc.g:325:2: ( rule__Minus__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred3_InternalCalc()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalCalc.g:325:3: rule__Minus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Minus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Minus__Group__1__Impl"


    // $ANTLR start "rule__Minus__Group_1__0"
    // InternalCalc.g:334:1: rule__Minus__Group_1__0 : rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 ;
    public final void rule__Minus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:338:1: ( rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1 )
            // InternalCalc.g:339:2: rule__Minus__Group_1__0__Impl rule__Minus__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Minus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1__1();

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
    // $ANTLR end "rule__Minus__Group_1__0"


    // $ANTLR start "rule__Minus__Group_1__0__Impl"
    // InternalCalc.g:346:1: rule__Minus__Group_1__0__Impl : ( ( rule__Minus__Group_1_0__0 ) ) ;
    public final void rule__Minus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:350:1: ( ( ( rule__Minus__Group_1_0__0 ) ) )
            // InternalCalc.g:351:1: ( ( rule__Minus__Group_1_0__0 ) )
            {
            // InternalCalc.g:351:1: ( ( rule__Minus__Group_1_0__0 ) )
            // InternalCalc.g:352:2: ( rule__Minus__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getGroup_1_0()); 
            }
            // InternalCalc.g:353:2: ( rule__Minus__Group_1_0__0 )
            // InternalCalc.g:353:3: rule__Minus__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Minus__Group_1__0__Impl"


    // $ANTLR start "rule__Minus__Group_1__1"
    // InternalCalc.g:361:1: rule__Minus__Group_1__1 : rule__Minus__Group_1__1__Impl ;
    public final void rule__Minus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:365:1: ( rule__Minus__Group_1__1__Impl )
            // InternalCalc.g:366:2: rule__Minus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1__1__Impl();

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
    // $ANTLR end "rule__Minus__Group_1__1"


    // $ANTLR start "rule__Minus__Group_1__1__Impl"
    // InternalCalc.g:372:1: rule__Minus__Group_1__1__Impl : ( ( rule__Minus__RhsAssignment_1_1 ) ) ;
    public final void rule__Minus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:376:1: ( ( ( rule__Minus__RhsAssignment_1_1 ) ) )
            // InternalCalc.g:377:1: ( ( rule__Minus__RhsAssignment_1_1 ) )
            {
            // InternalCalc.g:377:1: ( ( rule__Minus__RhsAssignment_1_1 ) )
            // InternalCalc.g:378:2: ( rule__Minus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getRhsAssignment_1_1()); 
            }
            // InternalCalc.g:379:2: ( rule__Minus__RhsAssignment_1_1 )
            // InternalCalc.g:379:3: rule__Minus__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Minus__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getRhsAssignment_1_1()); 
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
    // $ANTLR end "rule__Minus__Group_1__1__Impl"


    // $ANTLR start "rule__Minus__Group_1_0__0"
    // InternalCalc.g:388:1: rule__Minus__Group_1_0__0 : rule__Minus__Group_1_0__0__Impl ;
    public final void rule__Minus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:392:1: ( rule__Minus__Group_1_0__0__Impl )
            // InternalCalc.g:393:2: rule__Minus__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1_0__0__Impl();

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
    // $ANTLR end "rule__Minus__Group_1_0__0"


    // $ANTLR start "rule__Minus__Group_1_0__0__Impl"
    // InternalCalc.g:399:1: rule__Minus__Group_1_0__0__Impl : ( ( rule__Minus__Group_1_0_0__0 ) ) ;
    public final void rule__Minus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:403:1: ( ( ( rule__Minus__Group_1_0_0__0 ) ) )
            // InternalCalc.g:404:1: ( ( rule__Minus__Group_1_0_0__0 ) )
            {
            // InternalCalc.g:404:1: ( ( rule__Minus__Group_1_0_0__0 ) )
            // InternalCalc.g:405:2: ( rule__Minus__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getGroup_1_0_0()); 
            }
            // InternalCalc.g:406:2: ( rule__Minus__Group_1_0_0__0 )
            // InternalCalc.g:406:3: rule__Minus__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__Minus__Group_1_0__0__Impl"


    // $ANTLR start "rule__Minus__Group_1_0_0__0"
    // InternalCalc.g:415:1: rule__Minus__Group_1_0_0__0 : rule__Minus__Group_1_0_0__0__Impl rule__Minus__Group_1_0_0__1 ;
    public final void rule__Minus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:419:1: ( rule__Minus__Group_1_0_0__0__Impl rule__Minus__Group_1_0_0__1 )
            // InternalCalc.g:420:2: rule__Minus__Group_1_0_0__0__Impl rule__Minus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Minus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1_0_0__1();

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
    // $ANTLR end "rule__Minus__Group_1_0_0__0"


    // $ANTLR start "rule__Minus__Group_1_0_0__0__Impl"
    // InternalCalc.g:427:1: rule__Minus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Minus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:431:1: ( ( () ) )
            // InternalCalc.g:432:1: ( () )
            {
            // InternalCalc.g:432:1: ( () )
            // InternalCalc.g:433:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getMinusLhsAction_1_0_0_0()); 
            }
            // InternalCalc.g:434:2: ()
            // InternalCalc.g:434:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getMinusLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Minus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Minus__Group_1_0_0__1"
    // InternalCalc.g:442:1: rule__Minus__Group_1_0_0__1 : rule__Minus__Group_1_0_0__1__Impl ;
    public final void rule__Minus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:446:1: ( rule__Minus__Group_1_0_0__1__Impl )
            // InternalCalc.g:447:2: rule__Minus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Minus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Minus__Group_1_0_0__1"


    // $ANTLR start "rule__Minus__Group_1_0_0__1__Impl"
    // InternalCalc.g:453:1: rule__Minus__Group_1_0_0__1__Impl : ( '-' ) ;
    public final void rule__Minus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:457:1: ( ( '-' ) )
            // InternalCalc.g:458:1: ( '-' )
            {
            // InternalCalc.g:458:1: ( '-' )
            // InternalCalc.g:459:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_0_0_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Minus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Plus__Group__0"
    // InternalCalc.g:469:1: rule__Plus__Group__0 : rule__Plus__Group__0__Impl rule__Plus__Group__1 ;
    public final void rule__Plus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:473:1: ( rule__Plus__Group__0__Impl rule__Plus__Group__1 )
            // InternalCalc.g:474:2: rule__Plus__Group__0__Impl rule__Plus__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Plus__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Plus__Group__1();

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
    // $ANTLR end "rule__Plus__Group__0"


    // $ANTLR start "rule__Plus__Group__0__Impl"
    // InternalCalc.g:481:1: rule__Plus__Group__0__Impl : ( ruleDivide ) ;
    public final void rule__Plus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:485:1: ( ( ruleDivide ) )
            // InternalCalc.g:486:1: ( ruleDivide )
            {
            // InternalCalc.g:486:1: ( ruleDivide )
            // InternalCalc.g:487:2: ruleDivide
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getDivideParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDivide();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getDivideParserRuleCall_0()); 
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
    // $ANTLR end "rule__Plus__Group__0__Impl"


    // $ANTLR start "rule__Plus__Group__1"
    // InternalCalc.g:496:1: rule__Plus__Group__1 : rule__Plus__Group__1__Impl ;
    public final void rule__Plus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:500:1: ( rule__Plus__Group__1__Impl )
            // InternalCalc.g:501:2: rule__Plus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group__1__Impl();

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
    // $ANTLR end "rule__Plus__Group__1"


    // $ANTLR start "rule__Plus__Group__1__Impl"
    // InternalCalc.g:507:1: rule__Plus__Group__1__Impl : ( ( rule__Plus__Group_1__0 )* ) ;
    public final void rule__Plus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:511:1: ( ( ( rule__Plus__Group_1__0 )* ) )
            // InternalCalc.g:512:1: ( ( rule__Plus__Group_1__0 )* )
            {
            // InternalCalc.g:512:1: ( ( rule__Plus__Group_1__0 )* )
            // InternalCalc.g:513:2: ( rule__Plus__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getGroup_1()); 
            }
            // InternalCalc.g:514:2: ( rule__Plus__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred4_InternalCalc()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalCalc.g:514:3: rule__Plus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Plus__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Plus__Group__1__Impl"


    // $ANTLR start "rule__Plus__Group_1__0"
    // InternalCalc.g:523:1: rule__Plus__Group_1__0 : rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 ;
    public final void rule__Plus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:527:1: ( rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1 )
            // InternalCalc.g:528:2: rule__Plus__Group_1__0__Impl rule__Plus__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Plus__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1__1();

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
    // $ANTLR end "rule__Plus__Group_1__0"


    // $ANTLR start "rule__Plus__Group_1__0__Impl"
    // InternalCalc.g:535:1: rule__Plus__Group_1__0__Impl : ( ( rule__Plus__Group_1_0__0 ) ) ;
    public final void rule__Plus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:539:1: ( ( ( rule__Plus__Group_1_0__0 ) ) )
            // InternalCalc.g:540:1: ( ( rule__Plus__Group_1_0__0 ) )
            {
            // InternalCalc.g:540:1: ( ( rule__Plus__Group_1_0__0 ) )
            // InternalCalc.g:541:2: ( rule__Plus__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getGroup_1_0()); 
            }
            // InternalCalc.g:542:2: ( rule__Plus__Group_1_0__0 )
            // InternalCalc.g:542:3: rule__Plus__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Plus__Group_1__0__Impl"


    // $ANTLR start "rule__Plus__Group_1__1"
    // InternalCalc.g:550:1: rule__Plus__Group_1__1 : rule__Plus__Group_1__1__Impl ;
    public final void rule__Plus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:554:1: ( rule__Plus__Group_1__1__Impl )
            // InternalCalc.g:555:2: rule__Plus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1__1__Impl();

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
    // $ANTLR end "rule__Plus__Group_1__1"


    // $ANTLR start "rule__Plus__Group_1__1__Impl"
    // InternalCalc.g:561:1: rule__Plus__Group_1__1__Impl : ( ( rule__Plus__RhsAssignment_1_1 ) ) ;
    public final void rule__Plus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:565:1: ( ( ( rule__Plus__RhsAssignment_1_1 ) ) )
            // InternalCalc.g:566:1: ( ( rule__Plus__RhsAssignment_1_1 ) )
            {
            // InternalCalc.g:566:1: ( ( rule__Plus__RhsAssignment_1_1 ) )
            // InternalCalc.g:567:2: ( rule__Plus__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getRhsAssignment_1_1()); 
            }
            // InternalCalc.g:568:2: ( rule__Plus__RhsAssignment_1_1 )
            // InternalCalc.g:568:3: rule__Plus__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Plus__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getRhsAssignment_1_1()); 
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
    // $ANTLR end "rule__Plus__Group_1__1__Impl"


    // $ANTLR start "rule__Plus__Group_1_0__0"
    // InternalCalc.g:577:1: rule__Plus__Group_1_0__0 : rule__Plus__Group_1_0__0__Impl ;
    public final void rule__Plus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:581:1: ( rule__Plus__Group_1_0__0__Impl )
            // InternalCalc.g:582:2: rule__Plus__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1_0__0__Impl();

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
    // $ANTLR end "rule__Plus__Group_1_0__0"


    // $ANTLR start "rule__Plus__Group_1_0__0__Impl"
    // InternalCalc.g:588:1: rule__Plus__Group_1_0__0__Impl : ( ( rule__Plus__Group_1_0_0__0 ) ) ;
    public final void rule__Plus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:592:1: ( ( ( rule__Plus__Group_1_0_0__0 ) ) )
            // InternalCalc.g:593:1: ( ( rule__Plus__Group_1_0_0__0 ) )
            {
            // InternalCalc.g:593:1: ( ( rule__Plus__Group_1_0_0__0 ) )
            // InternalCalc.g:594:2: ( rule__Plus__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getGroup_1_0_0()); 
            }
            // InternalCalc.g:595:2: ( rule__Plus__Group_1_0_0__0 )
            // InternalCalc.g:595:3: rule__Plus__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__Plus__Group_1_0__0__Impl"


    // $ANTLR start "rule__Plus__Group_1_0_0__0"
    // InternalCalc.g:604:1: rule__Plus__Group_1_0_0__0 : rule__Plus__Group_1_0_0__0__Impl rule__Plus__Group_1_0_0__1 ;
    public final void rule__Plus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:608:1: ( rule__Plus__Group_1_0_0__0__Impl rule__Plus__Group_1_0_0__1 )
            // InternalCalc.g:609:2: rule__Plus__Group_1_0_0__0__Impl rule__Plus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Plus__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1_0_0__1();

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
    // $ANTLR end "rule__Plus__Group_1_0_0__0"


    // $ANTLR start "rule__Plus__Group_1_0_0__0__Impl"
    // InternalCalc.g:616:1: rule__Plus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Plus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:620:1: ( ( () ) )
            // InternalCalc.g:621:1: ( () )
            {
            // InternalCalc.g:621:1: ( () )
            // InternalCalc.g:622:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getPlusLhsAction_1_0_0_0()); 
            }
            // InternalCalc.g:623:2: ()
            // InternalCalc.g:623:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getPlusLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Plus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Plus__Group_1_0_0__1"
    // InternalCalc.g:631:1: rule__Plus__Group_1_0_0__1 : rule__Plus__Group_1_0_0__1__Impl ;
    public final void rule__Plus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:635:1: ( rule__Plus__Group_1_0_0__1__Impl )
            // InternalCalc.g:636:2: rule__Plus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Plus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Plus__Group_1_0_0__1"


    // $ANTLR start "rule__Plus__Group_1_0_0__1__Impl"
    // InternalCalc.g:642:1: rule__Plus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Plus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:646:1: ( ( '+' ) )
            // InternalCalc.g:647:1: ( '+' )
            {
            // InternalCalc.g:647:1: ( '+' )
            // InternalCalc.g:648:2: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getPlusSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Plus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Divide__Group__0"
    // InternalCalc.g:658:1: rule__Divide__Group__0 : rule__Divide__Group__0__Impl rule__Divide__Group__1 ;
    public final void rule__Divide__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:662:1: ( rule__Divide__Group__0__Impl rule__Divide__Group__1 )
            // InternalCalc.g:663:2: rule__Divide__Group__0__Impl rule__Divide__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Divide__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Divide__Group__1();

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
    // $ANTLR end "rule__Divide__Group__0"


    // $ANTLR start "rule__Divide__Group__0__Impl"
    // InternalCalc.g:670:1: rule__Divide__Group__0__Impl : ( ruleTimes ) ;
    public final void rule__Divide__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:674:1: ( ( ruleTimes ) )
            // InternalCalc.g:675:1: ( ruleTimes )
            {
            // InternalCalc.g:675:1: ( ruleTimes )
            // InternalCalc.g:676:2: ruleTimes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getTimesParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getTimesParserRuleCall_0()); 
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
    // $ANTLR end "rule__Divide__Group__0__Impl"


    // $ANTLR start "rule__Divide__Group__1"
    // InternalCalc.g:685:1: rule__Divide__Group__1 : rule__Divide__Group__1__Impl ;
    public final void rule__Divide__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:689:1: ( rule__Divide__Group__1__Impl )
            // InternalCalc.g:690:2: rule__Divide__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group__1__Impl();

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
    // $ANTLR end "rule__Divide__Group__1"


    // $ANTLR start "rule__Divide__Group__1__Impl"
    // InternalCalc.g:696:1: rule__Divide__Group__1__Impl : ( ( rule__Divide__Group_1__0 )* ) ;
    public final void rule__Divide__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:700:1: ( ( ( rule__Divide__Group_1__0 )* ) )
            // InternalCalc.g:701:1: ( ( rule__Divide__Group_1__0 )* )
            {
            // InternalCalc.g:701:1: ( ( rule__Divide__Group_1__0 )* )
            // InternalCalc.g:702:2: ( rule__Divide__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getGroup_1()); 
            }
            // InternalCalc.g:703:2: ( rule__Divide__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred5_InternalCalc()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalCalc.g:703:3: rule__Divide__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Divide__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Divide__Group__1__Impl"


    // $ANTLR start "rule__Divide__Group_1__0"
    // InternalCalc.g:712:1: rule__Divide__Group_1__0 : rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 ;
    public final void rule__Divide__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:716:1: ( rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1 )
            // InternalCalc.g:717:2: rule__Divide__Group_1__0__Impl rule__Divide__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Divide__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__1();

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
    // $ANTLR end "rule__Divide__Group_1__0"


    // $ANTLR start "rule__Divide__Group_1__0__Impl"
    // InternalCalc.g:724:1: rule__Divide__Group_1__0__Impl : ( ( rule__Divide__Group_1_0__0 ) ) ;
    public final void rule__Divide__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:728:1: ( ( ( rule__Divide__Group_1_0__0 ) ) )
            // InternalCalc.g:729:1: ( ( rule__Divide__Group_1_0__0 ) )
            {
            // InternalCalc.g:729:1: ( ( rule__Divide__Group_1_0__0 ) )
            // InternalCalc.g:730:2: ( rule__Divide__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getGroup_1_0()); 
            }
            // InternalCalc.g:731:2: ( rule__Divide__Group_1_0__0 )
            // InternalCalc.g:731:3: rule__Divide__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Divide__Group_1__0__Impl"


    // $ANTLR start "rule__Divide__Group_1__1"
    // InternalCalc.g:739:1: rule__Divide__Group_1__1 : rule__Divide__Group_1__1__Impl ;
    public final void rule__Divide__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:743:1: ( rule__Divide__Group_1__1__Impl )
            // InternalCalc.g:744:2: rule__Divide__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1__1__Impl();

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
    // $ANTLR end "rule__Divide__Group_1__1"


    // $ANTLR start "rule__Divide__Group_1__1__Impl"
    // InternalCalc.g:750:1: rule__Divide__Group_1__1__Impl : ( ( rule__Divide__RhsAssignment_1_1 ) ) ;
    public final void rule__Divide__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:754:1: ( ( ( rule__Divide__RhsAssignment_1_1 ) ) )
            // InternalCalc.g:755:1: ( ( rule__Divide__RhsAssignment_1_1 ) )
            {
            // InternalCalc.g:755:1: ( ( rule__Divide__RhsAssignment_1_1 ) )
            // InternalCalc.g:756:2: ( rule__Divide__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getRhsAssignment_1_1()); 
            }
            // InternalCalc.g:757:2: ( rule__Divide__RhsAssignment_1_1 )
            // InternalCalc.g:757:3: rule__Divide__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Divide__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getRhsAssignment_1_1()); 
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
    // $ANTLR end "rule__Divide__Group_1__1__Impl"


    // $ANTLR start "rule__Divide__Group_1_0__0"
    // InternalCalc.g:766:1: rule__Divide__Group_1_0__0 : rule__Divide__Group_1_0__0__Impl ;
    public final void rule__Divide__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:770:1: ( rule__Divide__Group_1_0__0__Impl )
            // InternalCalc.g:771:2: rule__Divide__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1_0__0__Impl();

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
    // $ANTLR end "rule__Divide__Group_1_0__0"


    // $ANTLR start "rule__Divide__Group_1_0__0__Impl"
    // InternalCalc.g:777:1: rule__Divide__Group_1_0__0__Impl : ( ( rule__Divide__Group_1_0_0__0 ) ) ;
    public final void rule__Divide__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:781:1: ( ( ( rule__Divide__Group_1_0_0__0 ) ) )
            // InternalCalc.g:782:1: ( ( rule__Divide__Group_1_0_0__0 ) )
            {
            // InternalCalc.g:782:1: ( ( rule__Divide__Group_1_0_0__0 ) )
            // InternalCalc.g:783:2: ( rule__Divide__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getGroup_1_0_0()); 
            }
            // InternalCalc.g:784:2: ( rule__Divide__Group_1_0_0__0 )
            // InternalCalc.g:784:3: rule__Divide__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__Divide__Group_1_0__0__Impl"


    // $ANTLR start "rule__Divide__Group_1_0_0__0"
    // InternalCalc.g:793:1: rule__Divide__Group_1_0_0__0 : rule__Divide__Group_1_0_0__0__Impl rule__Divide__Group_1_0_0__1 ;
    public final void rule__Divide__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:797:1: ( rule__Divide__Group_1_0_0__0__Impl rule__Divide__Group_1_0_0__1 )
            // InternalCalc.g:798:2: rule__Divide__Group_1_0_0__0__Impl rule__Divide__Group_1_0_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Divide__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1_0_0__1();

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
    // $ANTLR end "rule__Divide__Group_1_0_0__0"


    // $ANTLR start "rule__Divide__Group_1_0_0__0__Impl"
    // InternalCalc.g:805:1: rule__Divide__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Divide__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:809:1: ( ( () ) )
            // InternalCalc.g:810:1: ( () )
            {
            // InternalCalc.g:810:1: ( () )
            // InternalCalc.g:811:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getDivideLhsAction_1_0_0_0()); 
            }
            // InternalCalc.g:812:2: ()
            // InternalCalc.g:812:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getDivideLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Divide__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Divide__Group_1_0_0__1"
    // InternalCalc.g:820:1: rule__Divide__Group_1_0_0__1 : rule__Divide__Group_1_0_0__1__Impl ;
    public final void rule__Divide__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:824:1: ( rule__Divide__Group_1_0_0__1__Impl )
            // InternalCalc.g:825:2: rule__Divide__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Divide__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Divide__Group_1_0_0__1"


    // $ANTLR start "rule__Divide__Group_1_0_0__1__Impl"
    // InternalCalc.g:831:1: rule__Divide__Group_1_0_0__1__Impl : ( '/' ) ;
    public final void rule__Divide__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:835:1: ( ( '/' ) )
            // InternalCalc.g:836:1: ( '/' )
            {
            // InternalCalc.g:836:1: ( '/' )
            // InternalCalc.g:837:2: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getSolidusKeyword_1_0_0_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getSolidusKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Divide__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Times__Group__0"
    // InternalCalc.g:847:1: rule__Times__Group__0 : rule__Times__Group__0__Impl rule__Times__Group__1 ;
    public final void rule__Times__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:851:1: ( rule__Times__Group__0__Impl rule__Times__Group__1 )
            // InternalCalc.g:852:2: rule__Times__Group__0__Impl rule__Times__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Times__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Times__Group__1();

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
    // $ANTLR end "rule__Times__Group__0"


    // $ANTLR start "rule__Times__Group__0__Impl"
    // InternalCalc.g:859:1: rule__Times__Group__0__Impl : ( ruleTerminals ) ;
    public final void rule__Times__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:863:1: ( ( ruleTerminals ) )
            // InternalCalc.g:864:1: ( ruleTerminals )
            {
            // InternalCalc.g:864:1: ( ruleTerminals )
            // InternalCalc.g:865:2: ruleTerminals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getTerminalsParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getTerminalsParserRuleCall_0()); 
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
    // $ANTLR end "rule__Times__Group__0__Impl"


    // $ANTLR start "rule__Times__Group__1"
    // InternalCalc.g:874:1: rule__Times__Group__1 : rule__Times__Group__1__Impl ;
    public final void rule__Times__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:878:1: ( rule__Times__Group__1__Impl )
            // InternalCalc.g:879:2: rule__Times__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group__1__Impl();

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
    // $ANTLR end "rule__Times__Group__1"


    // $ANTLR start "rule__Times__Group__1__Impl"
    // InternalCalc.g:885:1: rule__Times__Group__1__Impl : ( ( rule__Times__Group_1__0 )* ) ;
    public final void rule__Times__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:889:1: ( ( ( rule__Times__Group_1__0 )* ) )
            // InternalCalc.g:890:1: ( ( rule__Times__Group_1__0 )* )
            {
            // InternalCalc.g:890:1: ( ( rule__Times__Group_1__0 )* )
            // InternalCalc.g:891:2: ( rule__Times__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getGroup_1()); 
            }
            // InternalCalc.g:892:2: ( rule__Times__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred6_InternalCalc()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalCalc.g:892:3: rule__Times__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Times__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Times__Group__1__Impl"


    // $ANTLR start "rule__Times__Group_1__0"
    // InternalCalc.g:901:1: rule__Times__Group_1__0 : rule__Times__Group_1__0__Impl rule__Times__Group_1__1 ;
    public final void rule__Times__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:905:1: ( rule__Times__Group_1__0__Impl rule__Times__Group_1__1 )
            // InternalCalc.g:906:2: rule__Times__Group_1__0__Impl rule__Times__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Times__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Times__Group_1__1();

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
    // $ANTLR end "rule__Times__Group_1__0"


    // $ANTLR start "rule__Times__Group_1__0__Impl"
    // InternalCalc.g:913:1: rule__Times__Group_1__0__Impl : ( ( rule__Times__Group_1_0__0 ) ) ;
    public final void rule__Times__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:917:1: ( ( ( rule__Times__Group_1_0__0 ) ) )
            // InternalCalc.g:918:1: ( ( rule__Times__Group_1_0__0 ) )
            {
            // InternalCalc.g:918:1: ( ( rule__Times__Group_1_0__0 ) )
            // InternalCalc.g:919:2: ( rule__Times__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getGroup_1_0()); 
            }
            // InternalCalc.g:920:2: ( rule__Times__Group_1_0__0 )
            // InternalCalc.g:920:3: rule__Times__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Times__Group_1__0__Impl"


    // $ANTLR start "rule__Times__Group_1__1"
    // InternalCalc.g:928:1: rule__Times__Group_1__1 : rule__Times__Group_1__1__Impl ;
    public final void rule__Times__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:932:1: ( rule__Times__Group_1__1__Impl )
            // InternalCalc.g:933:2: rule__Times__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group_1__1__Impl();

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
    // $ANTLR end "rule__Times__Group_1__1"


    // $ANTLR start "rule__Times__Group_1__1__Impl"
    // InternalCalc.g:939:1: rule__Times__Group_1__1__Impl : ( ( rule__Times__RhsAssignment_1_1 ) ) ;
    public final void rule__Times__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:943:1: ( ( ( rule__Times__RhsAssignment_1_1 ) ) )
            // InternalCalc.g:944:1: ( ( rule__Times__RhsAssignment_1_1 ) )
            {
            // InternalCalc.g:944:1: ( ( rule__Times__RhsAssignment_1_1 ) )
            // InternalCalc.g:945:2: ( rule__Times__RhsAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getRhsAssignment_1_1()); 
            }
            // InternalCalc.g:946:2: ( rule__Times__RhsAssignment_1_1 )
            // InternalCalc.g:946:3: rule__Times__RhsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Times__RhsAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getRhsAssignment_1_1()); 
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
    // $ANTLR end "rule__Times__Group_1__1__Impl"


    // $ANTLR start "rule__Times__Group_1_0__0"
    // InternalCalc.g:955:1: rule__Times__Group_1_0__0 : rule__Times__Group_1_0__0__Impl ;
    public final void rule__Times__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:959:1: ( rule__Times__Group_1_0__0__Impl )
            // InternalCalc.g:960:2: rule__Times__Group_1_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group_1_0__0__Impl();

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
    // $ANTLR end "rule__Times__Group_1_0__0"


    // $ANTLR start "rule__Times__Group_1_0__0__Impl"
    // InternalCalc.g:966:1: rule__Times__Group_1_0__0__Impl : ( ( rule__Times__Group_1_0_0__0 ) ) ;
    public final void rule__Times__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:970:1: ( ( ( rule__Times__Group_1_0_0__0 ) ) )
            // InternalCalc.g:971:1: ( ( rule__Times__Group_1_0_0__0 ) )
            {
            // InternalCalc.g:971:1: ( ( rule__Times__Group_1_0_0__0 ) )
            // InternalCalc.g:972:2: ( rule__Times__Group_1_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getGroup_1_0_0()); 
            }
            // InternalCalc.g:973:2: ( rule__Times__Group_1_0_0__0 )
            // InternalCalc.g:973:3: rule__Times__Group_1_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group_1_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getGroup_1_0_0()); 
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
    // $ANTLR end "rule__Times__Group_1_0__0__Impl"


    // $ANTLR start "rule__Times__Group_1_0_0__0"
    // InternalCalc.g:982:1: rule__Times__Group_1_0_0__0 : rule__Times__Group_1_0_0__0__Impl rule__Times__Group_1_0_0__1 ;
    public final void rule__Times__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:986:1: ( rule__Times__Group_1_0_0__0__Impl rule__Times__Group_1_0_0__1 )
            // InternalCalc.g:987:2: rule__Times__Group_1_0_0__0__Impl rule__Times__Group_1_0_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Times__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Times__Group_1_0_0__1();

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
    // $ANTLR end "rule__Times__Group_1_0_0__0"


    // $ANTLR start "rule__Times__Group_1_0_0__0__Impl"
    // InternalCalc.g:994:1: rule__Times__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Times__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:998:1: ( ( () ) )
            // InternalCalc.g:999:1: ( () )
            {
            // InternalCalc.g:999:1: ( () )
            // InternalCalc.g:1000:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getTimesLhsAction_1_0_0_0()); 
            }
            // InternalCalc.g:1001:2: ()
            // InternalCalc.g:1001:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getTimesLhsAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Times__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Times__Group_1_0_0__1"
    // InternalCalc.g:1009:1: rule__Times__Group_1_0_0__1 : rule__Times__Group_1_0_0__1__Impl ;
    public final void rule__Times__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1013:1: ( rule__Times__Group_1_0_0__1__Impl )
            // InternalCalc.g:1014:2: rule__Times__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Times__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Times__Group_1_0_0__1"


    // $ANTLR start "rule__Times__Group_1_0_0__1__Impl"
    // InternalCalc.g:1020:1: rule__Times__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Times__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1024:1: ( ( '*' ) )
            // InternalCalc.g:1025:1: ( '*' )
            {
            // InternalCalc.g:1025:1: ( '*' )
            // InternalCalc.g:1026:2: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getAsteriskKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Times__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Terminals__Group_0__0"
    // InternalCalc.g:1036:1: rule__Terminals__Group_0__0 : rule__Terminals__Group_0__0__Impl rule__Terminals__Group_0__1 ;
    public final void rule__Terminals__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1040:1: ( rule__Terminals__Group_0__0__Impl rule__Terminals__Group_0__1 )
            // InternalCalc.g:1041:2: rule__Terminals__Group_0__0__Impl rule__Terminals__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Terminals__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminals__Group_0__1();

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
    // $ANTLR end "rule__Terminals__Group_0__0"


    // $ANTLR start "rule__Terminals__Group_0__0__Impl"
    // InternalCalc.g:1048:1: rule__Terminals__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Terminals__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1052:1: ( ( '(' ) )
            // InternalCalc.g:1053:1: ( '(' )
            {
            // InternalCalc.g:1053:1: ( '(' )
            // InternalCalc.g:1054:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__Terminals__Group_0__0__Impl"


    // $ANTLR start "rule__Terminals__Group_0__1"
    // InternalCalc.g:1063:1: rule__Terminals__Group_0__1 : rule__Terminals__Group_0__1__Impl rule__Terminals__Group_0__2 ;
    public final void rule__Terminals__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1067:1: ( rule__Terminals__Group_0__1__Impl rule__Terminals__Group_0__2 )
            // InternalCalc.g:1068:2: rule__Terminals__Group_0__1__Impl rule__Terminals__Group_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Terminals__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminals__Group_0__2();

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
    // $ANTLR end "rule__Terminals__Group_0__1"


    // $ANTLR start "rule__Terminals__Group_0__1__Impl"
    // InternalCalc.g:1075:1: rule__Terminals__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Terminals__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1079:1: ( ( ruleExpression ) )
            // InternalCalc.g:1080:1: ( ruleExpression )
            {
            // InternalCalc.g:1080:1: ( ruleExpression )
            // InternalCalc.g:1081:2: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Terminals__Group_0__1__Impl"


    // $ANTLR start "rule__Terminals__Group_0__2"
    // InternalCalc.g:1090:1: rule__Terminals__Group_0__2 : rule__Terminals__Group_0__2__Impl ;
    public final void rule__Terminals__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1094:1: ( rule__Terminals__Group_0__2__Impl )
            // InternalCalc.g:1095:2: rule__Terminals__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminals__Group_0__2__Impl();

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
    // $ANTLR end "rule__Terminals__Group_0__2"


    // $ANTLR start "rule__Terminals__Group_0__2__Impl"
    // InternalCalc.g:1101:1: rule__Terminals__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Terminals__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1105:1: ( ( ')' ) )
            // InternalCalc.g:1106:1: ( ')' )
            {
            // InternalCalc.g:1106:1: ( ')' )
            // InternalCalc.g:1107:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__Terminals__Group_0__2__Impl"


    // $ANTLR start "rule__Terminals__Group_1__0"
    // InternalCalc.g:1117:1: rule__Terminals__Group_1__0 : rule__Terminals__Group_1__0__Impl rule__Terminals__Group_1__1 ;
    public final void rule__Terminals__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1121:1: ( rule__Terminals__Group_1__0__Impl rule__Terminals__Group_1__1 )
            // InternalCalc.g:1122:2: rule__Terminals__Group_1__0__Impl rule__Terminals__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Terminals__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminals__Group_1__1();

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
    // $ANTLR end "rule__Terminals__Group_1__0"


    // $ANTLR start "rule__Terminals__Group_1__0__Impl"
    // InternalCalc.g:1129:1: rule__Terminals__Group_1__0__Impl : ( () ) ;
    public final void rule__Terminals__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1133:1: ( ( () ) )
            // InternalCalc.g:1134:1: ( () )
            {
            // InternalCalc.g:1134:1: ( () )
            // InternalCalc.g:1135:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getNegateAction_1_0()); 
            }
            // InternalCalc.g:1136:2: ()
            // InternalCalc.g:1136:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getNegateAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Terminals__Group_1__0__Impl"


    // $ANTLR start "rule__Terminals__Group_1__1"
    // InternalCalc.g:1144:1: rule__Terminals__Group_1__1 : rule__Terminals__Group_1__1__Impl rule__Terminals__Group_1__2 ;
    public final void rule__Terminals__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1148:1: ( rule__Terminals__Group_1__1__Impl rule__Terminals__Group_1__2 )
            // InternalCalc.g:1149:2: rule__Terminals__Group_1__1__Impl rule__Terminals__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Terminals__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Terminals__Group_1__2();

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
    // $ANTLR end "rule__Terminals__Group_1__1"


    // $ANTLR start "rule__Terminals__Group_1__1__Impl"
    // InternalCalc.g:1156:1: rule__Terminals__Group_1__1__Impl : ( '-' ) ;
    public final void rule__Terminals__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1160:1: ( ( '-' ) )
            // InternalCalc.g:1161:1: ( '-' )
            {
            // InternalCalc.g:1161:1: ( '-' )
            // InternalCalc.g:1162:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getHyphenMinusKeyword_1_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getHyphenMinusKeyword_1_1()); 
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
    // $ANTLR end "rule__Terminals__Group_1__1__Impl"


    // $ANTLR start "rule__Terminals__Group_1__2"
    // InternalCalc.g:1171:1: rule__Terminals__Group_1__2 : rule__Terminals__Group_1__2__Impl ;
    public final void rule__Terminals__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1175:1: ( rule__Terminals__Group_1__2__Impl )
            // InternalCalc.g:1176:2: rule__Terminals__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Terminals__Group_1__2__Impl();

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
    // $ANTLR end "rule__Terminals__Group_1__2"


    // $ANTLR start "rule__Terminals__Group_1__2__Impl"
    // InternalCalc.g:1182:1: rule__Terminals__Group_1__2__Impl : ( ( rule__Terminals__VAssignment_1_2 ) ) ;
    public final void rule__Terminals__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1186:1: ( ( ( rule__Terminals__VAssignment_1_2 ) ) )
            // InternalCalc.g:1187:1: ( ( rule__Terminals__VAssignment_1_2 ) )
            {
            // InternalCalc.g:1187:1: ( ( rule__Terminals__VAssignment_1_2 ) )
            // InternalCalc.g:1188:2: ( rule__Terminals__VAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getVAssignment_1_2()); 
            }
            // InternalCalc.g:1189:2: ( rule__Terminals__VAssignment_1_2 )
            // InternalCalc.g:1189:3: rule__Terminals__VAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Terminals__VAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getVAssignment_1_2()); 
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
    // $ANTLR end "rule__Terminals__Group_1__2__Impl"


    // $ANTLR start "rule__Numeral__Group__0"
    // InternalCalc.g:1198:1: rule__Numeral__Group__0 : rule__Numeral__Group__0__Impl rule__Numeral__Group__1 ;
    public final void rule__Numeral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1202:1: ( rule__Numeral__Group__0__Impl rule__Numeral__Group__1 )
            // InternalCalc.g:1203:2: rule__Numeral__Group__0__Impl rule__Numeral__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Numeral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Numeral__Group__1();

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
    // $ANTLR end "rule__Numeral__Group__0"


    // $ANTLR start "rule__Numeral__Group__0__Impl"
    // InternalCalc.g:1210:1: rule__Numeral__Group__0__Impl : ( () ) ;
    public final void rule__Numeral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1214:1: ( ( () ) )
            // InternalCalc.g:1215:1: ( () )
            {
            // InternalCalc.g:1215:1: ( () )
            // InternalCalc.g:1216:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeralAccess().getNumeralAction_0()); 
            }
            // InternalCalc.g:1217:2: ()
            // InternalCalc.g:1217:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeralAccess().getNumeralAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeral__Group__0__Impl"


    // $ANTLR start "rule__Numeral__Group__1"
    // InternalCalc.g:1225:1: rule__Numeral__Group__1 : rule__Numeral__Group__1__Impl ;
    public final void rule__Numeral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1229:1: ( rule__Numeral__Group__1__Impl )
            // InternalCalc.g:1230:2: rule__Numeral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Numeral__Group__1__Impl();

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
    // $ANTLR end "rule__Numeral__Group__1"


    // $ANTLR start "rule__Numeral__Group__1__Impl"
    // InternalCalc.g:1236:1: rule__Numeral__Group__1__Impl : ( ( rule__Numeral__NAssignment_1 ) ) ;
    public final void rule__Numeral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1240:1: ( ( ( rule__Numeral__NAssignment_1 ) ) )
            // InternalCalc.g:1241:1: ( ( rule__Numeral__NAssignment_1 ) )
            {
            // InternalCalc.g:1241:1: ( ( rule__Numeral__NAssignment_1 ) )
            // InternalCalc.g:1242:2: ( rule__Numeral__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeralAccess().getNAssignment_1()); 
            }
            // InternalCalc.g:1243:2: ( rule__Numeral__NAssignment_1 )
            // InternalCalc.g:1243:3: rule__Numeral__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Numeral__NAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeralAccess().getNAssignment_1()); 
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
    // $ANTLR end "rule__Numeral__Group__1__Impl"


    // $ANTLR start "rule__Minus__RhsAssignment_1_1"
    // InternalCalc.g:1252:1: rule__Minus__RhsAssignment_1_1 : ( rulePlus ) ;
    public final void rule__Minus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1256:1: ( ( rulePlus ) )
            // InternalCalc.g:1257:2: ( rulePlus )
            {
            // InternalCalc.g:1257:2: ( rulePlus )
            // InternalCalc.g:1258:3: rulePlus
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusAccess().getRhsPlusParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePlus();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusAccess().getRhsPlusParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Minus__RhsAssignment_1_1"


    // $ANTLR start "rule__Plus__RhsAssignment_1_1"
    // InternalCalc.g:1267:1: rule__Plus__RhsAssignment_1_1 : ( ruleDivide ) ;
    public final void rule__Plus__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1271:1: ( ( ruleDivide ) )
            // InternalCalc.g:1272:2: ( ruleDivide )
            {
            // InternalCalc.g:1272:2: ( ruleDivide )
            // InternalCalc.g:1273:3: ruleDivide
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPlusAccess().getRhsDivideParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDivide();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPlusAccess().getRhsDivideParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Plus__RhsAssignment_1_1"


    // $ANTLR start "rule__Divide__RhsAssignment_1_1"
    // InternalCalc.g:1282:1: rule__Divide__RhsAssignment_1_1 : ( ruleTimes ) ;
    public final void rule__Divide__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1286:1: ( ( ruleTimes ) )
            // InternalCalc.g:1287:2: ( ruleTimes )
            {
            // InternalCalc.g:1287:2: ( ruleTimes )
            // InternalCalc.g:1288:3: ruleTimes
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDivideAccess().getRhsTimesParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTimes();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDivideAccess().getRhsTimesParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Divide__RhsAssignment_1_1"


    // $ANTLR start "rule__Times__RhsAssignment_1_1"
    // InternalCalc.g:1297:1: rule__Times__RhsAssignment_1_1 : ( ruleTerminals ) ;
    public final void rule__Times__RhsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1301:1: ( ( ruleTerminals ) )
            // InternalCalc.g:1302:2: ( ruleTerminals )
            {
            // InternalCalc.g:1302:2: ( ruleTerminals )
            // InternalCalc.g:1303:3: ruleTerminals
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimesAccess().getRhsTerminalsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerminals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimesAccess().getRhsTerminalsParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Times__RhsAssignment_1_1"


    // $ANTLR start "rule__Terminals__VAssignment_1_2"
    // InternalCalc.g:1312:1: rule__Terminals__VAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Terminals__VAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1316:1: ( ( ruleExpression ) )
            // InternalCalc.g:1317:2: ( ruleExpression )
            {
            // InternalCalc.g:1317:2: ( ruleExpression )
            // InternalCalc.g:1318:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTerminalsAccess().getVExpressionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTerminalsAccess().getVExpressionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Terminals__VAssignment_1_2"


    // $ANTLR start "rule__Numeral__NAssignment_1"
    // InternalCalc.g:1327:1: rule__Numeral__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__Numeral__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCalc.g:1331:1: ( ( RULE_INT ) )
            // InternalCalc.g:1332:2: ( RULE_INT )
            {
            // InternalCalc.g:1332:2: ( RULE_INT )
            // InternalCalc.g:1333:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumeralAccess().getNINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumeralAccess().getNINTTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Numeral__NAssignment_1"

    // $ANTLR start synpred3_InternalCalc
    public final void synpred3_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:325:3: ( rule__Minus__Group_1__0 )
        // InternalCalc.g:325:3: rule__Minus__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Minus__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalCalc

    // $ANTLR start synpred4_InternalCalc
    public final void synpred4_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:514:3: ( rule__Plus__Group_1__0 )
        // InternalCalc.g:514:3: rule__Plus__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Plus__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCalc

    // $ANTLR start synpred5_InternalCalc
    public final void synpred5_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:703:3: ( rule__Divide__Group_1__0 )
        // InternalCalc.g:703:3: rule__Divide__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Divide__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCalc

    // $ANTLR start synpred6_InternalCalc
    public final void synpred6_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:892:3: ( rule__Times__Group_1__0 )
        // InternalCalc.g:892:3: rule__Times__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__Times__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCalc

    // Delegated rules

    public final boolean synpred3_InternalCalc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCalc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCalc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCalc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCalc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCalc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCalc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCalc_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008810L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});

}
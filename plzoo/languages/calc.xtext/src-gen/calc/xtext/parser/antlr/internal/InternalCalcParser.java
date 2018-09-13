package calc.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import calc.xtext.services.CalcGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCalcParser extends AbstractInternalAntlrParser {
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

        public InternalCalcParser(TokenStream input, CalcGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Start";
       	}

       	@Override
       	protected CalcGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStart"
    // InternalCalc.g:64:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalCalc.g:64:46: (iv_ruleStart= ruleStart EOF )
            // InternalCalc.g:65:2: iv_ruleStart= ruleStart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalCalc.g:71:1: ruleStart returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalCalc.g:77:2: (this_Expression_0= ruleExpression )
            // InternalCalc.g:78:2: this_Expression_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getStartAccess().getExpressionParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Expression_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleExpression"
    // InternalCalc.g:89:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCalc.g:89:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCalc.g:90:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCalc.g:96:1: ruleExpression returns [EObject current=null] : this_Minus_0= ruleMinus ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Minus_0 = null;



        	enterRule();

        try {
            // InternalCalc.g:102:2: (this_Minus_0= ruleMinus )
            // InternalCalc.g:103:2: this_Minus_0= ruleMinus
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getMinusParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Minus_0=ruleMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Minus_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleMinus"
    // InternalCalc.g:114:1: entryRuleMinus returns [EObject current=null] : iv_ruleMinus= ruleMinus EOF ;
    public final EObject entryRuleMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinus = null;


        try {
            // InternalCalc.g:114:46: (iv_ruleMinus= ruleMinus EOF )
            // InternalCalc.g:115:2: iv_ruleMinus= ruleMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMinus=ruleMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMinus"


    // $ANTLR start "ruleMinus"
    // InternalCalc.g:121:1: ruleMinus returns [EObject current=null] : (this_Plus_0= rulePlus ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) ) )* ) ;
    public final EObject ruleMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Plus_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCalc.g:127:2: ( (this_Plus_0= rulePlus ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) ) )* ) )
            // InternalCalc.g:128:2: (this_Plus_0= rulePlus ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) ) )* )
            {
            // InternalCalc.g:128:2: (this_Plus_0= rulePlus ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) ) )* )
            // InternalCalc.g:129:3: this_Plus_0= rulePlus ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMinusAccess().getPlusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            this_Plus_0=rulePlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Plus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalc.g:137:3: ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_InternalCalc()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalCalc.g:138:4: ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= rulePlus ) )
            	    {
            	    // InternalCalc.g:138:4: ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) )
            	    // InternalCalc.g:139:5: ( ( () '-' ) )=> ( () otherlv_2= '-' )
            	    {
            	    // InternalCalc.g:145:5: ( () otherlv_2= '-' )
            	    // InternalCalc.g:146:6: () otherlv_2= '-'
            	    {
            	    // InternalCalc.g:146:6: ()
            	    // InternalCalc.g:147:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMinusAccess().getMinusLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getMinusAccess().getHyphenMinusKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalCalc.g:159:4: ( (lv_rhs_3_0= rulePlus ) )
            	    // InternalCalc.g:160:5: (lv_rhs_3_0= rulePlus )
            	    {
            	    // InternalCalc.g:160:5: (lv_rhs_3_0= rulePlus )
            	    // InternalCalc.g:161:6: lv_rhs_3_0= rulePlus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMinusAccess().getRhsPlusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_rhs_3_0=rulePlus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"calc.xtext.Calc.Plus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMinus"


    // $ANTLR start "entryRulePlus"
    // InternalCalc.g:183:1: entryRulePlus returns [EObject current=null] : iv_rulePlus= rulePlus EOF ;
    public final EObject entryRulePlus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlus = null;


        try {
            // InternalCalc.g:183:45: (iv_rulePlus= rulePlus EOF )
            // InternalCalc.g:184:2: iv_rulePlus= rulePlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlus=rulePlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlus"


    // $ANTLR start "rulePlus"
    // InternalCalc.g:190:1: rulePlus returns [EObject current=null] : (this_Divide_0= ruleDivide ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) ) )* ) ;
    public final EObject rulePlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Divide_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCalc.g:196:2: ( (this_Divide_0= ruleDivide ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) ) )* ) )
            // InternalCalc.g:197:2: (this_Divide_0= ruleDivide ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) ) )* )
            {
            // InternalCalc.g:197:2: (this_Divide_0= ruleDivide ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) ) )* )
            // InternalCalc.g:198:3: this_Divide_0= ruleDivide ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusAccess().getDivideParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            this_Divide_0=ruleDivide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Divide_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalc.g:206:3: ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalCalc()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalCalc.g:207:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleDivide ) )
            	    {
            	    // InternalCalc.g:207:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) )
            	    // InternalCalc.g:208:5: ( ( () '+' ) )=> ( () otherlv_2= '+' )
            	    {
            	    // InternalCalc.g:214:5: ( () otherlv_2= '+' )
            	    // InternalCalc.g:215:6: () otherlv_2= '+'
            	    {
            	    // InternalCalc.g:215:6: ()
            	    // InternalCalc.g:216:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getPlusAccess().getPlusLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalCalc.g:228:4: ( (lv_rhs_3_0= ruleDivide ) )
            	    // InternalCalc.g:229:5: (lv_rhs_3_0= ruleDivide )
            	    {
            	    // InternalCalc.g:229:5: (lv_rhs_3_0= ruleDivide )
            	    // InternalCalc.g:230:6: lv_rhs_3_0= ruleDivide
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusAccess().getRhsDivideParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_rhs_3_0=ruleDivide();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"calc.xtext.Calc.Divide");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlus"


    // $ANTLR start "entryRuleDivide"
    // InternalCalc.g:252:1: entryRuleDivide returns [EObject current=null] : iv_ruleDivide= ruleDivide EOF ;
    public final EObject entryRuleDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivide = null;


        try {
            // InternalCalc.g:252:47: (iv_ruleDivide= ruleDivide EOF )
            // InternalCalc.g:253:2: iv_ruleDivide= ruleDivide EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivideRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDivide=ruleDivide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivide; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDivide"


    // $ANTLR start "ruleDivide"
    // InternalCalc.g:259:1: ruleDivide returns [EObject current=null] : (this_Times_0= ruleTimes ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) ) )* ) ;
    public final EObject ruleDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Times_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCalc.g:265:2: ( (this_Times_0= ruleTimes ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) ) )* ) )
            // InternalCalc.g:266:2: (this_Times_0= ruleTimes ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) ) )* )
            {
            // InternalCalc.g:266:2: (this_Times_0= ruleTimes ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) ) )* )
            // InternalCalc.g:267:3: this_Times_0= ruleTimes ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDivideAccess().getTimesParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_Times_0=ruleTimes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Times_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalc.g:275:3: ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred3_InternalCalc()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalCalc.g:276:4: ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleTimes ) )
            	    {
            	    // InternalCalc.g:276:4: ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) )
            	    // InternalCalc.g:277:5: ( ( () '/' ) )=> ( () otherlv_2= '/' )
            	    {
            	    // InternalCalc.g:283:5: ( () otherlv_2= '/' )
            	    // InternalCalc.g:284:6: () otherlv_2= '/'
            	    {
            	    // InternalCalc.g:284:6: ()
            	    // InternalCalc.g:285:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getDivideAccess().getDivideLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getDivideAccess().getSolidusKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalCalc.g:297:4: ( (lv_rhs_3_0= ruleTimes ) )
            	    // InternalCalc.g:298:5: (lv_rhs_3_0= ruleTimes )
            	    {
            	    // InternalCalc.g:298:5: (lv_rhs_3_0= ruleTimes )
            	    // InternalCalc.g:299:6: lv_rhs_3_0= ruleTimes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDivideAccess().getRhsTimesParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_rhs_3_0=ruleTimes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDivideRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"calc.xtext.Calc.Times");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleDivide"


    // $ANTLR start "entryRuleTimes"
    // InternalCalc.g:321:1: entryRuleTimes returns [EObject current=null] : iv_ruleTimes= ruleTimes EOF ;
    public final EObject entryRuleTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimes = null;


        try {
            // InternalCalc.g:321:46: (iv_ruleTimes= ruleTimes EOF )
            // InternalCalc.g:322:2: iv_ruleTimes= ruleTimes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTimes=ruleTimes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimes; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimes"


    // $ANTLR start "ruleTimes"
    // InternalCalc.g:328:1: ruleTimes returns [EObject current=null] : (this_Terminals_0= ruleTerminals ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) ) )* ) ;
    public final EObject ruleTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Terminals_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalCalc.g:334:2: ( (this_Terminals_0= ruleTerminals ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) ) )* ) )
            // InternalCalc.g:335:2: (this_Terminals_0= ruleTerminals ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) ) )* )
            {
            // InternalCalc.g:335:2: (this_Terminals_0= ruleTerminals ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) ) )* )
            // InternalCalc.g:336:3: this_Terminals_0= ruleTerminals ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTimesAccess().getTerminalsParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_Terminals_0=ruleTerminals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Terminals_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalCalc.g:344:3: ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred4_InternalCalc()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalCalc.g:345:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminals ) )
            	    {
            	    // InternalCalc.g:345:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) )
            	    // InternalCalc.g:346:5: ( ( () '*' ) )=> ( () otherlv_2= '*' )
            	    {
            	    // InternalCalc.g:352:5: ( () otherlv_2= '*' )
            	    // InternalCalc.g:353:6: () otherlv_2= '*'
            	    {
            	    // InternalCalc.g:353:6: ()
            	    // InternalCalc.g:354:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getTimesAccess().getTimesLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getTimesAccess().getAsteriskKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalCalc.g:366:4: ( (lv_rhs_3_0= ruleTerminals ) )
            	    // InternalCalc.g:367:5: (lv_rhs_3_0= ruleTerminals )
            	    {
            	    // InternalCalc.g:367:5: (lv_rhs_3_0= ruleTerminals )
            	    // InternalCalc.g:368:6: lv_rhs_3_0= ruleTerminals
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTimesAccess().getRhsTerminalsParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_rhs_3_0=ruleTerminals();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTimesRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"calc.xtext.Calc.Terminals");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTimes"


    // $ANTLR start "entryRuleTerminals"
    // InternalCalc.g:390:1: entryRuleTerminals returns [EObject current=null] : iv_ruleTerminals= ruleTerminals EOF ;
    public final EObject entryRuleTerminals() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminals = null;


        try {
            // InternalCalc.g:390:50: (iv_ruleTerminals= ruleTerminals EOF )
            // InternalCalc.g:391:2: iv_ruleTerminals= ruleTerminals EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminals=ruleTerminals();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminals; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTerminals"


    // $ANTLR start "ruleTerminals"
    // InternalCalc.g:397:1: ruleTerminals returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) ) ) | this_Numeral_6= ruleNumeral ) ;
    public final EObject ruleTerminals() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_v_5_0 = null;

        EObject this_Numeral_6 = null;



        	enterRule();

        try {
            // InternalCalc.g:403:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) ) ) | this_Numeral_6= ruleNumeral ) )
            // InternalCalc.g:404:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) ) ) | this_Numeral_6= ruleNumeral )
            {
            // InternalCalc.g:404:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) ) ) | this_Numeral_6= ruleNumeral )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 11:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCalc.g:405:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalCalc.g:405:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalCalc.g:406:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTerminalsAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalsAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_8);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalsAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalCalc.g:424:3: ( () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) ) )
                    {
                    // InternalCalc.g:424:3: ( () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) ) )
                    // InternalCalc.g:425:4: () otherlv_4= '-' ( (lv_v_5_0= ruleExpression ) )
                    {
                    // InternalCalc.g:425:4: ()
                    // InternalCalc.g:426:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getTerminalsAccess().getNegateAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_4=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getTerminalsAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalCalc.g:436:4: ( (lv_v_5_0= ruleExpression ) )
                    // InternalCalc.g:437:5: (lv_v_5_0= ruleExpression )
                    {
                    // InternalCalc.g:437:5: (lv_v_5_0= ruleExpression )
                    // InternalCalc.g:438:6: lv_v_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTerminalsAccess().getVExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_v_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTerminalsRule());
                      						}
                      						set(
                      							current,
                      							"v",
                      							lv_v_5_0,
                      							"calc.xtext.Calc.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCalc.g:457:3: this_Numeral_6= ruleNumeral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalsAccess().getNumeralParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Numeral_6=ruleNumeral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Numeral_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTerminals"


    // $ANTLR start "entryRuleNumeral"
    // InternalCalc.g:469:1: entryRuleNumeral returns [EObject current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final EObject entryRuleNumeral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeral = null;


        try {
            // InternalCalc.g:469:48: (iv_ruleNumeral= ruleNumeral EOF )
            // InternalCalc.g:470:2: iv_ruleNumeral= ruleNumeral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumeralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumeral=ruleNumeral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumeral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // InternalCalc.g:476:1: ruleNumeral returns [EObject current=null] : ( () ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumeral() throws RecognitionException {
        EObject current = null;

        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalCalc.g:482:2: ( ( () ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalCalc.g:483:2: ( () ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalCalc.g:483:2: ( () ( (lv_n_1_0= RULE_INT ) ) )
            // InternalCalc.g:484:3: () ( (lv_n_1_0= RULE_INT ) )
            {
            // InternalCalc.g:484:3: ()
            // InternalCalc.g:485:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNumeralAccess().getNumeralAction_0(),
              					current);
              			
            }

            }

            // InternalCalc.g:491:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalCalc.g:492:4: (lv_n_1_0= RULE_INT )
            {
            // InternalCalc.g:492:4: (lv_n_1_0= RULE_INT )
            // InternalCalc.g:493:5: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_n_1_0, grammarAccess.getNumeralAccess().getNINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getNumeralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"n",
              						lv_n_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNumeral"

    // $ANTLR start synpred1_InternalCalc
    public final void synpred1_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:139:5: ( ( () '-' ) )
        // InternalCalc.g:139:6: ( () '-' )
        {
        // InternalCalc.g:139:6: ( () '-' )
        // InternalCalc.g:140:6: () '-'
        {
        // InternalCalc.g:140:6: ()
        // InternalCalc.g:141:6: 
        {
        }

        match(input,11,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCalc

    // $ANTLR start synpred2_InternalCalc
    public final void synpred2_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:208:5: ( ( () '+' ) )
        // InternalCalc.g:208:6: ( () '+' )
        {
        // InternalCalc.g:208:6: ( () '+' )
        // InternalCalc.g:209:6: () '+'
        {
        // InternalCalc.g:209:6: ()
        // InternalCalc.g:210:6: 
        {
        }

        match(input,12,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalCalc

    // $ANTLR start synpred3_InternalCalc
    public final void synpred3_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:277:5: ( ( () '/' ) )
        // InternalCalc.g:277:6: ( () '/' )
        {
        // InternalCalc.g:277:6: ( () '/' )
        // InternalCalc.g:278:6: () '/'
        {
        // InternalCalc.g:278:6: ()
        // InternalCalc.g:279:6: 
        {
        }

        match(input,13,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalCalc

    // $ANTLR start synpred4_InternalCalc
    public final void synpred4_InternalCalc_fragment() throws RecognitionException {   
        // InternalCalc.g:346:5: ( ( () '*' ) )
        // InternalCalc.g:346:6: ( () '*' )
        {
        // InternalCalc.g:346:6: ( () '*' )
        // InternalCalc.g:347:6: () '*'
        {
        // InternalCalc.g:347:6: ()
        // InternalCalc.g:348:6: 
        {
        }

        match(input,14,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalCalc

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
    public final boolean synpred2_InternalCalc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalCalc_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCalc() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCalc_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008810L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}
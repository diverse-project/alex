package org.xtext.example.mydsl4.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Expression";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:64:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:64:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:65:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:71:1: ruleExpression returns [EObject current=null] : this_Sum_0= ruleSum ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Sum_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: (this_Sum_0= ruleSum )
            // InternalMyDsl.g:78:2: this_Sum_0= ruleSum
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionAccess().getSumParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_Sum_0=ruleSum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_Sum_0;
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


    // $ANTLR start "entryRuleSum"
    // InternalMyDsl.g:89:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalMyDsl.g:89:44: (iv_ruleSum= ruleSum EOF )
            // InternalMyDsl.g:90:2: iv_ruleSum= ruleSum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSum; 
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
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalMyDsl.g:96:1: ruleSum returns [EObject current=null] : (this_Mul_0= ruleMul ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Mul_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:102:2: ( (this_Mul_0= ruleMul ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) ) )* ) )
            // InternalMyDsl.g:103:2: (this_Mul_0= ruleMul ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) ) )* )
            {
            // InternalMyDsl.g:103:2: (this_Mul_0= ruleMul ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) ) )* )
            // InternalMyDsl.g:104:3: this_Mul_0= ruleMul ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSumAccess().getMulParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            this_Mul_0=ruleMul();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Mul_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:112:3: ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_InternalMyDsl()) ) {
                        alt1=1;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:113:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleMul ) )
            	    {
            	    // InternalMyDsl.g:113:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) )
            	    // InternalMyDsl.g:114:5: ( ( () '+' ) )=> ( () otherlv_2= '+' )
            	    {
            	    // InternalMyDsl.g:120:5: ( () otherlv_2= '+' )
            	    // InternalMyDsl.g:121:6: () otherlv_2= '+'
            	    {
            	    // InternalMyDsl.g:121:6: ()
            	    // InternalMyDsl.g:122:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getSumAccess().getSumLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyDsl.g:134:4: ( (lv_rhs_3_0= ruleMul ) )
            	    // InternalMyDsl.g:135:5: (lv_rhs_3_0= ruleMul )
            	    {
            	    // InternalMyDsl.g:135:5: (lv_rhs_3_0= ruleMul )
            	    // InternalMyDsl.g:136:6: lv_rhs_3_0= ruleMul
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSumAccess().getRhsMulParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_rhs_3_0=ruleMul();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSumRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"org.xtext.example.mydsl4.MyDsl.Mul");
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
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleMul"
    // InternalMyDsl.g:158:1: entryRuleMul returns [EObject current=null] : iv_ruleMul= ruleMul EOF ;
    public final EObject entryRuleMul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMul = null;


        try {
            // InternalMyDsl.g:158:44: (iv_ruleMul= ruleMul EOF )
            // InternalMyDsl.g:159:2: iv_ruleMul= ruleMul EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMul=ruleMul();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMul; 
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
    // $ANTLR end "entryRuleMul"


    // $ANTLR start "ruleMul"
    // InternalMyDsl.g:165:1: ruleMul returns [EObject current=null] : (this_Terminal_0= ruleTerminal ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) ) )* ) ;
    public final EObject ruleMul() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Terminal_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:171:2: ( (this_Terminal_0= ruleTerminal ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) ) )* ) )
            // InternalMyDsl.g:172:2: (this_Terminal_0= ruleTerminal ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) ) )* )
            {
            // InternalMyDsl.g:172:2: (this_Terminal_0= ruleTerminal ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) ) )* )
            // InternalMyDsl.g:173:3: this_Terminal_0= ruleTerminal ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulAccess().getTerminalParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_5);
            this_Terminal_0=ruleTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Terminal_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMyDsl.g:181:3: ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalMyDsl()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:182:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleTerminal ) )
            	    {
            	    // InternalMyDsl.g:182:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) )
            	    // InternalMyDsl.g:183:5: ( ( () '*' ) )=> ( () otherlv_2= '*' )
            	    {
            	    // InternalMyDsl.g:189:5: ( () otherlv_2= '*' )
            	    // InternalMyDsl.g:190:6: () otherlv_2= '*'
            	    {
            	    // InternalMyDsl.g:190:6: ()
            	    // InternalMyDsl.g:191:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getMulAccess().getMulLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getMulAccess().getAsteriskKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalMyDsl.g:203:4: ( (lv_rhs_3_0= ruleTerminal ) )
            	    // InternalMyDsl.g:204:5: (lv_rhs_3_0= ruleTerminal )
            	    {
            	    // InternalMyDsl.g:204:5: (lv_rhs_3_0= ruleTerminal )
            	    // InternalMyDsl.g:205:6: lv_rhs_3_0= ruleTerminal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulAccess().getRhsTerminalParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_rhs_3_0=ruleTerminal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"org.xtext.example.mydsl4.MyDsl.Terminal");
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
    // $ANTLR end "ruleMul"


    // $ANTLR start "entryRuleTerminal"
    // InternalMyDsl.g:227:1: entryRuleTerminal returns [EObject current=null] : iv_ruleTerminal= ruleTerminal EOF ;
    public final EObject entryRuleTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerminal = null;


        try {
            // InternalMyDsl.g:227:49: (iv_ruleTerminal= ruleTerminal EOF )
            // InternalMyDsl.g:228:2: iv_ruleTerminal= ruleTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerminal=ruleTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerminal; 
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
    // $ANTLR end "entryRuleTerminal"


    // $ANTLR start "ruleTerminal"
    // InternalMyDsl.g:234:1: ruleTerminal returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral | this_Neg_4= ruleNeg ) ;
    public final EObject ruleTerminal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Literal_3 = null;

        EObject this_Neg_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:240:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral | this_Neg_4= ruleNeg ) )
            // InternalMyDsl.g:241:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral | this_Neg_4= ruleNeg )
            {
            // InternalMyDsl.g:241:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Literal_3= ruleLiteral | this_Neg_4= ruleNeg )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:242:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:242:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMyDsl.g:243:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTerminalAccess().getLeftParenthesisKeyword_0_0());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTerminalAccess().getExpressionParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_6);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Expression_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getTerminalAccess().getRightParenthesisKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:3: this_Literal_3= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalAccess().getLiteralParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Literal_3=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Literal_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:270:3: this_Neg_4= ruleNeg
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTerminalAccess().getNegParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Neg_4=ruleNeg();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Neg_4;
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
    // $ANTLR end "ruleTerminal"


    // $ANTLR start "entryRuleNeg"
    // InternalMyDsl.g:282:1: entryRuleNeg returns [EObject current=null] : iv_ruleNeg= ruleNeg EOF ;
    public final EObject entryRuleNeg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg = null;


        try {
            // InternalMyDsl.g:282:44: (iv_ruleNeg= ruleNeg EOF )
            // InternalMyDsl.g:283:2: iv_ruleNeg= ruleNeg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNeg=ruleNeg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNeg; 
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
    // $ANTLR end "entryRuleNeg"


    // $ANTLR start "ruleNeg"
    // InternalMyDsl.g:289:1: ruleNeg returns [EObject current=null] : ( () otherlv_1= '-' ( (lv_exp_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNeg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:295:2: ( ( () otherlv_1= '-' ( (lv_exp_2_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:296:2: ( () otherlv_1= '-' ( (lv_exp_2_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:296:2: ( () otherlv_1= '-' ( (lv_exp_2_0= ruleExpression ) ) )
            // InternalMyDsl.g:297:3: () otherlv_1= '-' ( (lv_exp_2_0= ruleExpression ) )
            {
            // InternalMyDsl.g:297:3: ()
            // InternalMyDsl.g:298:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNegAccess().getNegAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNegAccess().getHyphenMinusKeyword_1());
              		
            }
            // InternalMyDsl.g:308:3: ( (lv_exp_2_0= ruleExpression ) )
            // InternalMyDsl.g:309:4: (lv_exp_2_0= ruleExpression )
            {
            // InternalMyDsl.g:309:4: (lv_exp_2_0= ruleExpression )
            // InternalMyDsl.g:310:5: lv_exp_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNegAccess().getExpExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNegRule());
              					}
              					set(
              						current,
              						"exp",
              						lv_exp_2_0,
              						"org.xtext.example.mydsl4.MyDsl.Expression");
              					afterParserOrEnumRuleCall();
              				
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
    // $ANTLR end "ruleNeg"


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:331:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMyDsl.g:331:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMyDsl.g:332:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:338:1: ruleLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleELong ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:344:2: ( ( () ( (lv_value_1_0= ruleELong ) ) ) )
            // InternalMyDsl.g:345:2: ( () ( (lv_value_1_0= ruleELong ) ) )
            {
            // InternalMyDsl.g:345:2: ( () ( (lv_value_1_0= ruleELong ) ) )
            // InternalMyDsl.g:346:3: () ( (lv_value_1_0= ruleELong ) )
            {
            // InternalMyDsl.g:346:3: ()
            // InternalMyDsl.g:347:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLiteralAccess().getLiteralAction_0(),
              					current);
              			
            }

            }

            // InternalMyDsl.g:353:3: ( (lv_value_1_0= ruleELong ) )
            // InternalMyDsl.g:354:4: (lv_value_1_0= ruleELong )
            {
            // InternalMyDsl.g:354:4: (lv_value_1_0= ruleELong )
            // InternalMyDsl.g:355:5: lv_value_1_0= ruleELong
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLiteralAccess().getValueELongParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleELong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLiteralRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"org.xtext.example.mydsl4.MyDsl.ELong");
              					afterParserOrEnumRuleCall();
              				
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleELong"
    // InternalMyDsl.g:376:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalMyDsl.g:376:45: (iv_ruleELong= ruleELong EOF )
            // InternalMyDsl.g:377:2: iv_ruleELong= ruleELong EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getELongRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleELong.getText(); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalMyDsl.g:383:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:389:2: (this_INT_0= RULE_INT )
            // InternalMyDsl.g:390:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_INT_0, grammarAccess.getELongAccess().getINTTerminalRuleCall());
              	
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
    // $ANTLR end "ruleELong"

    // $ANTLR start synpred1_InternalMyDsl
    public final void synpred1_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:114:5: ( ( () '+' ) )
        // InternalMyDsl.g:114:6: ( () '+' )
        {
        // InternalMyDsl.g:114:6: ( () '+' )
        // InternalMyDsl.g:115:6: () '+'
        {
        // InternalMyDsl.g:115:6: ()
        // InternalMyDsl.g:116:6: 
        {
        }

        match(input,11,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalMyDsl

    // $ANTLR start synpred2_InternalMyDsl
    public final void synpred2_InternalMyDsl_fragment() throws RecognitionException {   
        // InternalMyDsl.g:183:5: ( ( () '*' ) )
        // InternalMyDsl.g:183:6: ( () '*' )
        {
        // InternalMyDsl.g:183:6: ( () '*' )
        // InternalMyDsl.g:184:6: () '*'
        {
        // InternalMyDsl.g:184:6: ()
        // InternalMyDsl.g:185:6: 
        {
        }

        match(input,12,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalMyDsl

    // Delegated rules

    public final boolean synpred1_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMyDsl_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}
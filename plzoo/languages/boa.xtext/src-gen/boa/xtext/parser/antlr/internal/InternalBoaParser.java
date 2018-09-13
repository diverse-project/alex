package boa.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import boa.xtext.services.BoaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalBoaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';;'", "'let'", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<>'", "'and'", "'or'", "'with'", "':='", "'.'", "';'", "'if'", "'then'", "'else'", "'fun'", "'->'", "'not'", "'this'", "'true'", "'false'", "'skip'", "'('", "')'", "'{'", "','", "'}'", "'copy'", "'in'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBoaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoa.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private BoaGrammarAccess grammarAccess;

        public InternalBoaParser(TokenStream input, BoaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "File";
       	}

       	@Override
       	protected BoaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFile"
    // InternalBoa.g:70:1: entryRuleFile returns [EObject current=null] : iv_ruleFile= ruleFile EOF ;
    public final EObject entryRuleFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFile = null;


        try {
            // InternalBoa.g:70:45: (iv_ruleFile= ruleFile EOF )
            // InternalBoa.g:71:2: iv_ruleFile= ruleFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFile=ruleFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFile; 
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
    // $ANTLR end "entryRuleFile"


    // $ANTLR start "ruleFile"
    // InternalBoa.g:77:1: ruleFile returns [EObject current=null] : ( () ( ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )* )? ) ;
    public final EObject ruleFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_commands_1_0 = null;

        EObject lv_commands_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:83:2: ( ( () ( ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )* )? ) )
            // InternalBoa.g:84:2: ( () ( ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )* )? )
            {
            // InternalBoa.g:84:2: ( () ( ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )* )? )
            // InternalBoa.g:85:3: () ( ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )* )?
            {
            // InternalBoa.g:85:3: ()
            // InternalBoa.g:86:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFileAccess().getFileAction_0(),
              					current);
              			
            }

            }

            // InternalBoa.g:95:3: ( ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_INT)||LA3_0==12||LA3_0==27||LA3_0==30||(LA3_0>=32 && LA3_0<=37)||LA3_0==39||LA3_0==42) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoa.g:96:4: ( (lv_commands_1_0= ruleTopLevelCmd ) ) (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )*
                    {
                    // InternalBoa.g:96:4: ( (lv_commands_1_0= ruleTopLevelCmd ) )
                    // InternalBoa.g:97:5: (lv_commands_1_0= ruleTopLevelCmd )
                    {
                    // InternalBoa.g:97:5: (lv_commands_1_0= ruleTopLevelCmd )
                    // InternalBoa.g:98:6: lv_commands_1_0= ruleTopLevelCmd
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFileAccess().getCommandsTopLevelCmdParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_commands_1_0=ruleTopLevelCmd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFileRule());
                      						}
                      						add(
                      							current,
                      							"commands",
                      							lv_commands_1_0,
                      							"boa.xtext.Boa.TopLevelCmd");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBoa.g:115:4: (otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )? )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==11) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalBoa.g:116:5: otherlv_2= ';;' ( (lv_commands_3_0= ruleTopLevelCmd ) ) (otherlv_4= ';;' )?
                    	    {
                    	    otherlv_2=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getFileAccess().getSemicolonSemicolonKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalBoa.g:120:5: ( (lv_commands_3_0= ruleTopLevelCmd ) )
                    	    // InternalBoa.g:121:6: (lv_commands_3_0= ruleTopLevelCmd )
                    	    {
                    	    // InternalBoa.g:121:6: (lv_commands_3_0= ruleTopLevelCmd )
                    	    // InternalBoa.g:122:7: lv_commands_3_0= ruleTopLevelCmd
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFileAccess().getCommandsTopLevelCmdParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_3);
                    	    lv_commands_3_0=ruleTopLevelCmd();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFileRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"commands",
                    	      								lv_commands_3_0,
                    	      								"boa.xtext.Boa.TopLevelCmd");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalBoa.g:139:5: (otherlv_4= ';;' )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==11) ) {
                    	        int LA1_1 = input.LA(2);

                    	        if ( (LA1_1==EOF||LA1_1==11) ) {
                    	            alt1=1;
                    	        }
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // InternalBoa.g:140:6: otherlv_4= ';;'
                    	            {
                    	            otherlv_4=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              						newLeafNode(otherlv_4, grammarAccess.getFileAccess().getSemicolonSemicolonKeyword_1_1_2());
                    	              					
                    	            }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleFile"


    // $ANTLR start "entryRuleTopLevelCmd"
    // InternalBoa.g:151:1: entryRuleTopLevelCmd returns [EObject current=null] : iv_ruleTopLevelCmd= ruleTopLevelCmd EOF ;
    public final EObject entryRuleTopLevelCmd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelCmd = null;


        try {
            // InternalBoa.g:151:52: (iv_ruleTopLevelCmd= ruleTopLevelCmd EOF )
            // InternalBoa.g:152:2: iv_ruleTopLevelCmd= ruleTopLevelCmd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopLevelCmdRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTopLevelCmd=ruleTopLevelCmd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTopLevelCmd; 
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
    // $ANTLR end "entryRuleTopLevelCmd"


    // $ANTLR start "ruleTopLevelCmd"
    // InternalBoa.g:158:1: ruleTopLevelCmd returns [EObject current=null] : (this_Def_0= ruleDef | this_Expr_1= ruleExpr ) ;
    public final EObject ruleTopLevelCmd() throws RecognitionException {
        EObject current = null;

        EObject this_Def_0 = null;

        EObject this_Expr_1 = null;



        	enterRule();

        try {
            // InternalBoa.g:164:2: ( (this_Def_0= ruleDef | this_Expr_1= ruleExpr ) )
            // InternalBoa.g:165:2: (this_Def_0= ruleDef | this_Expr_1= ruleExpr )
            {
            // InternalBoa.g:165:2: (this_Def_0= ruleDef | this_Expr_1= ruleExpr )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBoa.g:166:3: this_Def_0= ruleDef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelCmdAccess().getDefParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Def_0=ruleDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Def_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBoa.g:178:3: this_Expr_1= ruleExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTopLevelCmdAccess().getExprParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Expr_1=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Expr_1;
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
    // $ANTLR end "ruleTopLevelCmd"


    // $ANTLR start "entryRuleDef"
    // InternalBoa.g:193:1: entryRuleDef returns [EObject current=null] : iv_ruleDef= ruleDef EOF ;
    public final EObject entryRuleDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDef = null;


        try {
            // InternalBoa.g:193:44: (iv_ruleDef= ruleDef EOF )
            // InternalBoa.g:194:2: iv_ruleDef= ruleDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDef=ruleDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDef; 
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
    // $ANTLR end "entryRuleDef"


    // $ANTLR start "ruleDef"
    // InternalBoa.g:200:1: ruleDef returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) ) ;
    public final EObject ruleDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_expr_4_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:206:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) ) )
            // InternalBoa.g:207:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) )
            {
            // InternalBoa.g:207:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) ) )
            // InternalBoa.g:208:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_expr_4_0= ruleExpr ) )
            {
            // InternalBoa.g:208:3: ()
            // InternalBoa.g:209:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDefAccess().getDefAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefAccess().getLetKeyword_1());
              		
            }
            // InternalBoa.g:222:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBoa.g:223:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBoa.g:223:4: (lv_name_2_0= RULE_ID )
            // InternalBoa.g:224:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getDefAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getDefAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalBoa.g:244:3: ( (lv_expr_4_0= ruleExpr ) )
            // InternalBoa.g:245:4: (lv_expr_4_0= ruleExpr )
            {
            // InternalBoa.g:245:4: (lv_expr_4_0= ruleExpr )
            // InternalBoa.g:246:5: lv_expr_4_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefAccess().getExprExprParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_4_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_4_0,
              						"boa.xtext.Boa.Expr");
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
    // $ANTLR end "ruleDef"


    // $ANTLR start "entryRuleExpr"
    // InternalBoa.g:267:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // InternalBoa.g:267:45: (iv_ruleExpr= ruleExpr EOF )
            // InternalBoa.g:268:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // InternalBoa.g:274:1: ruleExpr returns [EObject current=null] : this_App_0= ruleApp ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_App_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:280:2: (this_App_0= ruleApp )
            // InternalBoa.g:281:2: this_App_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExprAccess().getAppParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_App_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_App_0;
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleApp"
    // InternalBoa.g:295:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalBoa.g:295:44: (iv_ruleApp= ruleApp EOF )
            // InternalBoa.g:296:2: iv_ruleApp= ruleApp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApp; 
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
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalBoa.g:302:1: ruleApp returns [EObject current=null] : ( () ( (lv_apps_1_0= ruleNonApp ) )+ ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        EObject lv_apps_1_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:308:2: ( ( () ( (lv_apps_1_0= ruleNonApp ) )+ ) )
            // InternalBoa.g:309:2: ( () ( (lv_apps_1_0= ruleNonApp ) )+ )
            {
            // InternalBoa.g:309:2: ( () ( (lv_apps_1_0= ruleNonApp ) )+ )
            // InternalBoa.g:310:3: () ( (lv_apps_1_0= ruleNonApp ) )+
            {
            // InternalBoa.g:310:3: ()
            // InternalBoa.g:311:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAppAccess().getAppAction_0(),
              					current);
              			
            }

            }

            // InternalBoa.g:320:3: ( (lv_apps_1_0= ruleNonApp ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalBoa.g:321:4: (lv_apps_1_0= ruleNonApp )
            	    {
            	    // InternalBoa.g:321:4: (lv_apps_1_0= ruleNonApp )
            	    // InternalBoa.g:322:5: lv_apps_1_0= ruleNonApp
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAppAccess().getAppsNonAppParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_apps_1_0=ruleNonApp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAppRule());
            	      					}
            	      					add(
            	      						current,
            	      						"apps",
            	      						lv_apps_1_0,
            	      						"boa.xtext.Boa.NonApp");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleNonApp"
    // InternalBoa.g:343:1: entryRuleNonApp returns [EObject current=null] : iv_ruleNonApp= ruleNonApp EOF ;
    public final EObject entryRuleNonApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonApp = null;


        try {
            // InternalBoa.g:343:47: (iv_ruleNonApp= ruleNonApp EOF )
            // InternalBoa.g:344:2: iv_ruleNonApp= ruleNonApp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonAppRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNonApp=ruleNonApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonApp; 
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
    // $ANTLR end "entryRuleNonApp"


    // $ANTLR start "ruleNonApp"
    // InternalBoa.g:350:1: ruleNonApp returns [EObject current=null] : this_ArithOpPlus_0= ruleArithOpPlus ;
    public final EObject ruleNonApp() throws RecognitionException {
        EObject current = null;

        EObject this_ArithOpPlus_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:356:2: (this_ArithOpPlus_0= ruleArithOpPlus )
            // InternalBoa.g:357:2: this_ArithOpPlus_0= ruleArithOpPlus
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getNonAppAccess().getArithOpPlusParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ArithOpPlus_0=ruleArithOpPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ArithOpPlus_0;
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
    // $ANTLR end "ruleNonApp"


    // $ANTLR start "entryRuleArithOpPlus"
    // InternalBoa.g:371:1: entryRuleArithOpPlus returns [EObject current=null] : iv_ruleArithOpPlus= ruleArithOpPlus EOF ;
    public final EObject entryRuleArithOpPlus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithOpPlus = null;


        try {
            // InternalBoa.g:371:52: (iv_ruleArithOpPlus= ruleArithOpPlus EOF )
            // InternalBoa.g:372:2: iv_ruleArithOpPlus= ruleArithOpPlus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithOpPlusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithOpPlus=ruleArithOpPlus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithOpPlus; 
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
    // $ANTLR end "entryRuleArithOpPlus"


    // $ANTLR start "ruleArithOpPlus"
    // InternalBoa.g:378:1: ruleArithOpPlus returns [EObject current=null] : (this_ArithOpMinus_0= ruleArithOpMinus ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )* ) ;
    public final EObject ruleArithOpPlus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ArithOpMinus_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:384:2: ( (this_ArithOpMinus_0= ruleArithOpMinus ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )* ) )
            // InternalBoa.g:385:2: (this_ArithOpMinus_0= ruleArithOpMinus ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )* )
            {
            // InternalBoa.g:385:2: (this_ArithOpMinus_0= ruleArithOpMinus ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )* )
            // InternalBoa.g:386:3: this_ArithOpMinus_0= ruleArithOpMinus ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithOpPlusAccess().getArithOpMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_ArithOpMinus_0=ruleArithOpMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithOpMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:397:3: ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred7_InternalBoa()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoa.g:398:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) )
            	    {
            	    // InternalBoa.g:398:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) )
            	    // InternalBoa.g:399:5: ( ( () '+' ) )=> ( () otherlv_2= '+' )
            	    {
            	    // InternalBoa.g:405:5: ( () otherlv_2= '+' )
            	    // InternalBoa.g:406:6: () otherlv_2= '+'
            	    {
            	    // InternalBoa.g:406:6: ()
            	    // InternalBoa.g:407:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getArithOpPlusAccess().getArithOpPlusLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getArithOpPlusAccess().getPlusSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:422:4: ( (lv_rhs_3_0= ruleArithOpMinus ) )
            	    // InternalBoa.g:423:5: (lv_rhs_3_0= ruleArithOpMinus )
            	    {
            	    // InternalBoa.g:423:5: (lv_rhs_3_0= ruleArithOpMinus )
            	    // InternalBoa.g:424:6: lv_rhs_3_0= ruleArithOpMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithOpPlusAccess().getRhsArithOpMinusParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_rhs_3_0=ruleArithOpMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithOpPlusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.ArithOpMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleArithOpPlus"


    // $ANTLR start "entryRuleArithOpMinus"
    // InternalBoa.g:446:1: entryRuleArithOpMinus returns [EObject current=null] : iv_ruleArithOpMinus= ruleArithOpMinus EOF ;
    public final EObject entryRuleArithOpMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithOpMinus = null;


        try {
            // InternalBoa.g:446:53: (iv_ruleArithOpMinus= ruleArithOpMinus EOF )
            // InternalBoa.g:447:2: iv_ruleArithOpMinus= ruleArithOpMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithOpMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithOpMinus=ruleArithOpMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithOpMinus; 
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
    // $ANTLR end "entryRuleArithOpMinus"


    // $ANTLR start "ruleArithOpMinus"
    // InternalBoa.g:453:1: ruleArithOpMinus returns [EObject current=null] : (this_ArithOpTimes_0= ruleArithOpTimes ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )* ) ;
    public final EObject ruleArithOpMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ArithOpTimes_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:459:2: ( (this_ArithOpTimes_0= ruleArithOpTimes ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )* ) )
            // InternalBoa.g:460:2: (this_ArithOpTimes_0= ruleArithOpTimes ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )* )
            {
            // InternalBoa.g:460:2: (this_ArithOpTimes_0= ruleArithOpTimes ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )* )
            // InternalBoa.g:461:3: this_ArithOpTimes_0= ruleArithOpTimes ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithOpMinusAccess().getArithOpTimesParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_ArithOpTimes_0=ruleArithOpTimes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithOpTimes_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:472:3: ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred9_InternalBoa()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalBoa.g:473:4: ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) )
            	    {
            	    // InternalBoa.g:473:4: ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) )
            	    // InternalBoa.g:474:5: ( ( () '-' ) )=> ( () otherlv_2= '-' )
            	    {
            	    // InternalBoa.g:480:5: ( () otherlv_2= '-' )
            	    // InternalBoa.g:481:6: () otherlv_2= '-'
            	    {
            	    // InternalBoa.g:481:6: ()
            	    // InternalBoa.g:482:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getArithOpMinusAccess().getArithOpMinusLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getArithOpMinusAccess().getHyphenMinusKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:497:4: ( (lv_rhs_3_0= ruleArithOpTimes ) )
            	    // InternalBoa.g:498:5: (lv_rhs_3_0= ruleArithOpTimes )
            	    {
            	    // InternalBoa.g:498:5: (lv_rhs_3_0= ruleArithOpTimes )
            	    // InternalBoa.g:499:6: lv_rhs_3_0= ruleArithOpTimes
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithOpMinusAccess().getRhsArithOpTimesParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_rhs_3_0=ruleArithOpTimes();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithOpMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.ArithOpTimes");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleArithOpMinus"


    // $ANTLR start "entryRuleArithOpTimes"
    // InternalBoa.g:521:1: entryRuleArithOpTimes returns [EObject current=null] : iv_ruleArithOpTimes= ruleArithOpTimes EOF ;
    public final EObject entryRuleArithOpTimes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithOpTimes = null;


        try {
            // InternalBoa.g:521:53: (iv_ruleArithOpTimes= ruleArithOpTimes EOF )
            // InternalBoa.g:522:2: iv_ruleArithOpTimes= ruleArithOpTimes EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithOpTimesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithOpTimes=ruleArithOpTimes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithOpTimes; 
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
    // $ANTLR end "entryRuleArithOpTimes"


    // $ANTLR start "ruleArithOpTimes"
    // InternalBoa.g:528:1: ruleArithOpTimes returns [EObject current=null] : (this_ArithOpDivide_0= ruleArithOpDivide ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )* ) ;
    public final EObject ruleArithOpTimes() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ArithOpDivide_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:534:2: ( (this_ArithOpDivide_0= ruleArithOpDivide ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )* ) )
            // InternalBoa.g:535:2: (this_ArithOpDivide_0= ruleArithOpDivide ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )* )
            {
            // InternalBoa.g:535:2: (this_ArithOpDivide_0= ruleArithOpDivide ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )* )
            // InternalBoa.g:536:3: this_ArithOpDivide_0= ruleArithOpDivide ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithOpTimesAccess().getArithOpDivideParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_10);
            this_ArithOpDivide_0=ruleArithOpDivide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithOpDivide_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:547:3: ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred11_InternalBoa()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalBoa.g:548:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) )
            	    {
            	    // InternalBoa.g:548:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) )
            	    // InternalBoa.g:549:5: ( ( () '*' ) )=> ( () otherlv_2= '*' )
            	    {
            	    // InternalBoa.g:555:5: ( () otherlv_2= '*' )
            	    // InternalBoa.g:556:6: () otherlv_2= '*'
            	    {
            	    // InternalBoa.g:556:6: ()
            	    // InternalBoa.g:557:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getArithOpTimesAccess().getArithOpTimesLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getArithOpTimesAccess().getAsteriskKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:572:4: ( (lv_rhs_3_0= ruleArithOpDivide ) )
            	    // InternalBoa.g:573:5: (lv_rhs_3_0= ruleArithOpDivide )
            	    {
            	    // InternalBoa.g:573:5: (lv_rhs_3_0= ruleArithOpDivide )
            	    // InternalBoa.g:574:6: lv_rhs_3_0= ruleArithOpDivide
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithOpTimesAccess().getRhsArithOpDivideParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_rhs_3_0=ruleArithOpDivide();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithOpTimesRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.ArithOpDivide");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleArithOpTimes"


    // $ANTLR start "entryRuleArithOpDivide"
    // InternalBoa.g:596:1: entryRuleArithOpDivide returns [EObject current=null] : iv_ruleArithOpDivide= ruleArithOpDivide EOF ;
    public final EObject entryRuleArithOpDivide() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithOpDivide = null;


        try {
            // InternalBoa.g:596:54: (iv_ruleArithOpDivide= ruleArithOpDivide EOF )
            // InternalBoa.g:597:2: iv_ruleArithOpDivide= ruleArithOpDivide EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithOpDivideRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithOpDivide=ruleArithOpDivide();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithOpDivide; 
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
    // $ANTLR end "entryRuleArithOpDivide"


    // $ANTLR start "ruleArithOpDivide"
    // InternalBoa.g:603:1: ruleArithOpDivide returns [EObject current=null] : (this_ArithOpRemainder_0= ruleArithOpRemainder ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )* ) ;
    public final EObject ruleArithOpDivide() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ArithOpRemainder_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:609:2: ( (this_ArithOpRemainder_0= ruleArithOpRemainder ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )* ) )
            // InternalBoa.g:610:2: (this_ArithOpRemainder_0= ruleArithOpRemainder ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )* )
            {
            // InternalBoa.g:610:2: (this_ArithOpRemainder_0= ruleArithOpRemainder ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )* )
            // InternalBoa.g:611:3: this_ArithOpRemainder_0= ruleArithOpRemainder ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithOpDivideAccess().getArithOpRemainderParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_11);
            this_ArithOpRemainder_0=ruleArithOpRemainder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ArithOpRemainder_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:622:3: ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred13_InternalBoa()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalBoa.g:623:4: ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) )
            	    {
            	    // InternalBoa.g:623:4: ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) )
            	    // InternalBoa.g:624:5: ( ( () '/' ) )=> ( () otherlv_2= '/' )
            	    {
            	    // InternalBoa.g:630:5: ( () otherlv_2= '/' )
            	    // InternalBoa.g:631:6: () otherlv_2= '/'
            	    {
            	    // InternalBoa.g:631:6: ()
            	    // InternalBoa.g:632:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getArithOpDivideAccess().getArithOpDivideLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getArithOpDivideAccess().getSolidusKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:647:4: ( (lv_rhs_3_0= ruleArithOpRemainder ) )
            	    // InternalBoa.g:648:5: (lv_rhs_3_0= ruleArithOpRemainder )
            	    {
            	    // InternalBoa.g:648:5: (lv_rhs_3_0= ruleArithOpRemainder )
            	    // InternalBoa.g:649:6: lv_rhs_3_0= ruleArithOpRemainder
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithOpDivideAccess().getRhsArithOpRemainderParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_rhs_3_0=ruleArithOpRemainder();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithOpDivideRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.ArithOpRemainder");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleArithOpDivide"


    // $ANTLR start "entryRuleArithOpRemainder"
    // InternalBoa.g:671:1: entryRuleArithOpRemainder returns [EObject current=null] : iv_ruleArithOpRemainder= ruleArithOpRemainder EOF ;
    public final EObject entryRuleArithOpRemainder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithOpRemainder = null;


        try {
            // InternalBoa.g:671:57: (iv_ruleArithOpRemainder= ruleArithOpRemainder EOF )
            // InternalBoa.g:672:2: iv_ruleArithOpRemainder= ruleArithOpRemainder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithOpRemainderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArithOpRemainder=ruleArithOpRemainder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithOpRemainder; 
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
    // $ANTLR end "entryRuleArithOpRemainder"


    // $ANTLR start "ruleArithOpRemainder"
    // InternalBoa.g:678:1: ruleArithOpRemainder returns [EObject current=null] : (this_BoolOpLess_0= ruleBoolOpLess ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )* ) ;
    public final EObject ruleArithOpRemainder() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolOpLess_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:684:2: ( (this_BoolOpLess_0= ruleBoolOpLess ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )* ) )
            // InternalBoa.g:685:2: (this_BoolOpLess_0= ruleBoolOpLess ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )* )
            {
            // InternalBoa.g:685:2: (this_BoolOpLess_0= ruleBoolOpLess ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )* )
            // InternalBoa.g:686:3: this_BoolOpLess_0= ruleBoolOpLess ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getArithOpRemainderAccess().getBoolOpLessParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_12);
            this_BoolOpLess_0=ruleBoolOpLess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BoolOpLess_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:697:3: ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred15_InternalBoa()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalBoa.g:698:4: ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) )
            	    {
            	    // InternalBoa.g:698:4: ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) )
            	    // InternalBoa.g:699:5: ( ( () '%' ) )=> ( () otherlv_2= '%' )
            	    {
            	    // InternalBoa.g:705:5: ( () otherlv_2= '%' )
            	    // InternalBoa.g:706:6: () otherlv_2= '%'
            	    {
            	    // InternalBoa.g:706:6: ()
            	    // InternalBoa.g:707:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getArithOpRemainderAccess().getArithOpRemainderLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getArithOpRemainderAccess().getPercentSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:722:4: ( (lv_rhs_3_0= ruleBoolOpLess ) )
            	    // InternalBoa.g:723:5: (lv_rhs_3_0= ruleBoolOpLess )
            	    {
            	    // InternalBoa.g:723:5: (lv_rhs_3_0= ruleBoolOpLess )
            	    // InternalBoa.g:724:6: lv_rhs_3_0= ruleBoolOpLess
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArithOpRemainderAccess().getRhsBoolOpLessParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_rhs_3_0=ruleBoolOpLess();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArithOpRemainderRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.BoolOpLess");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleArithOpRemainder"


    // $ANTLR start "entryRuleBoolOpLess"
    // InternalBoa.g:746:1: entryRuleBoolOpLess returns [EObject current=null] : iv_ruleBoolOpLess= ruleBoolOpLess EOF ;
    public final EObject entryRuleBoolOpLess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpLess = null;


        try {
            // InternalBoa.g:746:51: (iv_ruleBoolOpLess= ruleBoolOpLess EOF )
            // InternalBoa.g:747:2: iv_ruleBoolOpLess= ruleBoolOpLess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOpLessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpLess=ruleBoolOpLess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolOpLess; 
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
    // $ANTLR end "entryRuleBoolOpLess"


    // $ANTLR start "ruleBoolOpLess"
    // InternalBoa.g:753:1: ruleBoolOpLess returns [EObject current=null] : (this_BoolOpEqual_0= ruleBoolOpEqual ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )* ) ;
    public final EObject ruleBoolOpLess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolOpEqual_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:759:2: ( (this_BoolOpEqual_0= ruleBoolOpEqual ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )* ) )
            // InternalBoa.g:760:2: (this_BoolOpEqual_0= ruleBoolOpEqual ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )* )
            {
            // InternalBoa.g:760:2: (this_BoolOpEqual_0= ruleBoolOpEqual ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )* )
            // InternalBoa.g:761:3: this_BoolOpEqual_0= ruleBoolOpEqual ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolOpLessAccess().getBoolOpEqualParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_13);
            this_BoolOpEqual_0=ruleBoolOpEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BoolOpEqual_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:772:3: ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred17_InternalBoa()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalBoa.g:773:4: ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) )
            	    {
            	    // InternalBoa.g:773:4: ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) )
            	    // InternalBoa.g:774:5: ( ( () '<' ) )=> ( () otherlv_2= '<' )
            	    {
            	    // InternalBoa.g:780:5: ( () otherlv_2= '<' )
            	    // InternalBoa.g:781:6: () otherlv_2= '<'
            	    {
            	    // InternalBoa.g:781:6: ()
            	    // InternalBoa.g:782:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getBoolOpLessAccess().getBoolOpLessLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getBoolOpLessAccess().getLessThanSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:797:4: ( (lv_rhs_3_0= ruleBoolOpEqual ) )
            	    // InternalBoa.g:798:5: (lv_rhs_3_0= ruleBoolOpEqual )
            	    {
            	    // InternalBoa.g:798:5: (lv_rhs_3_0= ruleBoolOpEqual )
            	    // InternalBoa.g:799:6: lv_rhs_3_0= ruleBoolOpEqual
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOpLessAccess().getRhsBoolOpEqualParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_rhs_3_0=ruleBoolOpEqual();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOpLessRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.BoolOpEqual");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleBoolOpLess"


    // $ANTLR start "entryRuleBoolOpEqual"
    // InternalBoa.g:821:1: entryRuleBoolOpEqual returns [EObject current=null] : iv_ruleBoolOpEqual= ruleBoolOpEqual EOF ;
    public final EObject entryRuleBoolOpEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpEqual = null;


        try {
            // InternalBoa.g:821:52: (iv_ruleBoolOpEqual= ruleBoolOpEqual EOF )
            // InternalBoa.g:822:2: iv_ruleBoolOpEqual= ruleBoolOpEqual EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOpEqualRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpEqual=ruleBoolOpEqual();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolOpEqual; 
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
    // $ANTLR end "entryRuleBoolOpEqual"


    // $ANTLR start "ruleBoolOpEqual"
    // InternalBoa.g:828:1: ruleBoolOpEqual returns [EObject current=null] : (this_BoolOpUnequal_0= ruleBoolOpUnequal ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )* ) ;
    public final EObject ruleBoolOpEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolOpUnequal_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:834:2: ( (this_BoolOpUnequal_0= ruleBoolOpUnequal ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )* ) )
            // InternalBoa.g:835:2: (this_BoolOpUnequal_0= ruleBoolOpUnequal ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )* )
            {
            // InternalBoa.g:835:2: (this_BoolOpUnequal_0= ruleBoolOpUnequal ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )* )
            // InternalBoa.g:836:3: this_BoolOpUnequal_0= ruleBoolOpUnequal ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolOpEqualAccess().getBoolOpUnequalParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_14);
            this_BoolOpUnequal_0=ruleBoolOpUnequal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BoolOpUnequal_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:847:3: ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred19_InternalBoa()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalBoa.g:848:4: ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) )
            	    {
            	    // InternalBoa.g:848:4: ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) )
            	    // InternalBoa.g:849:5: ( ( () '=' ) )=> ( () otherlv_2= '=' )
            	    {
            	    // InternalBoa.g:855:5: ( () otherlv_2= '=' )
            	    // InternalBoa.g:856:6: () otherlv_2= '='
            	    {
            	    // InternalBoa.g:856:6: ()
            	    // InternalBoa.g:857:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getBoolOpEqualAccess().getBoolOpEqualLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getBoolOpEqualAccess().getEqualsSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:872:4: ( (lv_rhs_3_0= ruleBoolOpUnequal ) )
            	    // InternalBoa.g:873:5: (lv_rhs_3_0= ruleBoolOpUnequal )
            	    {
            	    // InternalBoa.g:873:5: (lv_rhs_3_0= ruleBoolOpUnequal )
            	    // InternalBoa.g:874:6: lv_rhs_3_0= ruleBoolOpUnequal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOpEqualAccess().getRhsBoolOpUnequalParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_rhs_3_0=ruleBoolOpUnequal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOpEqualRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.BoolOpUnequal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleBoolOpEqual"


    // $ANTLR start "entryRuleBoolOpUnequal"
    // InternalBoa.g:896:1: entryRuleBoolOpUnequal returns [EObject current=null] : iv_ruleBoolOpUnequal= ruleBoolOpUnequal EOF ;
    public final EObject entryRuleBoolOpUnequal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpUnequal = null;


        try {
            // InternalBoa.g:896:54: (iv_ruleBoolOpUnequal= ruleBoolOpUnequal EOF )
            // InternalBoa.g:897:2: iv_ruleBoolOpUnequal= ruleBoolOpUnequal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOpUnequalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpUnequal=ruleBoolOpUnequal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolOpUnequal; 
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
    // $ANTLR end "entryRuleBoolOpUnequal"


    // $ANTLR start "ruleBoolOpUnequal"
    // InternalBoa.g:903:1: ruleBoolOpUnequal returns [EObject current=null] : (this_BoolOpAnd_0= ruleBoolOpAnd ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )* ) ;
    public final EObject ruleBoolOpUnequal() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolOpAnd_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:909:2: ( (this_BoolOpAnd_0= ruleBoolOpAnd ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )* ) )
            // InternalBoa.g:910:2: (this_BoolOpAnd_0= ruleBoolOpAnd ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )* )
            {
            // InternalBoa.g:910:2: (this_BoolOpAnd_0= ruleBoolOpAnd ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )* )
            // InternalBoa.g:911:3: this_BoolOpAnd_0= ruleBoolOpAnd ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolOpUnequalAccess().getBoolOpAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_15);
            this_BoolOpAnd_0=ruleBoolOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BoolOpAnd_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:922:3: ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred21_InternalBoa()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalBoa.g:923:4: ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) )
            	    {
            	    // InternalBoa.g:923:4: ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) )
            	    // InternalBoa.g:924:5: ( ( () '<>' ) )=> ( () otherlv_2= '<>' )
            	    {
            	    // InternalBoa.g:930:5: ( () otherlv_2= '<>' )
            	    // InternalBoa.g:931:6: () otherlv_2= '<>'
            	    {
            	    // InternalBoa.g:931:6: ()
            	    // InternalBoa.g:932:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getBoolOpUnequalAccess().getBoolOpUnequalLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getBoolOpUnequalAccess().getLessThanSignGreaterThanSignKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:947:4: ( (lv_rhs_3_0= ruleBoolOpAnd ) )
            	    // InternalBoa.g:948:5: (lv_rhs_3_0= ruleBoolOpAnd )
            	    {
            	    // InternalBoa.g:948:5: (lv_rhs_3_0= ruleBoolOpAnd )
            	    // InternalBoa.g:949:6: lv_rhs_3_0= ruleBoolOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOpUnequalAccess().getRhsBoolOpAndParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_rhs_3_0=ruleBoolOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOpUnequalRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.BoolOpAnd");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleBoolOpUnequal"


    // $ANTLR start "entryRuleBoolOpAnd"
    // InternalBoa.g:971:1: entryRuleBoolOpAnd returns [EObject current=null] : iv_ruleBoolOpAnd= ruleBoolOpAnd EOF ;
    public final EObject entryRuleBoolOpAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpAnd = null;


        try {
            // InternalBoa.g:971:50: (iv_ruleBoolOpAnd= ruleBoolOpAnd EOF )
            // InternalBoa.g:972:2: iv_ruleBoolOpAnd= ruleBoolOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpAnd=ruleBoolOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolOpAnd; 
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
    // $ANTLR end "entryRuleBoolOpAnd"


    // $ANTLR start "ruleBoolOpAnd"
    // InternalBoa.g:978:1: ruleBoolOpAnd returns [EObject current=null] : (this_BoolOpOr_0= ruleBoolOpOr ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )* ) ;
    public final EObject ruleBoolOpAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BoolOpOr_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:984:2: ( (this_BoolOpOr_0= ruleBoolOpOr ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )* ) )
            // InternalBoa.g:985:2: (this_BoolOpOr_0= ruleBoolOpOr ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )* )
            {
            // InternalBoa.g:985:2: (this_BoolOpOr_0= ruleBoolOpOr ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )* )
            // InternalBoa.g:986:3: this_BoolOpOr_0= ruleBoolOpOr ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolOpAndAccess().getBoolOpOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_16);
            this_BoolOpOr_0=ruleBoolOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BoolOpOr_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:997:3: ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred23_InternalBoa()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalBoa.g:998:4: ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) )
            	    {
            	    // InternalBoa.g:998:4: ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) )
            	    // InternalBoa.g:999:5: ( ( () 'and' ) )=> ( () otherlv_2= 'and' )
            	    {
            	    // InternalBoa.g:1005:5: ( () otherlv_2= 'and' )
            	    // InternalBoa.g:1006:6: () otherlv_2= 'and'
            	    {
            	    // InternalBoa.g:1006:6: ()
            	    // InternalBoa.g:1007:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getBoolOpAndAccess().getBoolOpAndLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getBoolOpAndAccess().getAndKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:1022:4: ( (lv_rhs_3_0= ruleBoolOpOr ) )
            	    // InternalBoa.g:1023:5: (lv_rhs_3_0= ruleBoolOpOr )
            	    {
            	    // InternalBoa.g:1023:5: (lv_rhs_3_0= ruleBoolOpOr )
            	    // InternalBoa.g:1024:6: lv_rhs_3_0= ruleBoolOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOpAndAccess().getRhsBoolOpOrParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_rhs_3_0=ruleBoolOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOpAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.BoolOpOr");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleBoolOpAnd"


    // $ANTLR start "entryRuleBoolOpOr"
    // InternalBoa.g:1046:1: entryRuleBoolOpOr returns [EObject current=null] : iv_ruleBoolOpOr= ruleBoolOpOr EOF ;
    public final EObject entryRuleBoolOpOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpOr = null;


        try {
            // InternalBoa.g:1046:49: (iv_ruleBoolOpOr= ruleBoolOpOr EOF )
            // InternalBoa.g:1047:2: iv_ruleBoolOpOr= ruleBoolOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpOr=ruleBoolOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolOpOr; 
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
    // $ANTLR end "entryRuleBoolOpOr"


    // $ANTLR start "ruleBoolOpOr"
    // InternalBoa.g:1053:1: ruleBoolOpOr returns [EObject current=null] : (this_BWith_0= ruleBWith ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )* ) ;
    public final EObject ruleBoolOpOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_BWith_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1059:2: ( (this_BWith_0= ruleBWith ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )* ) )
            // InternalBoa.g:1060:2: (this_BWith_0= ruleBWith ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )* )
            {
            // InternalBoa.g:1060:2: (this_BWith_0= ruleBWith ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )* )
            // InternalBoa.g:1061:3: this_BWith_0= ruleBWith ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBoolOpOrAccess().getBWithParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_17);
            this_BWith_0=ruleBWith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_BWith_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:1072:3: ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred25_InternalBoa()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalBoa.g:1073:4: ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) )
            	    {
            	    // InternalBoa.g:1073:4: ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) )
            	    // InternalBoa.g:1074:5: ( ( () 'or' ) )=> ( () otherlv_2= 'or' )
            	    {
            	    // InternalBoa.g:1080:5: ( () otherlv_2= 'or' )
            	    // InternalBoa.g:1081:6: () otherlv_2= 'or'
            	    {
            	    // InternalBoa.g:1081:6: ()
            	    // InternalBoa.g:1082:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getBoolOpOrAccess().getBoolOpOrLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getBoolOpOrAccess().getOrKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:1097:4: ( (lv_rhs_3_0= ruleBWith ) )
            	    // InternalBoa.g:1098:5: (lv_rhs_3_0= ruleBWith )
            	    {
            	    // InternalBoa.g:1098:5: (lv_rhs_3_0= ruleBWith )
            	    // InternalBoa.g:1099:6: lv_rhs_3_0= ruleBWith
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBoolOpOrAccess().getRhsBWithParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_rhs_3_0=ruleBWith();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBoolOpOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.BWith");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleBoolOpOr"


    // $ANTLR start "entryRuleBWith"
    // InternalBoa.g:1121:1: entryRuleBWith returns [EObject current=null] : iv_ruleBWith= ruleBWith EOF ;
    public final EObject entryRuleBWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBWith = null;


        try {
            // InternalBoa.g:1121:46: (iv_ruleBWith= ruleBWith EOF )
            // InternalBoa.g:1122:2: iv_ruleBWith= ruleBWith EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBWithRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBWith=ruleBWith();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBWith; 
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
    // $ANTLR end "entryRuleBWith"


    // $ANTLR start "ruleBWith"
    // InternalBoa.g:1128:1: ruleBWith returns [EObject current=null] : (this_Assign_0= ruleAssign ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )* ) ;
    public final EObject ruleBWith() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Assign_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1134:2: ( (this_Assign_0= ruleAssign ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )* ) )
            // InternalBoa.g:1135:2: (this_Assign_0= ruleAssign ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )* )
            {
            // InternalBoa.g:1135:2: (this_Assign_0= ruleAssign ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )* )
            // InternalBoa.g:1136:3: this_Assign_0= ruleAssign ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getBWithAccess().getAssignParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_18);
            this_Assign_0=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Assign_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:1147:3: ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred27_InternalBoa()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalBoa.g:1148:4: ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) )
            	    {
            	    // InternalBoa.g:1148:4: ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) )
            	    // InternalBoa.g:1149:5: ( ( () 'with' ) )=> ( () otherlv_2= 'with' )
            	    {
            	    // InternalBoa.g:1155:5: ( () otherlv_2= 'with' )
            	    // InternalBoa.g:1156:6: () otherlv_2= 'with'
            	    {
            	    // InternalBoa.g:1156:6: ()
            	    // InternalBoa.g:1157:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getBWithAccess().getWithLhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getBWithAccess().getWithKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:1172:4: ( (lv_rhs_3_0= ruleAssign ) )
            	    // InternalBoa.g:1173:5: (lv_rhs_3_0= ruleAssign )
            	    {
            	    // InternalBoa.g:1173:5: (lv_rhs_3_0= ruleAssign )
            	    // InternalBoa.g:1174:6: lv_rhs_3_0= ruleAssign
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getBWithAccess().getRhsAssignParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_rhs_3_0=ruleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getBWithRule());
            	      						}
            	      						set(
            	      							current,
            	      							"rhs",
            	      							lv_rhs_3_0,
            	      							"boa.xtext.Boa.Assign");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleBWith"


    // $ANTLR start "entryRuleAssign"
    // InternalBoa.g:1196:1: entryRuleAssign returns [EObject current=null] : iv_ruleAssign= ruleAssign EOF ;
    public final EObject entryRuleAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssign = null;


        try {
            // InternalBoa.g:1196:47: (iv_ruleAssign= ruleAssign EOF )
            // InternalBoa.g:1197:2: iv_ruleAssign= ruleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssign=ruleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssign; 
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
    // $ANTLR end "entryRuleAssign"


    // $ANTLR start "ruleAssign"
    // InternalBoa.g:1203:1: ruleAssign returns [EObject current=null] : (this_Project_0= ruleProject ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )? ) ;
    public final EObject ruleAssign() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Project_0 = null;

        EObject lv_rhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1209:2: ( (this_Project_0= ruleProject ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )? ) )
            // InternalBoa.g:1210:2: (this_Project_0= ruleProject ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )? )
            {
            // InternalBoa.g:1210:2: (this_Project_0= ruleProject ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )? )
            // InternalBoa.g:1211:3: this_Project_0= ruleProject ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAssignAccess().getProjectParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_19);
            this_Project_0=ruleProject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Project_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:1222:3: ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                int LA17_1 = input.LA(2);

                if ( (synpred29_InternalBoa()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalBoa.g:1223:4: ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) )
                    {
                    // InternalBoa.g:1223:4: ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) )
                    // InternalBoa.g:1224:5: ( ( () ':=' ) )=> ( () otherlv_2= ':=' )
                    {
                    // InternalBoa.g:1230:5: ( () otherlv_2= ':=' )
                    // InternalBoa.g:1231:6: () otherlv_2= ':='
                    {
                    // InternalBoa.g:1231:6: ()
                    // InternalBoa.g:1232:7: 
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							current = forceCreateModelElementAndSet(
                      								grammarAccess.getAssignAccess().getAssignLhsAction_1_0_0_0(),
                      								current);
                      						
                    }

                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getColonEqualsSignKeyword_1_0_0_1());
                      					
                    }

                    }


                    }

                    // InternalBoa.g:1247:4: ( (lv_rhs_3_0= ruleApp ) )
                    // InternalBoa.g:1248:5: (lv_rhs_3_0= ruleApp )
                    {
                    // InternalBoa.g:1248:5: (lv_rhs_3_0= ruleApp )
                    // InternalBoa.g:1249:6: lv_rhs_3_0= ruleApp
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAssignAccess().getRhsAppParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rhs_3_0=ruleApp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAssignRule());
                      						}
                      						set(
                      							current,
                      							"rhs",
                      							lv_rhs_3_0,
                      							"boa.xtext.Boa.App");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleAssign"


    // $ANTLR start "entryRuleProject"
    // InternalBoa.g:1271:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalBoa.g:1271:48: (iv_ruleProject= ruleProject EOF )
            // InternalBoa.g:1272:2: iv_ruleProject= ruleProject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalBoa.g:1278:1: ruleProject returns [EObject current=null] : (this_Seq_0= ruleSeq ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )* ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_name_3_0=null;
        EObject this_Seq_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1284:2: ( (this_Seq_0= ruleSeq ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )* ) )
            // InternalBoa.g:1285:2: (this_Seq_0= ruleSeq ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )* )
            {
            // InternalBoa.g:1285:2: (this_Seq_0= ruleSeq ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )* )
            // InternalBoa.g:1286:3: this_Seq_0= ruleSeq ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getProjectAccess().getSeqParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_20);
            this_Seq_0=ruleSeq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Seq_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:1297:3: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    int LA18_2 = input.LA(2);

                    if ( (synpred31_InternalBoa()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalBoa.g:1298:4: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) )
            	    {
            	    // InternalBoa.g:1298:4: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) )
            	    // InternalBoa.g:1299:5: ( ( () '.' ) )=> ( () otherlv_2= '.' )
            	    {
            	    // InternalBoa.g:1305:5: ( () otherlv_2= '.' )
            	    // InternalBoa.g:1306:6: () otherlv_2= '.'
            	    {
            	    // InternalBoa.g:1306:6: ()
            	    // InternalBoa.g:1307:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getProjectAccess().getProjectProjectAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getFullStopKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:1322:4: ( (lv_name_3_0= RULE_ID ) )
            	    // InternalBoa.g:1323:5: (lv_name_3_0= RULE_ID )
            	    {
            	    // InternalBoa.g:1323:5: (lv_name_3_0= RULE_ID )
            	    // InternalBoa.g:1324:6: lv_name_3_0= RULE_ID
            	    {
            	    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_name_3_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getProjectRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"name",
            	      							lv_name_3_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleSeq"
    // InternalBoa.g:1345:1: entryRuleSeq returns [EObject current=null] : iv_ruleSeq= ruleSeq EOF ;
    public final EObject entryRuleSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeq = null;


        try {
            // InternalBoa.g:1345:44: (iv_ruleSeq= ruleSeq EOF )
            // InternalBoa.g:1346:2: iv_ruleSeq= ruleSeq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSeqRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSeq=ruleSeq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSeq; 
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
    // $ANTLR end "entryRuleSeq"


    // $ANTLR start "ruleSeq"
    // InternalBoa.g:1352:1: ruleSeq returns [EObject current=null] : (this_NonAppTerminal_0= ruleNonAppTerminal ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )* ) ;
    public final EObject ruleSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_NonAppTerminal_0 = null;

        EObject lv_lhs_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1358:2: ( (this_NonAppTerminal_0= ruleNonAppTerminal ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )* ) )
            // InternalBoa.g:1359:2: (this_NonAppTerminal_0= ruleNonAppTerminal ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )* )
            {
            // InternalBoa.g:1359:2: (this_NonAppTerminal_0= ruleNonAppTerminal ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )* )
            // InternalBoa.g:1360:3: this_NonAppTerminal_0= ruleNonAppTerminal ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSeqAccess().getNonAppTerminalParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_21);
            this_NonAppTerminal_0=ruleNonAppTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_NonAppTerminal_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalBoa.g:1371:3: ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred33_InternalBoa()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalBoa.g:1372:4: ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) )
            	    {
            	    // InternalBoa.g:1372:4: ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) )
            	    // InternalBoa.g:1373:5: ( ( () ';' ) )=> ( () otherlv_2= ';' )
            	    {
            	    // InternalBoa.g:1379:5: ( () otherlv_2= ';' )
            	    // InternalBoa.g:1380:6: () otherlv_2= ';'
            	    {
            	    // InternalBoa.g:1380:6: ()
            	    // InternalBoa.g:1381:7: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      							/* */
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							current = forceCreateModelElementAndSet(
            	      								grammarAccess.getSeqAccess().getSeqRhsAction_1_0_0_0(),
            	      								current);
            	      						
            	    }

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_2, grammarAccess.getSeqAccess().getSemicolonKeyword_1_0_0_1());
            	      					
            	    }

            	    }


            	    }

            	    // InternalBoa.g:1396:4: ( (lv_lhs_3_0= ruleNonAppTerminal ) )
            	    // InternalBoa.g:1397:5: (lv_lhs_3_0= ruleNonAppTerminal )
            	    {
            	    // InternalBoa.g:1397:5: (lv_lhs_3_0= ruleNonAppTerminal )
            	    // InternalBoa.g:1398:6: lv_lhs_3_0= ruleNonAppTerminal
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSeqAccess().getLhsNonAppTerminalParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_21);
            	    lv_lhs_3_0=ruleNonAppTerminal();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSeqRule());
            	      						}
            	      						set(
            	      							current,
            	      							"lhs",
            	      							lv_lhs_3_0,
            	      							"boa.xtext.Boa.NonAppTerminal");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleSeq"


    // $ANTLR start "entryRuleNonAppTerminal"
    // InternalBoa.g:1420:1: entryRuleNonAppTerminal returns [EObject current=null] : iv_ruleNonAppTerminal= ruleNonAppTerminal EOF ;
    public final EObject entryRuleNonAppTerminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonAppTerminal = null;


        try {
            // InternalBoa.g:1420:55: (iv_ruleNonAppTerminal= ruleNonAppTerminal EOF )
            // InternalBoa.g:1421:2: iv_ruleNonAppTerminal= ruleNonAppTerminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonAppTerminalRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNonAppTerminal=ruleNonAppTerminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonAppTerminal; 
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
    // $ANTLR end "entryRuleNonAppTerminal"


    // $ANTLR start "ruleNonAppTerminal"
    // InternalBoa.g:1427:1: ruleNonAppTerminal returns [EObject current=null] : (this_Var_0= ruleVar | this_This_1= ruleThis | this_Bool_2= ruleBool | this_Intz_3= ruleIntz | this_Skip_4= ruleSkip | this_Parens_5= ruleParens | this_BObject_6= ruleBObject | this_Copy_7= ruleCopy | this_BoolOpNot_8= ruleBoolOpNot | this_If_9= ruleIf | this_Fun_10= ruleFun | this_Let_11= ruleLet ) ;
    public final EObject ruleNonAppTerminal() throws RecognitionException {
        EObject current = null;

        EObject this_Var_0 = null;

        EObject this_This_1 = null;

        EObject this_Bool_2 = null;

        EObject this_Intz_3 = null;

        EObject this_Skip_4 = null;

        EObject this_Parens_5 = null;

        EObject this_BObject_6 = null;

        EObject this_Copy_7 = null;

        EObject this_BoolOpNot_8 = null;

        EObject this_If_9 = null;

        EObject this_Fun_10 = null;

        EObject this_Let_11 = null;



        	enterRule();

        try {
            // InternalBoa.g:1433:2: ( (this_Var_0= ruleVar | this_This_1= ruleThis | this_Bool_2= ruleBool | this_Intz_3= ruleIntz | this_Skip_4= ruleSkip | this_Parens_5= ruleParens | this_BObject_6= ruleBObject | this_Copy_7= ruleCopy | this_BoolOpNot_8= ruleBoolOpNot | this_If_9= ruleIf | this_Fun_10= ruleFun | this_Let_11= ruleLet ) )
            // InternalBoa.g:1434:2: (this_Var_0= ruleVar | this_This_1= ruleThis | this_Bool_2= ruleBool | this_Intz_3= ruleIntz | this_Skip_4= ruleSkip | this_Parens_5= ruleParens | this_BObject_6= ruleBObject | this_Copy_7= ruleCopy | this_BoolOpNot_8= ruleBoolOpNot | this_If_9= ruleIf | this_Fun_10= ruleFun | this_Let_11= ruleLet )
            {
            // InternalBoa.g:1434:2: (this_Var_0= ruleVar | this_This_1= ruleThis | this_Bool_2= ruleBool | this_Intz_3= ruleIntz | this_Skip_4= ruleSkip | this_Parens_5= ruleParens | this_BObject_6= ruleBObject | this_Copy_7= ruleCopy | this_BoolOpNot_8= ruleBoolOpNot | this_If_9= ruleIf | this_Fun_10= ruleFun | this_Let_11= ruleLet )
            int alt20=12;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 33:
                {
                alt20=2;
                }
                break;
            case 34:
            case 35:
                {
                alt20=3;
                }
                break;
            case RULE_INT:
                {
                alt20=4;
                }
                break;
            case 36:
                {
                alt20=5;
                }
                break;
            case 37:
                {
                alt20=6;
                }
                break;
            case 39:
                {
                alt20=7;
                }
                break;
            case 42:
                {
                alt20=8;
                }
                break;
            case 32:
                {
                alt20=9;
                }
                break;
            case 27:
                {
                alt20=10;
                }
                break;
            case 30:
                {
                alt20=11;
                }
                break;
            case 12:
                {
                alt20=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalBoa.g:1435:3: this_Var_0= ruleVar
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getVarParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Var_0=ruleVar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Var_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBoa.g:1447:3: this_This_1= ruleThis
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getThisParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_This_1=ruleThis();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_This_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBoa.g:1459:3: this_Bool_2= ruleBool
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getBoolParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Bool_2=ruleBool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Bool_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBoa.g:1471:3: this_Intz_3= ruleIntz
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getIntzParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Intz_3=ruleIntz();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Intz_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalBoa.g:1483:3: this_Skip_4= ruleSkip
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getSkipParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Skip_4=ruleSkip();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Skip_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalBoa.g:1495:3: this_Parens_5= ruleParens
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getParensParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parens_5=ruleParens();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parens_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalBoa.g:1507:3: this_BObject_6= ruleBObject
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getBObjectParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BObject_6=ruleBObject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BObject_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalBoa.g:1519:3: this_Copy_7= ruleCopy
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getCopyParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Copy_7=ruleCopy();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Copy_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalBoa.g:1531:3: this_BoolOpNot_8= ruleBoolOpNot
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getBoolOpNotParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_BoolOpNot_8=ruleBoolOpNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BoolOpNot_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalBoa.g:1543:3: this_If_9= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getIfParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_9=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalBoa.g:1555:3: this_Fun_10= ruleFun
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getFunParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Fun_10=ruleFun();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Fun_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalBoa.g:1567:3: this_Let_11= ruleLet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNonAppTerminalAccess().getLetParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Let_11=ruleLet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Let_11;
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
    // $ANTLR end "ruleNonAppTerminal"


    // $ANTLR start "entryRuleIf"
    // InternalBoa.g:1582:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalBoa.g:1582:43: (iv_ruleIf= ruleIf EOF )
            // InternalBoa.g:1583:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalBoa.g:1589:1: ruleIf returns [EObject current=null] : ( () otherlv_1= 'if' ( (lv_cond_2_0= ruleApp ) ) ( ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cond_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1595:2: ( ( () otherlv_1= 'if' ( (lv_cond_2_0= ruleApp ) ) ( ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) ) ) ) )
            // InternalBoa.g:1596:2: ( () otherlv_1= 'if' ( (lv_cond_2_0= ruleApp ) ) ( ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) ) ) )
            {
            // InternalBoa.g:1596:2: ( () otherlv_1= 'if' ( (lv_cond_2_0= ruleApp ) ) ( ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) ) ) )
            // InternalBoa.g:1597:3: () otherlv_1= 'if' ( (lv_cond_2_0= ruleApp ) ) ( ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) ) )
            {
            // InternalBoa.g:1597:3: ()
            // InternalBoa.g:1598:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIfAccess().getIfAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getIfKeyword_1());
              		
            }
            // InternalBoa.g:1611:3: ( (lv_cond_2_0= ruleApp ) )
            // InternalBoa.g:1612:4: (lv_cond_2_0= ruleApp )
            {
            // InternalBoa.g:1612:4: (lv_cond_2_0= ruleApp )
            // InternalBoa.g:1613:5: lv_cond_2_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfAccess().getCondAppParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_22);
            lv_cond_2_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfRule());
              					}
              					set(
              						current,
              						"cond",
              						lv_cond_2_0,
              						"boa.xtext.Boa.App");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBoa.g:1630:3: ( ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) ) )
            // InternalBoa.g:1631:4: ( ( 'then' )=>otherlv_3= 'then' ) ( (lv_then_4_0= ruleApp ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) )
            {
            // InternalBoa.g:1631:4: ( ( 'then' )=>otherlv_3= 'then' )
            // InternalBoa.g:1632:5: ( 'then' )=>otherlv_3= 'then'
            {
            otherlv_3=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getIfAccess().getThenKeyword_3_0());
              				
            }

            }

            // InternalBoa.g:1638:4: ( (lv_then_4_0= ruleApp ) )
            // InternalBoa.g:1639:5: (lv_then_4_0= ruleApp )
            {
            // InternalBoa.g:1639:5: (lv_then_4_0= ruleApp )
            // InternalBoa.g:1640:6: lv_then_4_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getIfAccess().getThenAppParserRuleCall_3_1_0());
              					
            }
            pushFollow(FOLLOW_23);
            lv_then_4_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getIfRule());
              						}
              						set(
              							current,
              							"then",
              							lv_then_4_0,
              							"boa.xtext.Boa.App");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalBoa.g:1657:4: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) ) )
            // InternalBoa.g:1658:5: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleApp ) )
            {
            // InternalBoa.g:1658:5: ( ( 'else' )=>otherlv_5= 'else' )
            // InternalBoa.g:1659:6: ( 'else' )=>otherlv_5= 'else'
            {
            otherlv_5=(Token)match(input,29,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						newLeafNode(otherlv_5, grammarAccess.getIfAccess().getElseKeyword_3_2_0());
              					
            }

            }

            // InternalBoa.g:1665:5: ( (lv_else_6_0= ruleApp ) )
            // InternalBoa.g:1666:6: (lv_else_6_0= ruleApp )
            {
            // InternalBoa.g:1666:6: (lv_else_6_0= ruleApp )
            // InternalBoa.g:1667:7: lv_else_6_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getIfAccess().getElseAppParserRuleCall_3_2_1_0());
              						
            }
            pushFollow(FOLLOW_2);
            lv_else_6_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getIfRule());
              							}
              							set(
              								current,
              								"else",
              								lv_else_6_0,
              								"boa.xtext.Boa.App");
              							afterParserOrEnumRuleCall();
              						
            }

            }


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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleFun"
    // InternalBoa.g:1690:1: entryRuleFun returns [EObject current=null] : iv_ruleFun= ruleFun EOF ;
    public final EObject entryRuleFun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFun = null;


        try {
            // InternalBoa.g:1690:44: (iv_ruleFun= ruleFun EOF )
            // InternalBoa.g:1691:2: iv_ruleFun= ruleFun EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFun=ruleFun();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFun; 
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
    // $ANTLR end "entryRuleFun"


    // $ANTLR start "ruleFun"
    // InternalBoa.g:1697:1: ruleFun returns [EObject current=null] : (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_body_3_0= ruleApp ) ) ) ;
    public final EObject ruleFun() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1703:2: ( (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_body_3_0= ruleApp ) ) ) )
            // InternalBoa.g:1704:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_body_3_0= ruleApp ) ) )
            {
            // InternalBoa.g:1704:2: (otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_body_3_0= ruleApp ) ) )
            // InternalBoa.g:1705:3: otherlv_0= 'fun' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '->' ( (lv_body_3_0= ruleApp ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFunAccess().getFunKeyword_0());
              		
            }
            // InternalBoa.g:1709:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoa.g:1710:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoa.g:1710:4: (lv_name_1_0= RULE_ID )
            // InternalBoa.g:1711:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getFunAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunAccess().getHyphenMinusGreaterThanSignKeyword_2());
              		
            }
            // InternalBoa.g:1731:3: ( (lv_body_3_0= ruleApp ) )
            // InternalBoa.g:1732:4: (lv_body_3_0= ruleApp )
            {
            // InternalBoa.g:1732:4: (lv_body_3_0= ruleApp )
            // InternalBoa.g:1733:5: lv_body_3_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunAccess().getBodyAppParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_3_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_3_0,
              						"boa.xtext.Boa.App");
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
    // $ANTLR end "ruleFun"


    // $ANTLR start "entryRuleBoolOpNot"
    // InternalBoa.g:1754:1: entryRuleBoolOpNot returns [EObject current=null] : iv_ruleBoolOpNot= ruleBoolOpNot EOF ;
    public final EObject entryRuleBoolOpNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolOpNot = null;


        try {
            // InternalBoa.g:1754:50: (iv_ruleBoolOpNot= ruleBoolOpNot EOF )
            // InternalBoa.g:1755:2: iv_ruleBoolOpNot= ruleBoolOpNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolOpNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolOpNot=ruleBoolOpNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolOpNot; 
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
    // $ANTLR end "entryRuleBoolOpNot"


    // $ANTLR start "ruleBoolOpNot"
    // InternalBoa.g:1761:1: ruleBoolOpNot returns [EObject current=null] : ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleApp ) ) ) ;
    public final EObject ruleBoolOpNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:1767:2: ( ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleApp ) ) ) )
            // InternalBoa.g:1768:2: ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleApp ) ) )
            {
            // InternalBoa.g:1768:2: ( () otherlv_1= 'not' ( (lv_expr_2_0= ruleApp ) ) )
            // InternalBoa.g:1769:3: () otherlv_1= 'not' ( (lv_expr_2_0= ruleApp ) )
            {
            // InternalBoa.g:1769:3: ()
            // InternalBoa.g:1770:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolOpNotAccess().getBoolOpNotAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoolOpNotAccess().getNotKeyword_1());
              		
            }
            // InternalBoa.g:1783:3: ( (lv_expr_2_0= ruleApp ) )
            // InternalBoa.g:1784:4: (lv_expr_2_0= ruleApp )
            {
            // InternalBoa.g:1784:4: (lv_expr_2_0= ruleApp )
            // InternalBoa.g:1785:5: lv_expr_2_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBoolOpNotAccess().getExprAppParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expr_2_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBoolOpNotRule());
              					}
              					set(
              						current,
              						"expr",
              						lv_expr_2_0,
              						"boa.xtext.Boa.App");
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
    // $ANTLR end "ruleBoolOpNot"


    // $ANTLR start "entryRuleVar"
    // InternalBoa.g:1806:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalBoa.g:1806:44: (iv_ruleVar= ruleVar EOF )
            // InternalBoa.g:1807:2: iv_ruleVar= ruleVar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVar; 
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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalBoa.g:1813:1: ruleVar returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBoa.g:1819:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBoa.g:1820:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBoa.g:1820:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBoa.g:1821:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalBoa.g:1821:3: ()
            // InternalBoa.g:1822:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getVarAccess().getVarAction_0(),
              					current);
              			
            }

            }

            // InternalBoa.g:1831:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBoa.g:1832:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBoa.g:1832:4: (lv_name_1_0= RULE_ID )
            // InternalBoa.g:1833:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVarRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
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
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleThis"
    // InternalBoa.g:1853:1: entryRuleThis returns [EObject current=null] : iv_ruleThis= ruleThis EOF ;
    public final EObject entryRuleThis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThis = null;


        try {
            // InternalBoa.g:1853:45: (iv_ruleThis= ruleThis EOF )
            // InternalBoa.g:1854:2: iv_ruleThis= ruleThis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleThis=ruleThis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThis; 
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
    // $ANTLR end "entryRuleThis"


    // $ANTLR start "ruleThis"
    // InternalBoa.g:1860:1: ruleThis returns [EObject current=null] : ( () otherlv_1= 'this' ) ;
    public final EObject ruleThis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoa.g:1866:2: ( ( () otherlv_1= 'this' ) )
            // InternalBoa.g:1867:2: ( () otherlv_1= 'this' )
            {
            // InternalBoa.g:1867:2: ( () otherlv_1= 'this' )
            // InternalBoa.g:1868:3: () otherlv_1= 'this'
            {
            // InternalBoa.g:1868:3: ()
            // InternalBoa.g:1869:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getThisAccess().getThisAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getThisAccess().getThisKeyword_1());
              		
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
    // $ANTLR end "ruleThis"


    // $ANTLR start "entryRuleBool"
    // InternalBoa.g:1886:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalBoa.g:1886:45: (iv_ruleBool= ruleBool EOF )
            // InternalBoa.g:1887:2: iv_ruleBool= ruleBool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBool; 
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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalBoa.g:1893:1: ruleBool returns [EObject current=null] : ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalBoa.g:1899:2: ( ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) ) )
            // InternalBoa.g:1900:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            {
            // InternalBoa.g:1900:2: ( () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' ) )
            // InternalBoa.g:1901:3: () ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            {
            // InternalBoa.g:1901:3: ()
            // InternalBoa.g:1902:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolAccess().getBoolAction_0(),
              					current);
              			
            }

            }

            // InternalBoa.g:1911:3: ( ( (lv_value_1_0= 'true' ) ) | otherlv_2= 'false' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            else if ( (LA21_0==35) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalBoa.g:1912:4: ( (lv_value_1_0= 'true' ) )
                    {
                    // InternalBoa.g:1912:4: ( (lv_value_1_0= 'true' ) )
                    // InternalBoa.g:1913:5: (lv_value_1_0= 'true' )
                    {
                    // InternalBoa.g:1913:5: (lv_value_1_0= 'true' )
                    // InternalBoa.g:1914:6: lv_value_1_0= 'true'
                    {
                    lv_value_1_0=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getBoolAccess().getValueTrueKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBoolRule());
                      						}
                      						setWithLastConsumed(current, "value", true, "true");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBoa.g:1927:4: otherlv_2= 'false'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getBoolAccess().getFalseKeyword_1_1());
                      			
                    }

                    }
                    break;

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
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleIntz"
    // InternalBoa.g:1936:1: entryRuleIntz returns [EObject current=null] : iv_ruleIntz= ruleIntz EOF ;
    public final EObject entryRuleIntz() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntz = null;


        try {
            // InternalBoa.g:1936:45: (iv_ruleIntz= ruleIntz EOF )
            // InternalBoa.g:1937:2: iv_ruleIntz= ruleIntz EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntzRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIntz=ruleIntz();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntz; 
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
    // $ANTLR end "entryRuleIntz"


    // $ANTLR start "ruleIntz"
    // InternalBoa.g:1943:1: ruleIntz returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleIntz() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalBoa.g:1949:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalBoa.g:1950:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalBoa.g:1950:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalBoa.g:1951:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalBoa.g:1951:3: ()
            // InternalBoa.g:1952:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIntzAccess().getIntAction_0(),
              					current);
              			
            }

            }

            // InternalBoa.g:1961:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalBoa.g:1962:4: (lv_value_1_0= RULE_INT )
            {
            // InternalBoa.g:1962:4: (lv_value_1_0= RULE_INT )
            // InternalBoa.g:1963:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getIntzAccess().getValueINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIntzRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
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
    // $ANTLR end "ruleIntz"


    // $ANTLR start "entryRuleSkip"
    // InternalBoa.g:1983:1: entryRuleSkip returns [EObject current=null] : iv_ruleSkip= ruleSkip EOF ;
    public final EObject entryRuleSkip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkip = null;


        try {
            // InternalBoa.g:1983:45: (iv_ruleSkip= ruleSkip EOF )
            // InternalBoa.g:1984:2: iv_ruleSkip= ruleSkip EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSkipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSkip=ruleSkip();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSkip; 
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
    // $ANTLR end "entryRuleSkip"


    // $ANTLR start "ruleSkip"
    // InternalBoa.g:1990:1: ruleSkip returns [EObject current=null] : ( () otherlv_1= 'skip' ) ;
    public final EObject ruleSkip() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoa.g:1996:2: ( ( () otherlv_1= 'skip' ) )
            // InternalBoa.g:1997:2: ( () otherlv_1= 'skip' )
            {
            // InternalBoa.g:1997:2: ( () otherlv_1= 'skip' )
            // InternalBoa.g:1998:3: () otherlv_1= 'skip'
            {
            // InternalBoa.g:1998:3: ()
            // InternalBoa.g:1999:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSkipAccess().getSkipAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getSkipAccess().getSkipKeyword_1());
              		
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
    // $ANTLR end "ruleSkip"


    // $ANTLR start "entryRuleParens"
    // InternalBoa.g:2016:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // InternalBoa.g:2016:47: (iv_ruleParens= ruleParens EOF )
            // InternalBoa.g:2017:2: iv_ruleParens= ruleParens EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParensRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParens=ruleParens();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParens; 
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
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // InternalBoa.g:2023:1: ruleParens returns [EObject current=null] : (otherlv_0= '(' this_App_1= ruleApp otherlv_2= ')' ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_App_1 = null;



        	enterRule();

        try {
            // InternalBoa.g:2029:2: ( (otherlv_0= '(' this_App_1= ruleApp otherlv_2= ')' ) )
            // InternalBoa.g:2030:2: (otherlv_0= '(' this_App_1= ruleApp otherlv_2= ')' )
            {
            // InternalBoa.g:2030:2: (otherlv_0= '(' this_App_1= ruleApp otherlv_2= ')' )
            // InternalBoa.g:2031:3: otherlv_0= '(' this_App_1= ruleApp otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParensAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParensAccess().getAppParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_25);
            this_App_1=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_App_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParensAccess().getRightParenthesisKeyword_2());
              		
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
    // $ANTLR end "ruleParens"


    // $ANTLR start "entryRuleBObject"
    // InternalBoa.g:2054:1: entryRuleBObject returns [EObject current=null] : iv_ruleBObject= ruleBObject EOF ;
    public final EObject entryRuleBObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBObject = null;


        try {
            // InternalBoa.g:2054:48: (iv_ruleBObject= ruleBObject EOF )
            // InternalBoa.g:2055:2: iv_ruleBObject= ruleBObject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBObjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBObject=ruleBObject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBObject; 
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
    // $ANTLR end "entryRuleBObject"


    // $ANTLR start "ruleBObject"
    // InternalBoa.g:2061:1: ruleBObject returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleBObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_4_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:2067:2: ( ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' ) )
            // InternalBoa.g:2068:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            {
            // InternalBoa.g:2068:2: ( () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}' )
            // InternalBoa.g:2069:3: () otherlv_1= '{' ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )? otherlv_5= '}'
            {
            // InternalBoa.g:2069:3: ()
            // InternalBoa.g:2070:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBObjectAccess().getBObjectAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBObjectAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalBoa.g:2083:3: ( ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBoa.g:2084:4: ( (lv_fields_2_0= ruleField ) ) (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    {
                    // InternalBoa.g:2084:4: ( (lv_fields_2_0= ruleField ) )
                    // InternalBoa.g:2085:5: (lv_fields_2_0= ruleField )
                    {
                    // InternalBoa.g:2085:5: (lv_fields_2_0= ruleField )
                    // InternalBoa.g:2086:6: lv_fields_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBObjectAccess().getFieldsFieldParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_fields_2_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getBObjectRule());
                      						}
                      						add(
                      							current,
                      							"fields",
                      							lv_fields_2_0,
                      							"boa.xtext.Boa.Field");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalBoa.g:2103:4: (otherlv_3= ',' ( (lv_fields_4_0= ruleField ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==40) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalBoa.g:2104:5: otherlv_3= ',' ( (lv_fields_4_0= ruleField ) )
                    	    {
                    	    otherlv_3=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getBObjectAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalBoa.g:2108:5: ( (lv_fields_4_0= ruleField ) )
                    	    // InternalBoa.g:2109:6: (lv_fields_4_0= ruleField )
                    	    {
                    	    // InternalBoa.g:2109:6: (lv_fields_4_0= ruleField )
                    	    // InternalBoa.g:2110:7: lv_fields_4_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getBObjectAccess().getFieldsFieldParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_27);
                    	    lv_fields_4_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getBObjectRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_4_0,
                    	      								"boa.xtext.Boa.Field");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getBObjectAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleBObject"


    // $ANTLR start "entryRuleField"
    // InternalBoa.g:2137:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalBoa.g:2137:46: (iv_ruleField= ruleField EOF )
            // InternalBoa.g:2138:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalBoa.g:2144:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:2150:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) ) )
            // InternalBoa.g:2151:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            {
            // InternalBoa.g:2151:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) ) )
            // InternalBoa.g:2152:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpr ) )
            {
            // InternalBoa.g:2152:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBoa.g:2153:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBoa.g:2153:4: (lv_name_0_0= RULE_ID )
            // InternalBoa.g:2154:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFieldRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalBoa.g:2174:3: ( (lv_value_2_0= ruleExpr ) )
            // InternalBoa.g:2175:4: (lv_value_2_0= ruleExpr )
            {
            // InternalBoa.g:2175:4: (lv_value_2_0= ruleExpr )
            // InternalBoa.g:2176:5: lv_value_2_0= ruleExpr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFieldAccess().getValueExprParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFieldRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"boa.xtext.Boa.Expr");
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleCopy"
    // InternalBoa.g:2197:1: entryRuleCopy returns [EObject current=null] : iv_ruleCopy= ruleCopy EOF ;
    public final EObject entryRuleCopy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCopy = null;


        try {
            // InternalBoa.g:2197:45: (iv_ruleCopy= ruleCopy EOF )
            // InternalBoa.g:2198:2: iv_ruleCopy= ruleCopy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCopyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCopy=ruleCopy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCopy; 
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
    // $ANTLR end "entryRuleCopy"


    // $ANTLR start "ruleCopy"
    // InternalBoa.g:2204:1: ruleCopy returns [EObject current=null] : ( () otherlv_1= 'copy' ( (lv_copy_2_0= ruleApp ) ) ) ;
    public final EObject ruleCopy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_copy_2_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:2210:2: ( ( () otherlv_1= 'copy' ( (lv_copy_2_0= ruleApp ) ) ) )
            // InternalBoa.g:2211:2: ( () otherlv_1= 'copy' ( (lv_copy_2_0= ruleApp ) ) )
            {
            // InternalBoa.g:2211:2: ( () otherlv_1= 'copy' ( (lv_copy_2_0= ruleApp ) ) )
            // InternalBoa.g:2212:3: () otherlv_1= 'copy' ( (lv_copy_2_0= ruleApp ) )
            {
            // InternalBoa.g:2212:3: ()
            // InternalBoa.g:2213:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCopyAccess().getCopyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCopyAccess().getCopyKeyword_1());
              		
            }
            // InternalBoa.g:2226:3: ( (lv_copy_2_0= ruleApp ) )
            // InternalBoa.g:2227:4: (lv_copy_2_0= ruleApp )
            {
            // InternalBoa.g:2227:4: (lv_copy_2_0= ruleApp )
            // InternalBoa.g:2228:5: lv_copy_2_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCopyAccess().getCopyAppParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_copy_2_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCopyRule());
              					}
              					set(
              						current,
              						"copy",
              						lv_copy_2_0,
              						"boa.xtext.Boa.App");
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
    // $ANTLR end "ruleCopy"


    // $ANTLR start "entryRuleLet"
    // InternalBoa.g:2249:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalBoa.g:2249:44: (iv_ruleLet= ruleLet EOF )
            // InternalBoa.g:2250:2: iv_ruleLet= ruleLet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLet; 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalBoa.g:2256:1: ruleLet returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_lhs_4_0= ruleApp ) ) ( ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) ) ) ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_lhs_4_0 = null;

        EObject lv_rhs_6_0 = null;



        	enterRule();

        try {
            // InternalBoa.g:2262:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_lhs_4_0= ruleApp ) ) ( ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) ) ) ) )
            // InternalBoa.g:2263:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_lhs_4_0= ruleApp ) ) ( ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) ) ) )
            {
            // InternalBoa.g:2263:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_lhs_4_0= ruleApp ) ) ( ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) ) ) )
            // InternalBoa.g:2264:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_lhs_4_0= ruleApp ) ) ( ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) ) )
            {
            // InternalBoa.g:2264:3: ()
            // InternalBoa.g:2265:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLetAccess().getLetAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLetAccess().getLetKeyword_1());
              		
            }
            // InternalBoa.g:2278:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBoa.g:2279:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBoa.g:2279:4: (lv_name_2_0= RULE_ID )
            // InternalBoa.g:2280:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLetRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLetAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalBoa.g:2300:3: ( (lv_lhs_4_0= ruleApp ) )
            // InternalBoa.g:2301:4: (lv_lhs_4_0= ruleApp )
            {
            // InternalBoa.g:2301:4: (lv_lhs_4_0= ruleApp )
            // InternalBoa.g:2302:5: lv_lhs_4_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLetAccess().getLhsAppParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_28);
            lv_lhs_4_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLetRule());
              					}
              					set(
              						current,
              						"lhs",
              						lv_lhs_4_0,
              						"boa.xtext.Boa.App");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBoa.g:2319:3: ( ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) ) )
            // InternalBoa.g:2320:4: ( ( 'in' ( ( ruleApp ) ) ) )=> (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) )
            {
            // InternalBoa.g:2329:4: (otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) ) )
            // InternalBoa.g:2330:5: otherlv_5= 'in' ( (lv_rhs_6_0= ruleApp ) )
            {
            otherlv_5=(Token)match(input,43,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getLetAccess().getInKeyword_5_0_0());
              				
            }
            // InternalBoa.g:2334:5: ( (lv_rhs_6_0= ruleApp ) )
            // InternalBoa.g:2335:6: (lv_rhs_6_0= ruleApp )
            {
            // InternalBoa.g:2335:6: (lv_rhs_6_0= ruleApp )
            // InternalBoa.g:2336:7: lv_rhs_6_0= ruleApp
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getLetAccess().getRhsAppParserRuleCall_5_0_1_0());
              						
            }
            pushFollow(FOLLOW_2);
            lv_rhs_6_0=ruleApp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getLetRule());
              							}
              							set(
              								current,
              								"rhs",
              								lv_rhs_6_0,
              								"boa.xtext.Boa.App");
              							afterParserOrEnumRuleCall();
              						
            }

            }


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
    // $ANTLR end "ruleLet"

    // $ANTLR start synpred4_InternalBoa
    public final void synpred4_InternalBoa_fragment() throws RecognitionException {   
        EObject this_Def_0 = null;


        // InternalBoa.g:166:3: (this_Def_0= ruleDef )
        // InternalBoa.g:166:3: this_Def_0= ruleDef
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_Def_0=ruleDef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalBoa

    // $ANTLR start synpred5_InternalBoa
    public final void synpred5_InternalBoa_fragment() throws RecognitionException {   
        EObject lv_apps_1_0 = null;


        // InternalBoa.g:321:4: ( (lv_apps_1_0= ruleNonApp ) )
        // InternalBoa.g:321:4: (lv_apps_1_0= ruleNonApp )
        {
        // InternalBoa.g:321:4: (lv_apps_1_0= ruleNonApp )
        // InternalBoa.g:322:5: lv_apps_1_0= ruleNonApp
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getAppAccess().getAppsNonAppParserRuleCall_1_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_apps_1_0=ruleNonApp();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalBoa

    // $ANTLR start synpred7_InternalBoa
    public final void synpred7_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:398:4: ( ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) ) )
        // InternalBoa.g:398:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) ) ( (lv_rhs_3_0= ruleArithOpMinus ) )
        {
        // InternalBoa.g:398:4: ( ( ( () '+' ) )=> ( () otherlv_2= '+' ) )
        // InternalBoa.g:399:5: ( ( () '+' ) )=> ( () otherlv_2= '+' )
        {
        // InternalBoa.g:405:5: ( () otherlv_2= '+' )
        // InternalBoa.g:406:6: () otherlv_2= '+'
        {
        // InternalBoa.g:406:6: ()
        // InternalBoa.g:407:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,14,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:422:4: ( (lv_rhs_3_0= ruleArithOpMinus ) )
        // InternalBoa.g:423:5: (lv_rhs_3_0= ruleArithOpMinus )
        {
        // InternalBoa.g:423:5: (lv_rhs_3_0= ruleArithOpMinus )
        // InternalBoa.g:424:6: lv_rhs_3_0= ruleArithOpMinus
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithOpPlusAccess().getRhsArithOpMinusParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleArithOpMinus();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalBoa

    // $ANTLR start synpred9_InternalBoa
    public final void synpred9_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:473:4: ( ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) ) )
        // InternalBoa.g:473:4: ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) ) ( (lv_rhs_3_0= ruleArithOpTimes ) )
        {
        // InternalBoa.g:473:4: ( ( ( () '-' ) )=> ( () otherlv_2= '-' ) )
        // InternalBoa.g:474:5: ( ( () '-' ) )=> ( () otherlv_2= '-' )
        {
        // InternalBoa.g:480:5: ( () otherlv_2= '-' )
        // InternalBoa.g:481:6: () otherlv_2= '-'
        {
        // InternalBoa.g:481:6: ()
        // InternalBoa.g:482:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,15,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:497:4: ( (lv_rhs_3_0= ruleArithOpTimes ) )
        // InternalBoa.g:498:5: (lv_rhs_3_0= ruleArithOpTimes )
        {
        // InternalBoa.g:498:5: (lv_rhs_3_0= ruleArithOpTimes )
        // InternalBoa.g:499:6: lv_rhs_3_0= ruleArithOpTimes
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithOpMinusAccess().getRhsArithOpTimesParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleArithOpTimes();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalBoa

    // $ANTLR start synpred11_InternalBoa
    public final void synpred11_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:548:4: ( ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) ) )
        // InternalBoa.g:548:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) ) ( (lv_rhs_3_0= ruleArithOpDivide ) )
        {
        // InternalBoa.g:548:4: ( ( ( () '*' ) )=> ( () otherlv_2= '*' ) )
        // InternalBoa.g:549:5: ( ( () '*' ) )=> ( () otherlv_2= '*' )
        {
        // InternalBoa.g:555:5: ( () otherlv_2= '*' )
        // InternalBoa.g:556:6: () otherlv_2= '*'
        {
        // InternalBoa.g:556:6: ()
        // InternalBoa.g:557:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,16,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:572:4: ( (lv_rhs_3_0= ruleArithOpDivide ) )
        // InternalBoa.g:573:5: (lv_rhs_3_0= ruleArithOpDivide )
        {
        // InternalBoa.g:573:5: (lv_rhs_3_0= ruleArithOpDivide )
        // InternalBoa.g:574:6: lv_rhs_3_0= ruleArithOpDivide
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithOpTimesAccess().getRhsArithOpDivideParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleArithOpDivide();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalBoa

    // $ANTLR start synpred13_InternalBoa
    public final void synpred13_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:623:4: ( ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) ) )
        // InternalBoa.g:623:4: ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) ) ( (lv_rhs_3_0= ruleArithOpRemainder ) )
        {
        // InternalBoa.g:623:4: ( ( ( () '/' ) )=> ( () otherlv_2= '/' ) )
        // InternalBoa.g:624:5: ( ( () '/' ) )=> ( () otherlv_2= '/' )
        {
        // InternalBoa.g:630:5: ( () otherlv_2= '/' )
        // InternalBoa.g:631:6: () otherlv_2= '/'
        {
        // InternalBoa.g:631:6: ()
        // InternalBoa.g:632:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:647:4: ( (lv_rhs_3_0= ruleArithOpRemainder ) )
        // InternalBoa.g:648:5: (lv_rhs_3_0= ruleArithOpRemainder )
        {
        // InternalBoa.g:648:5: (lv_rhs_3_0= ruleArithOpRemainder )
        // InternalBoa.g:649:6: lv_rhs_3_0= ruleArithOpRemainder
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithOpDivideAccess().getRhsArithOpRemainderParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleArithOpRemainder();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalBoa

    // $ANTLR start synpred15_InternalBoa
    public final void synpred15_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:698:4: ( ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) ) )
        // InternalBoa.g:698:4: ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) ) ( (lv_rhs_3_0= ruleBoolOpLess ) )
        {
        // InternalBoa.g:698:4: ( ( ( () '%' ) )=> ( () otherlv_2= '%' ) )
        // InternalBoa.g:699:5: ( ( () '%' ) )=> ( () otherlv_2= '%' )
        {
        // InternalBoa.g:705:5: ( () otherlv_2= '%' )
        // InternalBoa.g:706:6: () otherlv_2= '%'
        {
        // InternalBoa.g:706:6: ()
        // InternalBoa.g:707:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:722:4: ( (lv_rhs_3_0= ruleBoolOpLess ) )
        // InternalBoa.g:723:5: (lv_rhs_3_0= ruleBoolOpLess )
        {
        // InternalBoa.g:723:5: (lv_rhs_3_0= ruleBoolOpLess )
        // InternalBoa.g:724:6: lv_rhs_3_0= ruleBoolOpLess
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getArithOpRemainderAccess().getRhsBoolOpLessParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleBoolOpLess();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15_InternalBoa

    // $ANTLR start synpred17_InternalBoa
    public final void synpred17_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:773:4: ( ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) ) )
        // InternalBoa.g:773:4: ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) ) ( (lv_rhs_3_0= ruleBoolOpEqual ) )
        {
        // InternalBoa.g:773:4: ( ( ( () '<' ) )=> ( () otherlv_2= '<' ) )
        // InternalBoa.g:774:5: ( ( () '<' ) )=> ( () otherlv_2= '<' )
        {
        // InternalBoa.g:780:5: ( () otherlv_2= '<' )
        // InternalBoa.g:781:6: () otherlv_2= '<'
        {
        // InternalBoa.g:781:6: ()
        // InternalBoa.g:782:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,19,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:797:4: ( (lv_rhs_3_0= ruleBoolOpEqual ) )
        // InternalBoa.g:798:5: (lv_rhs_3_0= ruleBoolOpEqual )
        {
        // InternalBoa.g:798:5: (lv_rhs_3_0= ruleBoolOpEqual )
        // InternalBoa.g:799:6: lv_rhs_3_0= ruleBoolOpEqual
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBoolOpLessAccess().getRhsBoolOpEqualParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleBoolOpEqual();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17_InternalBoa

    // $ANTLR start synpred19_InternalBoa
    public final void synpred19_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:848:4: ( ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) ) )
        // InternalBoa.g:848:4: ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) ) ( (lv_rhs_3_0= ruleBoolOpUnequal ) )
        {
        // InternalBoa.g:848:4: ( ( ( () '=' ) )=> ( () otherlv_2= '=' ) )
        // InternalBoa.g:849:5: ( ( () '=' ) )=> ( () otherlv_2= '=' )
        {
        // InternalBoa.g:855:5: ( () otherlv_2= '=' )
        // InternalBoa.g:856:6: () otherlv_2= '='
        {
        // InternalBoa.g:856:6: ()
        // InternalBoa.g:857:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:872:4: ( (lv_rhs_3_0= ruleBoolOpUnequal ) )
        // InternalBoa.g:873:5: (lv_rhs_3_0= ruleBoolOpUnequal )
        {
        // InternalBoa.g:873:5: (lv_rhs_3_0= ruleBoolOpUnequal )
        // InternalBoa.g:874:6: lv_rhs_3_0= ruleBoolOpUnequal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBoolOpEqualAccess().getRhsBoolOpUnequalParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleBoolOpUnequal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalBoa

    // $ANTLR start synpred21_InternalBoa
    public final void synpred21_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:923:4: ( ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) ) )
        // InternalBoa.g:923:4: ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) ) ( (lv_rhs_3_0= ruleBoolOpAnd ) )
        {
        // InternalBoa.g:923:4: ( ( ( () '<>' ) )=> ( () otherlv_2= '<>' ) )
        // InternalBoa.g:924:5: ( ( () '<>' ) )=> ( () otherlv_2= '<>' )
        {
        // InternalBoa.g:930:5: ( () otherlv_2= '<>' )
        // InternalBoa.g:931:6: () otherlv_2= '<>'
        {
        // InternalBoa.g:931:6: ()
        // InternalBoa.g:932:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,20,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:947:4: ( (lv_rhs_3_0= ruleBoolOpAnd ) )
        // InternalBoa.g:948:5: (lv_rhs_3_0= ruleBoolOpAnd )
        {
        // InternalBoa.g:948:5: (lv_rhs_3_0= ruleBoolOpAnd )
        // InternalBoa.g:949:6: lv_rhs_3_0= ruleBoolOpAnd
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBoolOpUnequalAccess().getRhsBoolOpAndParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleBoolOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalBoa

    // $ANTLR start synpred23_InternalBoa
    public final void synpred23_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:998:4: ( ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) ) )
        // InternalBoa.g:998:4: ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) ) ( (lv_rhs_3_0= ruleBoolOpOr ) )
        {
        // InternalBoa.g:998:4: ( ( ( () 'and' ) )=> ( () otherlv_2= 'and' ) )
        // InternalBoa.g:999:5: ( ( () 'and' ) )=> ( () otherlv_2= 'and' )
        {
        // InternalBoa.g:1005:5: ( () otherlv_2= 'and' )
        // InternalBoa.g:1006:6: () otherlv_2= 'and'
        {
        // InternalBoa.g:1006:6: ()
        // InternalBoa.g:1007:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,21,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:1022:4: ( (lv_rhs_3_0= ruleBoolOpOr ) )
        // InternalBoa.g:1023:5: (lv_rhs_3_0= ruleBoolOpOr )
        {
        // InternalBoa.g:1023:5: (lv_rhs_3_0= ruleBoolOpOr )
        // InternalBoa.g:1024:6: lv_rhs_3_0= ruleBoolOpOr
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBoolOpAndAccess().getRhsBoolOpOrParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleBoolOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalBoa

    // $ANTLR start synpred25_InternalBoa
    public final void synpred25_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:1073:4: ( ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) ) )
        // InternalBoa.g:1073:4: ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) ) ( (lv_rhs_3_0= ruleBWith ) )
        {
        // InternalBoa.g:1073:4: ( ( ( () 'or' ) )=> ( () otherlv_2= 'or' ) )
        // InternalBoa.g:1074:5: ( ( () 'or' ) )=> ( () otherlv_2= 'or' )
        {
        // InternalBoa.g:1080:5: ( () otherlv_2= 'or' )
        // InternalBoa.g:1081:6: () otherlv_2= 'or'
        {
        // InternalBoa.g:1081:6: ()
        // InternalBoa.g:1082:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,22,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:1097:4: ( (lv_rhs_3_0= ruleBWith ) )
        // InternalBoa.g:1098:5: (lv_rhs_3_0= ruleBWith )
        {
        // InternalBoa.g:1098:5: (lv_rhs_3_0= ruleBWith )
        // InternalBoa.g:1099:6: lv_rhs_3_0= ruleBWith
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBoolOpOrAccess().getRhsBWithParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleBWith();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalBoa

    // $ANTLR start synpred27_InternalBoa
    public final void synpred27_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:1148:4: ( ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) ) )
        // InternalBoa.g:1148:4: ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) ) ( (lv_rhs_3_0= ruleAssign ) )
        {
        // InternalBoa.g:1148:4: ( ( ( () 'with' ) )=> ( () otherlv_2= 'with' ) )
        // InternalBoa.g:1149:5: ( ( () 'with' ) )=> ( () otherlv_2= 'with' )
        {
        // InternalBoa.g:1155:5: ( () otherlv_2= 'with' )
        // InternalBoa.g:1156:6: () otherlv_2= 'with'
        {
        // InternalBoa.g:1156:6: ()
        // InternalBoa.g:1157:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,23,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:1172:4: ( (lv_rhs_3_0= ruleAssign ) )
        // InternalBoa.g:1173:5: (lv_rhs_3_0= ruleAssign )
        {
        // InternalBoa.g:1173:5: (lv_rhs_3_0= ruleAssign )
        // InternalBoa.g:1174:6: lv_rhs_3_0= ruleAssign
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getBWithAccess().getRhsAssignParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalBoa

    // $ANTLR start synpred29_InternalBoa
    public final void synpred29_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_rhs_3_0 = null;


        // InternalBoa.g:1223:4: ( ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) ) )
        // InternalBoa.g:1223:4: ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) ) ( (lv_rhs_3_0= ruleApp ) )
        {
        // InternalBoa.g:1223:4: ( ( ( () ':=' ) )=> ( () otherlv_2= ':=' ) )
        // InternalBoa.g:1224:5: ( ( () ':=' ) )=> ( () otherlv_2= ':=' )
        {
        // InternalBoa.g:1230:5: ( () otherlv_2= ':=' )
        // InternalBoa.g:1231:6: () otherlv_2= ':='
        {
        // InternalBoa.g:1231:6: ()
        // InternalBoa.g:1232:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,24,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:1247:4: ( (lv_rhs_3_0= ruleApp ) )
        // InternalBoa.g:1248:5: (lv_rhs_3_0= ruleApp )
        {
        // InternalBoa.g:1248:5: (lv_rhs_3_0= ruleApp )
        // InternalBoa.g:1249:6: lv_rhs_3_0= ruleApp
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAssignAccess().getRhsAppParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_rhs_3_0=ruleApp();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29_InternalBoa

    // $ANTLR start synpred31_InternalBoa
    public final void synpred31_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        Token lv_name_3_0=null;

        // InternalBoa.g:1298:4: ( ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) ) )
        // InternalBoa.g:1298:4: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) ) ( (lv_name_3_0= RULE_ID ) )
        {
        // InternalBoa.g:1298:4: ( ( ( () '.' ) )=> ( () otherlv_2= '.' ) )
        // InternalBoa.g:1299:5: ( ( () '.' ) )=> ( () otherlv_2= '.' )
        {
        // InternalBoa.g:1305:5: ( () otherlv_2= '.' )
        // InternalBoa.g:1306:6: () otherlv_2= '.'
        {
        // InternalBoa.g:1306:6: ()
        // InternalBoa.g:1307:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return ;

        }


        }

        // InternalBoa.g:1322:4: ( (lv_name_3_0= RULE_ID ) )
        // InternalBoa.g:1323:5: (lv_name_3_0= RULE_ID )
        {
        // InternalBoa.g:1323:5: (lv_name_3_0= RULE_ID )
        // InternalBoa.g:1324:6: lv_name_3_0= RULE_ID
        {
        lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred31_InternalBoa

    // $ANTLR start synpred33_InternalBoa
    public final void synpred33_InternalBoa_fragment() throws RecognitionException {   
        Token otherlv_2=null;
        EObject lv_lhs_3_0 = null;


        // InternalBoa.g:1372:4: ( ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) ) )
        // InternalBoa.g:1372:4: ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) ) ( (lv_lhs_3_0= ruleNonAppTerminal ) )
        {
        // InternalBoa.g:1372:4: ( ( ( () ';' ) )=> ( () otherlv_2= ';' ) )
        // InternalBoa.g:1373:5: ( ( () ';' ) )=> ( () otherlv_2= ';' )
        {
        // InternalBoa.g:1379:5: ( () otherlv_2= ';' )
        // InternalBoa.g:1380:6: () otherlv_2= ';'
        {
        // InternalBoa.g:1380:6: ()
        // InternalBoa.g:1381:7: 
        {
        if ( state.backtracking==0 ) {

          							/* */
          						
        }

        }

        otherlv_2=(Token)match(input,26,FOLLOW_4); if (state.failed) return ;

        }


        }

        // InternalBoa.g:1396:4: ( (lv_lhs_3_0= ruleNonAppTerminal ) )
        // InternalBoa.g:1397:5: (lv_lhs_3_0= ruleNonAppTerminal )
        {
        // InternalBoa.g:1397:5: (lv_lhs_3_0= ruleNonAppTerminal )
        // InternalBoa.g:1398:6: lv_lhs_3_0= ruleNonAppTerminal
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getSeqAccess().getLhsNonAppTerminalParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_lhs_3_0=ruleNonAppTerminal();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred33_InternalBoa

    // Delegated rules

    public final boolean synpred25_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalBoa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalBoa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\1\0\15\uffff";
    static final String dfa_3s = "\1\52\1\0\15\uffff";
    static final String dfa_4s = "\2\uffff\1\2\13\uffff\1\1";
    static final String dfa_5s = "\1\uffff\1\0\15\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\6\uffff\1\1\16\uffff\1\2\2\uffff\1\2\1\uffff\6\2\1\uffff\1\2\2\uffff\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "165:2: (this_Def_0= ruleDef | this_Expr_1= ruleExpr )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_1 = input.LA(1);

                         
                        int index4_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalBoa()) ) {s = 14;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index4_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\45\uffff";
    static final String dfa_8s = "\1\1\44\uffff";
    static final String dfa_9s = "\1\4\17\uffff\15\0\10\uffff";
    static final String dfa_10s = "\1\53\17\uffff\15\0\10\uffff";
    static final String dfa_11s = "\1\uffff\1\2\42\uffff\1\1";
    static final String dfa_12s = "\20\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\10\uffff}>";
    static final String[] dfa_13s = {
            "\1\20\1\24\5\uffff\1\1\1\34\16\1\1\32\2\1\1\33\1\uffff\1\31\1\21\1\22\1\23\1\25\1\26\1\1\1\27\2\1\1\30\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()+ loopback of 320:3: ( (lv_apps_1_0= ruleNonApp ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_16 = input.LA(1);

                         
                        int index5_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_17 = input.LA(1);

                         
                        int index5_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_17);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_18 = input.LA(1);

                         
                        int index5_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_19 = input.LA(1);

                         
                        int index5_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_20 = input.LA(1);

                         
                        int index5_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_20);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_21 = input.LA(1);

                         
                        int index5_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_21);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_22 = input.LA(1);

                         
                        int index5_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_22);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_23 = input.LA(1);

                         
                        int index5_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_23);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_24 = input.LA(1);

                         
                        int index5_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_24);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_25 = input.LA(1);

                         
                        int index5_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_25);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_26 = input.LA(1);

                         
                        int index5_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_26);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_27 = input.LA(1);

                         
                        int index5_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_27);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_28 = input.LA(1);

                         
                        int index5_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalBoa()) ) {s = 36;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000004BF48001030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000004BF48001032L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});

}
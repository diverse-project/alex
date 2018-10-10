package execboatruffle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

@SuppressWarnings("all")
public interface ExecboatrufflePackage extends EPackage {
  ExecboatrufflePackage eINSTANCE = execboatruffle.impl.ExecboatrufflePackageImpl.init();
  
  String eNS_URI = "http://execboatruffle.execboa.boa/";
  
  String eNAME = "execboatruffle";
  
  String eNS_PREFIX = "execboatruffle";
  
  public static int FILE = 0;
  
  public static int TOP_LEVEL_CMD = 1;
  
  public static int EXPR = 2;
  
  public static int DEF = 3;
  
  public static int APP = 4;
  
  public static int VAR = 5;
  
  public static int THIS = 6;
  
  public static int BOOL = 7;
  
  public static int INT = 8;
  
  public static int SKIP = 9;
  
  public static int PROJECT = 10;
  
  public static int BOBJECT = 11;
  
  public static int FIELD = 12;
  
  public static int COPY = 13;
  
  public static int WITH = 14;
  
  public static int ARITH_OP = 15;
  
  public static int NOT = 16;
  
  public static int CMP_OP = 17;
  
  public static int BOOL_OP = 18;
  
  public static int IF = 19;
  
  public static int LET = 20;
  
  public static int FUN = 21;
  
  public static int ASSIGN = 22;
  
  public static int ARITH_OP_PLUS = 23;
  
  public static int ARITH_OP_MINUS = 24;
  
  public static int ARITH_OP_TIMES = 25;
  
  public static int ARITH_OP_DIVIDE = 26;
  
  public static int ARITH_OP_REMAINDER = 27;
  
  public static int BOOL_OP_AND = 28;
  
  public static int BOOL_OP_OR = 29;
  
  public static int SEQ = 30;
  
  public static int CMP_OP_EQUAL = 31;
  
  public static int CMP_OP_UNEQUAL = 32;
  
  public static int CMP_OP_LESS = 33;
  
  public interface Literals {
    public static EClass FILE = eINSTANCE.getFile();
    
    public static EClass TOPLEVELCMD = eINSTANCE.getTopLevelCmd();
    
    public static EClass EXPR = eINSTANCE.getExpr();
    
    public static EClass DEF = eINSTANCE.getDef();
    
    public static EClass APP = eINSTANCE.getApp();
    
    public static EClass VAR = eINSTANCE.getVar();
    
    public static EClass THIS = eINSTANCE.getThis();
    
    public static EClass BOOL = eINSTANCE.getBool();
    
    public static EClass INT = eINSTANCE.getInt();
    
    public static EClass SKIP = eINSTANCE.getSkip();
    
    public static EClass PROJECT = eINSTANCE.getProject();
    
    public static EClass BOBJECT = eINSTANCE.getBObject();
    
    public static EClass FIELD = eINSTANCE.getField();
    
    public static EClass COPY = eINSTANCE.getCopy();
    
    public static EClass WITH = eINSTANCE.getWith();
    
    public static EClass ARITHOP = eINSTANCE.getArithOp();
    
    public static EClass NOT = eINSTANCE.getNot();
    
    public static EClass CMPOP = eINSTANCE.getCmpOp();
    
    public static EClass BOOLOP = eINSTANCE.getBoolOp();
    
    public static EClass IF = eINSTANCE.getIf();
    
    public static EClass LET = eINSTANCE.getLet();
    
    public static EClass FUN = eINSTANCE.getFun();
    
    public static EClass ASSIGN = eINSTANCE.getAssign();
    
    public static EClass ARITHOPPLUS = eINSTANCE.getArithOpPlus();
    
    public static EClass ARITHOPMINUS = eINSTANCE.getArithOpMinus();
    
    public static EClass ARITHOPTIMES = eINSTANCE.getArithOpTimes();
    
    public static EClass ARITHOPDIVIDE = eINSTANCE.getArithOpDivide();
    
    public static EClass ARITHOPREMAINDER = eINSTANCE.getArithOpRemainder();
    
    public static EClass BOOLOPAND = eINSTANCE.getBoolOpAnd();
    
    public static EClass BOOLOPOR = eINSTANCE.getBoolOpOr();
    
    public static EClass SEQ = eINSTANCE.getSeq();
    
    public static EClass CMPOPEQUAL = eINSTANCE.getCmpOpEqual();
    
    public static EClass CMPOPUNEQUAL = eINSTANCE.getCmpOpUnequal();
    
    public static EClass CMPOPLESS = eINSTANCE.getCmpOpLess();
    
    public static EReference FILE__COMMANDS = eINSTANCE.getFile_Commands();
    
    public static EReference DEF__EXPR = eINSTANCE.getDef_Expr();
    
    public static EReference APP__LHS = eINSTANCE.getApp_Lhs();
    
    public static EReference APP__RHS = eINSTANCE.getApp_Rhs();
    
    public static EReference PROJECT__EXP = eINSTANCE.getProject_Exp();
    
    public static EReference BOBJECT__FIELDS = eINSTANCE.getBobject_Fields();
    
    public static EReference FIELD__VALUE = eINSTANCE.getField_Value();
    
    public static EReference COPY__COPY = eINSTANCE.getCopy_Copy();
    
    public static EReference WITH__LHS = eINSTANCE.getWith_Lhs();
    
    public static EReference WITH__RHS = eINSTANCE.getWith_Rhs();
    
    public static EReference ARITH_OP__LHS = eINSTANCE.getArith_op_Lhs();
    
    public static EReference ARITH_OP__RHS = eINSTANCE.getArith_op_Rhs();
    
    public static EReference NOT__VALUE = eINSTANCE.getNot_Value();
    
    public static EReference CMP_OP__LHS = eINSTANCE.getCmp_op_Lhs();
    
    public static EReference CMP_OP__RHS = eINSTANCE.getCmp_op_Rhs();
    
    public static EReference IF__COND = eINSTANCE.getIf_Cond();
    
    public static EReference IF__THEN = eINSTANCE.getIf_Then();
    
    public static EReference IF__ELS = eINSTANCE.getIf_Els();
    
    public static EReference LET__LHS = eINSTANCE.getLet_Lhs();
    
    public static EReference LET__RHS = eINSTANCE.getLet_Rhs();
    
    public static EReference FUN__BODY = eINSTANCE.getFun_Body();
    
    public static EReference ASSIGN__LHS = eINSTANCE.getAssign_Lhs();
    
    public static EReference ASSIGN__RHS = eINSTANCE.getAssign_Rhs();
    
    public static EReference BOOL_OP_AND__LHS = eINSTANCE.getBool_op_and_Lhs();
    
    public static EReference BOOL_OP_AND__RHS = eINSTANCE.getBool_op_and_Rhs();
    
    public static EReference BOOL_OP_OR__LHS = eINSTANCE.getBool_op_or_Lhs();
    
    public static EReference BOOL_OP_OR__RHS = eINSTANCE.getBool_op_or_Rhs();
    
    public static EReference SEQ__LHS = eINSTANCE.getSeq_Lhs();
    
    public static EReference SEQ__RHS = eINSTANCE.getSeq_Rhs();
    
    public static EAttribute DEF__NAME = eINSTANCE.getDef_Name();
    
    public static EAttribute VAR__NAME = eINSTANCE.getVar_Name();
    
    public static EAttribute BOOL__VALUE = eINSTANCE.getBool_Value();
    
    public static EAttribute INT__VALUE = eINSTANCE.getInt_Value();
    
    public static EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();
    
    public static EAttribute FIELD__NAME = eINSTANCE.getField_Name();
    
    public static EAttribute LET__NAME = eINSTANCE.getLet_Name();
    
    public static EAttribute FUN__NAME = eINSTANCE.getFun_Name();
    
    public static EAttribute ASSIGN__NAME = eINSTANCE.getAssign_Name();
  }
  
  public abstract EClass getFile();
  
  public abstract EClass getTopLevelCmd();
  
  public abstract EClass getExpr();
  
  public abstract EClass getDef();
  
  public abstract EClass getApp();
  
  public abstract EClass getVar();
  
  public abstract EClass getThis();
  
  public abstract EClass getBool();
  
  public abstract EClass getInt();
  
  public abstract EClass getSkip();
  
  public abstract EClass getProject();
  
  public abstract EClass getBObject();
  
  public abstract EClass getField();
  
  public abstract EClass getCopy();
  
  public abstract EClass getWith();
  
  public abstract EClass getArithOp();
  
  public abstract EClass getNot();
  
  public abstract EClass getCmpOp();
  
  public abstract EClass getBoolOp();
  
  public abstract EClass getIf();
  
  public abstract EClass getLet();
  
  public abstract EClass getFun();
  
  public abstract EClass getAssign();
  
  public abstract EClass getArithOpPlus();
  
  public abstract EClass getArithOpMinus();
  
  public abstract EClass getArithOpTimes();
  
  public abstract EClass getArithOpDivide();
  
  public abstract EClass getArithOpRemainder();
  
  public abstract EClass getBoolOpAnd();
  
  public abstract EClass getBoolOpOr();
  
  public abstract EClass getSeq();
  
  public abstract EClass getCmpOpEqual();
  
  public abstract EClass getCmpOpUnequal();
  
  public abstract EClass getCmpOpLess();
  
  public abstract EReference getFile_Commands();
  
  public abstract EReference getDef_Expr();
  
  public abstract EReference getApp_Lhs();
  
  public abstract EReference getApp_Rhs();
  
  public abstract EReference getProject_Exp();
  
  public abstract EReference getBobject_Fields();
  
  public abstract EReference getField_Value();
  
  public abstract EReference getCopy_Copy();
  
  public abstract EReference getWith_Lhs();
  
  public abstract EReference getWith_Rhs();
  
  public abstract EReference getArith_op_Lhs();
  
  public abstract EReference getArith_op_Rhs();
  
  public abstract EReference getNot_Value();
  
  public abstract EReference getCmp_op_Lhs();
  
  public abstract EReference getCmp_op_Rhs();
  
  public abstract EReference getIf_Cond();
  
  public abstract EReference getIf_Then();
  
  public abstract EReference getIf_Els();
  
  public abstract EReference getLet_Lhs();
  
  public abstract EReference getLet_Rhs();
  
  public abstract EReference getFun_Body();
  
  public abstract EReference getAssign_Lhs();
  
  public abstract EReference getAssign_Rhs();
  
  public abstract EReference getBool_op_and_Lhs();
  
  public abstract EReference getBool_op_and_Rhs();
  
  public abstract EReference getBool_op_or_Lhs();
  
  public abstract EReference getBool_op_or_Rhs();
  
  public abstract EReference getSeq_Lhs();
  
  public abstract EReference getSeq_Rhs();
  
  public abstract EAttribute getDef_Name();
  
  public abstract EAttribute getVar_Name();
  
  public abstract EAttribute getBool_Value();
  
  public abstract EAttribute getInt_Value();
  
  public abstract EAttribute getProject_Name();
  
  public abstract EAttribute getField_Name();
  
  public abstract EAttribute getLet_Name();
  
  public abstract EAttribute getFun_Name();
  
  public abstract EAttribute getAssign_Name();
  
  int EXECBOATRUFFLE_FEATURE_COUNT = 0;
  
  int FILE__COMMANDS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int DEF__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int DEF__EXPR = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int APP__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int APP__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int VAR__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int BOOL__VALUE = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int INT__VALUE = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int PROJECT__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int PROJECT__EXP = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int BOBJECT__FIELDS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int FIELD__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int FIELD__VALUE = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int COPY__COPY = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int WITH__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int WITH__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int ARITH_OP__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int ARITH_OP__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int NOT__VALUE = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int CMP_OP__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int CMP_OP__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int IF__COND = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int IF__THEN = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int IF__ELS = EXECBOATRUFFLE_FEATURE_COUNT + 2;
  
  int LET__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int LET__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int LET__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 2;
  
  int FUN__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int FUN__BODY = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int ASSIGN__NAME = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int ASSIGN__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int ASSIGN__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 2;
  
  int BOOL_OP_AND__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int BOOL_OP_AND__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int BOOL_OP_OR__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int BOOL_OP_OR__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
  
  int SEQ__LHS = EXECBOATRUFFLE_FEATURE_COUNT + 0;
  
  int SEQ__RHS = EXECBOATRUFFLE_FEATURE_COUNT + 1;
}

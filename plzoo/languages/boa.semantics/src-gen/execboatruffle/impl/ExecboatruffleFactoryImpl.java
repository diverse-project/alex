package execboatruffle.impl;

import execboatruffle.App;
import execboatruffle.ArithOpDivide;
import execboatruffle.ArithOpMinus;
import execboatruffle.ArithOpPlus;
import execboatruffle.ArithOpRemainder;
import execboatruffle.ArithOpTimes;
import execboatruffle.Assign;
import execboatruffle.BObject;
import execboatruffle.Bool;
import execboatruffle.BoolOpAnd;
import execboatruffle.BoolOpOr;
import execboatruffle.CmpOpEqual;
import execboatruffle.CmpOpLess;
import execboatruffle.CmpOpUnequal;
import execboatruffle.Copy;
import execboatruffle.Def;
import execboatruffle.ExecboatruffleFactory;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.Field;
import execboatruffle.File;
import execboatruffle.Fun;
import execboatruffle.If;
import execboatruffle.Int;
import execboatruffle.Let;
import execboatruffle.Not;
import execboatruffle.Project;
import execboatruffle.Seq;
import execboatruffle.Skip;
import execboatruffle.This;
import execboatruffle.Var;
import execboatruffle.With;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

@SuppressWarnings("all")
public class ExecboatruffleFactoryImpl extends EFactoryImpl implements ExecboatruffleFactory {
  private ExecboatruffleFactoryImpl() {
    super();
  }
  
  public static ExecboatruffleFactory init() {
    try {
    	ExecboatruffleFactory theExecboatruffleFactory = (ExecboatruffleFactory) EPackage.Registry.INSTANCE.getEFactory(execboatruffle.ExecboatrufflePackage.eNS_URI);
    	if (theExecboatruffleFactory != null) {
    		return theExecboatruffleFactory;
    	}
    } catch (Exception exception) {
    	EcorePlugin.INSTANCE.log(exception);
    }
    return new ExecboatruffleFactoryImpl();
  }
  
  public EObject create(final EClass eClass) {
    switch (eClass.getClassifierID()) {
    case ExecboatrufflePackage.FILE:
    	return createFile();
    case ExecboatrufflePackage.DEF:
    	return createDef();
    case ExecboatrufflePackage.APP:
    	return createApp();
    case ExecboatrufflePackage.VAR:
    	return createVar();
    case ExecboatrufflePackage.THIS:
    	return createThis();
    case ExecboatrufflePackage.BOOL:
    	return createBool();
    case ExecboatrufflePackage.INT:
    	return createInt();
    case ExecboatrufflePackage.SKIP:
    	return createSkip();
    case ExecboatrufflePackage.PROJECT:
    	return createProject();
    case ExecboatrufflePackage.BOBJECT:
    	return createBObject();
    case ExecboatrufflePackage.FIELD:
    	return createField();
    case ExecboatrufflePackage.COPY:
    	return createCopy();
    case ExecboatrufflePackage.WITH:
    	return createWith();
    case ExecboatrufflePackage.NOT:
    	return createNot();
    case ExecboatrufflePackage.IF:
    	return createIf();
    case ExecboatrufflePackage.LET:
    	return createLet();
    case ExecboatrufflePackage.FUN:
    	return createFun();
    case ExecboatrufflePackage.ASSIGN:
    	return createAssign();
    case ExecboatrufflePackage.ARITH_OP_PLUS:
    	return createArithOpPlus();
    case ExecboatrufflePackage.ARITH_OP_MINUS:
    	return createArithOpMinus();
    case ExecboatrufflePackage.ARITH_OP_TIMES:
    	return createArithOpTimes();
    case ExecboatrufflePackage.ARITH_OP_DIVIDE:
    	return createArithOpDivide();
    case ExecboatrufflePackage.ARITH_OP_REMAINDER:
    	return createArithOpRemainder();
    case ExecboatrufflePackage.BOOL_OP_AND:
    	return createBoolOpAnd();
    case ExecboatrufflePackage.BOOL_OP_OR:
    	return createBoolOpOr();
    case ExecboatrufflePackage.SEQ:
    	return createSeq();
    case ExecboatrufflePackage.CMP_OP_EQUAL:
    	return createCmpOpEqual();
    case ExecboatrufflePackage.CMP_OP_UNEQUAL:
    	return createCmpOpUnequal();
    case ExecboatrufflePackage.CMP_OP_LESS:
    	return createCmpOpLess();
    default:
    	throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }
  
  public File createFile() {
    execboatruffle.impl.FileImpl ret = new execboatruffle.impl.FileImpl();
    return ret;
  }
  
  public Def createDef() {
    execboatruffle.impl.DefImpl ret = new execboatruffle.impl.DefImpl();
    return ret;
  }
  
  public App createApp() {
    execboatruffle.impl.AppImpl ret = new execboatruffle.impl.AppImpl();
    return ret;
  }
  
  public Var createVar() {
    execboatruffle.impl.VarImpl ret = new execboatruffle.impl.VarImpl();
    return ret;
  }
  
  public This createThis() {
    execboatruffle.impl.ThisImpl ret = new execboatruffle.impl.ThisImpl();
    return ret;
  }
  
  public Bool createBool() {
    execboatruffle.impl.BoolImpl ret = new execboatruffle.impl.BoolImpl();
    return ret;
  }
  
  public Int createInt() {
    execboatruffle.impl.IntImpl ret = new execboatruffle.impl.IntImpl();
    return ret;
  }
  
  public Skip createSkip() {
    execboatruffle.impl.SkipImpl ret = new execboatruffle.impl.SkipImpl();
    return ret;
  }
  
  public Project createProject() {
    execboatruffle.impl.ProjectImpl ret = new execboatruffle.impl.ProjectImpl();
    return ret;
  }
  
  public BObject createBObject() {
    execboatruffle.impl.BObjectImpl ret = new execboatruffle.impl.BObjectImpl();
    return ret;
  }
  
  public Field createField() {
    execboatruffle.impl.FieldImpl ret = new execboatruffle.impl.FieldImpl();
    return ret;
  }
  
  public Copy createCopy() {
    execboatruffle.impl.CopyImpl ret = new execboatruffle.impl.CopyImpl();
    return ret;
  }
  
  public With createWith() {
    execboatruffle.impl.WithImpl ret = new execboatruffle.impl.WithImpl();
    return ret;
  }
  
  public Not createNot() {
    execboatruffle.impl.NotImpl ret = new execboatruffle.impl.NotImpl();
    return ret;
  }
  
  public If createIf() {
    execboatruffle.impl.IfImpl ret = new execboatruffle.impl.IfImpl();
    return ret;
  }
  
  public Let createLet() {
    execboatruffle.impl.LetImpl ret = new execboatruffle.impl.LetImpl();
    return ret;
  }
  
  public Fun createFun() {
    execboatruffle.impl.FunImpl ret = new execboatruffle.impl.FunImpl();
    return ret;
  }
  
  public Assign createAssign() {
    execboatruffle.impl.AssignImpl ret = new execboatruffle.impl.AssignImpl();
    return ret;
  }
  
  public ArithOpPlus createArithOpPlus() {
    execboatruffle.impl.ArithOpPlusImpl ret = new execboatruffle.impl.ArithOpPlusImpl();
    return ret;
  }
  
  public ArithOpMinus createArithOpMinus() {
    execboatruffle.impl.ArithOpMinusImpl ret = new execboatruffle.impl.ArithOpMinusImpl();
    return ret;
  }
  
  public ArithOpTimes createArithOpTimes() {
    execboatruffle.impl.ArithOpTimesImpl ret = new execboatruffle.impl.ArithOpTimesImpl();
    return ret;
  }
  
  public ArithOpDivide createArithOpDivide() {
    execboatruffle.impl.ArithOpDivideImpl ret = new execboatruffle.impl.ArithOpDivideImpl();
    return ret;
  }
  
  public ArithOpRemainder createArithOpRemainder() {
    execboatruffle.impl.ArithOpRemainderImpl ret = new execboatruffle.impl.ArithOpRemainderImpl();
    return ret;
  }
  
  public BoolOpAnd createBoolOpAnd() {
    execboatruffle.impl.BoolOpAndImpl ret = new execboatruffle.impl.BoolOpAndImpl();
    return ret;
  }
  
  public BoolOpOr createBoolOpOr() {
    execboatruffle.impl.BoolOpOrImpl ret = new execboatruffle.impl.BoolOpOrImpl();
    return ret;
  }
  
  public Seq createSeq() {
    execboatruffle.impl.SeqImpl ret = new execboatruffle.impl.SeqImpl();
    return ret;
  }
  
  public CmpOpEqual createCmpOpEqual() {
    execboatruffle.impl.CmpOpEqualImpl ret = new execboatruffle.impl.CmpOpEqualImpl();
    return ret;
  }
  
  public CmpOpUnequal createCmpOpUnequal() {
    execboatruffle.impl.CmpOpUnequalImpl ret = new execboatruffle.impl.CmpOpUnequalImpl();
    return ret;
  }
  
  public CmpOpLess createCmpOpLess() {
    execboatruffle.impl.CmpOpLessImpl ret = new execboatruffle.impl.CmpOpLessImpl();
    return ret;
  }
}

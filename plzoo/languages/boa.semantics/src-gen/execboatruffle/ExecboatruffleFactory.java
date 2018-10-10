package execboatruffle;

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
import org.eclipse.emf.ecore.EFactory;

@SuppressWarnings("all")
public interface ExecboatruffleFactory extends EFactory {
  ExecboatruffleFactory eINSTANCE = execboatruffle.impl.ExecboatruffleFactoryImpl.init();
  
  public abstract File createFile();
  
  public abstract Def createDef();
  
  public abstract App createApp();
  
  public abstract Var createVar();
  
  public abstract This createThis();
  
  public abstract Bool createBool();
  
  public abstract Int createInt();
  
  public abstract Skip createSkip();
  
  public abstract Project createProject();
  
  public abstract BObject createBObject();
  
  public abstract Field createField();
  
  public abstract Copy createCopy();
  
  public abstract With createWith();
  
  public abstract Not createNot();
  
  public abstract If createIf();
  
  public abstract Let createLet();
  
  public abstract Fun createFun();
  
  public abstract Assign createAssign();
  
  public abstract ArithOpPlus createArithOpPlus();
  
  public abstract ArithOpMinus createArithOpMinus();
  
  public abstract ArithOpTimes createArithOpTimes();
  
  public abstract ArithOpDivide createArithOpDivide();
  
  public abstract ArithOpRemainder createArithOpRemainder();
  
  public abstract BoolOpAnd createBoolOpAnd();
  
  public abstract BoolOpOr createBoolOpOr();
  
  public abstract Seq createSeq();
  
  public abstract CmpOpEqual createCmpOpEqual();
  
  public abstract CmpOpUnequal createCmpOpUnequal();
  
  public abstract CmpOpLess createCmpOpLess();
}

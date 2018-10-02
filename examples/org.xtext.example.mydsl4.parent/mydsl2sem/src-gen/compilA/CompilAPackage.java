package compilA;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

@SuppressWarnings("all")
public interface CompilAPackage extends EPackage {
  CompilAPackage eINSTANCE = compilA.impl.CompilAPackageImpl.init();
  
  String eNS_URI = "http://compilA.test.mod/";
  
  String eNAME = "compilA";
  
  String eNS_PREFIX = "compilA";
  
  public static int EXPRESSION = 0;
  
  public static int SUM = 1;
  
  public static int LITERAL = 2;
  
  public static int MUL = 3;
  
  public static int NEG = 4;
  
  public interface Literals {
    public static EClass EXPRESSION = eINSTANCE.getExpression();
    
    public static EClass SUM = eINSTANCE.getSum();
    
    public static EClass LITERAL = eINSTANCE.getLiteral();
    
    public static EClass MUL = eINSTANCE.getMul();
    
    public static EClass NEG = eINSTANCE.getNeg();
    
    public static EReference SUM__LHS = eINSTANCE.getSum_Lhs();
    
    public static EReference SUM__RHS = eINSTANCE.getSum_Rhs();
    
    public static EReference MUL__LHS = eINSTANCE.getMul_Lhs();
    
    public static EReference MUL__RHS = eINSTANCE.getMul_Rhs();
    
    public static EReference NEG__EXP = eINSTANCE.getNeg_Exp();
    
    public static EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();
  }
  
  public abstract EClass getExpression();
  
  public abstract EClass getSum();
  
  public abstract EClass getLiteral();
  
  public abstract EClass getMul();
  
  public abstract EClass getNeg();
  
  public abstract EReference getSum_Lhs();
  
  public abstract EReference getSum_Rhs();
  
  public abstract EReference getMul_Lhs();
  
  public abstract EReference getMul_Rhs();
  
  public abstract EReference getNeg_Exp();
  
  public abstract EAttribute getLiteral_Value();
  
  int COMPILA_FEATURE_COUNT = 0;
  
  int SUM__LHS = COMPILA_FEATURE_COUNT + 0;
  
  int SUM__RHS = COMPILA_FEATURE_COUNT + 1;
  
  int LITERAL__VALUE = COMPILA_FEATURE_COUNT + 0;
  
  int MUL__LHS = COMPILA_FEATURE_COUNT + 0;
  
  int MUL__RHS = COMPILA_FEATURE_COUNT + 1;
  
  int NEG__EXP = COMPILA_FEATURE_COUNT + 0;
}

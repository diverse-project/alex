package compilA.impl;

import compilA.CompilAFactory;
import compilA.CompilAPackage;
import compilA.Literal;
import compilA.Mul;
import compilA.Neg;
import compilA.Sum;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

@SuppressWarnings("all")
public class CompilAFactoryImpl extends EFactoryImpl implements CompilAFactory {
  private CompilAFactoryImpl() {
    super();
  }
  
  public static CompilAFactory init() {
    try {
    	CompilAFactory theCompilAFactory = (CompilAFactory) EPackage.Registry.INSTANCE.getEFactory(compilA.CompilAPackage.eNS_URI);
    	if (theCompilAFactory != null) {
    		return theCompilAFactory;
    	}
    } catch (Exception exception) {
    	EcorePlugin.INSTANCE.log(exception);
    }
    return new CompilAFactoryImpl();
  }
  
  public EObject create(final EClass eClass) {
    switch (eClass.getClassifierID()) {
    case CompilAPackage.SUM:
    	return createSum();
    case CompilAPackage.LITERAL:
    	return createLiteral();
    case CompilAPackage.MUL:
    	return createMul();
    case CompilAPackage.NEG:
    	return createNeg();
    default:
    	throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }
  
  public Sum createSum() {
    compilA.impl.SumImpl ret = new compilA.impl.SumImpl();
    return ret;
  }
  
  public Literal createLiteral() {
    compilA.impl.LiteralImpl ret = new compilA.impl.LiteralImpl();
    return ret;
  }
  
  public Mul createMul() {
    compilA.impl.MulImpl ret = new compilA.impl.MulImpl();
    return ret;
  }
  
  public Neg createNeg() {
    compilA.impl.NegImpl ret = new compilA.impl.NegImpl();
    return ret;
  }
}

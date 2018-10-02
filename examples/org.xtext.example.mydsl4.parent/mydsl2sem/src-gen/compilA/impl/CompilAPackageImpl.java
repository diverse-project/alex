package compilA.impl;

import compilA.CompilAPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

@SuppressWarnings("all")
public class CompilAPackageImpl extends EPackageImpl implements CompilAPackage {
  private static boolean isInited;
  
  private static boolean isCreated;
  
  private static boolean isInitialized;
  
  public static CompilAPackage init() {
    if (isInited)
    	return (compilA.CompilAPackage) EPackage.Registry.INSTANCE.getEPackage(compilA.CompilAPackage.eNS_URI);
    
    // Obtain or create and register package
    Object registeredCompilAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    compilA.impl.CompilAPackageImpl theCompilAPackage = registeredCompilAPackage instanceof compilA.impl.CompilAPackageImpl
    		? (compilA.impl.CompilAPackageImpl) registeredCompilAPackage
    		: new compilA.impl.CompilAPackageImpl();
    
    isInited = true;
    
    // Create package meta-data objects
    theCompilAPackage.createPackageContents();
    
    // Initialize created meta-data
    theCompilAPackage.initializePackageContents();
    
    // Mark meta-data to indicate it can't be changed
    theCompilAPackage.freeze();
    
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(theCompilAPackage.eNS_URI, theCompilAPackage);
    return theCompilAPackage;
  }
  
  public void createPackageContents() {
    if(isCreated) return;
    isCreated = true;
    
    expressionEClass = createEClass(EXPRESSION);
    sumEClass = createEClass(SUM);
    createEReference(sumEClass, SUM__LHS);
    createEReference(sumEClass, SUM__RHS);
    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__VALUE);
    mulEClass = createEClass(MUL);
    createEReference(mulEClass, MUL__LHS);
    createEReference(mulEClass, MUL__RHS);
    negEClass = createEClass(NEG);
    createEReference(negEClass, NEG__EXP);
  }
  
  public void initializePackageContents() {
    if (isInitialized)
    	return;
    isInitialized = true;
    
    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);
    
    // Create type parameters
    
    // Set bounds for type parameters
    
    // Add supertypes to classes
    sumEClass.getESuperTypes().add(this.getExpression());
    literalEClass.getESuperTypes().add(this.getExpression());
    mulEClass.getESuperTypes().add(this.getExpression());
    negEClass.getESuperTypes().add(this.getExpression());
    
    // Initialize classes, features, and operations; add parameters
    initEClass(expressionEClass, compilA.Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEClass(sumEClass, compilA.Sum.class, "Sum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSum_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, compilA.Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getSum_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, compilA.Sum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(literalEClass, compilA.Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_Value(), ecorePackage.getELong(), "value", null, 0, 1, compilA.Literal.class, !IS_TRANSIENT,!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(mulEClass, compilA.Mul.class, "Mul", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMul_Lhs(), this.getExpression(), null, "lhs", null, 1, 1, compilA.Mul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEReference(getMul_Rhs(), this.getExpression(), null, "rhs", null, 1, 1, compilA.Mul.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    initEClass(negEClass, compilA.Neg.class, "Neg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeg_Exp(), this.getExpression(), null, "exp", null, 1, 1, compilA.Neg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);				
    // Create resource
    createResource(eNS_URI);
  }
  
  private EClass expressionEClass = null;
  
  private EClass sumEClass = null;
  
  private EClass literalEClass = null;
  
  private EClass mulEClass = null;
  
  private EClass negEClass = null;
  
  public EClass getExpression() {
    return expressionEClass;
  }
  
  public EClass getSum() {
    return sumEClass;
  }
  
  public EClass getLiteral() {
    return literalEClass;
  }
  
  public EClass getMul() {
    return mulEClass;
  }
  
  public EClass getNeg() {
    return negEClass;
  }
  
  public EReference getSum_Lhs() {
    return (EReference) sumEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getSum_Rhs() {
    return (EReference) sumEClass.getEStructuralFeatures().get(1);
  }
  
  public EAttribute getLiteral_Value() {
    return (EAttribute) literalEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getMul_Lhs() {
    return (EReference) mulEClass.getEStructuralFeatures().get(0);
  }
  
  public EReference getMul_Rhs() {
    return (EReference) mulEClass.getEStructuralFeatures().get(1);
  }
  
  public EReference getNeg_Exp() {
    return (EReference) negEClass.getEStructuralFeatures().get(0);
  }
  
  private CompilAPackageImpl() {
    super(eNS_URI, compilA.CompilAFactory.eINSTANCE);
  }
}

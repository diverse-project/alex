/**
 * generated by Xtext 2.14.0
 */
package fr.inria.diverse.alex.xtext.alex.impl;

import fr.inria.diverse.alex.xtext.alex.AbstractMethod;
import fr.inria.diverse.alex.xtext.alex.AlexClass;
import fr.inria.diverse.alex.xtext.alex.AlexFactory;
import fr.inria.diverse.alex.xtext.alex.AlexImport;
import fr.inria.diverse.alex.xtext.alex.AlexMethod;
import fr.inria.diverse.alex.xtext.alex.AlexPackage;
import fr.inria.diverse.alex.xtext.alex.AlexRoot;
import fr.inria.diverse.alex.xtext.alex.ConcreteMethod;
import fr.inria.diverse.alex.xtext.alex.DefMethod;
import fr.inria.diverse.alex.xtext.alex.EcoreImport;
import fr.inria.diverse.alex.xtext.alex.OverrideMethod;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlexPackageImpl extends EPackageImpl implements AlexPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alexRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ecoreImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alexImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alexClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alexMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass concreteMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass overrideMethodEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.inria.diverse.alex.xtext.alex.AlexPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AlexPackageImpl()
  {
    super(eNS_URI, AlexFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AlexPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AlexPackage init()
  {
    if (isInited) return (AlexPackage)EPackage.Registry.INSTANCE.getEPackage(AlexPackage.eNS_URI);

    // Obtain or create and register package
    AlexPackageImpl theAlexPackage = (AlexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlexPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XbasePackage.eINSTANCE.eClass();
    XtypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theAlexPackage.createPackageContents();

    // Initialize created meta-data
    theAlexPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAlexPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AlexPackage.eNS_URI, theAlexPackage);
    return theAlexPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlexRoot()
  {
    return alexRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlexRoot_Name()
  {
    return (EAttribute)alexRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexRoot_JavaImports()
  {
    return (EReference)alexRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexRoot_EcoreImport()
  {
    return (EReference)alexRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexRoot_AlexImports()
  {
    return (EReference)alexRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexRoot_Classes()
  {
    return (EReference)alexRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEcoreImport()
  {
    return ecoreImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEcoreImport_Uri()
  {
    return (EAttribute)ecoreImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlexImport()
  {
    return alexImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexImport_Ref()
  {
    return (EReference)alexImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlexClass()
  {
    return alexClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlexClass_Abstract()
  {
    return (EAttribute)alexClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlexClass_Name()
  {
    return (EAttribute)alexClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexClass_Methods()
  {
    return (EReference)alexClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlexMethod()
  {
    return alexMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexMethod_Type()
  {
    return (EReference)alexMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlexMethod_Name()
  {
    return (EAttribute)alexMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlexMethod_Params()
  {
    return (EReference)alexMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConcreteMethod()
  {
    return concreteMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConcreteMethod_Block()
  {
    return (EReference)concreteMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractMethod()
  {
    return abstractMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefMethod()
  {
    return defMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOverrideMethod()
  {
    return overrideMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlexFactory getAlexFactory()
  {
    return (AlexFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    alexRootEClass = createEClass(ALEX_ROOT);
    createEAttribute(alexRootEClass, ALEX_ROOT__NAME);
    createEReference(alexRootEClass, ALEX_ROOT__JAVA_IMPORTS);
    createEReference(alexRootEClass, ALEX_ROOT__ECORE_IMPORT);
    createEReference(alexRootEClass, ALEX_ROOT__ALEX_IMPORTS);
    createEReference(alexRootEClass, ALEX_ROOT__CLASSES);

    ecoreImportEClass = createEClass(ECORE_IMPORT);
    createEAttribute(ecoreImportEClass, ECORE_IMPORT__URI);

    alexImportEClass = createEClass(ALEX_IMPORT);
    createEReference(alexImportEClass, ALEX_IMPORT__REF);

    alexClassEClass = createEClass(ALEX_CLASS);
    createEAttribute(alexClassEClass, ALEX_CLASS__ABSTRACT);
    createEAttribute(alexClassEClass, ALEX_CLASS__NAME);
    createEReference(alexClassEClass, ALEX_CLASS__METHODS);

    alexMethodEClass = createEClass(ALEX_METHOD);
    createEReference(alexMethodEClass, ALEX_METHOD__TYPE);
    createEAttribute(alexMethodEClass, ALEX_METHOD__NAME);
    createEReference(alexMethodEClass, ALEX_METHOD__PARAMS);

    concreteMethodEClass = createEClass(CONCRETE_METHOD);
    createEReference(concreteMethodEClass, CONCRETE_METHOD__BLOCK);

    abstractMethodEClass = createEClass(ABSTRACT_METHOD);

    defMethodEClass = createEClass(DEF_METHOD);

    overrideMethodEClass = createEClass(OVERRIDE_METHOD);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    concreteMethodEClass.getESuperTypes().add(this.getAlexMethod());
    abstractMethodEClass.getESuperTypes().add(this.getAlexMethod());
    defMethodEClass.getESuperTypes().add(this.getConcreteMethod());
    overrideMethodEClass.getESuperTypes().add(this.getConcreteMethod());

    // Initialize classes and features; add operations and parameters
    initEClass(alexRootEClass, AlexRoot.class, "AlexRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlexRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, AlexRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlexRoot_JavaImports(), theXtypePackage.getXImportSection(), null, "javaImports", null, 0, 1, AlexRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlexRoot_EcoreImport(), this.getEcoreImport(), null, "ecoreImport", null, 0, 1, AlexRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlexRoot_AlexImports(), this.getAlexImport(), null, "alexImports", null, 0, -1, AlexRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlexRoot_Classes(), this.getAlexClass(), null, "classes", null, 0, -1, AlexRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ecoreImportEClass, EcoreImport.class, "EcoreImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEcoreImport_Uri(), ecorePackage.getEString(), "uri", null, 0, 1, EcoreImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alexImportEClass, AlexImport.class, "AlexImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlexImport_Ref(), this.getAlexRoot(), null, "ref", null, 0, 1, AlexImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alexClassEClass, AlexClass.class, "AlexClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlexClass_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, AlexClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlexClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, AlexClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlexClass_Methods(), this.getAlexMethod(), null, "methods", null, 0, -1, AlexClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alexMethodEClass, AlexMethod.class, "AlexMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlexMethod_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, AlexMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlexMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, AlexMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlexMethod_Params(), theTypesPackage.getJvmFormalParameter(), null, "params", null, 0, -1, AlexMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(concreteMethodEClass, ConcreteMethod.class, "ConcreteMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConcreteMethod_Block(), theXbasePackage.getXExpression(), null, "block", null, 0, 1, ConcreteMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractMethodEClass, AbstractMethod.class, "AbstractMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(defMethodEClass, DefMethod.class, "DefMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(overrideMethodEClass, OverrideMethod.class, "OverrideMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //AlexPackageImpl

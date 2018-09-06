/**
 */
package tel1.model.tel1.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import tel0.model.tel0.Tel0Package;
import tel1.model.tel1.Tel1Factory;
import tel1.model.tel1.Tel1Package;
import tel1.model.tel1.VarLit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Tel1PackageImpl extends EPackageImpl implements Tel1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varLitEClass = null;

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
	 * @see tel1.model.tel1.Tel1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Tel1PackageImpl() {
		super(eNS_URI, Tel1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Tel1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Tel1Package init() {
		if (isInited)
			return (Tel1Package) EPackage.Registry.INSTANCE.getEPackage(Tel1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTel1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Tel1PackageImpl theTel1Package = registeredTel1Package instanceof Tel1PackageImpl
				? (Tel1PackageImpl) registeredTel1Package
				: new Tel1PackageImpl();

		isInited = true;

		// Initialize simple dependencies
		Tel0Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theTel1Package.createPackageContents();

		// Initialize created meta-data
		theTel1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTel1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Tel1Package.eNS_URI, theTel1Package);
		return theTel1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarLit() {
		return varLitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarLit_Name() {
		return (EAttribute) varLitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tel1Factory getTel1Factory() {
		return (Tel1Factory) getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		varLitEClass = createEClass(VAR_LIT);
		createEAttribute(varLitEClass, VAR_LIT__NAME);
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
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Tel0Package theTel0Package = (Tel0Package) EPackage.Registry.INSTANCE.getEPackage(Tel0Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		varLitEClass.getESuperTypes().add(theTel0Package.getExp());

		// Initialize classes, features, and operations; add parameters
		initEClass(varLitEClass, VarLit.class, "VarLit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarLit_Name(), ecorePackage.getEString(), "name", null, 0, 1, VarLit.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Tel1PackageImpl

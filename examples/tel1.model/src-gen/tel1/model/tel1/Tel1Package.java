/**
 */
package tel1.model.tel1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import tel0.model.tel0.Tel0Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tel1.model.tel1.Tel1Factory
 * @model kind="package"
 * @generated
 */
public interface Tel1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tel1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tel1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tel1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tel1Package eINSTANCE = tel1.model.tel1.impl.Tel1PackageImpl.init();

	/**
	 * The meta object id for the '{@link tel1.model.tel1.impl.VarLitImpl <em>Var Lit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tel1.model.tel1.impl.VarLitImpl
	 * @see tel1.model.tel1.impl.Tel1PackageImpl#getVarLit()
	 * @generated
	 */
	int VAR_LIT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIT__NAME = Tel0Package.EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIT_FEATURE_COUNT = Tel0Package.EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var Lit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIT_OPERATION_COUNT = Tel0Package.EXP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link tel1.model.tel1.VarLit <em>Var Lit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Lit</em>'.
	 * @see tel1.model.tel1.VarLit
	 * @generated
	 */
	EClass getVarLit();

	/**
	 * Returns the meta object for the attribute '{@link tel1.model.tel1.VarLit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tel1.model.tel1.VarLit#getName()
	 * @see #getVarLit()
	 * @generated
	 */
	EAttribute getVarLit_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tel1Factory getTel1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tel1.model.tel1.impl.VarLitImpl <em>Var Lit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tel1.model.tel1.impl.VarLitImpl
		 * @see tel1.model.tel1.impl.Tel1PackageImpl#getVarLit()
		 * @generated
		 */
		EClass VAR_LIT = eINSTANCE.getVarLit();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_LIT__NAME = eINSTANCE.getVarLit_Name();

	}

} //Tel1Package

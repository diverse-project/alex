/**
 */
package tel0.model.tel0;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see tel0.model.tel0.Tel0Factory
 * @model kind="package"
 * @generated
 */
public interface Tel0Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tel0";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tel0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tel0";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tel0Package eINSTANCE = tel0.model.tel0.impl.Tel0PackageImpl.init();

	/**
	 * The meta object id for the '{@link tel0.model.tel0.impl.ExpImpl <em>Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tel0.model.tel0.impl.ExpImpl
	 * @see tel0.model.tel0.impl.Tel0PackageImpl#getExp()
	 * @generated
	 */
	int EXP = 0;

	/**
	 * The number of structural features of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tel0.model.tel0.impl.LitValImpl <em>Lit Val</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tel0.model.tel0.impl.LitValImpl
	 * @see tel0.model.tel0.impl.Tel0PackageImpl#getLitVal()
	 * @generated
	 */
	int LIT_VAL = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIT_VAL__VALUE = EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lit Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIT_VAL_FEATURE_COUNT = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lit Val</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIT_VAL_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tel0.model.tel0.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tel0.model.tel0.impl.SumImpl
	 * @see tel0.model.tel0.impl.Tel0PackageImpl#getSum()
	 * @generated
	 */
	int SUM = 2;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__LHS = EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__RHS = EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_OPERATION_COUNT = EXP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link tel0.model.tel0.Exp <em>Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exp</em>'.
	 * @see tel0.model.tel0.Exp
	 * @generated
	 */
	EClass getExp();

	/**
	 * Returns the meta object for class '{@link tel0.model.tel0.LitVal <em>Lit Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lit Val</em>'.
	 * @see tel0.model.tel0.LitVal
	 * @generated
	 */
	EClass getLitVal();

	/**
	 * Returns the meta object for the attribute '{@link tel0.model.tel0.LitVal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see tel0.model.tel0.LitVal#getValue()
	 * @see #getLitVal()
	 * @generated
	 */
	EAttribute getLitVal_Value();

	/**
	 * Returns the meta object for class '{@link tel0.model.tel0.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see tel0.model.tel0.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for the containment reference '{@link tel0.model.tel0.Sum#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see tel0.model.tel0.Sum#getLhs()
	 * @see #getSum()
	 * @generated
	 */
	EReference getSum_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link tel0.model.tel0.Sum#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see tel0.model.tel0.Sum#getRhs()
	 * @see #getSum()
	 * @generated
	 */
	EReference getSum_Rhs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Tel0Factory getTel0Factory();

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
		 * The meta object literal for the '{@link tel0.model.tel0.impl.ExpImpl <em>Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tel0.model.tel0.impl.ExpImpl
		 * @see tel0.model.tel0.impl.Tel0PackageImpl#getExp()
		 * @generated
		 */
		EClass EXP = eINSTANCE.getExp();

		/**
		 * The meta object literal for the '{@link tel0.model.tel0.impl.LitValImpl <em>Lit Val</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tel0.model.tel0.impl.LitValImpl
		 * @see tel0.model.tel0.impl.Tel0PackageImpl#getLitVal()
		 * @generated
		 */
		EClass LIT_VAL = eINSTANCE.getLitVal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIT_VAL__VALUE = eINSTANCE.getLitVal_Value();

		/**
		 * The meta object literal for the '{@link tel0.model.tel0.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tel0.model.tel0.impl.SumImpl
		 * @see tel0.model.tel0.impl.Tel0PackageImpl#getSum()
		 * @generated
		 */
		EClass SUM = eINSTANCE.getSum();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUM__LHS = eINSTANCE.getSum_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUM__RHS = eINSTANCE.getSum_Rhs();

	}

} //Tel0Package

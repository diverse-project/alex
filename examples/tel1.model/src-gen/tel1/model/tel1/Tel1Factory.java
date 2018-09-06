/**
 */
package tel1.model.tel1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tel1.model.tel1.Tel1Package
 * @generated
 */
public interface Tel1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Tel1Factory eINSTANCE = tel1.model.tel1.impl.Tel1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Var Lit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Var Lit</em>'.
	 * @generated
	 */
	VarLit createVarLit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Tel1Package getTel1Package();

} //Tel1Factory

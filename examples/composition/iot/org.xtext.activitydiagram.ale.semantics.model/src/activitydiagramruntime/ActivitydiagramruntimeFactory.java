/**
 */
package activitydiagramruntime;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see activitydiagramruntime.ActivitydiagramruntimePackage
 * @generated
 */
public interface ActivitydiagramruntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivitydiagramruntimeFactory eINSTANCE = activitydiagramruntime.impl.ActivitydiagramruntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Offer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offer</em>'.
	 * @generated
	 */
	Offer createOffer();

	/**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>Control Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Token</em>'.
	 * @generated
	 */
	ControlToken createControlToken();

	/**
	 * Returns a new object of class '<em>Forked Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forked Token</em>'.
	 * @generated
	 */
	ForkedToken createForkedToken();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivitydiagramruntimePackage getActivitydiagramruntimePackage();

} //ActivitydiagramruntimeFactory

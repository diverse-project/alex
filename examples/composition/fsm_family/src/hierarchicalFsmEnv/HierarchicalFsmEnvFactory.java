/**
 */
package hierarchicalFsmEnv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hierarchicalFsmEnv.HierarchicalFsmEnvPackage
 * @generated
 */
public interface HierarchicalFsmEnvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HierarchicalFsmEnvFactory eINSTANCE = hierarchicalFsmEnv.impl.HierarchicalFsmEnvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite State</em>'.
	 * @generated
	 */
	CompositeState createCompositeState();

	/**
	 * Returns a new object of class '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Region</em>'.
	 * @generated
	 */
	Region createRegion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HierarchicalFsmEnvPackage getHierarchicalFsmEnvPackage();

} //HierarchicalFsmEnvFactory

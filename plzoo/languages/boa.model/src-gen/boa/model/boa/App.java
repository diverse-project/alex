/**
 */
package boa.model.boa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.App#getApps <em>Apps</em>}</li>
 * </ul>
 *
 * @see boa.model.boa.BoaPackage#getApp()
 * @model
 * @generated
 */
public interface App extends Expr {
	/**
	 * Returns the value of the '<em><b>Apps</b></em>' containment reference list.
	 * The list contents are of type {@link boa.model.boa.Expr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apps</em>' containment reference list.
	 * @see boa.model.boa.BoaPackage#getApp_Apps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Expr> getApps();

} // App

/**
 */
package boa.model.boa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.Project#getVars <em>Vars</em>}</li>
 * </ul>
 *
 * @see boa.model.boa.BoaPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends Expr {
	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link boa.model.boa.Var}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see boa.model.boa.BoaPackage#getProject_Vars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Var> getVars();

} // Project

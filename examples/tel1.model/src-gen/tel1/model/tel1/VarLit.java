/**
 */
package tel1.model.tel1;

import tel0.model.tel0.Exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tel1.model.tel1.VarLit#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tel1.model.tel1.Tel1Package#getVarLit()
 * @model
 * @generated
 */
public interface VarLit extends Exp {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tel1.model.tel1.Tel1Package#getVarLit_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tel1.model.tel1.VarLit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // VarLit

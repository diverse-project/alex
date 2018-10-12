/**
 */
package boa.model.boa;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.If#getCond <em>Cond</em>}</li>
 *   <li>{@link boa.model.boa.If#getThen <em>Then</em>}</li>
 *   <li>{@link boa.model.boa.If#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @see boa.model.boa.BoaPackage#getIf()
 * @model
 * @generated
 */
public interface If extends Expr {
	/**
	 * Returns the value of the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cond</em>' containment reference.
	 * @see #setCond(Expr)
	 * @see boa.model.boa.BoaPackage#getIf_Cond()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getCond();

	/**
	 * Sets the value of the '{@link boa.model.boa.If#getCond <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cond</em>' containment reference.
	 * @see #getCond()
	 * @generated
	 */
	void setCond(Expr value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Expr)
	 * @see boa.model.boa.BoaPackage#getIf_Then()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getThen();

	/**
	 * Sets the value of the '{@link boa.model.boa.If#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Expr value);

	/**
	 * Returns the value of the '<em><b>Els</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Els</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Els</em>' containment reference.
	 * @see #setEls(Expr)
	 * @see boa.model.boa.BoaPackage#getIf_Els()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getEls();

	/**
	 * Sets the value of the '{@link boa.model.boa.If#getEls <em>Els</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Els</em>' containment reference.
	 * @see #getEls()
	 * @generated
	 */
	void setEls(Expr value);

} // If
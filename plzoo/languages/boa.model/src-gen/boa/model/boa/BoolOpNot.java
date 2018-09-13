/**
 */
package boa.model.boa;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bool Op Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.BoolOpNot#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @see boa.model.boa.BoaPackage#getBoolOpNot()
 * @model
 * @generated
 */
public interface BoolOpNot extends BoolOp {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' containment reference.
	 * @see #setExpr(Expr)
	 * @see boa.model.boa.BoaPackage#getBoolOpNot_Expr()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expr getExpr();

	/**
	 * Sets the value of the '{@link boa.model.boa.BoolOpNot#getExpr <em>Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' containment reference.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(Expr value);

} // BoolOpNot

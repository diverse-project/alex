/**
 */
package tel0.model.tel0;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tel0.model.tel0.Sum#getLhs <em>Lhs</em>}</li>
 *   <li>{@link tel0.model.tel0.Sum#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see tel0.model.tel0.Tel0Package#getSum()
 * @model
 * @generated
 */
public interface Sum extends Exp {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Exp)
	 * @see tel0.model.tel0.Tel0Package#getSum_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getLhs();

	/**
	 * Sets the value of the '{@link tel0.model.tel0.Sum#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Exp value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Exp)
	 * @see tel0.model.tel0.Tel0Package#getSum_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Exp getRhs();

	/**
	 * Sets the value of the '{@link tel0.model.tel0.Sum#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Exp value);

} // Sum

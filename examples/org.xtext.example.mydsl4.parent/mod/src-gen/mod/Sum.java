/**
 */
package mod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mod.Sum#getLhs <em>Lhs</em>}</li>
 *   <li>{@link mod.Sum#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see mod.ModPackage#getSum()
 * @model
 * @generated
 */
public interface Sum extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see mod.ModPackage#getSum_Lhs()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see mod.ModPackage#getSum_Rhs()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	Expression getRhs();

} // Sum

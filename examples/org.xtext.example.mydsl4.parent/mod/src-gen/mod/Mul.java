/**
 */
package mod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mod.Mul#getLhs <em>Lhs</em>}</li>
 *   <li>{@link mod.Mul#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see mod.ModPackage#getMul()
 * @model
 * @generated
 */
public interface Mul extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see mod.ModPackage#getMul_Lhs()
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
	 * @see mod.ModPackage#getMul_Rhs()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	Expression getRhs();

} // Mul

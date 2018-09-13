/**
 */
package calc.calc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calc.calc.Negate#getV <em>V</em>}</li>
 * </ul>
 *
 * @see calc.calc.CalcPackage#getNegate()
 * @model
 * @generated
 */
public interface Negate extends Expression {
	/**
	 * Returns the value of the '<em><b>V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' containment reference.
	 * @see #setV(Expression)
	 * @see calc.calc.CalcPackage#getNegate_V()
	 * @model containment="true"
	 * @generated
	 */
	Expression getV();

	/**
	 * Sets the value of the '{@link calc.calc.Negate#getV <em>V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' containment reference.
	 * @see #getV()
	 * @generated
	 */
	void setV(Expression value);

} // Negate

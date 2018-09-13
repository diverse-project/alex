/**
 */
package calc.calc;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link calc.calc.Numeral#getN <em>N</em>}</li>
 * </ul>
 *
 * @see calc.calc.CalcPackage#getNumeral()
 * @model
 * @generated
 */
public interface Numeral extends Expression {
	/**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(int)
	 * @see calc.calc.CalcPackage#getNumeral_N()
	 * @model
	 * @generated
	 */
	int getN();

	/**
	 * Sets the value of the '{@link calc.calc.Numeral#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
	void setN(int value);

} // Numeral

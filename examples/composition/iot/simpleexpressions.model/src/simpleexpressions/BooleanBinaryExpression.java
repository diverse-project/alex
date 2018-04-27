/**
 */
package simpleexpressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simpleexpressions.BooleanBinaryExpression#getOperand1 <em>Operand1</em>}</li>
 *   <li>{@link simpleexpressions.BooleanBinaryExpression#getOperand2 <em>Operand2</em>}</li>
 *   <li>{@link simpleexpressions.BooleanBinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see simpleexpressions.SimpleexpressionsPackage#getBooleanBinaryExpression()
 * @model
 * @generated
 */
public interface BooleanBinaryExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Operand1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand1</em>' reference.
	 * @see #setOperand1(BooleanVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getBooleanBinaryExpression_Operand1()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getOperand1();

	/**
	 * Sets the value of the '{@link simpleexpressions.BooleanBinaryExpression#getOperand1 <em>Operand1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand1</em>' reference.
	 * @see #getOperand1()
	 * @generated
	 */
	void setOperand1(BooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operand2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand2</em>' reference.
	 * @see #setOperand2(BooleanVariable)
	 * @see simpleexpressions.SimpleexpressionsPackage#getBooleanBinaryExpression_Operand2()
	 * @model required="true"
	 * @generated
	 */
	BooleanVariable getOperand2();

	/**
	 * Sets the value of the '{@link simpleexpressions.BooleanBinaryExpression#getOperand2 <em>Operand2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand2</em>' reference.
	 * @see #getOperand2()
	 * @generated
	 */
	void setOperand2(BooleanVariable value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link simpleexpressions.BooleanBinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.BooleanBinaryOperator
	 * @see #setOperator(BooleanBinaryOperator)
	 * @see simpleexpressions.SimpleexpressionsPackage#getBooleanBinaryExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	BooleanBinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link simpleexpressions.BooleanBinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see simpleexpressions.BooleanBinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BooleanBinaryOperator value);

} // BooleanBinaryExpression
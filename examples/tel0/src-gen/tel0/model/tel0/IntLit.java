/**
 */
package tel0.model.tel0;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Int Lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tel0.model.tel0.IntLit#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tel0.model.tel0.Tel0Package#getIntLit()
 * @model
 * @generated
 */
public interface IntLit extends Exp {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see tel0.model.tel0.Tel0Package#getIntLit_Value()
	 * @model
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link tel0.model.tel0.IntLit#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

} // IntLit

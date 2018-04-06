/**
 */
package ale2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale2.B#getRb <em>Rb</em>}</li>
 * </ul>
 *
 * @see ale2.Ale2Package#getB()
 * @model
 * @generated
 */
public interface B extends EObject {
	/**
	 * Returns the value of the '<em><b>Rb</b></em>' containment reference list.
	 * The list contents are of type {@link ale2.RB}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rb</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rb</em>' containment reference list.
	 * @see ale2.Ale2Package#getB_Rb()
	 * @model containment="true"
	 * @generated
	 */
	EList<RB> getRb();

} // B

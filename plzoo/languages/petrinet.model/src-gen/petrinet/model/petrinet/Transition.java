/**
 */
package petrinet.model.petrinet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.model.petrinet.Transition#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link petrinet.model.petrinet.Transition#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @see petrinet.model.petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Node {
	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' attribute.
	 * @see #setMinTime(int)
	 * @see petrinet.model.petrinet.PetrinetPackage#getTransition_MinTime()
	 * @model
	 * @generated
	 */
	int getMinTime();

	/**
	 * Sets the value of the '{@link petrinet.model.petrinet.Transition#getMinTime <em>Min Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' attribute.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(int value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' attribute.
	 * @see #setMaxTime(int)
	 * @see petrinet.model.petrinet.PetrinetPackage#getTransition_MaxTime()
	 * @model
	 * @generated
	 */
	int getMaxTime();

	/**
	 * Sets the value of the '{@link petrinet.model.petrinet.Transition#getMaxTime <em>Max Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' attribute.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(int value);

} // Transition

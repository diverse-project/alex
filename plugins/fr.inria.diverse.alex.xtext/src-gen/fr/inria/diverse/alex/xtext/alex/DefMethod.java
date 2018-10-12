/**
 * generated by Xtext 2.14.0
 */
package fr.inria.diverse.alex.xtext.alex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Def Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.alex.xtext.alex.DefMethod#isDispatch <em>Dispatch</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.alex.xtext.alex.AlexPackage#getDefMethod()
 * @model
 * @generated
 */
public interface DefMethod extends ConcreteMethod
{
  /**
   * Returns the value of the '<em><b>Dispatch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dispatch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dispatch</em>' attribute.
   * @see #setDispatch(boolean)
   * @see fr.inria.diverse.alex.xtext.alex.AlexPackage#getDefMethod_Dispatch()
   * @model
   * @generated
   */
  boolean isDispatch();

  /**
   * Sets the value of the '{@link fr.inria.diverse.alex.xtext.alex.DefMethod#isDispatch <em>Dispatch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dispatch</em>' attribute.
   * @see #isDispatch()
   * @generated
   */
  void setDispatch(boolean value);

} // DefMethod
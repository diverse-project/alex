/**
 * generated by Xtext 2.10.0
 */
package ale.xtext.ale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ale.xtext.ale.Root#getName <em>Name</em>}</li>
 *   <li>{@link ale.xtext.ale.Root#getImportsEcore <em>Imports Ecore</em>}</li>
 *   <li>{@link ale.xtext.ale.Root#getImportsAle <em>Imports Ale</em>}</li>
 *   <li>{@link ale.xtext.ale.Root#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ale.xtext.ale.AlePackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ale.xtext.ale.AlePackage#getRoot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ale.xtext.ale.Root#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports Ecore</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.ImportEcore}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports Ecore</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports Ecore</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getRoot_ImportsEcore()
   * @model containment="true"
   * @generated
   */
  EList<ImportEcore> getImportsEcore();

  /**
   * Returns the value of the '<em><b>Imports Ale</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.ImportAle}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports Ale</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports Ale</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getRoot_ImportsAle()
   * @model containment="true"
   * @generated
   */
  EList<ImportAle> getImportsAle();

  /**
   * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
   * The list contents are of type {@link ale.xtext.ale.AleClass}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classes</em>' containment reference list.
   * @see ale.xtext.ale.AlePackage#getRoot_Classes()
   * @model containment="true"
   * @generated
   */
  EList<AleClass> getClasses();

} // Root

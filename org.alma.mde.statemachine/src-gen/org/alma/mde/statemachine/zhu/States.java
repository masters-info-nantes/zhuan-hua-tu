/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.States#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStates()
 * @model
 * @generated
 */
public interface States extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference.
   * @see #setStates(StatesSeparated)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStates_States()
   * @model containment="true"
   * @generated
   */
  StatesSeparated getStates();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.States#getStates <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>States</em>' containment reference.
   * @see #getStates()
   * @generated
   */
  void setStates(StatesSeparated value);

} // States

/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.StateMachine#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Region</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Region</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Region</em>' containment reference.
   * @see #setRegion(TopRegion)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStateMachine_Region()
   * @model containment="true"
   * @generated
   */
  TopRegion getRegion();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.StateMachine#getRegion <em>Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Region</em>' containment reference.
   * @see #getRegion()
   * @generated
   */
  void setRegion(TopRegion value);

} // StateMachine

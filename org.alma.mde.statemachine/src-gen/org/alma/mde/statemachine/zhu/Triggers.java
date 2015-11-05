/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.Triggers#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTriggers()
 * @model
 * @generated
 */
public interface Triggers extends EObject
{
  /**
   * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggers</em>' containment reference.
   * @see #setTriggers(TriggersSeparated)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTriggers_Triggers()
   * @model containment="true"
   * @generated
   */
  TriggersSeparated getTriggers();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Triggers#getTriggers <em>Triggers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triggers</em>' containment reference.
   * @see #getTriggers()
   * @generated
   */
  void setTriggers(TriggersSeparated value);

} // Triggers

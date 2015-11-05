/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triggers Separated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.TriggersSeparated#getFirstTrigger <em>First Trigger</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.TriggersSeparated#getFollowingTriggers <em>Following Triggers</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTriggersSeparated()
 * @model
 * @generated
 */
public interface TriggersSeparated extends EObject
{
  /**
   * Returns the value of the '<em><b>First Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Trigger</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Trigger</em>' attribute.
   * @see #setFirstTrigger(String)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTriggersSeparated_FirstTrigger()
   * @model
   * @generated
   */
  String getFirstTrigger();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.TriggersSeparated#getFirstTrigger <em>First Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Trigger</em>' attribute.
   * @see #getFirstTrigger()
   * @generated
   */
  void setFirstTrigger(String value);

  /**
   * Returns the value of the '<em><b>Following Triggers</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Following Triggers</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Following Triggers</em>' attribute list.
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTriggersSeparated_FollowingTriggers()
   * @model unique="false"
   * @generated
   */
  EList<String> getFollowingTriggers();

} // TriggersSeparated

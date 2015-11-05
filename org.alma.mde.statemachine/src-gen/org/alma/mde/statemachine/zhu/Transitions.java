/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transitions#getFirstTransition <em>First Transition</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transitions#getFollowingTransitions <em>Following Transitions</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransitions()
 * @model
 * @generated
 */
public interface Transitions extends EObject
{
  /**
   * Returns the value of the '<em><b>First Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Transition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Transition</em>' containment reference.
   * @see #setFirstTransition(Transition)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransitions_FirstTransition()
   * @model containment="true"
   * @generated
   */
  Transition getFirstTransition();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Transitions#getFirstTransition <em>First Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Transition</em>' containment reference.
   * @see #getFirstTransition()
   * @generated
   */
  void setFirstTransition(Transition value);

  /**
   * Returns the value of the '<em><b>Following Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.alma.mde.statemachine.zhu.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Following Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Following Transitions</em>' containment reference list.
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransitions_FollowingTransitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getFollowingTransitions();

} // Transitions

/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>States Separated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.StatesSeparated#getFirstState <em>First State</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.StatesSeparated#getFollowingStates <em>Following States</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStatesSeparated()
 * @model
 * @generated
 */
public interface StatesSeparated extends EObject
{
  /**
   * Returns the value of the '<em><b>First State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First State</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First State</em>' containment reference.
   * @see #setFirstState(State)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStatesSeparated_FirstState()
   * @model containment="true"
   * @generated
   */
  State getFirstState();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.StatesSeparated#getFirstState <em>First State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First State</em>' containment reference.
   * @see #getFirstState()
   * @generated
   */
  void setFirstState(State value);

  /**
   * Returns the value of the '<em><b>Following States</b></em>' containment reference list.
   * The list contents are of type {@link org.alma.mde.statemachine.zhu.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Following States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Following States</em>' containment reference list.
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getStatesSeparated_FollowingStates()
   * @model containment="true"
   * @generated
   */
  EList<State> getFollowingStates();

} // StatesSeparated

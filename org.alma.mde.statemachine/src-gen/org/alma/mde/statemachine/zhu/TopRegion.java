/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.TopRegion#getStates <em>States</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.TopRegion#getRegions <em>Regions</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.TopRegion#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTopRegion()
 * @model
 * @generated
 */
public interface TopRegion extends EObject
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
   * @see #setStates(States)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTopRegion_States()
   * @model containment="true"
   * @generated
   */
  States getStates();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.TopRegion#getStates <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>States</em>' containment reference.
   * @see #getStates()
   * @generated
   */
  void setStates(States value);

  /**
   * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
   * The list contents are of type {@link org.alma.mde.statemachine.zhu.Region}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Regions</em>' containment reference list.
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTopRegion_Regions()
   * @model containment="true"
   * @generated
   */
  EList<Region> getRegions();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference.
   * @see #setTransitions(Transitions)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTopRegion_Transitions()
   * @model containment="true"
   * @generated
   */
  Transitions getTransitions();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.TopRegion#getTransitions <em>Transitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transitions</em>' containment reference.
   * @see #getTransitions()
   * @generated
   */
  void setTransitions(Transitions value);

} // TopRegion

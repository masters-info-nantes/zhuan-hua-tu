/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transition#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.Transition#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(State)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransition_Source()
   * @model
   * @generated
   */
  State getSource();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Transition#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(State value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransition_Target()
   * @model
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

  /**
   * Returns the value of the '<em><b>Triggers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggers</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggers</em>' containment reference.
   * @see #setTriggers(Triggers)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransition_Triggers()
   * @model containment="true"
   * @generated
   */
  Triggers getTriggers();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Transition#getTriggers <em>Triggers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Triggers</em>' containment reference.
   * @see #getTriggers()
   * @generated
   */
  void setTriggers(Triggers value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' attribute.
   * @see #setGuard(String)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransition_Guard()
   * @model
   * @generated
   */
  String getGuard();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Transition#getGuard <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' attribute.
   * @see #getGuard()
   * @generated
   */
  void setGuard(String value);

  /**
   * Returns the value of the '<em><b>Behaviour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviour</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour</em>' attribute.
   * @see #setBehaviour(String)
   * @see org.alma.mde.statemachine.zhu.ZhuPackage#getTransition_Behaviour()
   * @model
   * @generated
   */
  String getBehaviour();

  /**
   * Sets the value of the '{@link org.alma.mde.statemachine.zhu.Transition#getBehaviour <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour</em>' attribute.
   * @see #getBehaviour()
   * @generated
   */
  void setBehaviour(String value);

} // Transition

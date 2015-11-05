/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.alma.mde.statemachine.zhu.ZhuPackage
 * @generated
 */
public interface ZhuFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ZhuFactory eINSTANCE = org.alma.mde.statemachine.zhu.impl.ZhuFactoryImpl.init();

  /**
   * Returns a new object of class '<em>State Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State Machine</em>'.
   * @generated
   */
  StateMachine createStateMachine();

  /**
   * Returns a new object of class '<em>Top Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Region</em>'.
   * @generated
   */
  TopRegion createTopRegion();

  /**
   * Returns a new object of class '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Region</em>'.
   * @generated
   */
  Region createRegion();

  /**
   * Returns a new object of class '<em>Transitions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transitions</em>'.
   * @generated
   */
  Transitions createTransitions();

  /**
   * Returns a new object of class '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transition</em>'.
   * @generated
   */
  Transition createTransition();

  /**
   * Returns a new object of class '<em>States</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>States</em>'.
   * @generated
   */
  States createStates();

  /**
   * Returns a new object of class '<em>States Separated</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>States Separated</em>'.
   * @generated
   */
  StatesSeparated createStatesSeparated();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Triggers</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triggers</em>'.
   * @generated
   */
  Triggers createTriggers();

  /**
   * Returns a new object of class '<em>Triggers Separated</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Triggers Separated</em>'.
   * @generated
   */
  TriggersSeparated createTriggersSeparated();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ZhuPackage getZhuPackage();

} //ZhuFactory

/**
 */
package org.alma.mde.statemachine.zhu;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.alma.mde.statemachine.zhu.ZhuFactory
 * @model kind="package"
 * @generated
 */
public interface ZhuPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "zhu";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.alma.org/mde/statemachine/Zhu";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "zhu";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ZhuPackage eINSTANCE = org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl.init();

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.StateMachineImpl <em>State Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.StateMachineImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getStateMachine()
   * @generated
   */
  int STATE_MACHINE = 0;

  /**
   * The feature id for the '<em><b>Region</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE__REGION = 0;

  /**
   * The number of structural features of the '<em>State Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_MACHINE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.TopRegionImpl <em>Top Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.TopRegionImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTopRegion()
   * @generated
   */
  int TOP_REGION = 1;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_REGION__STATES = 0;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_REGION__REGIONS = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_REGION__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>Top Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOP_REGION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.RegionImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getRegion()
   * @generated
   */
  int REGION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__NAME = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__STATES = 1;

  /**
   * The feature id for the '<em><b>Regions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__REGIONS = 2;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__TRANSITIONS = 3;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.TransitionsImpl <em>Transitions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.TransitionsImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTransitions()
   * @generated
   */
  int TRANSITIONS = 3;

  /**
   * The feature id for the '<em><b>First Transition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__FIRST_TRANSITION = 0;

  /**
   * The feature id for the '<em><b>Following Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS__FOLLOWING_TRANSITIONS = 1;

  /**
   * The number of structural features of the '<em>Transitions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.TransitionImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = 1;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRIGGERS = 2;

  /**
   * The feature id for the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = 3;

  /**
   * The feature id for the '<em><b>Behaviour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__BEHAVIOUR = 4;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.StatesImpl <em>States</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.StatesImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getStates()
   * @generated
   */
  int STATES = 5;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES__STATES = 0;

  /**
   * The number of structural features of the '<em>States</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.StatesSeparatedImpl <em>States Separated</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.StatesSeparatedImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getStatesSeparated()
   * @generated
   */
  int STATES_SEPARATED = 6;

  /**
   * The feature id for the '<em><b>First State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_SEPARATED__FIRST_STATE = 0;

  /**
   * The feature id for the '<em><b>Following States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_SEPARATED__FOLLOWING_STATES = 1;

  /**
   * The number of structural features of the '<em>States Separated</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATES_SEPARATED_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.StateImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getState()
   * @generated
   */
  int STATE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.TriggersImpl <em>Triggers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.TriggersImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTriggers()
   * @generated
   */
  int TRIGGERS = 8;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERS__TRIGGERS = 0;

  /**
   * The number of structural features of the '<em>Triggers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.alma.mde.statemachine.zhu.impl.TriggersSeparatedImpl <em>Triggers Separated</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.alma.mde.statemachine.zhu.impl.TriggersSeparatedImpl
   * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTriggersSeparated()
   * @generated
   */
  int TRIGGERS_SEPARATED = 9;

  /**
   * The feature id for the '<em><b>First Trigger</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERS_SEPARATED__FIRST_TRIGGER = 0;

  /**
   * The feature id for the '<em><b>Following Triggers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS = 1;

  /**
   * The number of structural features of the '<em>Triggers Separated</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGERS_SEPARATED_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Machine</em>'.
   * @see org.alma.mde.statemachine.zhu.StateMachine
   * @generated
   */
  EClass getStateMachine();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.StateMachine#getRegion <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Region</em>'.
   * @see org.alma.mde.statemachine.zhu.StateMachine#getRegion()
   * @see #getStateMachine()
   * @generated
   */
  EReference getStateMachine_Region();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.TopRegion <em>Top Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Top Region</em>'.
   * @see org.alma.mde.statemachine.zhu.TopRegion
   * @generated
   */
  EClass getTopRegion();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.TopRegion#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States</em>'.
   * @see org.alma.mde.statemachine.zhu.TopRegion#getStates()
   * @see #getTopRegion()
   * @generated
   */
  EReference getTopRegion_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.alma.mde.statemachine.zhu.TopRegion#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see org.alma.mde.statemachine.zhu.TopRegion#getRegions()
   * @see #getTopRegion()
   * @generated
   */
  EReference getTopRegion_Regions();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.TopRegion#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transitions</em>'.
   * @see org.alma.mde.statemachine.zhu.TopRegion#getTransitions()
   * @see #getTopRegion()
   * @generated
   */
  EReference getTopRegion_Transitions();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see org.alma.mde.statemachine.zhu.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for the attribute '{@link org.alma.mde.statemachine.zhu.Region#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.alma.mde.statemachine.zhu.Region#getName()
   * @see #getRegion()
   * @generated
   */
  EAttribute getRegion_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.Region#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States</em>'.
   * @see org.alma.mde.statemachine.zhu.Region#getStates()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_States();

  /**
   * Returns the meta object for the containment reference list '{@link org.alma.mde.statemachine.zhu.Region#getRegions <em>Regions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Regions</em>'.
   * @see org.alma.mde.statemachine.zhu.Region#getRegions()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Regions();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.Region#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Transitions</em>'.
   * @see org.alma.mde.statemachine.zhu.Region#getTransitions()
   * @see #getRegion()
   * @generated
   */
  EReference getRegion_Transitions();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.Transitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitions</em>'.
   * @see org.alma.mde.statemachine.zhu.Transitions
   * @generated
   */
  EClass getTransitions();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.Transitions#getFirstTransition <em>First Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First Transition</em>'.
   * @see org.alma.mde.statemachine.zhu.Transitions#getFirstTransition()
   * @see #getTransitions()
   * @generated
   */
  EReference getTransitions_FirstTransition();

  /**
   * Returns the meta object for the containment reference list '{@link org.alma.mde.statemachine.zhu.Transitions#getFollowingTransitions <em>Following Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Following Transitions</em>'.
   * @see org.alma.mde.statemachine.zhu.Transitions#getFollowingTransitions()
   * @see #getTransitions()
   * @generated
   */
  EReference getTransitions_FollowingTransitions();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.alma.mde.statemachine.zhu.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link org.alma.mde.statemachine.zhu.Transition#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see org.alma.mde.statemachine.zhu.Transition#getSource()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Source();

  /**
   * Returns the meta object for the reference '{@link org.alma.mde.statemachine.zhu.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.alma.mde.statemachine.zhu.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.Transition#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Triggers</em>'.
   * @see org.alma.mde.statemachine.zhu.Transition#getTriggers()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Triggers();

  /**
   * Returns the meta object for the attribute '{@link org.alma.mde.statemachine.zhu.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guard</em>'.
   * @see org.alma.mde.statemachine.zhu.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Guard();

  /**
   * Returns the meta object for the attribute '{@link org.alma.mde.statemachine.zhu.Transition#getBehaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Behaviour</em>'.
   * @see org.alma.mde.statemachine.zhu.Transition#getBehaviour()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Behaviour();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States</em>'.
   * @see org.alma.mde.statemachine.zhu.States
   * @generated
   */
  EClass getStates();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.States#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States</em>'.
   * @see org.alma.mde.statemachine.zhu.States#getStates()
   * @see #getStates()
   * @generated
   */
  EReference getStates_States();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.StatesSeparated <em>States Separated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>States Separated</em>'.
   * @see org.alma.mde.statemachine.zhu.StatesSeparated
   * @generated
   */
  EClass getStatesSeparated();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.StatesSeparated#getFirstState <em>First State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>First State</em>'.
   * @see org.alma.mde.statemachine.zhu.StatesSeparated#getFirstState()
   * @see #getStatesSeparated()
   * @generated
   */
  EReference getStatesSeparated_FirstState();

  /**
   * Returns the meta object for the containment reference list '{@link org.alma.mde.statemachine.zhu.StatesSeparated#getFollowingStates <em>Following States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Following States</em>'.
   * @see org.alma.mde.statemachine.zhu.StatesSeparated#getFollowingStates()
   * @see #getStatesSeparated()
   * @generated
   */
  EReference getStatesSeparated_FollowingStates();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.alma.mde.statemachine.zhu.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link org.alma.mde.statemachine.zhu.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.alma.mde.statemachine.zhu.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.Triggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triggers</em>'.
   * @see org.alma.mde.statemachine.zhu.Triggers
   * @generated
   */
  EClass getTriggers();

  /**
   * Returns the meta object for the containment reference '{@link org.alma.mde.statemachine.zhu.Triggers#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Triggers</em>'.
   * @see org.alma.mde.statemachine.zhu.Triggers#getTriggers()
   * @see #getTriggers()
   * @generated
   */
  EReference getTriggers_Triggers();

  /**
   * Returns the meta object for class '{@link org.alma.mde.statemachine.zhu.TriggersSeparated <em>Triggers Separated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Triggers Separated</em>'.
   * @see org.alma.mde.statemachine.zhu.TriggersSeparated
   * @generated
   */
  EClass getTriggersSeparated();

  /**
   * Returns the meta object for the attribute '{@link org.alma.mde.statemachine.zhu.TriggersSeparated#getFirstTrigger <em>First Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Trigger</em>'.
   * @see org.alma.mde.statemachine.zhu.TriggersSeparated#getFirstTrigger()
   * @see #getTriggersSeparated()
   * @generated
   */
  EAttribute getTriggersSeparated_FirstTrigger();

  /**
   * Returns the meta object for the attribute list '{@link org.alma.mde.statemachine.zhu.TriggersSeparated#getFollowingTriggers <em>Following Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Following Triggers</em>'.
   * @see org.alma.mde.statemachine.zhu.TriggersSeparated#getFollowingTriggers()
   * @see #getTriggersSeparated()
   * @generated
   */
  EAttribute getTriggersSeparated_FollowingTriggers();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ZhuFactory getZhuFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.StateMachineImpl <em>State Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.StateMachineImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getStateMachine()
     * @generated
     */
    EClass STATE_MACHINE = eINSTANCE.getStateMachine();

    /**
     * The meta object literal for the '<em><b>Region</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_MACHINE__REGION = eINSTANCE.getStateMachine_Region();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.TopRegionImpl <em>Top Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.TopRegionImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTopRegion()
     * @generated
     */
    EClass TOP_REGION = eINSTANCE.getTopRegion();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_REGION__STATES = eINSTANCE.getTopRegion_States();

    /**
     * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_REGION__REGIONS = eINSTANCE.getTopRegion_Regions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TOP_REGION__TRANSITIONS = eINSTANCE.getTopRegion_Transitions();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.RegionImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGION__NAME = eINSTANCE.getRegion_Name();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__STATES = eINSTANCE.getRegion_States();

    /**
     * The meta object literal for the '<em><b>Regions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__REGIONS = eINSTANCE.getRegion_Regions();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGION__TRANSITIONS = eINSTANCE.getRegion_Transitions();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.TransitionsImpl <em>Transitions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.TransitionsImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTransitions()
     * @generated
     */
    EClass TRANSITIONS = eINSTANCE.getTransitions();

    /**
     * The meta object literal for the '<em><b>First Transition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIONS__FIRST_TRANSITION = eINSTANCE.getTransitions_FirstTransition();

    /**
     * The meta object literal for the '<em><b>Following Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITIONS__FOLLOWING_TRANSITIONS = eINSTANCE.getTransitions_FollowingTransitions();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.TransitionImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TRIGGERS = eINSTANCE.getTransition_Triggers();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Behaviour</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__BEHAVIOUR = eINSTANCE.getTransition_Behaviour();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.StatesImpl <em>States</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.StatesImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getStates()
     * @generated
     */
    EClass STATES = eINSTANCE.getStates();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES__STATES = eINSTANCE.getStates_States();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.StatesSeparatedImpl <em>States Separated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.StatesSeparatedImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getStatesSeparated()
     * @generated
     */
    EClass STATES_SEPARATED = eINSTANCE.getStatesSeparated();

    /**
     * The meta object literal for the '<em><b>First State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES_SEPARATED__FIRST_STATE = eINSTANCE.getStatesSeparated_FirstState();

    /**
     * The meta object literal for the '<em><b>Following States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATES_SEPARATED__FOLLOWING_STATES = eINSTANCE.getStatesSeparated_FollowingStates();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.StateImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.TriggersImpl <em>Triggers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.TriggersImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTriggers()
     * @generated
     */
    EClass TRIGGERS = eINSTANCE.getTriggers();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGERS__TRIGGERS = eINSTANCE.getTriggers_Triggers();

    /**
     * The meta object literal for the '{@link org.alma.mde.statemachine.zhu.impl.TriggersSeparatedImpl <em>Triggers Separated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.alma.mde.statemachine.zhu.impl.TriggersSeparatedImpl
     * @see org.alma.mde.statemachine.zhu.impl.ZhuPackageImpl#getTriggersSeparated()
     * @generated
     */
    EClass TRIGGERS_SEPARATED = eINSTANCE.getTriggersSeparated();

    /**
     * The meta object literal for the '<em><b>First Trigger</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGERS_SEPARATED__FIRST_TRIGGER = eINSTANCE.getTriggersSeparated_FirstTrigger();

    /**
     * The meta object literal for the '<em><b>Following Triggers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS = eINSTANCE.getTriggersSeparated_FollowingTriggers();

  }

} //ZhuPackage

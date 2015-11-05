/**
 */
package org.alma.mde.statemachine.zhu.impl;

import org.alma.mde.statemachine.zhu.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZhuFactoryImpl extends EFactoryImpl implements ZhuFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ZhuFactory init()
  {
    try
    {
      ZhuFactory theZhuFactory = (ZhuFactory)EPackage.Registry.INSTANCE.getEFactory(ZhuPackage.eNS_URI);
      if (theZhuFactory != null)
      {
        return theZhuFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ZhuFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZhuFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ZhuPackage.STATE_MACHINE: return createStateMachine();
      case ZhuPackage.TOP_REGION: return createTopRegion();
      case ZhuPackage.REGION: return createRegion();
      case ZhuPackage.TRANSITIONS: return createTransitions();
      case ZhuPackage.TRANSITION: return createTransition();
      case ZhuPackage.STATES: return createStates();
      case ZhuPackage.STATES_SEPARATED: return createStatesSeparated();
      case ZhuPackage.STATE: return createState();
      case ZhuPackage.TRIGGERS: return createTriggers();
      case ZhuPackage.TRIGGERS_SEPARATED: return createTriggersSeparated();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateMachine createStateMachine()
  {
    StateMachineImpl stateMachine = new StateMachineImpl();
    return stateMachine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopRegion createTopRegion()
  {
    TopRegionImpl topRegion = new TopRegionImpl();
    return topRegion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transitions createTransitions()
  {
    TransitionsImpl transitions = new TransitionsImpl();
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States createStates()
  {
    StatesImpl states = new StatesImpl();
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesSeparated createStatesSeparated()
  {
    StatesSeparatedImpl statesSeparated = new StatesSeparatedImpl();
    return statesSeparated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Triggers createTriggers()
  {
    TriggersImpl triggers = new TriggersImpl();
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggersSeparated createTriggersSeparated()
  {
    TriggersSeparatedImpl triggersSeparated = new TriggersSeparatedImpl();
    return triggersSeparated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZhuPackage getZhuPackage()
  {
    return (ZhuPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ZhuPackage getPackage()
  {
    return ZhuPackage.eINSTANCE;
  }

} //ZhuFactoryImpl

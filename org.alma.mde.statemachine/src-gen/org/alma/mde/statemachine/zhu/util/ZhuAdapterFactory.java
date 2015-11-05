/**
 */
package org.alma.mde.statemachine.zhu.util;

import org.alma.mde.statemachine.zhu.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.alma.mde.statemachine.zhu.ZhuPackage
 * @generated
 */
public class ZhuAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ZhuPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZhuAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ZhuPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ZhuSwitch<Adapter> modelSwitch =
    new ZhuSwitch<Adapter>()
    {
      @Override
      public Adapter caseStateMachine(StateMachine object)
      {
        return createStateMachineAdapter();
      }
      @Override
      public Adapter caseTopRegion(TopRegion object)
      {
        return createTopRegionAdapter();
      }
      @Override
      public Adapter caseRegion(Region object)
      {
        return createRegionAdapter();
      }
      @Override
      public Adapter caseTransitions(Transitions object)
      {
        return createTransitionsAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseStates(States object)
      {
        return createStatesAdapter();
      }
      @Override
      public Adapter caseStatesSeparated(StatesSeparated object)
      {
        return createStatesSeparatedAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseTriggers(Triggers object)
      {
        return createTriggersAdapter();
      }
      @Override
      public Adapter caseTriggersSeparated(TriggersSeparated object)
      {
        return createTriggersSeparatedAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.StateMachine <em>State Machine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.StateMachine
   * @generated
   */
  public Adapter createStateMachineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.TopRegion <em>Top Region</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.TopRegion
   * @generated
   */
  public Adapter createTopRegionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.Region
   * @generated
   */
  public Adapter createRegionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.Transitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.Transitions
   * @generated
   */
  public Adapter createTransitionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.States <em>States</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.States
   * @generated
   */
  public Adapter createStatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.StatesSeparated <em>States Separated</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.StatesSeparated
   * @generated
   */
  public Adapter createStatesSeparatedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.Triggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.Triggers
   * @generated
   */
  public Adapter createTriggersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.alma.mde.statemachine.zhu.TriggersSeparated <em>Triggers Separated</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.alma.mde.statemachine.zhu.TriggersSeparated
   * @generated
   */
  public Adapter createTriggersSeparatedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ZhuAdapterFactory

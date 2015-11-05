/**
 */
package org.alma.mde.statemachine.zhu.impl;

import org.alma.mde.statemachine.zhu.State;
import org.alma.mde.statemachine.zhu.Transition;
import org.alma.mde.statemachine.zhu.Triggers;
import org.alma.mde.statemachine.zhu.ZhuPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionImpl#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected State source;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected State target;

  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected Triggers triggers;

  /**
   * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected static final String GUARD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected String guard = GUARD_EDEFAULT;

  /**
   * The default value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected static final String BEHAVIOUR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected String behaviour = BEHAVIOUR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ZhuPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (State)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZhuPackage.TRANSITION__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(State newSource)
  {
    State oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITION__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (State)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZhuPackage.TRANSITION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(State newTarget)
  {
    State oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Triggers getTriggers()
  {
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggers(Triggers newTriggers, NotificationChain msgs)
  {
    Triggers oldTriggers = triggers;
    triggers = newTriggers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITION__TRIGGERS, oldTriggers, newTriggers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggers(Triggers newTriggers)
  {
    if (newTriggers != triggers)
    {
      NotificationChain msgs = null;
      if (triggers != null)
        msgs = ((InternalEObject)triggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TRANSITION__TRIGGERS, null, msgs);
      if (newTriggers != null)
        msgs = ((InternalEObject)newTriggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TRANSITION__TRIGGERS, null, msgs);
      msgs = basicSetTriggers(newTriggers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITION__TRIGGERS, newTriggers, newTriggers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(String newGuard)
  {
    String oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITION__GUARD, oldGuard, guard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBehaviour()
  {
    return behaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBehaviour(String newBehaviour)
  {
    String oldBehaviour = behaviour;
    behaviour = newBehaviour;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITION__BEHAVIOUR, oldBehaviour, behaviour));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ZhuPackage.TRANSITION__TRIGGERS:
        return basicSetTriggers(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ZhuPackage.TRANSITION__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case ZhuPackage.TRANSITION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ZhuPackage.TRANSITION__TRIGGERS:
        return getTriggers();
      case ZhuPackage.TRANSITION__GUARD:
        return getGuard();
      case ZhuPackage.TRANSITION__BEHAVIOUR:
        return getBehaviour();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ZhuPackage.TRANSITION__SOURCE:
        setSource((State)newValue);
        return;
      case ZhuPackage.TRANSITION__TARGET:
        setTarget((State)newValue);
        return;
      case ZhuPackage.TRANSITION__TRIGGERS:
        setTriggers((Triggers)newValue);
        return;
      case ZhuPackage.TRANSITION__GUARD:
        setGuard((String)newValue);
        return;
      case ZhuPackage.TRANSITION__BEHAVIOUR:
        setBehaviour((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ZhuPackage.TRANSITION__SOURCE:
        setSource((State)null);
        return;
      case ZhuPackage.TRANSITION__TARGET:
        setTarget((State)null);
        return;
      case ZhuPackage.TRANSITION__TRIGGERS:
        setTriggers((Triggers)null);
        return;
      case ZhuPackage.TRANSITION__GUARD:
        setGuard(GUARD_EDEFAULT);
        return;
      case ZhuPackage.TRANSITION__BEHAVIOUR:
        setBehaviour(BEHAVIOUR_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ZhuPackage.TRANSITION__SOURCE:
        return source != null;
      case ZhuPackage.TRANSITION__TARGET:
        return target != null;
      case ZhuPackage.TRANSITION__TRIGGERS:
        return triggers != null;
      case ZhuPackage.TRANSITION__GUARD:
        return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
      case ZhuPackage.TRANSITION__BEHAVIOUR:
        return BEHAVIOUR_EDEFAULT == null ? behaviour != null : !BEHAVIOUR_EDEFAULT.equals(behaviour);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (guard: ");
    result.append(guard);
    result.append(", behaviour: ");
    result.append(behaviour);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl

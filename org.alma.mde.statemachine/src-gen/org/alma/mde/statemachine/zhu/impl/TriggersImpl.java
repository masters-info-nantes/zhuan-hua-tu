/**
 */
package org.alma.mde.statemachine.zhu.impl;

import org.alma.mde.statemachine.zhu.Triggers;
import org.alma.mde.statemachine.zhu.TriggersSeparated;
import org.alma.mde.statemachine.zhu.ZhuPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triggers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TriggersImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggersImpl extends MinimalEObjectImpl.Container implements Triggers
{
  /**
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected TriggersSeparated triggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggersImpl()
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
    return ZhuPackage.Literals.TRIGGERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggersSeparated getTriggers()
  {
    return triggers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTriggers(TriggersSeparated newTriggers, NotificationChain msgs)
  {
    TriggersSeparated oldTriggers = triggers;
    triggers = newTriggers;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.TRIGGERS__TRIGGERS, oldTriggers, newTriggers);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTriggers(TriggersSeparated newTriggers)
  {
    if (newTriggers != triggers)
    {
      NotificationChain msgs = null;
      if (triggers != null)
        msgs = ((InternalEObject)triggers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TRIGGERS__TRIGGERS, null, msgs);
      if (newTriggers != null)
        msgs = ((InternalEObject)newTriggers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TRIGGERS__TRIGGERS, null, msgs);
      msgs = basicSetTriggers(newTriggers, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRIGGERS__TRIGGERS, newTriggers, newTriggers));
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
      case ZhuPackage.TRIGGERS__TRIGGERS:
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
      case ZhuPackage.TRIGGERS__TRIGGERS:
        return getTriggers();
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
      case ZhuPackage.TRIGGERS__TRIGGERS:
        setTriggers((TriggersSeparated)newValue);
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
      case ZhuPackage.TRIGGERS__TRIGGERS:
        setTriggers((TriggersSeparated)null);
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
      case ZhuPackage.TRIGGERS__TRIGGERS:
        return triggers != null;
    }
    return super.eIsSet(featureID);
  }

} //TriggersImpl

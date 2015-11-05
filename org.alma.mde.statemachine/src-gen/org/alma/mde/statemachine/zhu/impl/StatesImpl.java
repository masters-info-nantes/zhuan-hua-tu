/**
 */
package org.alma.mde.statemachine.zhu.impl;

import org.alma.mde.statemachine.zhu.States;
import org.alma.mde.statemachine.zhu.StatesSeparated;
import org.alma.mde.statemachine.zhu.ZhuPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>States</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.StatesImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatesImpl extends MinimalEObjectImpl.Container implements States
{
  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected StatesSeparated states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatesImpl()
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
    return ZhuPackage.Literals.STATES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatesSeparated getStates()
  {
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStates(StatesSeparated newStates, NotificationChain msgs)
  {
    StatesSeparated oldStates = states;
    states = newStates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.STATES__STATES, oldStates, newStates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStates(StatesSeparated newStates)
  {
    if (newStates != states)
    {
      NotificationChain msgs = null;
      if (states != null)
        msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.STATES__STATES, null, msgs);
      if (newStates != null)
        msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.STATES__STATES, null, msgs);
      msgs = basicSetStates(newStates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.STATES__STATES, newStates, newStates));
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
      case ZhuPackage.STATES__STATES:
        return basicSetStates(null, msgs);
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
      case ZhuPackage.STATES__STATES:
        return getStates();
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
      case ZhuPackage.STATES__STATES:
        setStates((StatesSeparated)newValue);
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
      case ZhuPackage.STATES__STATES:
        setStates((StatesSeparated)null);
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
      case ZhuPackage.STATES__STATES:
        return states != null;
    }
    return super.eIsSet(featureID);
  }

} //StatesImpl

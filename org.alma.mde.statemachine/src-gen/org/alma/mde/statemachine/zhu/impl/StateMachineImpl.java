/**
 */
package org.alma.mde.statemachine.zhu.impl;

import org.alma.mde.statemachine.zhu.StateMachine;
import org.alma.mde.statemachine.zhu.TopRegion;
import org.alma.mde.statemachine.zhu.ZhuPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine
{
  /**
   * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegion()
   * @generated
   * @ordered
   */
  protected TopRegion region;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateMachineImpl()
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
    return ZhuPackage.Literals.STATE_MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopRegion getRegion()
  {
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRegion(TopRegion newRegion, NotificationChain msgs)
  {
    TopRegion oldRegion = region;
    region = newRegion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.STATE_MACHINE__REGION, oldRegion, newRegion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegion(TopRegion newRegion)
  {
    if (newRegion != region)
    {
      NotificationChain msgs = null;
      if (region != null)
        msgs = ((InternalEObject)region).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.STATE_MACHINE__REGION, null, msgs);
      if (newRegion != null)
        msgs = ((InternalEObject)newRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.STATE_MACHINE__REGION, null, msgs);
      msgs = basicSetRegion(newRegion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.STATE_MACHINE__REGION, newRegion, newRegion));
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
      case ZhuPackage.STATE_MACHINE__REGION:
        return basicSetRegion(null, msgs);
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
      case ZhuPackage.STATE_MACHINE__REGION:
        return getRegion();
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
      case ZhuPackage.STATE_MACHINE__REGION:
        setRegion((TopRegion)newValue);
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
      case ZhuPackage.STATE_MACHINE__REGION:
        setRegion((TopRegion)null);
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
      case ZhuPackage.STATE_MACHINE__REGION:
        return region != null;
    }
    return super.eIsSet(featureID);
  }

} //StateMachineImpl

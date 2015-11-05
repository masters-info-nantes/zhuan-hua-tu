/**
 */
package org.alma.mde.statemachine.zhu.impl;

import java.util.Collection;

import org.alma.mde.statemachine.zhu.Region;
import org.alma.mde.statemachine.zhu.States;
import org.alma.mde.statemachine.zhu.TopRegion;
import org.alma.mde.statemachine.zhu.Transitions;
import org.alma.mde.statemachine.zhu.ZhuPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TopRegionImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TopRegionImpl#getRegions <em>Regions</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TopRegionImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopRegionImpl extends MinimalEObjectImpl.Container implements TopRegion
{
  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected States states;

  /**
   * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegions()
   * @generated
   * @ordered
   */
  protected EList<Region> regions;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected Transitions transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopRegionImpl()
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
    return ZhuPackage.Literals.TOP_REGION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public States getStates()
  {
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStates(States newStates, NotificationChain msgs)
  {
    States oldStates = states;
    states = newStates;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.TOP_REGION__STATES, oldStates, newStates);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStates(States newStates)
  {
    if (newStates != states)
    {
      NotificationChain msgs = null;
      if (states != null)
        msgs = ((InternalEObject)states).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TOP_REGION__STATES, null, msgs);
      if (newStates != null)
        msgs = ((InternalEObject)newStates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TOP_REGION__STATES, null, msgs);
      msgs = basicSetStates(newStates, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TOP_REGION__STATES, newStates, newStates));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Region> getRegions()
  {
    if (regions == null)
    {
      regions = new EObjectContainmentEList<Region>(Region.class, this, ZhuPackage.TOP_REGION__REGIONS);
    }
    return regions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transitions getTransitions()
  {
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTransitions(Transitions newTransitions, NotificationChain msgs)
  {
    Transitions oldTransitions = transitions;
    transitions = newTransitions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.TOP_REGION__TRANSITIONS, oldTransitions, newTransitions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTransitions(Transitions newTransitions)
  {
    if (newTransitions != transitions)
    {
      NotificationChain msgs = null;
      if (transitions != null)
        msgs = ((InternalEObject)transitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TOP_REGION__TRANSITIONS, null, msgs);
      if (newTransitions != null)
        msgs = ((InternalEObject)newTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TOP_REGION__TRANSITIONS, null, msgs);
      msgs = basicSetTransitions(newTransitions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TOP_REGION__TRANSITIONS, newTransitions, newTransitions));
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
      case ZhuPackage.TOP_REGION__STATES:
        return basicSetStates(null, msgs);
      case ZhuPackage.TOP_REGION__REGIONS:
        return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
      case ZhuPackage.TOP_REGION__TRANSITIONS:
        return basicSetTransitions(null, msgs);
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
      case ZhuPackage.TOP_REGION__STATES:
        return getStates();
      case ZhuPackage.TOP_REGION__REGIONS:
        return getRegions();
      case ZhuPackage.TOP_REGION__TRANSITIONS:
        return getTransitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ZhuPackage.TOP_REGION__STATES:
        setStates((States)newValue);
        return;
      case ZhuPackage.TOP_REGION__REGIONS:
        getRegions().clear();
        getRegions().addAll((Collection<? extends Region>)newValue);
        return;
      case ZhuPackage.TOP_REGION__TRANSITIONS:
        setTransitions((Transitions)newValue);
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
      case ZhuPackage.TOP_REGION__STATES:
        setStates((States)null);
        return;
      case ZhuPackage.TOP_REGION__REGIONS:
        getRegions().clear();
        return;
      case ZhuPackage.TOP_REGION__TRANSITIONS:
        setTransitions((Transitions)null);
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
      case ZhuPackage.TOP_REGION__STATES:
        return states != null;
      case ZhuPackage.TOP_REGION__REGIONS:
        return regions != null && !regions.isEmpty();
      case ZhuPackage.TOP_REGION__TRANSITIONS:
        return transitions != null;
    }
    return super.eIsSet(featureID);
  }

} //TopRegionImpl

/**
 */
package org.alma.mde.statemachine.zhu.impl;

import java.util.Collection;

import org.alma.mde.statemachine.zhu.State;
import org.alma.mde.statemachine.zhu.StatesSeparated;
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
 * An implementation of the model object '<em><b>States Separated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.StatesSeparatedImpl#getFirstState <em>First State</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.StatesSeparatedImpl#getFollowingStates <em>Following States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatesSeparatedImpl extends MinimalEObjectImpl.Container implements StatesSeparated
{
  /**
   * The cached value of the '{@link #getFirstState() <em>First State</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstState()
   * @generated
   * @ordered
   */
  protected State firstState;

  /**
   * The cached value of the '{@link #getFollowingStates() <em>Following States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowingStates()
   * @generated
   * @ordered
   */
  protected EList<State> followingStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatesSeparatedImpl()
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
    return ZhuPackage.Literals.STATES_SEPARATED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getFirstState()
  {
    return firstState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstState(State newFirstState, NotificationChain msgs)
  {
    State oldFirstState = firstState;
    firstState = newFirstState;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.STATES_SEPARATED__FIRST_STATE, oldFirstState, newFirstState);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstState(State newFirstState)
  {
    if (newFirstState != firstState)
    {
      NotificationChain msgs = null;
      if (firstState != null)
        msgs = ((InternalEObject)firstState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.STATES_SEPARATED__FIRST_STATE, null, msgs);
      if (newFirstState != null)
        msgs = ((InternalEObject)newFirstState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.STATES_SEPARATED__FIRST_STATE, null, msgs);
      msgs = basicSetFirstState(newFirstState, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.STATES_SEPARATED__FIRST_STATE, newFirstState, newFirstState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getFollowingStates()
  {
    if (followingStates == null)
    {
      followingStates = new EObjectContainmentEList<State>(State.class, this, ZhuPackage.STATES_SEPARATED__FOLLOWING_STATES);
    }
    return followingStates;
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
      case ZhuPackage.STATES_SEPARATED__FIRST_STATE:
        return basicSetFirstState(null, msgs);
      case ZhuPackage.STATES_SEPARATED__FOLLOWING_STATES:
        return ((InternalEList<?>)getFollowingStates()).basicRemove(otherEnd, msgs);
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
      case ZhuPackage.STATES_SEPARATED__FIRST_STATE:
        return getFirstState();
      case ZhuPackage.STATES_SEPARATED__FOLLOWING_STATES:
        return getFollowingStates();
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
      case ZhuPackage.STATES_SEPARATED__FIRST_STATE:
        setFirstState((State)newValue);
        return;
      case ZhuPackage.STATES_SEPARATED__FOLLOWING_STATES:
        getFollowingStates().clear();
        getFollowingStates().addAll((Collection<? extends State>)newValue);
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
      case ZhuPackage.STATES_SEPARATED__FIRST_STATE:
        setFirstState((State)null);
        return;
      case ZhuPackage.STATES_SEPARATED__FOLLOWING_STATES:
        getFollowingStates().clear();
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
      case ZhuPackage.STATES_SEPARATED__FIRST_STATE:
        return firstState != null;
      case ZhuPackage.STATES_SEPARATED__FOLLOWING_STATES:
        return followingStates != null && !followingStates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatesSeparatedImpl

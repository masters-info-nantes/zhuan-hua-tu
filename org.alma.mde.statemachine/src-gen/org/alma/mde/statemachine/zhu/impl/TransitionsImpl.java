/**
 */
package org.alma.mde.statemachine.zhu.impl;

import java.util.Collection;

import org.alma.mde.statemachine.zhu.Transition;
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
 * An implementation of the model object '<em><b>Transitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionsImpl#getFirstTransition <em>First Transition</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TransitionsImpl#getFollowingTransitions <em>Following Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionsImpl extends MinimalEObjectImpl.Container implements Transitions
{
  /**
   * The cached value of the '{@link #getFirstTransition() <em>First Transition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstTransition()
   * @generated
   * @ordered
   */
  protected Transition firstTransition;

  /**
   * The cached value of the '{@link #getFollowingTransitions() <em>Following Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowingTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> followingTransitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionsImpl()
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
    return ZhuPackage.Literals.TRANSITIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition getFirstTransition()
  {
    return firstTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstTransition(Transition newFirstTransition, NotificationChain msgs)
  {
    Transition oldFirstTransition = firstTransition;
    firstTransition = newFirstTransition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITIONS__FIRST_TRANSITION, oldFirstTransition, newFirstTransition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstTransition(Transition newFirstTransition)
  {
    if (newFirstTransition != firstTransition)
    {
      NotificationChain msgs = null;
      if (firstTransition != null)
        msgs = ((InternalEObject)firstTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TRANSITIONS__FIRST_TRANSITION, null, msgs);
      if (newFirstTransition != null)
        msgs = ((InternalEObject)newFirstTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZhuPackage.TRANSITIONS__FIRST_TRANSITION, null, msgs);
      msgs = basicSetFirstTransition(newFirstTransition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRANSITIONS__FIRST_TRANSITION, newFirstTransition, newFirstTransition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getFollowingTransitions()
  {
    if (followingTransitions == null)
    {
      followingTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, ZhuPackage.TRANSITIONS__FOLLOWING_TRANSITIONS);
    }
    return followingTransitions;
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
      case ZhuPackage.TRANSITIONS__FIRST_TRANSITION:
        return basicSetFirstTransition(null, msgs);
      case ZhuPackage.TRANSITIONS__FOLLOWING_TRANSITIONS:
        return ((InternalEList<?>)getFollowingTransitions()).basicRemove(otherEnd, msgs);
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
      case ZhuPackage.TRANSITIONS__FIRST_TRANSITION:
        return getFirstTransition();
      case ZhuPackage.TRANSITIONS__FOLLOWING_TRANSITIONS:
        return getFollowingTransitions();
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
      case ZhuPackage.TRANSITIONS__FIRST_TRANSITION:
        setFirstTransition((Transition)newValue);
        return;
      case ZhuPackage.TRANSITIONS__FOLLOWING_TRANSITIONS:
        getFollowingTransitions().clear();
        getFollowingTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case ZhuPackage.TRANSITIONS__FIRST_TRANSITION:
        setFirstTransition((Transition)null);
        return;
      case ZhuPackage.TRANSITIONS__FOLLOWING_TRANSITIONS:
        getFollowingTransitions().clear();
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
      case ZhuPackage.TRANSITIONS__FIRST_TRANSITION:
        return firstTransition != null;
      case ZhuPackage.TRANSITIONS__FOLLOWING_TRANSITIONS:
        return followingTransitions != null && !followingTransitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TransitionsImpl

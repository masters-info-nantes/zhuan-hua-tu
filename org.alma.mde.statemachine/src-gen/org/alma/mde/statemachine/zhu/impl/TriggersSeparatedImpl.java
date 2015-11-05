/**
 */
package org.alma.mde.statemachine.zhu.impl;

import java.util.Collection;

import org.alma.mde.statemachine.zhu.TriggersSeparated;
import org.alma.mde.statemachine.zhu.ZhuPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triggers Separated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TriggersSeparatedImpl#getFirstTrigger <em>First Trigger</em>}</li>
 *   <li>{@link org.alma.mde.statemachine.zhu.impl.TriggersSeparatedImpl#getFollowingTriggers <em>Following Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggersSeparatedImpl extends MinimalEObjectImpl.Container implements TriggersSeparated
{
  /**
   * The default value of the '{@link #getFirstTrigger() <em>First Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstTrigger()
   * @generated
   * @ordered
   */
  protected static final String FIRST_TRIGGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstTrigger() <em>First Trigger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstTrigger()
   * @generated
   * @ordered
   */
  protected String firstTrigger = FIRST_TRIGGER_EDEFAULT;

  /**
   * The cached value of the '{@link #getFollowingTriggers() <em>Following Triggers</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFollowingTriggers()
   * @generated
   * @ordered
   */
  protected EList<String> followingTriggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggersSeparatedImpl()
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
    return ZhuPackage.Literals.TRIGGERS_SEPARATED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstTrigger()
  {
    return firstTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstTrigger(String newFirstTrigger)
  {
    String oldFirstTrigger = firstTrigger;
    firstTrigger = newFirstTrigger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ZhuPackage.TRIGGERS_SEPARATED__FIRST_TRIGGER, oldFirstTrigger, firstTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFollowingTriggers()
  {
    if (followingTriggers == null)
    {
      followingTriggers = new EDataTypeEList<String>(String.class, this, ZhuPackage.TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS);
    }
    return followingTriggers;
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
      case ZhuPackage.TRIGGERS_SEPARATED__FIRST_TRIGGER:
        return getFirstTrigger();
      case ZhuPackage.TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS:
        return getFollowingTriggers();
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
      case ZhuPackage.TRIGGERS_SEPARATED__FIRST_TRIGGER:
        setFirstTrigger((String)newValue);
        return;
      case ZhuPackage.TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS:
        getFollowingTriggers().clear();
        getFollowingTriggers().addAll((Collection<? extends String>)newValue);
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
      case ZhuPackage.TRIGGERS_SEPARATED__FIRST_TRIGGER:
        setFirstTrigger(FIRST_TRIGGER_EDEFAULT);
        return;
      case ZhuPackage.TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS:
        getFollowingTriggers().clear();
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
      case ZhuPackage.TRIGGERS_SEPARATED__FIRST_TRIGGER:
        return FIRST_TRIGGER_EDEFAULT == null ? firstTrigger != null : !FIRST_TRIGGER_EDEFAULT.equals(firstTrigger);
      case ZhuPackage.TRIGGERS_SEPARATED__FOLLOWING_TRIGGERS:
        return followingTriggers != null && !followingTriggers.isEmpty();
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
    result.append(" (firstTrigger: ");
    result.append(firstTrigger);
    result.append(", followingTriggers: ");
    result.append(followingTriggers);
    result.append(')');
    return result.toString();
  }

} //TriggersSeparatedImpl

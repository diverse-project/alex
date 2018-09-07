/**
 */
package model.impl;

import activitydiagram.impl.VariableImpl;

import model.BooleanVariableBindSEBooleanVariable;
import model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleexpressions.SEBooleanVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Variable Bind SE Boolean Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link model.impl.BooleanVariableBindSEBooleanVariableImpl#getDelegate <em>Delegate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BooleanVariableBindSEBooleanVariableImpl extends VariableImpl implements BooleanVariableBindSEBooleanVariable {
	/**
	 * The cached value of the '{@link #getDelegate() <em>Delegate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegate()
	 * @generated
	 * @ordered
	 */
	protected SEBooleanVariable delegate;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanVariableBindSEBooleanVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEBooleanVariable getDelegate() {
		return delegate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelegate(SEBooleanVariable newDelegate, NotificationChain msgs) {
		SEBooleanVariable oldDelegate = delegate;
		delegate = newDelegate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE, oldDelegate, newDelegate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegate(SEBooleanVariable newDelegate) {
		if (newDelegate != delegate) {
			NotificationChain msgs = null;
			if (delegate != null)
				msgs = ((InternalEObject)delegate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE, null, msgs);
			if (newDelegate != null)
				msgs = ((InternalEObject)newDelegate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE, null, msgs);
			msgs = basicSetDelegate(newDelegate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE, newDelegate, newDelegate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				return basicSetDelegate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				return getDelegate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				setDelegate((SEBooleanVariable)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				setDelegate((SEBooleanVariable)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BOOLEAN_VARIABLE_BIND_SE_BOOLEAN_VARIABLE__DELEGATE:
				return delegate != null;
		}
		return super.eIsSet(featureID);
	}

} //BooleanVariableBindSEBooleanVariableImpl

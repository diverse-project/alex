/**
 */
package boa.model.boa.impl;

import boa.model.boa.BoaPackage;
import boa.model.boa.Expr;
import boa.model.boa.If;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.impl.IfImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link boa.model.boa.impl.IfImpl#getThen <em>Then</em>}</li>
 *   <li>{@link boa.model.boa.impl.IfImpl#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends ExprImpl implements If {
	/**
	 * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCond()
	 * @generated
	 * @ordered
	 */
	protected Expr cond;

	/**
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected Expr then;

	/**
	 * The cached value of the '{@link #getEls() <em>Els</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEls()
	 * @generated
	 * @ordered
	 */
	protected Expr els;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoaPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr getCond() {
		return cond;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCond(Expr newCond, NotificationChain msgs) {
		Expr oldCond = cond;
		cond = newCond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BoaPackage.IF__COND, oldCond,
					newCond);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCond(Expr newCond) {
		if (newCond != cond) {
			NotificationChain msgs = null;
			if (cond != null)
				msgs = ((InternalEObject) cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BoaPackage.IF__COND, null,
						msgs);
			if (newCond != null)
				msgs = ((InternalEObject) newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BoaPackage.IF__COND, null,
						msgs);
			msgs = basicSetCond(newCond, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoaPackage.IF__COND, newCond, newCond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(Expr newThen, NotificationChain msgs) {
		Expr oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BoaPackage.IF__THEN, oldThen,
					newThen);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(Expr newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject) then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BoaPackage.IF__THEN, null,
						msgs);
			if (newThen != null)
				msgs = ((InternalEObject) newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BoaPackage.IF__THEN, null,
						msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoaPackage.IF__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expr getEls() {
		return els;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEls(Expr newEls, NotificationChain msgs) {
		Expr oldEls = els;
		els = newEls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BoaPackage.IF__ELS, oldEls,
					newEls);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEls(Expr newEls) {
		if (newEls != els) {
			NotificationChain msgs = null;
			if (els != null)
				msgs = ((InternalEObject) els).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BoaPackage.IF__ELS, null,
						msgs);
			if (newEls != null)
				msgs = ((InternalEObject) newEls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BoaPackage.IF__ELS, null,
						msgs);
			msgs = basicSetEls(newEls, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BoaPackage.IF__ELS, newEls, newEls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BoaPackage.IF__COND:
			return basicSetCond(null, msgs);
		case BoaPackage.IF__THEN:
			return basicSetThen(null, msgs);
		case BoaPackage.IF__ELS:
			return basicSetEls(null, msgs);
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
		case BoaPackage.IF__COND:
			return getCond();
		case BoaPackage.IF__THEN:
			return getThen();
		case BoaPackage.IF__ELS:
			return getEls();
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
		case BoaPackage.IF__COND:
			setCond((Expr) newValue);
			return;
		case BoaPackage.IF__THEN:
			setThen((Expr) newValue);
			return;
		case BoaPackage.IF__ELS:
			setEls((Expr) newValue);
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
		case BoaPackage.IF__COND:
			setCond((Expr) null);
			return;
		case BoaPackage.IF__THEN:
			setThen((Expr) null);
			return;
		case BoaPackage.IF__ELS:
			setEls((Expr) null);
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
		case BoaPackage.IF__COND:
			return cond != null;
		case BoaPackage.IF__THEN:
			return then != null;
		case BoaPackage.IF__ELS:
			return els != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl

/**
 */
package boa.model.boa.impl;

import boa.model.boa.BObject;
import boa.model.boa.BoaPackage;
import boa.model.boa.Field;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BObject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.impl.BObjectImpl#getFieldsList <em>Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BObjectImpl extends ExprImpl implements BObject {
	/**
	 * The cached value of the '{@link #getFieldsList() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The empty value for the '{@link #getFields() <em>Fields</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected static final Field[] FIELDS_EEMPTY_ARRAY = new Field[0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoaPackage.Literals.BOBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field[] getFields() {
		if (fields == null || fields.isEmpty())
			return FIELDS_EEMPTY_ARRAY;
		BasicEList<Field> list = (BasicEList<Field>) fields;
		list.shrink();
		return (Field[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getFields(int index) {
		return getFieldsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFieldsLength() {
		return fields == null ? 0 : fields.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFields(Field[] newFields) {
		((BasicEList<Field>) getFieldsList()).setData(newFields.length, newFields);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFields(int index, Field element) {
		getFieldsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFieldsList() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, BoaPackage.BOBJECT__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BoaPackage.BOBJECT__FIELDS:
			return ((InternalEList<?>) getFieldsList()).basicRemove(otherEnd, msgs);
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
		case BoaPackage.BOBJECT__FIELDS:
			return getFieldsList();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BoaPackage.BOBJECT__FIELDS:
			getFieldsList().clear();
			getFieldsList().addAll((Collection<? extends Field>) newValue);
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
		case BoaPackage.BOBJECT__FIELDS:
			getFieldsList().clear();
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
		case BoaPackage.BOBJECT__FIELDS:
			return fields != null && !fields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BObjectImpl

/**
 */
package boa.model.boa.impl;

import boa.model.boa.BoaPackage;
import boa.model.boa.File;
import boa.model.boa.TopLevelCmd;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link boa.model.boa.impl.FileImpl#getCommandsList <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File {
	/**
	 * The cached value of the '{@link #getCommandsList() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandsList()
	 * @generated
	 * @ordered
	 */
	protected EList<TopLevelCmd> commands;

	/**
	 * The empty value for the '{@link #getCommands() <em>Commands</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected static final TopLevelCmd[] COMMANDS_EEMPTY_ARRAY = new TopLevelCmd[0];

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BoaPackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelCmd[] getCommands() {
		if (commands == null || commands.isEmpty())
			return COMMANDS_EEMPTY_ARRAY;
		BasicEList<TopLevelCmd> list = (BasicEList<TopLevelCmd>) commands;
		list.shrink();
		return (TopLevelCmd[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelCmd getCommands(int index) {
		return getCommandsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommandsLength() {
		return commands == null ? 0 : commands.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommands(TopLevelCmd[] newCommands) {
		((BasicEList<TopLevelCmd>) getCommandsList()).setData(newCommands.length, newCommands);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommands(int index, TopLevelCmd element) {
		getCommandsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TopLevelCmd> getCommandsList() {
		if (commands == null) {
			commands = new EObjectContainmentEList<TopLevelCmd>(TopLevelCmd.class, this, BoaPackage.FILE__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BoaPackage.FILE__COMMANDS:
			return ((InternalEList<?>) getCommandsList()).basicRemove(otherEnd, msgs);
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
		case BoaPackage.FILE__COMMANDS:
			return getCommandsList();
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
		case BoaPackage.FILE__COMMANDS:
			getCommandsList().clear();
			getCommandsList().addAll((Collection<? extends TopLevelCmd>) newValue);
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
		case BoaPackage.FILE__COMMANDS:
			getCommandsList().clear();
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
		case BoaPackage.FILE__COMMANDS:
			return commands != null && !commands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileImpl

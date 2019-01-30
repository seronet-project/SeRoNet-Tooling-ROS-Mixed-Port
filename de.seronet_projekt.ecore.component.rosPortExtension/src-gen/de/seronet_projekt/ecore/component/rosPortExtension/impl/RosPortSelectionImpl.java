/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension.impl;

import de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage;
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rosInterfacesPool.RosInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Port Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortSelectionImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosPortSelectionImpl extends MinimalEObjectImpl.Container implements RosPortSelection {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected RosInterface port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RosPortSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPortExtensionPackage.Literals.ROS_PORT_SELECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosInterface getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (RosInterface) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RosPortExtensionPackage.ROS_PORT_SELECTION__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosInterface basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(RosInterface newPort) {
		RosInterface oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPortExtensionPackage.ROS_PORT_SELECTION__PORT,
					oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RosPortExtensionPackage.ROS_PORT_SELECTION__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
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
		case RosPortExtensionPackage.ROS_PORT_SELECTION__PORT:
			setPort((RosInterface) newValue);
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
		case RosPortExtensionPackage.ROS_PORT_SELECTION__PORT:
			setPort((RosInterface) null);
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
		case RosPortExtensionPackage.ROS_PORT_SELECTION__PORT:
			return port != null;
		}
		return super.eIsSet(featureID);
	}

} //RosPortSelectionImpl

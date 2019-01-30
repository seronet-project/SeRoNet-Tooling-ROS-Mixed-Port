/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension.impl;

import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent;
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage;
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extends Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.ExtendsComponentImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.ExtendsComponentImpl#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtendsComponentImpl extends MinimalEObjectImpl.Container implements ExtendsComponent {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition component;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<RosPortSelection> ports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendsComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RosPortExtensionPackage.Literals.EXTENDS_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (ComponentDefinition) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							RosPortExtensionPackage.EXTENDS_COMPONENT__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentDefinition newComponent) {
		ComponentDefinition oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RosPortExtensionPackage.EXTENDS_COMPONENT__COMPONENT,
					oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RosPortSelection> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<RosPortSelection>(RosPortSelection.class, this,
					RosPortExtensionPackage.EXTENDS_COMPONENT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RosPortExtensionPackage.EXTENDS_COMPONENT__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
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
		case RosPortExtensionPackage.EXTENDS_COMPONENT__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case RosPortExtensionPackage.EXTENDS_COMPONENT__PORTS:
			return getPorts();
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
		case RosPortExtensionPackage.EXTENDS_COMPONENT__COMPONENT:
			setComponent((ComponentDefinition) newValue);
			return;
		case RosPortExtensionPackage.EXTENDS_COMPONENT__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends RosPortSelection>) newValue);
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
		case RosPortExtensionPackage.EXTENDS_COMPONENT__COMPONENT:
			setComponent((ComponentDefinition) null);
			return;
		case RosPortExtensionPackage.EXTENDS_COMPONENT__PORTS:
			getPorts().clear();
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
		case RosPortExtensionPackage.EXTENDS_COMPONENT__COMPONENT:
			return component != null;
		case RosPortExtensionPackage.EXTENDS_COMPONENT__PORTS:
			return ports != null && !ports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtendsComponentImpl

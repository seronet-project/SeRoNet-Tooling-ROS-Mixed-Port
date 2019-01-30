/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension.impl;

import de.seronet_projekt.ecore.component.rosPortExtension.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosPortExtensionFactoryImpl extends EFactoryImpl implements RosPortExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RosPortExtensionFactory init() {
		try {
			RosPortExtensionFactory theRosPortExtensionFactory = (RosPortExtensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(RosPortExtensionPackage.eNS_URI);
			if (theRosPortExtensionFactory != null) {
				return theRosPortExtensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosPortExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPortExtensionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RosPortExtensionPackage.EXTENDS_COMPONENT:
			return createExtendsComponent();
		case RosPortExtensionPackage.ROS_PORT_SELECTION:
			return createRosPortSelection();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendsComponent createExtendsComponent() {
		ExtendsComponentImpl extendsComponent = new ExtendsComponentImpl();
		return extendsComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPortSelection createRosPortSelection() {
		RosPortSelectionImpl rosPortSelection = new RosPortSelectionImpl();
		return rosPortSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPortExtensionPackage getRosPortExtensionPackage() {
		return (RosPortExtensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RosPortExtensionPackage getPackage() {
		return RosPortExtensionPackage.eINSTANCE;
	}

} //RosPortExtensionFactoryImpl

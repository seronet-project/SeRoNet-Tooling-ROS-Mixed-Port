/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension.impl;

import de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent;
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionFactory;
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage;
import de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.service.communicationObject.CommunicationObjectPackage;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.ecore.service.componentMode.ComponentModePackage;

import org.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

import rosInterfacesPool.RosInterfacesPoolPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosPortExtensionPackageImpl extends EPackageImpl implements RosPortExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendsComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosPortSelectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RosPortExtensionPackageImpl() {
		super(eNS_URI, RosPortExtensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RosPortExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RosPortExtensionPackage init() {
		if (isInited)
			return (RosPortExtensionPackage) EPackage.Registry.INSTANCE.getEPackage(RosPortExtensionPackage.eNS_URI);

		// Obtain or create and register package
		RosPortExtensionPackageImpl theRosPortExtensionPackage = (RosPortExtensionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RosPortExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RosPortExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		RosInterfacesPoolPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRosPortExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theRosPortExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRosPortExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RosPortExtensionPackage.eNS_URI, theRosPortExtensionPackage);
		return theRosPortExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendsComponent() {
		return extendsComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendsComponent_Component() {
		return (EReference) extendsComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtendsComponent_Ports() {
		return (EReference) extendsComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosPortSelection() {
		return rosPortSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosPortSelection_Port() {
		return (EReference) rosPortSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosPortExtensionFactory getRosPortExtensionFactory() {
		return (RosPortExtensionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		extendsComponentEClass = createEClass(EXTENDS_COMPONENT);
		createEReference(extendsComponentEClass, EXTENDS_COMPONENT__COMPONENT);
		createEReference(extendsComponentEClass, EXTENDS_COMPONENT__PORTS);

		rosPortSelectionEClass = createEClass(ROS_PORT_SELECTION);
		createEReference(rosPortSelectionEClass, ROS_PORT_SELECTION__PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);
		RosInterfacesPoolPackage theRosInterfacesPoolPackage = (RosInterfacesPoolPackage) EPackage.Registry.INSTANCE
				.getEPackage(RosInterfacesPoolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(extendsComponentEClass, ExtendsComponent.class, "ExtendsComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtendsComponent_Component(), theComponentDefinitionPackage.getComponentDefinition(), null,
				"component", null, 1, 1, ExtendsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendsComponent_Ports(), this.getRosPortSelection(), null, "ports", null, 0, -1,
				ExtendsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosPortSelectionEClass, RosPortSelection.class, "RosPortSelection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosPortSelection_Port(), theRosInterfacesPoolPackage.getRosInterface(), null, "port", null, 1,
				1, RosPortSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RosPortExtensionPackageImpl

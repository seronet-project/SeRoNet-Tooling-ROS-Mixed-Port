/**
 */
package rosInterfacesPool.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rosInterfacesPool.RosInterface;
import rosInterfacesPool.RosInterfacesPool;
import rosInterfacesPool.RosInterfacesPoolFactory;
import rosInterfacesPool.RosInterfacesPoolPackage;
import rosInterfacesPool.RosPublisher;
import rosInterfacesPool.RosService;
import rosInterfacesPool.RosSrvClient;
import rosInterfacesPool.RosSrvServer;
import rosInterfacesPool.RosSubscriber;
import rosInterfacesPool.RosTopic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RosInterfacesPoolPackageImpl extends EPackageImpl implements RosInterfacesPoolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosInterfacesPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosTopicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosPublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSubscriberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSrvServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosSrvClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rosInterfaceEClass = null;

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
	 * @see rosInterfacesPool.RosInterfacesPoolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RosInterfacesPoolPackageImpl() {
		super(eNS_URI, RosInterfacesPoolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RosInterfacesPoolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RosInterfacesPoolPackage init() {
		if (isInited) return (RosInterfacesPoolPackage)EPackage.Registry.INSTANCE.getEPackage(RosInterfacesPoolPackage.eNS_URI);

		// Obtain or create and register package
		RosInterfacesPoolPackageImpl theRosInterfacesPoolPackage = (RosInterfacesPoolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RosInterfacesPoolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RosInterfacesPoolPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRosInterfacesPoolPackage.createPackageContents();

		// Initialize created meta-data
		theRosInterfacesPoolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRosInterfacesPoolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RosInterfacesPoolPackage.eNS_URI, theRosInterfacesPoolPackage);
		return theRosInterfacesPoolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosInterfacesPool() {
		return rosInterfacesPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRosInterfacesPool_Interfaces() {
		return (EReference)rosInterfacesPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosTopic() {
		return rosTopicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosTopic_TopicName() {
		return (EAttribute)rosTopicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosTopic_Type() {
		return (EAttribute)rosTopicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosService() {
		return rosServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosService_SrvName() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosService_Type() {
		return (EAttribute)rosServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosPublisher() {
		return rosPublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosSubscriber() {
		return rosSubscriberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosSrvServer() {
		return rosSrvServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosSrvClient() {
		return rosSrvClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRosInterface() {
		return rosInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRosInterface_Name() {
		return (EAttribute)rosInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosInterfacesPoolFactory getRosInterfacesPoolFactory() {
		return (RosInterfacesPoolFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rosInterfacesPoolEClass = createEClass(ROS_INTERFACES_POOL);
		createEReference(rosInterfacesPoolEClass, ROS_INTERFACES_POOL__INTERFACES);

		rosTopicEClass = createEClass(ROS_TOPIC);
		createEAttribute(rosTopicEClass, ROS_TOPIC__TOPIC_NAME);
		createEAttribute(rosTopicEClass, ROS_TOPIC__TYPE);

		rosServiceEClass = createEClass(ROS_SERVICE);
		createEAttribute(rosServiceEClass, ROS_SERVICE__SRV_NAME);
		createEAttribute(rosServiceEClass, ROS_SERVICE__TYPE);

		rosPublisherEClass = createEClass(ROS_PUBLISHER);

		rosSubscriberEClass = createEClass(ROS_SUBSCRIBER);

		rosSrvServerEClass = createEClass(ROS_SRV_SERVER);

		rosSrvClientEClass = createEClass(ROS_SRV_CLIENT);

		rosInterfaceEClass = createEClass(ROS_INTERFACE);
		createEAttribute(rosInterfaceEClass, ROS_INTERFACE__NAME);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		rosTopicEClass.getESuperTypes().add(this.getRosInterface());
		rosServiceEClass.getESuperTypes().add(this.getRosInterface());
		rosPublisherEClass.getESuperTypes().add(this.getRosTopic());
		rosSubscriberEClass.getESuperTypes().add(this.getRosTopic());
		rosSrvServerEClass.getESuperTypes().add(this.getRosService());
		rosSrvClientEClass.getESuperTypes().add(this.getRosService());

		// Initialize classes, features, and operations; add parameters
		initEClass(rosInterfacesPoolEClass, RosInterfacesPool.class, "RosInterfacesPool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRosInterfacesPool_Interfaces(), this.getRosInterface(), null, "interfaces", null, 0, -1, RosInterfacesPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosTopicEClass, RosTopic.class, "RosTopic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosTopic_TopicName(), ecorePackage.getEString(), "topicName", null, 1, 1, RosTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosTopic_Type(), ecorePackage.getEString(), "type", null, 1, 1, RosTopic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosServiceEClass, RosService.class, "RosService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosService_SrvName(), ecorePackage.getEString(), "srvName", null, 1, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRosService_Type(), ecorePackage.getEString(), "type", null, 1, 1, RosService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rosPublisherEClass, RosPublisher.class, "RosPublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosSubscriberEClass, RosSubscriber.class, "RosSubscriber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosSrvServerEClass, RosSrvServer.class, "RosSrvServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosSrvClientEClass, RosSrvClient.class, "RosSrvClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rosInterfaceEClass, RosInterface.class, "RosInterface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRosInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1, RosInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RosInterfacesPoolPackageImpl

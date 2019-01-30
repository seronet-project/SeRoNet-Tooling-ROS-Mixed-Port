/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface RosPortExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rosPortExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.seronet-projekt.de/component/rosPortExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rosPortExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosPortExtensionPackage eINSTANCE = de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortExtensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.ExtendsComponentImpl <em>Extends Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.ExtendsComponentImpl
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortExtensionPackageImpl#getExtendsComponent()
	 * @generated
	 */
	int EXTENDS_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_COMPONENT__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_COMPONENT__PORTS = 1;

	/**
	 * The number of structural features of the '<em>Extends Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extends Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortSelectionImpl <em>Ros Port Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortSelectionImpl
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortExtensionPackageImpl#getRosPortSelection()
	 * @generated
	 */
	int ROS_PORT_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PORT_SELECTION__PORT = 0;

	/**
	 * The number of structural features of the '<em>Ros Port Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PORT_SELECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ros Port Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_PORT_SELECTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent <em>Extends Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends Component</em>'.
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent
	 * @generated
	 */
	EClass getExtendsComponent();

	/**
	 * Returns the meta object for the reference '{@link de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getComponent()
	 * @see #getExtendsComponent()
	 * @generated
	 */
	EReference getExtendsComponent_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getPorts()
	 * @see #getExtendsComponent()
	 * @generated
	 */
	EReference getExtendsComponent_Ports();

	/**
	 * Returns the meta object for class '{@link de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection <em>Ros Port Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ros Port Selection</em>'.
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection
	 * @generated
	 */
	EClass getRosPortSelection();

	/**
	 * Returns the meta object for the reference '{@link de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection#getPort()
	 * @see #getRosPortSelection()
	 * @generated
	 */
	EReference getRosPortSelection_Port();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RosPortExtensionFactory getRosPortExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.ExtendsComponentImpl <em>Extends Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.ExtendsComponentImpl
		 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortExtensionPackageImpl#getExtendsComponent()
		 * @generated
		 */
		EClass EXTENDS_COMPONENT = eINSTANCE.getExtendsComponent();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_COMPONENT__COMPONENT = eINSTANCE.getExtendsComponent_Component();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS_COMPONENT__PORTS = eINSTANCE.getExtendsComponent_Ports();

		/**
		 * The meta object literal for the '{@link de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortSelectionImpl <em>Ros Port Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortSelectionImpl
		 * @see de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortExtensionPackageImpl#getRosPortSelection()
		 * @generated
		 */
		EClass ROS_PORT_SELECTION = eINSTANCE.getRosPortSelection();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROS_PORT_SELECTION__PORT = eINSTANCE.getRosPortSelection_Port();

	}

} //RosPortExtensionPackage

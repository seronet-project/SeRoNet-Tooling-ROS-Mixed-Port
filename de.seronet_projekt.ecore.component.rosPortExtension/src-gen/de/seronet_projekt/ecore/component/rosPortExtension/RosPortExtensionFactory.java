/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage
 * @generated
 */
public interface RosPortExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RosPortExtensionFactory eINSTANCE = de.seronet_projekt.ecore.component.rosPortExtension.impl.RosPortExtensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Extends Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extends Component</em>'.
	 * @generated
	 */
	ExtendsComponent createExtendsComponent();

	/**
	 * Returns a new object of class '<em>Ros Port Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ros Port Selection</em>'.
	 * @generated
	 */
	RosPortSelection createRosPortSelection();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RosPortExtensionPackage getRosPortExtensionPackage();

} //RosPortExtensionFactory

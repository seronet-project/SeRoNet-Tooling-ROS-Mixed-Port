/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extends Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getComponent <em>Component</em>}</li>
 *   <li>{@link de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage#getExtendsComponent()
 * @model
 * @generated
 */
public interface ExtendsComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage#getExtendsComponent_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link de.seronet_projekt.ecore.component.rosPortExtension.ExtendsComponent#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage#getExtendsComponent_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<RosPortSelection> getPorts();

} // ExtendsComponent

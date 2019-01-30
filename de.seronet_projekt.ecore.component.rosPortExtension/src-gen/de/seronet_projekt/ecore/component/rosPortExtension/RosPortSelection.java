/**
 */
package de.seronet_projekt.ecore.component.rosPortExtension;

import org.eclipse.emf.ecore.EObject;

import rosInterfacesPool.RosInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Port Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage#getRosPortSelection()
 * @model
 * @generated
 */
public interface RosPortSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(RosInterface)
	 * @see de.seronet_projekt.ecore.component.rosPortExtension.RosPortExtensionPackage#getRosPortSelection_Port()
	 * @model required="true"
	 * @generated
	 */
	RosInterface getPort();

	/**
	 * Sets the value of the '{@link de.seronet_projekt.ecore.component.rosPortExtension.RosPortSelection#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(RosInterface value);

} // RosPortSelection

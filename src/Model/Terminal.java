/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Terminal#getNumeroTerminal <em>Numero Terminal</em>}</li>
 *   <li>{@link Model.Terminal#getSenhaTerminal <em>Senha Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getTerminal()
 * @model
 * @generated
 */
public interface Terminal extends EObject {
	/**
	 * Returns the value of the '<em><b>Numero Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numero Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numero Terminal</em>' attribute.
	 * @see #setNumeroTerminal(int)
	 * @see Model.ModelPackage#getTerminal_NumeroTerminal()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumeroTerminal();

	/**
	 * Sets the value of the '{@link Model.Terminal#getNumeroTerminal <em>Numero Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numero Terminal</em>' attribute.
	 * @see #getNumeroTerminal()
	 * @generated
	 */
	void setNumeroTerminal(int value);

	/**
	 * Returns the value of the '<em><b>Senha Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senha Terminal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senha Terminal</em>' attribute.
	 * @see #setSenhaTerminal(int)
	 * @see Model.ModelPackage#getTerminal_SenhaTerminal()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSenhaTerminal();

	/**
	 * Sets the value of the '{@link Model.Terminal#getSenhaTerminal <em>Senha Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senha Terminal</em>' attribute.
	 * @see #getSenhaTerminal()
	 * @generated
	 */
	void setSenhaTerminal(int value);

} // Terminal

/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcionario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Funcionario#isSuspenso <em>Suspenso</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getFuncionario()
 * @model
 * @generated
 */
public interface Funcionario extends Usuario {
	/**
	 * Returns the value of the '<em><b>Suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suspenso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suspenso</em>' attribute.
	 * @see #setSuspenso(boolean)
	 * @see Model.ModelPackage#getFuncionario_Suspenso()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isSuspenso();

	/**
	 * Sets the value of the '{@link Model.Funcionario#isSuspenso <em>Suspenso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suspenso</em>' attribute.
	 * @see #isSuspenso()
	 * @generated
	 */
	void setSuspenso(boolean value);

} // Funcionario

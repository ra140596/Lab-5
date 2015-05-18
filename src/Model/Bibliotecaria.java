/**
 */
package Model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bibliotecaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Bibliotecaria#getSenhaAcesso <em>Senha Acesso</em>}</li>
 *   <li>{@link Model.Bibliotecaria#getCodigoBibliotecaria <em>Codigo Bibliotecaria</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getBibliotecaria()
 * @model
 * @generated
 */
public interface Bibliotecaria extends Funcionario {
	/**
	 * Returns the value of the '<em><b>Senha Acesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Senha Acesso</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senha Acesso</em>' attribute.
	 * @see #setSenhaAcesso(int)
	 * @see Model.ModelPackage#getBibliotecaria_SenhaAcesso()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSenhaAcesso();

	/**
	 * Sets the value of the '{@link Model.Bibliotecaria#getSenhaAcesso <em>Senha Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Senha Acesso</em>' attribute.
	 * @see #getSenhaAcesso()
	 * @generated
	 */
	void setSenhaAcesso(int value);

	/**
	 * Returns the value of the '<em><b>Codigo Bibliotecaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Bibliotecaria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Bibliotecaria</em>' attribute.
	 * @see #setCodigoBibliotecaria(int)
	 * @see Model.ModelPackage#getBibliotecaria_CodigoBibliotecaria()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCodigoBibliotecaria();

	/**
	 * Sets the value of the '{@link Model.Bibliotecaria#getCodigoBibliotecaria <em>Codigo Bibliotecaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Bibliotecaria</em>' attribute.
	 * @see #getCodigoBibliotecaria()
	 * @generated
	 */
	void setCodigoBibliotecaria(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void incluirExemplar();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eRequired="true" eOrdered="false"
	 * @generated
	 */
	void excluirExemplar(Exemplar e);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model eRequired="true" eOrdered="false"
	 * @generated
	 */
	void atualizarExemplar(Exemplar e);

} // Bibliotecaria

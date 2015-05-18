/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Livro#getAnoPublicacao <em>Ano Publicacao</em>}</li>
 *   <li>{@link Model.Livro#getEdicao <em>Edicao</em>}</li>
 *   <li>{@link Model.Livro#getAutores <em>Autores</em>}</li>
 *   <li>{@link Model.Livro#getEditora <em>Editora</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getLivro()
 * @model
 * @generated
 */
public interface Livro extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Ano Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ano Publicacao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ano Publicacao</em>' attribute.
	 * @see #setAnoPublicacao(int)
	 * @see Model.ModelPackage#getLivro_AnoPublicacao()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAnoPublicacao();

	/**
	 * Sets the value of the '{@link Model.Livro#getAnoPublicacao <em>Ano Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ano Publicacao</em>' attribute.
	 * @see #getAnoPublicacao()
	 * @generated
	 */
	void setAnoPublicacao(int value);

	/**
	 * Returns the value of the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edicao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edicao</em>' attribute.
	 * @see #setEdicao(int)
	 * @see Model.ModelPackage#getLivro_Edicao()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getEdicao();

	/**
	 * Sets the value of the '{@link Model.Livro#getEdicao <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edicao</em>' attribute.
	 * @see #getEdicao()
	 * @generated
	 */
	void setEdicao(int value);

	/**
	 * Returns the value of the '<em><b>Autores</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autores</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autores</em>' attribute list.
	 * @see Model.ModelPackage#getLivro_Autores()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getAutores();

	/**
	 * Returns the value of the '<em><b>Editora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editora</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editora</em>' attribute.
	 * @see #setEditora(String)
	 * @see Model.ModelPackage#getLivro_Editora()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEditora();

	/**
	 * Sets the value of the '{@link Model.Livro#getEditora <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editora</em>' attribute.
	 * @see #getEditora()
	 * @generated
	 */
	void setEditora(String value);

} // Livro

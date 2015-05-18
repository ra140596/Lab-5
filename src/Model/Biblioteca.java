/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Biblioteca#getNomeBiblioteca <em>Nome Biblioteca</em>}</li>
 *   <li>{@link Model.Biblioteca#getCodigoBiblioteca <em>Codigo Biblioteca</em>}</li>
 *   <li>{@link Model.Biblioteca#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Model.Biblioteca#getPublicacoes <em>Publicacoes</em>}</li>
 *   <li>{@link Model.Biblioteca#getExemplares <em>Exemplares</em>}</li>
 *   <li>{@link Model.Biblioteca#getEmprestimos <em>Emprestimos</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getBiblioteca()
 * @model
 * @generated
 */
public interface Biblioteca extends EObject {
	/**
	 * Returns the value of the '<em><b>Nome Biblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Biblioteca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Biblioteca</em>' attribute.
	 * @see #setNomeBiblioteca(String)
	 * @see Model.ModelPackage#getBiblioteca_NomeBiblioteca()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNomeBiblioteca();

	/**
	 * Sets the value of the '{@link Model.Biblioteca#getNomeBiblioteca <em>Nome Biblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Biblioteca</em>' attribute.
	 * @see #getNomeBiblioteca()
	 * @generated
	 */
	void setNomeBiblioteca(String value);

	/**
	 * Returns the value of the '<em><b>Codigo Biblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Biblioteca</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Biblioteca</em>' attribute.
	 * @see #setCodigoBiblioteca(int)
	 * @see Model.ModelPackage#getBiblioteca_CodigoBiblioteca()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCodigoBiblioteca();

	/**
	 * Sets the value of the '{@link Model.Biblioteca#getCodigoBiblioteca <em>Codigo Biblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Biblioteca</em>' attribute.
	 * @see #getCodigoBiblioteca()
	 * @generated
	 */
	void setCodigoBiblioteca(int value);

	/**
	 * Returns the value of the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminal</em>' reference.
	 * @see #setTerminal(Terminal)
	 * @see Model.ModelPackage#getBiblioteca_Terminal()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Terminal getTerminal();

	/**
	 * Sets the value of the '{@link Model.Biblioteca#getTerminal <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Terminal</em>' reference.
	 * @see #getTerminal()
	 * @generated
	 */
	void setTerminal(Terminal value);

	/**
	 * Returns the value of the '<em><b>Publicacoes</b></em>' reference list.
	 * The list contents are of type {@link Model.Publicacao}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicacoes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicacoes</em>' reference list.
	 * @see Model.ModelPackage#getBiblioteca_Publicacoes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Publicacao> getPublicacoes();

	/**
	 * Returns the value of the '<em><b>Exemplares</b></em>' reference list.
	 * The list contents are of type {@link Model.Exemplar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exemplares</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplares</em>' reference list.
	 * @see Model.ModelPackage#getBiblioteca_Exemplares()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Exemplar> getExemplares();

	/**
	 * Returns the value of the '<em><b>Emprestimos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emprestimos</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emprestimos</em>' reference.
	 * @see #setEmprestimos(Emprestimo)
	 * @see Model.ModelPackage#getBiblioteca_Emprestimos()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Emprestimo getEmprestimos();

	/**
	 * Sets the value of the '{@link Model.Biblioteca#getEmprestimos <em>Emprestimos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emprestimos</em>' reference.
	 * @see #getEmprestimos()
	 * @generated
	 */
	void setEmprestimos(Emprestimo value);

} // Biblioteca

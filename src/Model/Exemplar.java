/**
 */
package Model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Exemplar#getCodigoExemplar <em>Codigo Exemplar</em>}</li>
 *   <li>{@link Model.Exemplar#getPublicacao <em>Publicacao</em>}</li>
 *   <li>{@link Model.Exemplar#isEmprestado <em>Emprestado</em>}</li>
 *   <li>{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getExemplar()
 * @model
 * @generated
 */
public interface Exemplar extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Exemplar</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Exemplar</em>' attribute.
	 * @see #setCodigoExemplar(int)
	 * @see Model.ModelPackage#getExemplar_CodigoExemplar()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCodigoExemplar();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getCodigoExemplar <em>Codigo Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Exemplar</em>' attribute.
	 * @see #getCodigoExemplar()
	 * @generated
	 */
	void setCodigoExemplar(int value);

	/**
	 * Returns the value of the '<em><b>Publicacao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicacao</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicacao</em>' reference.
	 * @see #setPublicacao(Publicacao)
	 * @see Model.ModelPackage#getExemplar_Publicacao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicacao getPublicacao();

	/**
	 * Sets the value of the '{@link Model.Exemplar#getPublicacao <em>Publicacao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicacao</em>' reference.
	 * @see #getPublicacao()
	 * @generated
	 */
	void setPublicacao(Publicacao value);

	/**
	 * Returns the value of the '<em><b>Emprestado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emprestado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emprestado</em>' attribute.
	 * @see #setEmprestado(boolean)
	 * @see Model.ModelPackage#getExemplar_Emprestado()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isEmprestado();

	/**
	 * Sets the value of the '{@link Model.Exemplar#isEmprestado <em>Emprestado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emprestado</em>' attribute.
	 * @see #isEmprestado()
	 * @generated
	 */
	void setEmprestado(boolean value);

	/**
	 * Returns the value of the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloqueado</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloqueado</em>' attribute.
	 * @see #setBloqueado(boolean)
	 * @see Model.ModelPackage#getExemplar_Bloqueado()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBloqueado();

	/**
	 * Sets the value of the '{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloqueado</em>' attribute.
	 * @see #isBloqueado()
	 * @generated
	 */
	void setBloqueado(boolean value);

} // Exemplar

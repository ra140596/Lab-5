/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tese</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Tese#getAutores <em>Autores</em>}</li>
 *   <li>{@link Model.Tese#getAnoPublicacao <em>Ano Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getTese()
 * @model
 * @generated
 */
public interface Tese extends Publicacao {
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
	 * @see Model.ModelPackage#getTese_Autores()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getAutores();

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
	 * @see Model.ModelPackage#getTese_AnoPublicacao()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAnoPublicacao();

	/**
	 * Sets the value of the '{@link Model.Tese#getAnoPublicacao <em>Ano Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ano Publicacao</em>' attribute.
	 * @see #getAnoPublicacao()
	 * @generated
	 */
	void setAnoPublicacao(int value);

} // Tese

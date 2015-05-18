/**
 */
package Model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodico</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Periodico#getDataPublicacao <em>Data Publicacao</em>}</li>
 *   <li>{@link Model.Periodico#getEditora <em>Editora</em>}</li>
 *   <li>{@link Model.Periodico#getPublicacoesPorSemana <em>Publicacoes Por Semana</em>}</li>
 *   <li>{@link Model.Periodico#getNomePeriodico <em>Nome Periodico</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getPeriodico()
 * @model
 * @generated
 */
public interface Periodico extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Publicacao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Publicacao</em>' attribute.
	 * @see #setDataPublicacao(Date)
	 * @see Model.ModelPackage#getPeriodico_DataPublicacao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataPublicacao();

	/**
	 * Sets the value of the '{@link Model.Periodico#getDataPublicacao <em>Data Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Publicacao</em>' attribute.
	 * @see #getDataPublicacao()
	 * @generated
	 */
	void setDataPublicacao(Date value);

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
	 * @see Model.ModelPackage#getPeriodico_Editora()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEditora();

	/**
	 * Sets the value of the '{@link Model.Periodico#getEditora <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editora</em>' attribute.
	 * @see #getEditora()
	 * @generated
	 */
	void setEditora(String value);

	/**
	 * Returns the value of the '<em><b>Publicacoes Por Semana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publicacoes Por Semana</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publicacoes Por Semana</em>' attribute.
	 * @see #setPublicacoesPorSemana(double)
	 * @see Model.ModelPackage#getPeriodico_PublicacoesPorSemana()
	 * @model dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getPublicacoesPorSemana();

	/**
	 * Sets the value of the '{@link Model.Periodico#getPublicacoesPorSemana <em>Publicacoes Por Semana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicacoes Por Semana</em>' attribute.
	 * @see #getPublicacoesPorSemana()
	 * @generated
	 */
	void setPublicacoesPorSemana(double value);

	/**
	 * Returns the value of the '<em><b>Nome Periodico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nome Periodico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nome Periodico</em>' attribute.
	 * @see #setNomePeriodico(String)
	 * @see Model.ModelPackage#getPeriodico_NomePeriodico()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNomePeriodico();

	/**
	 * Sets the value of the '{@link Model.Periodico#getNomePeriodico <em>Nome Periodico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nome Periodico</em>' attribute.
	 * @see #getNomePeriodico()
	 * @generated
	 */
	void setNomePeriodico(String value);

} // Periodico

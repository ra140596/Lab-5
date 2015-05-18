/**
 */
package Model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Manual#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.Manual#getDisciplina <em>Disciplina</em>}</li>
 *   <li>{@link Model.Manual#getAnoPublicacao <em>Ano Publicacao</em>}</li>
 *   <li>{@link Model.Manual#getProfessores <em>Professores</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getManual()
 * @model
 * @generated
 */
public interface Manual extends Publicacao {
	/**
	 * Returns the value of the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instituto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instituto</em>' attribute.
	 * @see #setInstituto(String)
	 * @see Model.ModelPackage#getManual_Instituto()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInstituto();

	/**
	 * Sets the value of the '{@link Model.Manual#getInstituto <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instituto</em>' attribute.
	 * @see #getInstituto()
	 * @generated
	 */
	void setInstituto(String value);

	/**
	 * Returns the value of the '<em><b>Disciplina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disciplina</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplina</em>' attribute.
	 * @see #setDisciplina(String)
	 * @see Model.ModelPackage#getManual_Disciplina()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDisciplina();

	/**
	 * Sets the value of the '{@link Model.Manual#getDisciplina <em>Disciplina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disciplina</em>' attribute.
	 * @see #getDisciplina()
	 * @generated
	 */
	void setDisciplina(String value);

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
	 * @see Model.ModelPackage#getManual_AnoPublicacao()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAnoPublicacao();

	/**
	 * Sets the value of the '{@link Model.Manual#getAnoPublicacao <em>Ano Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ano Publicacao</em>' attribute.
	 * @see #getAnoPublicacao()
	 * @generated
	 */
	void setAnoPublicacao(int value);

	/**
	 * Returns the value of the '<em><b>Professores</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professores</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professores</em>' attribute list.
	 * @see Model.ModelPackage#getManual_Professores()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getProfessores();

} // Manual

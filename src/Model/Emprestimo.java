/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Emprestimo#getCodigoEmprestimo <em>Codigo Emprestimo</em>}</li>
 *   <li>{@link Model.Emprestimo#getDataEmprestimo <em>Data Emprestimo</em>}</li>
 *   <li>{@link Model.Emprestimo#getDataDevolucao <em>Data Devolucao</em>}</li>
 *   <li>{@link Model.Emprestimo#getMulta <em>Multa</em>}</li>
 *   <li>{@link Model.Emprestimo#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link Model.Emprestimo#getUsuario <em>Usuario</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getEmprestimo()
 * @model
 * @generated
 */
public interface Emprestimo extends EObject {
	/**
	 * Returns the value of the '<em><b>Codigo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Emprestimo</em>' attribute.
	 * @see #setCodigoEmprestimo(int)
	 * @see Model.ModelPackage#getEmprestimo_CodigoEmprestimo()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCodigoEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getCodigoEmprestimo <em>Codigo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Emprestimo</em>' attribute.
	 * @see #getCodigoEmprestimo()
	 * @generated
	 */
	void setCodigoEmprestimo(int value);

	/**
	 * Returns the value of the '<em><b>Data Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Emprestimo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Emprestimo</em>' attribute.
	 * @see #setDataEmprestimo(Date)
	 * @see Model.ModelPackage#getEmprestimo_DataEmprestimo()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataEmprestimo();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDataEmprestimo <em>Data Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Emprestimo</em>' attribute.
	 * @see #getDataEmprestimo()
	 * @generated
	 */
	void setDataEmprestimo(Date value);

	/**
	 * Returns the value of the '<em><b>Data Devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Devolucao</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Devolucao</em>' attribute.
	 * @see #setDataDevolucao(Date)
	 * @see Model.ModelPackage#getEmprestimo_DataDevolucao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataDevolucao();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getDataDevolucao <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Devolucao</em>' attribute.
	 * @see #getDataDevolucao()
	 * @generated
	 */
	void setDataDevolucao(Date value);

	/**
	 * Returns the value of the '<em><b>Multa</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multa</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multa</em>' attribute.
	 * @see #setMulta(double)
	 * @see Model.ModelPackage#getEmprestimo_Multa()
	 * @model default="0" dataType="org.eclipse.uml2.types.Real" required="true" ordered="false"
	 * @generated
	 */
	double getMulta();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getMulta <em>Multa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multa</em>' attribute.
	 * @see #getMulta()
	 * @generated
	 */
	void setMulta(double value);

	/**
	 * Returns the value of the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exemplar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exemplar</em>' reference.
	 * @see #setExemplar(Exemplar)
	 * @see Model.ModelPackage#getEmprestimo_Exemplar()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Exemplar getExemplar();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getExemplar <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exemplar</em>' reference.
	 * @see #getExemplar()
	 * @generated
	 */
	void setExemplar(Exemplar value);

	/**
	 * Returns the value of the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usuario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usuario</em>' reference.
	 * @see #setUsuario(Usuario)
	 * @see Model.ModelPackage#getEmprestimo_Usuario()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link Model.Emprestimo#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

} // Emprestimo

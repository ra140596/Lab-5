/**
 */
package Model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserva</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Model.Reserva#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link Model.Reserva#getPublicacao <em>Publicacao</em>}</li>
 *   <li>{@link Model.Reserva#getDataRetirada <em>Data Retirada</em>}</li>
 *   <li>{@link Model.Reserva#getCodigoReserva <em>Codigo Reserva</em>}</li>
 * </ul>
 * </p>
 *
 * @see Model.ModelPackage#getReserva()
 * @model
 * @generated
 */
public interface Reserva extends EObject {
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
	 * @see Model.ModelPackage#getReserva_Usuario()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Usuario getUsuario();

	/**
	 * Sets the value of the '{@link Model.Reserva#getUsuario <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usuario</em>' reference.
	 * @see #getUsuario()
	 * @generated
	 */
	void setUsuario(Usuario value);

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
	 * @see Model.ModelPackage#getReserva_Publicacao()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Publicacao getPublicacao();

	/**
	 * Sets the value of the '{@link Model.Reserva#getPublicacao <em>Publicacao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publicacao</em>' reference.
	 * @see #getPublicacao()
	 * @generated
	 */
	void setPublicacao(Publicacao value);

	/**
	 * Returns the value of the '<em><b>Data Retirada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Retirada</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Retirada</em>' attribute.
	 * @see #setDataRetirada(Date)
	 * @see Model.ModelPackage#getReserva_DataRetirada()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getDataRetirada();

	/**
	 * Sets the value of the '{@link Model.Reserva#getDataRetirada <em>Data Retirada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Retirada</em>' attribute.
	 * @see #getDataRetirada()
	 * @generated
	 */
	void setDataRetirada(Date value);

	/**
	 * Returns the value of the '<em><b>Codigo Reserva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codigo Reserva</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codigo Reserva</em>' attribute.
	 * @see #setCodigoReserva(int)
	 * @see Model.ModelPackage#getReserva_CodigoReserva()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCodigoReserva();

	/**
	 * Sets the value of the '{@link Model.Reserva#getCodigoReserva <em>Codigo Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codigo Reserva</em>' attribute.
	 * @see #getCodigoReserva()
	 * @generated
	 */
	void setCodigoReserva(int value);

} // Reserva

/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Publicacao;
import Model.Reserva;
import Model.Usuario;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserva</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ReservaImpl#getUsuario <em>Usuario</em>}</li>
 *   <li>{@link Model.impl.ReservaImpl#getPublicacao <em>Publicacao</em>}</li>
 *   <li>{@link Model.impl.ReservaImpl#getDataRetirada <em>Data Retirada</em>}</li>
 *   <li>{@link Model.impl.ReservaImpl#getCodigoReserva <em>Codigo Reserva</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservaImpl extends MinimalEObjectImpl.Container implements Reserva {
	/**
	 * The cached value of the '{@link #getUsuario() <em>Usuario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsuario()
	 * @generated
	 * @ordered
	 */
	protected Usuario usuario;

	/**
	 * The cached value of the '{@link #getPublicacao() <em>Publicacao</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicacao()
	 * @generated
	 * @ordered
	 */
	protected Publicacao publicacao;

	/**
	 * The default value of the '{@link #getDataRetirada() <em>Data Retirada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRetirada()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_RETIRADA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataRetirada() <em>Data Retirada</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataRetirada()
	 * @generated
	 * @ordered
	 */
	protected Date dataRetirada = DATA_RETIRADA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoReserva() <em>Codigo Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoReserva()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_RESERVA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigoReserva() <em>Codigo Reserva</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoReserva()
	 * @generated
	 * @ordered
	 */
	protected int codigoReserva = CODIGO_RESERVA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RESERVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario getUsuario() {
		if (usuario != null && usuario.eIsProxy()) {
			InternalEObject oldUsuario = (InternalEObject)usuario;
			usuario = (Usuario)eResolveProxy(oldUsuario);
			if (usuario != oldUsuario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVA__USUARIO, oldUsuario, usuario));
			}
		}
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usuario basicGetUsuario() {
		return usuario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsuario(Usuario newUsuario) {
		Usuario oldUsuario = usuario;
		usuario = newUsuario;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVA__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao getPublicacao() {
		if (publicacao != null && publicacao.eIsProxy()) {
			InternalEObject oldPublicacao = (InternalEObject)publicacao;
			publicacao = (Publicacao)eResolveProxy(oldPublicacao);
			if (publicacao != oldPublicacao) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.RESERVA__PUBLICACAO, oldPublicacao, publicacao));
			}
		}
		return publicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publicacao basicGetPublicacao() {
		return publicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicacao(Publicacao newPublicacao) {
		Publicacao oldPublicacao = publicacao;
		publicacao = newPublicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVA__PUBLICACAO, oldPublicacao, publicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataRetirada() {
		return dataRetirada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataRetirada(Date newDataRetirada) {
		Date oldDataRetirada = dataRetirada;
		dataRetirada = newDataRetirada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVA__DATA_RETIRADA, oldDataRetirada, dataRetirada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigoReserva() {
		return codigoReserva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoReserva(int newCodigoReserva) {
		int oldCodigoReserva = codigoReserva;
		codigoReserva = newCodigoReserva;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.RESERVA__CODIGO_RESERVA, oldCodigoReserva, codigoReserva));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RESERVA__USUARIO:
				if (resolve) return getUsuario();
				return basicGetUsuario();
			case ModelPackage.RESERVA__PUBLICACAO:
				if (resolve) return getPublicacao();
				return basicGetPublicacao();
			case ModelPackage.RESERVA__DATA_RETIRADA:
				return getDataRetirada();
			case ModelPackage.RESERVA__CODIGO_RESERVA:
				return getCodigoReserva();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.RESERVA__USUARIO:
				setUsuario((Usuario)newValue);
				return;
			case ModelPackage.RESERVA__PUBLICACAO:
				setPublicacao((Publicacao)newValue);
				return;
			case ModelPackage.RESERVA__DATA_RETIRADA:
				setDataRetirada((Date)newValue);
				return;
			case ModelPackage.RESERVA__CODIGO_RESERVA:
				setCodigoReserva((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.RESERVA__USUARIO:
				setUsuario((Usuario)null);
				return;
			case ModelPackage.RESERVA__PUBLICACAO:
				setPublicacao((Publicacao)null);
				return;
			case ModelPackage.RESERVA__DATA_RETIRADA:
				setDataRetirada(DATA_RETIRADA_EDEFAULT);
				return;
			case ModelPackage.RESERVA__CODIGO_RESERVA:
				setCodigoReserva(CODIGO_RESERVA_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.RESERVA__USUARIO:
				return usuario != null;
			case ModelPackage.RESERVA__PUBLICACAO:
				return publicacao != null;
			case ModelPackage.RESERVA__DATA_RETIRADA:
				return DATA_RETIRADA_EDEFAULT == null ? dataRetirada != null : !DATA_RETIRADA_EDEFAULT.equals(dataRetirada);
			case ModelPackage.RESERVA__CODIGO_RESERVA:
				return codigoReserva != CODIGO_RESERVA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataRetirada: ");
		result.append(dataRetirada);
		result.append(", codigoReserva: ");
		result.append(codigoReserva);
		result.append(')');
		return result.toString();
	}

} //ReservaImpl

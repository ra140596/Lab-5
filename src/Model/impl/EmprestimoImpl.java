/**
 */
package Model.impl;

import Model.Emprestimo;
import Model.Exemplar;
import Model.ModelPackage;
import Model.Usuario;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emprestimo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.EmprestimoImpl#getCodigoEmprestimo <em>Codigo Emprestimo</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getDataEmprestimo <em>Data Emprestimo</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getDataDevolucao <em>Data Devolucao</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getMulta <em>Multa</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getExemplar <em>Exemplar</em>}</li>
 *   <li>{@link Model.impl.EmprestimoImpl#getUsuario <em>Usuario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmprestimoImpl extends MinimalEObjectImpl.Container implements Emprestimo {
	/**
	 * The default value of the '{@link #getCodigoEmprestimo() <em>Codigo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_EMPRESTIMO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigoEmprestimo() <em>Codigo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected int codigoEmprestimo = CODIGO_EMPRESTIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataEmprestimo() <em>Data Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_EMPRESTIMO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataEmprestimo() <em>Data Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected Date dataEmprestimo = DATA_EMPRESTIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataDevolucao() <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDevolucao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_DEVOLUCAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataDevolucao() <em>Data Devolucao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDevolucao()
	 * @generated
	 * @ordered
	 */
	protected Date dataDevolucao = DATA_DEVOLUCAO_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulta() <em>Multa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulta()
	 * @generated
	 * @ordered
	 */
	protected static final double MULTA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMulta() <em>Multa</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulta()
	 * @generated
	 * @ordered
	 */
	protected double multa = MULTA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExemplar() <em>Exemplar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemplar()
	 * @generated
	 * @ordered
	 */
	protected Exemplar exemplar;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmprestimoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EMPRESTIMO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoEmprestimo(int newCodigoEmprestimo) {
		int oldCodigoEmprestimo = codigoEmprestimo;
		codigoEmprestimo = newCodigoEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__CODIGO_EMPRESTIMO, oldCodigoEmprestimo, codigoEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEmprestimo(Date newDataEmprestimo) {
		Date oldDataEmprestimo = dataEmprestimo;
		dataEmprestimo = newDataEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO, oldDataEmprestimo, dataEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDevolucao(Date newDataDevolucao) {
		Date oldDataDevolucao = dataDevolucao;
		dataDevolucao = newDataDevolucao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO, oldDataDevolucao, dataDevolucao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMulta() {
		return multa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulta(double newMulta) {
		double oldMulta = multa;
		multa = newMulta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__MULTA, oldMulta, multa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar getExemplar() {
		if (exemplar != null && exemplar.eIsProxy()) {
			InternalEObject oldExemplar = (InternalEObject)exemplar;
			exemplar = (Exemplar)eResolveProxy(oldExemplar);
			if (exemplar != oldExemplar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__EXEMPLAR, oldExemplar, exemplar));
			}
		}
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exemplar basicGetExemplar() {
		return exemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExemplar(Exemplar newExemplar) {
		Exemplar oldExemplar = exemplar;
		exemplar = newExemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__EXEMPLAR, oldExemplar, exemplar));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EMPRESTIMO__USUARIO, oldUsuario, usuario));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EMPRESTIMO__USUARIO, oldUsuario, usuario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EMPRESTIMO__CODIGO_EMPRESTIMO:
				return getCodigoEmprestimo();
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				return getDataEmprestimo();
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				return getDataDevolucao();
			case ModelPackage.EMPRESTIMO__MULTA:
				return getMulta();
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				if (resolve) return getExemplar();
				return basicGetExemplar();
			case ModelPackage.EMPRESTIMO__USUARIO:
				if (resolve) return getUsuario();
				return basicGetUsuario();
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
			case ModelPackage.EMPRESTIMO__CODIGO_EMPRESTIMO:
				setCodigoEmprestimo((Integer)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				setDataEmprestimo((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				setDataDevolucao((Date)newValue);
				return;
			case ModelPackage.EMPRESTIMO__MULTA:
				setMulta((Double)newValue);
				return;
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				setExemplar((Exemplar)newValue);
				return;
			case ModelPackage.EMPRESTIMO__USUARIO:
				setUsuario((Usuario)newValue);
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
			case ModelPackage.EMPRESTIMO__CODIGO_EMPRESTIMO:
				setCodigoEmprestimo(CODIGO_EMPRESTIMO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				setDataEmprestimo(DATA_EMPRESTIMO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				setDataDevolucao(DATA_DEVOLUCAO_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__MULTA:
				setMulta(MULTA_EDEFAULT);
				return;
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				setExemplar((Exemplar)null);
				return;
			case ModelPackage.EMPRESTIMO__USUARIO:
				setUsuario((Usuario)null);
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
			case ModelPackage.EMPRESTIMO__CODIGO_EMPRESTIMO:
				return codigoEmprestimo != CODIGO_EMPRESTIMO_EDEFAULT;
			case ModelPackage.EMPRESTIMO__DATA_EMPRESTIMO:
				return DATA_EMPRESTIMO_EDEFAULT == null ? dataEmprestimo != null : !DATA_EMPRESTIMO_EDEFAULT.equals(dataEmprestimo);
			case ModelPackage.EMPRESTIMO__DATA_DEVOLUCAO:
				return DATA_DEVOLUCAO_EDEFAULT == null ? dataDevolucao != null : !DATA_DEVOLUCAO_EDEFAULT.equals(dataDevolucao);
			case ModelPackage.EMPRESTIMO__MULTA:
				return multa != MULTA_EDEFAULT;
			case ModelPackage.EMPRESTIMO__EXEMPLAR:
				return exemplar != null;
			case ModelPackage.EMPRESTIMO__USUARIO:
				return usuario != null;
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
		result.append(" (codigoEmprestimo: ");
		result.append(codigoEmprestimo);
		result.append(", dataEmprestimo: ");
		result.append(dataEmprestimo);
		result.append(", dataDevolucao: ");
		result.append(dataDevolucao);
		result.append(", multa: ");
		result.append(multa);
		result.append(')');
		return result.toString();
	}

} //EmprestimoImpl

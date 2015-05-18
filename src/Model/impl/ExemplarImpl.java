/**
 */
package Model.impl;

import Model.Exemplar;
import Model.ModelPackage;
import Model.Publicacao;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exemplar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ExemplarImpl#getCodigoExemplar <em>Codigo Exemplar</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#getPublicacao <em>Publicacao</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#isEmprestado <em>Emprestado</em>}</li>
 *   <li>{@link Model.impl.ExemplarImpl#isBloqueado <em>Bloqueado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExemplarImpl extends MinimalEObjectImpl.Container implements Exemplar {
	/**
	 * The default value of the '{@link #getCodigoExemplar() <em>Codigo Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoExemplar()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_EXEMPLAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigoExemplar() <em>Codigo Exemplar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoExemplar()
	 * @generated
	 * @ordered
	 */
	protected int codigoExemplar = CODIGO_EXEMPLAR_EDEFAULT;

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
	 * The default value of the '{@link #isEmprestado() <em>Emprestado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmprestado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMPRESTADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmprestado() <em>Emprestado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmprestado()
	 * @generated
	 * @ordered
	 */
	protected boolean emprestado = EMPRESTADO_EDEFAULT;

	/**
	 * The default value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOQUEADO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBloqueado() <em>Bloqueado</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBloqueado()
	 * @generated
	 * @ordered
	 */
	protected boolean bloqueado = BLOQUEADO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExemplarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.EXEMPLAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigoExemplar() {
		return codigoExemplar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoExemplar(int newCodigoExemplar) {
		int oldCodigoExemplar = codigoExemplar;
		codigoExemplar = newCodigoExemplar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__CODIGO_EXEMPLAR, oldCodigoExemplar, codigoExemplar));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.EXEMPLAR__PUBLICACAO, oldPublicacao, publicacao));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__PUBLICACAO, oldPublicacao, publicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEmprestado() {
		return emprestado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmprestado(boolean newEmprestado) {
		boolean oldEmprestado = emprestado;
		emprestado = newEmprestado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__EMPRESTADO, oldEmprestado, emprestado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBloqueado() {
		return bloqueado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloqueado(boolean newBloqueado) {
		boolean oldBloqueado = bloqueado;
		bloqueado = newBloqueado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.EXEMPLAR__BLOQUEADO, oldBloqueado, bloqueado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.EXEMPLAR__CODIGO_EXEMPLAR:
				return getCodigoExemplar();
			case ModelPackage.EXEMPLAR__PUBLICACAO:
				if (resolve) return getPublicacao();
				return basicGetPublicacao();
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				return isEmprestado();
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				return isBloqueado();
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
			case ModelPackage.EXEMPLAR__CODIGO_EXEMPLAR:
				setCodigoExemplar((Integer)newValue);
				return;
			case ModelPackage.EXEMPLAR__PUBLICACAO:
				setPublicacao((Publicacao)newValue);
				return;
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				setEmprestado((Boolean)newValue);
				return;
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				setBloqueado((Boolean)newValue);
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
			case ModelPackage.EXEMPLAR__CODIGO_EXEMPLAR:
				setCodigoExemplar(CODIGO_EXEMPLAR_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__PUBLICACAO:
				setPublicacao((Publicacao)null);
				return;
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				setEmprestado(EMPRESTADO_EDEFAULT);
				return;
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				setBloqueado(BLOQUEADO_EDEFAULT);
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
			case ModelPackage.EXEMPLAR__CODIGO_EXEMPLAR:
				return codigoExemplar != CODIGO_EXEMPLAR_EDEFAULT;
			case ModelPackage.EXEMPLAR__PUBLICACAO:
				return publicacao != null;
			case ModelPackage.EXEMPLAR__EMPRESTADO:
				return emprestado != EMPRESTADO_EDEFAULT;
			case ModelPackage.EXEMPLAR__BLOQUEADO:
				return bloqueado != BLOQUEADO_EDEFAULT;
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
		result.append(" (codigoExemplar: ");
		result.append(codigoExemplar);
		result.append(", emprestado: ");
		result.append(emprestado);
		result.append(", bloqueado: ");
		result.append(bloqueado);
		result.append(')');
		return result.toString();
	}

} //ExemplarImpl

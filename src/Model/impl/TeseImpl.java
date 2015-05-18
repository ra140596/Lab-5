/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Tese;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tese</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.TeseImpl#getAutores <em>Autores</em>}</li>
 *   <li>{@link Model.impl.TeseImpl#getAnoPublicacao <em>Ano Publicacao</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeseImpl extends PublicacaoImpl implements Tese {
	/**
	 * The cached value of the '{@link #getAutores() <em>Autores</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutores()
	 * @generated
	 * @ordered
	 */
	protected EList<String> autores;

	/**
	 * The default value of the '{@link #getAnoPublicacao() <em>Ano Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnoPublicacao()
	 * @generated
	 * @ordered
	 */
	protected static final int ANO_PUBLICACAO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnoPublicacao() <em>Ano Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnoPublicacao()
	 * @generated
	 * @ordered
	 */
	protected int anoPublicacao = ANO_PUBLICACAO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TESE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAutores() {
		if (autores == null) {
			autores = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.TESE__AUTORES);
		}
		return autores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnoPublicacao(int newAnoPublicacao) {
		int oldAnoPublicacao = anoPublicacao;
		anoPublicacao = newAnoPublicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TESE__ANO_PUBLICACAO, oldAnoPublicacao, anoPublicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TESE__AUTORES:
				return getAutores();
			case ModelPackage.TESE__ANO_PUBLICACAO:
				return getAnoPublicacao();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.TESE__AUTORES:
				getAutores().clear();
				getAutores().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.TESE__ANO_PUBLICACAO:
				setAnoPublicacao((Integer)newValue);
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
			case ModelPackage.TESE__AUTORES:
				getAutores().clear();
				return;
			case ModelPackage.TESE__ANO_PUBLICACAO:
				setAnoPublicacao(ANO_PUBLICACAO_EDEFAULT);
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
			case ModelPackage.TESE__AUTORES:
				return autores != null && !autores.isEmpty();
			case ModelPackage.TESE__ANO_PUBLICACAO:
				return anoPublicacao != ANO_PUBLICACAO_EDEFAULT;
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
		result.append(" (autores: ");
		result.append(autores);
		result.append(", anoPublicacao: ");
		result.append(anoPublicacao);
		result.append(')');
		return result.toString();
	}

} //TeseImpl

/**
 */
package Model.impl;

import Model.Livro;
import Model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Livro</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.LivroImpl#getAnoPublicacao <em>Ano Publicacao</em>}</li>
 *   <li>{@link Model.impl.LivroImpl#getEdicao <em>Edicao</em>}</li>
 *   <li>{@link Model.impl.LivroImpl#getAutores <em>Autores</em>}</li>
 *   <li>{@link Model.impl.LivroImpl#getEditora <em>Editora</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivroImpl extends PublicacaoImpl implements Livro {
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
	 * The default value of the '{@link #getEdicao() <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicao()
	 * @generated
	 * @ordered
	 */
	protected static final int EDICAO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEdicao() <em>Edicao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdicao()
	 * @generated
	 * @ordered
	 */
	protected int edicao = EDICAO_EDEFAULT;

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
	 * The default value of the '{@link #getEditora() <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditora()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITORA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditora() <em>Editora</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditora()
	 * @generated
	 * @ordered
	 */
	protected String editora = EDITORA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivroImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.LIVRO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__ANO_PUBLICACAO, oldAnoPublicacao, anoPublicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEdicao() {
		return edicao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdicao(int newEdicao) {
		int oldEdicao = edicao;
		edicao = newEdicao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__EDICAO, oldEdicao, edicao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAutores() {
		if (autores == null) {
			autores = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.LIVRO__AUTORES);
		}
		return autores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditora() {
		return editora;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditora(String newEditora) {
		String oldEditora = editora;
		editora = newEditora;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.LIVRO__EDITORA, oldEditora, editora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.LIVRO__ANO_PUBLICACAO:
				return getAnoPublicacao();
			case ModelPackage.LIVRO__EDICAO:
				return getEdicao();
			case ModelPackage.LIVRO__AUTORES:
				return getAutores();
			case ModelPackage.LIVRO__EDITORA:
				return getEditora();
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
			case ModelPackage.LIVRO__ANO_PUBLICACAO:
				setAnoPublicacao((Integer)newValue);
				return;
			case ModelPackage.LIVRO__EDICAO:
				setEdicao((Integer)newValue);
				return;
			case ModelPackage.LIVRO__AUTORES:
				getAutores().clear();
				getAutores().addAll((Collection<? extends String>)newValue);
				return;
			case ModelPackage.LIVRO__EDITORA:
				setEditora((String)newValue);
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
			case ModelPackage.LIVRO__ANO_PUBLICACAO:
				setAnoPublicacao(ANO_PUBLICACAO_EDEFAULT);
				return;
			case ModelPackage.LIVRO__EDICAO:
				setEdicao(EDICAO_EDEFAULT);
				return;
			case ModelPackage.LIVRO__AUTORES:
				getAutores().clear();
				return;
			case ModelPackage.LIVRO__EDITORA:
				setEditora(EDITORA_EDEFAULT);
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
			case ModelPackage.LIVRO__ANO_PUBLICACAO:
				return anoPublicacao != ANO_PUBLICACAO_EDEFAULT;
			case ModelPackage.LIVRO__EDICAO:
				return edicao != EDICAO_EDEFAULT;
			case ModelPackage.LIVRO__AUTORES:
				return autores != null && !autores.isEmpty();
			case ModelPackage.LIVRO__EDITORA:
				return EDITORA_EDEFAULT == null ? editora != null : !EDITORA_EDEFAULT.equals(editora);
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
		result.append(" (anoPublicacao: ");
		result.append(anoPublicacao);
		result.append(", edicao: ");
		result.append(edicao);
		result.append(", autores: ");
		result.append(autores);
		result.append(", editora: ");
		result.append(editora);
		result.append(')');
		return result.toString();
	}

} //LivroImpl

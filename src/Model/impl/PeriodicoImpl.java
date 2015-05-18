/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Periodico;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Periodico</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.PeriodicoImpl#getDataPublicacao <em>Data Publicacao</em>}</li>
 *   <li>{@link Model.impl.PeriodicoImpl#getEditora <em>Editora</em>}</li>
 *   <li>{@link Model.impl.PeriodicoImpl#getPublicacoesPorSemana <em>Publicacoes Por Semana</em>}</li>
 *   <li>{@link Model.impl.PeriodicoImpl#getNomePeriodico <em>Nome Periodico</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PeriodicoImpl extends PublicacaoImpl implements Periodico {
	/**
	 * The default value of the '{@link #getDataPublicacao() <em>Data Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPublicacao()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATA_PUBLICACAO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataPublicacao() <em>Data Publicacao</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPublicacao()
	 * @generated
	 * @ordered
	 */
	protected Date dataPublicacao = DATA_PUBLICACAO_EDEFAULT;

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
	 * The default value of the '{@link #getPublicacoesPorSemana() <em>Publicacoes Por Semana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicacoesPorSemana()
	 * @generated
	 * @ordered
	 */
	protected static final double PUBLICACOES_POR_SEMANA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPublicacoesPorSemana() <em>Publicacoes Por Semana</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicacoesPorSemana()
	 * @generated
	 * @ordered
	 */
	protected double publicacoesPorSemana = PUBLICACOES_POR_SEMANA_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomePeriodico() <em>Nome Periodico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomePeriodico()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_PERIODICO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomePeriodico() <em>Nome Periodico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomePeriodico()
	 * @generated
	 * @ordered
	 */
	protected String nomePeriodico = NOME_PERIODICO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodicoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERIODICO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPublicacao(Date newDataPublicacao) {
		Date oldDataPublicacao = dataPublicacao;
		dataPublicacao = newDataPublicacao;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__DATA_PUBLICACAO, oldDataPublicacao, dataPublicacao));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__EDITORA, oldEditora, editora));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPublicacoesPorSemana() {
		return publicacoesPorSemana;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicacoesPorSemana(double newPublicacoesPorSemana) {
		double oldPublicacoesPorSemana = publicacoesPorSemana;
		publicacoesPorSemana = newPublicacoesPorSemana;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__PUBLICACOES_POR_SEMANA, oldPublicacoesPorSemana, publicacoesPorSemana));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomePeriodico() {
		return nomePeriodico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomePeriodico(String newNomePeriodico) {
		String oldNomePeriodico = nomePeriodico;
		nomePeriodico = newNomePeriodico;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERIODICO__NOME_PERIODICO, oldNomePeriodico, nomePeriodico));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERIODICO__DATA_PUBLICACAO:
				return getDataPublicacao();
			case ModelPackage.PERIODICO__EDITORA:
				return getEditora();
			case ModelPackage.PERIODICO__PUBLICACOES_POR_SEMANA:
				return getPublicacoesPorSemana();
			case ModelPackage.PERIODICO__NOME_PERIODICO:
				return getNomePeriodico();
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
			case ModelPackage.PERIODICO__DATA_PUBLICACAO:
				setDataPublicacao((Date)newValue);
				return;
			case ModelPackage.PERIODICO__EDITORA:
				setEditora((String)newValue);
				return;
			case ModelPackage.PERIODICO__PUBLICACOES_POR_SEMANA:
				setPublicacoesPorSemana((Double)newValue);
				return;
			case ModelPackage.PERIODICO__NOME_PERIODICO:
				setNomePeriodico((String)newValue);
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
			case ModelPackage.PERIODICO__DATA_PUBLICACAO:
				setDataPublicacao(DATA_PUBLICACAO_EDEFAULT);
				return;
			case ModelPackage.PERIODICO__EDITORA:
				setEditora(EDITORA_EDEFAULT);
				return;
			case ModelPackage.PERIODICO__PUBLICACOES_POR_SEMANA:
				setPublicacoesPorSemana(PUBLICACOES_POR_SEMANA_EDEFAULT);
				return;
			case ModelPackage.PERIODICO__NOME_PERIODICO:
				setNomePeriodico(NOME_PERIODICO_EDEFAULT);
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
			case ModelPackage.PERIODICO__DATA_PUBLICACAO:
				return DATA_PUBLICACAO_EDEFAULT == null ? dataPublicacao != null : !DATA_PUBLICACAO_EDEFAULT.equals(dataPublicacao);
			case ModelPackage.PERIODICO__EDITORA:
				return EDITORA_EDEFAULT == null ? editora != null : !EDITORA_EDEFAULT.equals(editora);
			case ModelPackage.PERIODICO__PUBLICACOES_POR_SEMANA:
				return publicacoesPorSemana != PUBLICACOES_POR_SEMANA_EDEFAULT;
			case ModelPackage.PERIODICO__NOME_PERIODICO:
				return NOME_PERIODICO_EDEFAULT == null ? nomePeriodico != null : !NOME_PERIODICO_EDEFAULT.equals(nomePeriodico);
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
		result.append(" (dataPublicacao: ");
		result.append(dataPublicacao);
		result.append(", editora: ");
		result.append(editora);
		result.append(", publicacoesPorSemana: ");
		result.append(publicacoesPorSemana);
		result.append(", nomePeriodico: ");
		result.append(nomePeriodico);
		result.append(')');
		return result.toString();
	}

} //PeriodicoImpl

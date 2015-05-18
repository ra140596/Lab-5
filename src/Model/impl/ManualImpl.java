/**
 */
package Model.impl;

import Model.Manual;
import Model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.ManualImpl#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.impl.ManualImpl#getDisciplina <em>Disciplina</em>}</li>
 *   <li>{@link Model.impl.ManualImpl#getAnoPublicacao <em>Ano Publicacao</em>}</li>
 *   <li>{@link Model.impl.ManualImpl#getProfessores <em>Professores</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManualImpl extends PublicacaoImpl implements Manual {
	/**
	 * The default value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstituto() <em>Instituto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstituto()
	 * @generated
	 * @ordered
	 */
	protected String instituto = INSTITUTO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisciplina() <em>Disciplina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplina()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCIPLINA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisciplina() <em>Disciplina</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplina()
	 * @generated
	 * @ordered
	 */
	protected String disciplina = DISCIPLINA_EDEFAULT;

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
	 * The cached value of the '{@link #getProfessores() <em>Professores</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessores()
	 * @generated
	 * @ordered
	 */
	protected EList<String> professores;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MANUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstituto() {
		return instituto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstituto(String newInstituto) {
		String oldInstituto = instituto;
		instituto = newInstituto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MANUAL__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisciplina() {
		return disciplina;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisciplina(String newDisciplina) {
		String oldDisciplina = disciplina;
		disciplina = newDisciplina;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MANUAL__DISCIPLINA, oldDisciplina, disciplina));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MANUAL__ANO_PUBLICACAO, oldAnoPublicacao, anoPublicacao));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProfessores() {
		if (professores == null) {
			professores = new EDataTypeUniqueEList<String>(String.class, this, ModelPackage.MANUAL__PROFESSORES);
		}
		return professores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MANUAL__INSTITUTO:
				return getInstituto();
			case ModelPackage.MANUAL__DISCIPLINA:
				return getDisciplina();
			case ModelPackage.MANUAL__ANO_PUBLICACAO:
				return getAnoPublicacao();
			case ModelPackage.MANUAL__PROFESSORES:
				return getProfessores();
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
			case ModelPackage.MANUAL__INSTITUTO:
				setInstituto((String)newValue);
				return;
			case ModelPackage.MANUAL__DISCIPLINA:
				setDisciplina((String)newValue);
				return;
			case ModelPackage.MANUAL__ANO_PUBLICACAO:
				setAnoPublicacao((Integer)newValue);
				return;
			case ModelPackage.MANUAL__PROFESSORES:
				getProfessores().clear();
				getProfessores().addAll((Collection<? extends String>)newValue);
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
			case ModelPackage.MANUAL__INSTITUTO:
				setInstituto(INSTITUTO_EDEFAULT);
				return;
			case ModelPackage.MANUAL__DISCIPLINA:
				setDisciplina(DISCIPLINA_EDEFAULT);
				return;
			case ModelPackage.MANUAL__ANO_PUBLICACAO:
				setAnoPublicacao(ANO_PUBLICACAO_EDEFAULT);
				return;
			case ModelPackage.MANUAL__PROFESSORES:
				getProfessores().clear();
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
			case ModelPackage.MANUAL__INSTITUTO:
				return INSTITUTO_EDEFAULT == null ? instituto != null : !INSTITUTO_EDEFAULT.equals(instituto);
			case ModelPackage.MANUAL__DISCIPLINA:
				return DISCIPLINA_EDEFAULT == null ? disciplina != null : !DISCIPLINA_EDEFAULT.equals(disciplina);
			case ModelPackage.MANUAL__ANO_PUBLICACAO:
				return anoPublicacao != ANO_PUBLICACAO_EDEFAULT;
			case ModelPackage.MANUAL__PROFESSORES:
				return professores != null && !professores.isEmpty();
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
		result.append(" (instituto: ");
		result.append(instituto);
		result.append(", disciplina: ");
		result.append(disciplina);
		result.append(", anoPublicacao: ");
		result.append(anoPublicacao);
		result.append(", professores: ");
		result.append(professores);
		result.append(')');
		return result.toString();
	}

} //ManualImpl

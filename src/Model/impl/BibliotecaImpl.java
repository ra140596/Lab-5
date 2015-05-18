/**
 */
package Model.impl;

import Model.Biblioteca;
import Model.Emprestimo;
import Model.Exemplar;
import Model.ModelPackage;
import Model.Publicacao;
import Model.Terminal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biblioteca</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.BibliotecaImpl#getNomeBiblioteca <em>Nome Biblioteca</em>}</li>
 *   <li>{@link Model.impl.BibliotecaImpl#getCodigoBiblioteca <em>Codigo Biblioteca</em>}</li>
 *   <li>{@link Model.impl.BibliotecaImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link Model.impl.BibliotecaImpl#getPublicacoes <em>Publicacoes</em>}</li>
 *   <li>{@link Model.impl.BibliotecaImpl#getExemplares <em>Exemplares</em>}</li>
 *   <li>{@link Model.impl.BibliotecaImpl#getEmprestimos <em>Emprestimos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliotecaImpl extends MinimalEObjectImpl.Container implements Biblioteca {
	/**
	 * The default value of the '{@link #getNomeBiblioteca() <em>Nome Biblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected static final String NOME_BIBLIOTECA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomeBiblioteca() <em>Nome Biblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomeBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected String nomeBiblioteca = NOME_BIBLIOTECA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoBiblioteca() <em>Codigo Biblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_BIBLIOTECA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigoBiblioteca() <em>Codigo Biblioteca</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoBiblioteca()
	 * @generated
	 * @ordered
	 */
	protected int codigoBiblioteca = CODIGO_BIBLIOTECA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminal()
	 * @generated
	 * @ordered
	 */
	protected Terminal terminal;

	/**
	 * The cached value of the '{@link #getPublicacoes() <em>Publicacoes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicacoes()
	 * @generated
	 * @ordered
	 */
	protected EList<Publicacao> publicacoes;

	/**
	 * The cached value of the '{@link #getExemplares() <em>Exemplares</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExemplares()
	 * @generated
	 * @ordered
	 */
	protected EList<Exemplar> exemplares;

	/**
	 * The cached value of the '{@link #getEmprestimos() <em>Emprestimos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmprestimos()
	 * @generated
	 * @ordered
	 */
	protected Emprestimo emprestimos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BIBLIOTECA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomeBiblioteca() {
		return nomeBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomeBiblioteca(String newNomeBiblioteca) {
		String oldNomeBiblioteca = nomeBiblioteca;
		nomeBiblioteca = newNomeBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__NOME_BIBLIOTECA, oldNomeBiblioteca, nomeBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigoBiblioteca() {
		return codigoBiblioteca;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoBiblioteca(int newCodigoBiblioteca) {
		int oldCodigoBiblioteca = codigoBiblioteca;
		codigoBiblioteca = newCodigoBiblioteca;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__CODIGO_BIBLIOTECA, oldCodigoBiblioteca, codigoBiblioteca));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal getTerminal() {
		if (terminal != null && terminal.eIsProxy()) {
			InternalEObject oldTerminal = (InternalEObject)terminal;
			terminal = (Terminal)eResolveProxy(oldTerminal);
			if (terminal != oldTerminal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BIBLIOTECA__TERMINAL, oldTerminal, terminal));
			}
		}
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminal basicGetTerminal() {
		return terminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminal(Terminal newTerminal) {
		Terminal oldTerminal = terminal;
		terminal = newTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__TERMINAL, oldTerminal, terminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Publicacao> getPublicacoes() {
		if (publicacoes == null) {
			publicacoes = new EObjectResolvingEList<Publicacao>(Publicacao.class, this, ModelPackage.BIBLIOTECA__PUBLICACOES);
		}
		return publicacoes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exemplar> getExemplares() {
		if (exemplares == null) {
			exemplares = new EObjectResolvingEList<Exemplar>(Exemplar.class, this, ModelPackage.BIBLIOTECA__EXEMPLARES);
		}
		return exemplares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo getEmprestimos() {
		if (emprestimos != null && emprestimos.eIsProxy()) {
			InternalEObject oldEmprestimos = (InternalEObject)emprestimos;
			emprestimos = (Emprestimo)eResolveProxy(oldEmprestimos);
			if (emprestimos != oldEmprestimos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BIBLIOTECA__EMPRESTIMOS, oldEmprestimos, emprestimos));
			}
		}
		return emprestimos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emprestimo basicGetEmprestimos() {
		return emprestimos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmprestimos(Emprestimo newEmprestimos) {
		Emprestimo oldEmprestimos = emprestimos;
		emprestimos = newEmprestimos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECA__EMPRESTIMOS, oldEmprestimos, emprestimos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECA__NOME_BIBLIOTECA:
				return getNomeBiblioteca();
			case ModelPackage.BIBLIOTECA__CODIGO_BIBLIOTECA:
				return getCodigoBiblioteca();
			case ModelPackage.BIBLIOTECA__TERMINAL:
				if (resolve) return getTerminal();
				return basicGetTerminal();
			case ModelPackage.BIBLIOTECA__PUBLICACOES:
				return getPublicacoes();
			case ModelPackage.BIBLIOTECA__EXEMPLARES:
				return getExemplares();
			case ModelPackage.BIBLIOTECA__EMPRESTIMOS:
				if (resolve) return getEmprestimos();
				return basicGetEmprestimos();
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
			case ModelPackage.BIBLIOTECA__NOME_BIBLIOTECA:
				setNomeBiblioteca((String)newValue);
				return;
			case ModelPackage.BIBLIOTECA__CODIGO_BIBLIOTECA:
				setCodigoBiblioteca((Integer)newValue);
				return;
			case ModelPackage.BIBLIOTECA__TERMINAL:
				setTerminal((Terminal)newValue);
				return;
			case ModelPackage.BIBLIOTECA__PUBLICACOES:
				getPublicacoes().clear();
				getPublicacoes().addAll((Collection<? extends Publicacao>)newValue);
				return;
			case ModelPackage.BIBLIOTECA__EXEMPLARES:
				getExemplares().clear();
				getExemplares().addAll((Collection<? extends Exemplar>)newValue);
				return;
			case ModelPackage.BIBLIOTECA__EMPRESTIMOS:
				setEmprestimos((Emprestimo)newValue);
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
			case ModelPackage.BIBLIOTECA__NOME_BIBLIOTECA:
				setNomeBiblioteca(NOME_BIBLIOTECA_EDEFAULT);
				return;
			case ModelPackage.BIBLIOTECA__CODIGO_BIBLIOTECA:
				setCodigoBiblioteca(CODIGO_BIBLIOTECA_EDEFAULT);
				return;
			case ModelPackage.BIBLIOTECA__TERMINAL:
				setTerminal((Terminal)null);
				return;
			case ModelPackage.BIBLIOTECA__PUBLICACOES:
				getPublicacoes().clear();
				return;
			case ModelPackage.BIBLIOTECA__EXEMPLARES:
				getExemplares().clear();
				return;
			case ModelPackage.BIBLIOTECA__EMPRESTIMOS:
				setEmprestimos((Emprestimo)null);
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
			case ModelPackage.BIBLIOTECA__NOME_BIBLIOTECA:
				return NOME_BIBLIOTECA_EDEFAULT == null ? nomeBiblioteca != null : !NOME_BIBLIOTECA_EDEFAULT.equals(nomeBiblioteca);
			case ModelPackage.BIBLIOTECA__CODIGO_BIBLIOTECA:
				return codigoBiblioteca != CODIGO_BIBLIOTECA_EDEFAULT;
			case ModelPackage.BIBLIOTECA__TERMINAL:
				return terminal != null;
			case ModelPackage.BIBLIOTECA__PUBLICACOES:
				return publicacoes != null && !publicacoes.isEmpty();
			case ModelPackage.BIBLIOTECA__EXEMPLARES:
				return exemplares != null && !exemplares.isEmpty();
			case ModelPackage.BIBLIOTECA__EMPRESTIMOS:
				return emprestimos != null;
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
		result.append(" (nomeBiblioteca: ");
		result.append(nomeBiblioteca);
		result.append(", codigoBiblioteca: ");
		result.append(codigoBiblioteca);
		result.append(')');
		return result.toString();
	}

} //BibliotecaImpl

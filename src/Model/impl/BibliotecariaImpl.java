/**
 */
package Model.impl;

import Model.Bibliotecaria;
import Model.Exemplar;
import Model.ModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bibliotecaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.BibliotecariaImpl#getSenhaAcesso <em>Senha Acesso</em>}</li>
 *   <li>{@link Model.impl.BibliotecariaImpl#getCodigoBibliotecaria <em>Codigo Bibliotecaria</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BibliotecariaImpl extends FuncionarioImpl implements Bibliotecaria {
	/**
	 * The default value of the '{@link #getSenhaAcesso() <em>Senha Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenhaAcesso()
	 * @generated
	 * @ordered
	 */
	protected static final int SENHA_ACESSO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSenhaAcesso() <em>Senha Acesso</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenhaAcesso()
	 * @generated
	 * @ordered
	 */
	protected int senhaAcesso = SENHA_ACESSO_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodigoBibliotecaria() <em>Codigo Bibliotecaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoBibliotecaria()
	 * @generated
	 * @ordered
	 */
	protected static final int CODIGO_BIBLIOTECARIA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCodigoBibliotecaria() <em>Codigo Bibliotecaria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodigoBibliotecaria()
	 * @generated
	 * @ordered
	 */
	protected int codigoBibliotecaria = CODIGO_BIBLIOTECARIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BibliotecariaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BIBLIOTECARIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSenhaAcesso() {
		return senhaAcesso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenhaAcesso(int newSenhaAcesso) {
		int oldSenhaAcesso = senhaAcesso;
		senhaAcesso = newSenhaAcesso;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECARIA__SENHA_ACESSO, oldSenhaAcesso, senhaAcesso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCodigoBibliotecaria() {
		return codigoBibliotecaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodigoBibliotecaria(int newCodigoBibliotecaria) {
		int oldCodigoBibliotecaria = codigoBibliotecaria;
		codigoBibliotecaria = newCodigoBibliotecaria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BIBLIOTECARIA__CODIGO_BIBLIOTECARIA, oldCodigoBibliotecaria, codigoBibliotecaria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void incluirExemplar() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excluirExemplar(Exemplar e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void atualizarExemplar(Exemplar e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BIBLIOTECARIA__SENHA_ACESSO:
				return getSenhaAcesso();
			case ModelPackage.BIBLIOTECARIA__CODIGO_BIBLIOTECARIA:
				return getCodigoBibliotecaria();
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
			case ModelPackage.BIBLIOTECARIA__SENHA_ACESSO:
				setSenhaAcesso((Integer)newValue);
				return;
			case ModelPackage.BIBLIOTECARIA__CODIGO_BIBLIOTECARIA:
				setCodigoBibliotecaria((Integer)newValue);
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
			case ModelPackage.BIBLIOTECARIA__SENHA_ACESSO:
				setSenhaAcesso(SENHA_ACESSO_EDEFAULT);
				return;
			case ModelPackage.BIBLIOTECARIA__CODIGO_BIBLIOTECARIA:
				setCodigoBibliotecaria(CODIGO_BIBLIOTECARIA_EDEFAULT);
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
			case ModelPackage.BIBLIOTECARIA__SENHA_ACESSO:
				return senhaAcesso != SENHA_ACESSO_EDEFAULT;
			case ModelPackage.BIBLIOTECARIA__CODIGO_BIBLIOTECARIA:
				return codigoBibliotecaria != CODIGO_BIBLIOTECARIA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.BIBLIOTECARIA___INCLUIR_EXEMPLAR:
				incluirExemplar();
				return null;
			case ModelPackage.BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR:
				excluirExemplar((Exemplar)arguments.get(0));
				return null;
			case ModelPackage.BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR:
				atualizarExemplar((Exemplar)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (senhaAcesso: ");
		result.append(senhaAcesso);
		result.append(", codigoBibliotecaria: ");
		result.append(codigoBibliotecaria);
		result.append(')');
		return result.toString();
	}

} //BibliotecariaImpl

/**
 */
package Model.impl;

import Model.ModelPackage;
import Model.Terminal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Terminal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.TerminalImpl#getNumeroTerminal <em>Numero Terminal</em>}</li>
 *   <li>{@link Model.impl.TerminalImpl#getSenhaTerminal <em>Senha Terminal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TerminalImpl extends MinimalEObjectImpl.Container implements Terminal {
	/**
	 * The default value of the '{@link #getNumeroTerminal() <em>Numero Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_TERMINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroTerminal() <em>Numero Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroTerminal()
	 * @generated
	 * @ordered
	 */
	protected int numeroTerminal = NUMERO_TERMINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSenhaTerminal() <em>Senha Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenhaTerminal()
	 * @generated
	 * @ordered
	 */
	protected static final int SENHA_TERMINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSenhaTerminal() <em>Senha Terminal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenhaTerminal()
	 * @generated
	 * @ordered
	 */
	protected int senhaTerminal = SENHA_TERMINAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.TERMINAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroTerminal() {
		return numeroTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroTerminal(int newNumeroTerminal) {
		int oldNumeroTerminal = numeroTerminal;
		numeroTerminal = newNumeroTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__NUMERO_TERMINAL, oldNumeroTerminal, numeroTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSenhaTerminal() {
		return senhaTerminal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSenhaTerminal(int newSenhaTerminal) {
		int oldSenhaTerminal = senhaTerminal;
		senhaTerminal = newSenhaTerminal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.TERMINAL__SENHA_TERMINAL, oldSenhaTerminal, senhaTerminal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.TERMINAL__NUMERO_TERMINAL:
				return getNumeroTerminal();
			case ModelPackage.TERMINAL__SENHA_TERMINAL:
				return getSenhaTerminal();
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
			case ModelPackage.TERMINAL__NUMERO_TERMINAL:
				setNumeroTerminal((Integer)newValue);
				return;
			case ModelPackage.TERMINAL__SENHA_TERMINAL:
				setSenhaTerminal((Integer)newValue);
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
			case ModelPackage.TERMINAL__NUMERO_TERMINAL:
				setNumeroTerminal(NUMERO_TERMINAL_EDEFAULT);
				return;
			case ModelPackage.TERMINAL__SENHA_TERMINAL:
				setSenhaTerminal(SENHA_TERMINAL_EDEFAULT);
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
			case ModelPackage.TERMINAL__NUMERO_TERMINAL:
				return numeroTerminal != NUMERO_TERMINAL_EDEFAULT;
			case ModelPackage.TERMINAL__SENHA_TERMINAL:
				return senhaTerminal != SENHA_TERMINAL_EDEFAULT;
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
		result.append(" (numeroTerminal: ");
		result.append(numeroTerminal);
		result.append(", senhaTerminal: ");
		result.append(senhaTerminal);
		result.append(')');
		return result.toString();
	}

} //TerminalImpl

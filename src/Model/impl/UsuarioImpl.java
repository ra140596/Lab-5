/**
 */
package Model.impl;

import Model.Emprestimo;
import Model.Exemplar;
import Model.ModelPackage;
import Model.Publicacao;
import Model.Reserva;
import Model.Usuario;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Model.impl.UsuarioImpl#getNumeroRegistro <em>Numero Registro</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getInstituto <em>Instituto</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEmprestimos <em>Emprestimos</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getReservas <em>Reservas</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTempoEmprestimo <em>Tempo Emprestimo</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getState <em>State</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getAddress1 <em>Address1</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCity <em>City</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCpf <em>Cpf</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCep <em>Cep</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getAddress2 <em>Address2</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link Model.impl.UsuarioImpl#getFirstName <em>First Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioImpl extends MinimalEObjectImpl.Container implements Usuario {
	/**
	 * The default value of the '{@link #getNumeroRegistro() <em>Numero Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRegistro()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERO_REGISTRO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumeroRegistro() <em>Numero Registro</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroRegistro()
	 * @generated
	 * @ordered
	 */
	protected int numeroRegistro = NUMERO_REGISTRO_EDEFAULT;

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
	 * The cached value of the '{@link #getEmprestimos() <em>Emprestimos</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmprestimos()
	 * @generated
	 * @ordered
	 */
	protected EList<Emprestimo> emprestimos;

	/**
	 * The cached value of the '{@link #getReservas() <em>Reservas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservas()
	 * @generated
	 * @ordered
	 */
	protected EList<Reserva> reservas;

	/**
	 * The default value of the '{@link #getTempoEmprestimo() <em>Tempo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempoEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected static final int TEMPO_EMPRESTIMO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTempoEmprestimo() <em>Tempo Emprestimo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTempoEmprestimo()
	 * @generated
	 * @ordered
	 */
	protected int tempoEmprestimo = TEMPO_EMPRESTIMO_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress1() <em>Address1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress1()
	 * @generated
	 * @ordered
	 */
	protected String address1 = ADDRESS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected static final int CPF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpf() <em>Cpf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpf()
	 * @generated
	 * @ordered
	 */
	protected int cpf = CPF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected static final int CEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCep() <em>Cep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCep()
	 * @generated
	 * @ordered
	 */
	protected int cep = CEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress2() <em>Address2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress2()
	 * @generated
	 * @ordered
	 */
	protected String address2 = ADDRESS2_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected int phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsuarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.USUARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroRegistro(int newNumeroRegistro) {
		int oldNumeroRegistro = numeroRegistro;
		numeroRegistro = newNumeroRegistro;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__NUMERO_REGISTRO, oldNumeroRegistro, numeroRegistro));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__INSTITUTO, oldInstituto, instituto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Emprestimo> getEmprestimos() {
		if (emprestimos == null) {
			emprestimos = new EObjectResolvingEList<Emprestimo>(Emprestimo.class, this, ModelPackage.USUARIO__EMPRESTIMOS);
		}
		return emprestimos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reserva> getReservas() {
		if (reservas == null) {
			reservas = new EObjectResolvingEList<Reserva>(Reserva.class, this, ModelPackage.USUARIO__RESERVAS);
		}
		return reservas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTempoEmprestimo() {
		return tempoEmprestimo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempoEmprestimo(int newTempoEmprestimo) {
		int oldTempoEmprestimo = tempoEmprestimo;
		tempoEmprestimo = newTempoEmprestimo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TEMPO_EMPRESTIMO, oldTempoEmprestimo, tempoEmprestimo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__BIRTHDATE, oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress1() {
		return address1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress1(String newAddress1) {
		String oldAddress1 = address1;
		address1 = newAddress1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ADDRESS1, oldAddress1, address1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpf() {
		return cpf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpf(int newCpf) {
		int oldCpf = cpf;
		cpf = newCpf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CPF, oldCpf, cpf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCep() {
		return cep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCep(int newCep) {
		int oldCep = cep;
		cep = newCep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__CEP, oldCep, cep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress2() {
		return address2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress2(String newAddress2) {
		String oldAddress2 = address2;
		address2 = newAddress2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__ADDRESS2, oldAddress2, address2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(int newPhone) {
		int oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.USUARIO__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reservar(Publicacao p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void emprestar(Exemplar e) {
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
			case ModelPackage.USUARIO__NUMERO_REGISTRO:
				return getNumeroRegistro();
			case ModelPackage.USUARIO__INSTITUTO:
				return getInstituto();
			case ModelPackage.USUARIO__EMPRESTIMOS:
				return getEmprestimos();
			case ModelPackage.USUARIO__RESERVAS:
				return getReservas();
			case ModelPackage.USUARIO__TEMPO_EMPRESTIMO:
				return getTempoEmprestimo();
			case ModelPackage.USUARIO__STATE:
				return getState();
			case ModelPackage.USUARIO__EMAIL:
				return getEmail();
			case ModelPackage.USUARIO__BIRTHDATE:
				return getBirthdate();
			case ModelPackage.USUARIO__ADDRESS1:
				return getAddress1();
			case ModelPackage.USUARIO__CITY:
				return getCity();
			case ModelPackage.USUARIO__TITLE:
				return getTitle();
			case ModelPackage.USUARIO__CPF:
				return getCpf();
			case ModelPackage.USUARIO__LAST_NAME:
				return getLastName();
			case ModelPackage.USUARIO__CEP:
				return getCep();
			case ModelPackage.USUARIO__ADDRESS2:
				return getAddress2();
			case ModelPackage.USUARIO__COUNTRY:
				return getCountry();
			case ModelPackage.USUARIO__PHONE:
				return getPhone();
			case ModelPackage.USUARIO__FIRST_NAME:
				return getFirstName();
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
			case ModelPackage.USUARIO__NUMERO_REGISTRO:
				setNumeroRegistro((Integer)newValue);
				return;
			case ModelPackage.USUARIO__INSTITUTO:
				setInstituto((String)newValue);
				return;
			case ModelPackage.USUARIO__EMPRESTIMOS:
				getEmprestimos().clear();
				getEmprestimos().addAll((Collection<? extends Emprestimo>)newValue);
				return;
			case ModelPackage.USUARIO__RESERVAS:
				getReservas().clear();
				getReservas().addAll((Collection<? extends Reserva>)newValue);
				return;
			case ModelPackage.USUARIO__TEMPO_EMPRESTIMO:
				setTempoEmprestimo((Integer)newValue);
				return;
			case ModelPackage.USUARIO__STATE:
				setState((String)newValue);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.USUARIO__BIRTHDATE:
				setBirthdate((Date)newValue);
				return;
			case ModelPackage.USUARIO__ADDRESS1:
				setAddress1((String)newValue);
				return;
			case ModelPackage.USUARIO__CITY:
				setCity((String)newValue);
				return;
			case ModelPackage.USUARIO__TITLE:
				setTitle((String)newValue);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf((Integer)newValue);
				return;
			case ModelPackage.USUARIO__LAST_NAME:
				setLastName((String)newValue);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep((Integer)newValue);
				return;
			case ModelPackage.USUARIO__ADDRESS2:
				setAddress2((String)newValue);
				return;
			case ModelPackage.USUARIO__COUNTRY:
				setCountry((String)newValue);
				return;
			case ModelPackage.USUARIO__PHONE:
				setPhone((Integer)newValue);
				return;
			case ModelPackage.USUARIO__FIRST_NAME:
				setFirstName((String)newValue);
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
			case ModelPackage.USUARIO__NUMERO_REGISTRO:
				setNumeroRegistro(NUMERO_REGISTRO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__INSTITUTO:
				setInstituto(INSTITUTO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__EMPRESTIMOS:
				getEmprestimos().clear();
				return;
			case ModelPackage.USUARIO__RESERVAS:
				getReservas().clear();
				return;
			case ModelPackage.USUARIO__TEMPO_EMPRESTIMO:
				setTempoEmprestimo(TEMPO_EMPRESTIMO_EDEFAULT);
				return;
			case ModelPackage.USUARIO__STATE:
				setState(STATE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.USUARIO__BIRTHDATE:
				setBirthdate(BIRTHDATE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ADDRESS1:
				setAddress1(ADDRESS1_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case ModelPackage.USUARIO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CPF:
				setCpf(CPF_EDEFAULT);
				return;
			case ModelPackage.USUARIO__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case ModelPackage.USUARIO__CEP:
				setCep(CEP_EDEFAULT);
				return;
			case ModelPackage.USUARIO__ADDRESS2:
				setAddress2(ADDRESS2_EDEFAULT);
				return;
			case ModelPackage.USUARIO__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case ModelPackage.USUARIO__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case ModelPackage.USUARIO__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
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
			case ModelPackage.USUARIO__NUMERO_REGISTRO:
				return numeroRegistro != NUMERO_REGISTRO_EDEFAULT;
			case ModelPackage.USUARIO__INSTITUTO:
				return INSTITUTO_EDEFAULT == null ? instituto != null : !INSTITUTO_EDEFAULT.equals(instituto);
			case ModelPackage.USUARIO__EMPRESTIMOS:
				return emprestimos != null && !emprestimos.isEmpty();
			case ModelPackage.USUARIO__RESERVAS:
				return reservas != null && !reservas.isEmpty();
			case ModelPackage.USUARIO__TEMPO_EMPRESTIMO:
				return tempoEmprestimo != TEMPO_EMPRESTIMO_EDEFAULT;
			case ModelPackage.USUARIO__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case ModelPackage.USUARIO__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.USUARIO__BIRTHDATE:
				return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
			case ModelPackage.USUARIO__ADDRESS1:
				return ADDRESS1_EDEFAULT == null ? address1 != null : !ADDRESS1_EDEFAULT.equals(address1);
			case ModelPackage.USUARIO__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case ModelPackage.USUARIO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ModelPackage.USUARIO__CPF:
				return cpf != CPF_EDEFAULT;
			case ModelPackage.USUARIO__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case ModelPackage.USUARIO__CEP:
				return cep != CEP_EDEFAULT;
			case ModelPackage.USUARIO__ADDRESS2:
				return ADDRESS2_EDEFAULT == null ? address2 != null : !ADDRESS2_EDEFAULT.equals(address2);
			case ModelPackage.USUARIO__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case ModelPackage.USUARIO__PHONE:
				return phone != PHONE_EDEFAULT;
			case ModelPackage.USUARIO__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
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
			case ModelPackage.USUARIO___RESERVAR__PUBLICACAO:
				reservar((Publicacao)arguments.get(0));
				return null;
			case ModelPackage.USUARIO___EMPRESTAR__EXEMPLAR:
				emprestar((Exemplar)arguments.get(0));
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
		result.append(" (numeroRegistro: ");
		result.append(numeroRegistro);
		result.append(", instituto: ");
		result.append(instituto);
		result.append(", tempoEmprestimo: ");
		result.append(tempoEmprestimo);
		result.append(", state: ");
		result.append(state);
		result.append(", email: ");
		result.append(email);
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", address1: ");
		result.append(address1);
		result.append(", city: ");
		result.append(city);
		result.append(", title: ");
		result.append(title);
		result.append(", cpf: ");
		result.append(cpf);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", cep: ");
		result.append(cep);
		result.append(", address2: ");
		result.append(address2);
		result.append(", country: ");
		result.append(country);
		result.append(", phone: ");
		result.append(phone);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(')');
		return result.toString();
	}

} //UsuarioImpl

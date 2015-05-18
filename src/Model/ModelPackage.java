/**
 */
package Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Model.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = Model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TerminalImpl
	 * @see Model.impl.ModelPackageImpl#getTerminal()
	 * @generated
	 */
	int TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Numero Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__NUMERO_TERMINAL = 0;

	/**
	 * The feature id for the '<em><b>Senha Terminal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL__SENHA_TERMINAL = 1;

	/**
	 * The number of structural features of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Terminal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecaImpl
	 * @see Model.impl.ModelPackageImpl#getBiblioteca()
	 * @generated
	 */
	int BIBLIOTECA = 1;

	/**
	 * The feature id for the '<em><b>Nome Biblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__NOME_BIBLIOTECA = 0;

	/**
	 * The feature id for the '<em><b>Codigo Biblioteca</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__CODIGO_BIBLIOTECA = 1;

	/**
	 * The feature id for the '<em><b>Terminal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__TERMINAL = 2;

	/**
	 * The feature id for the '<em><b>Publicacoes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__PUBLICACOES = 3;

	/**
	 * The feature id for the '<em><b>Exemplares</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__EXEMPLARES = 4;

	/**
	 * The feature id for the '<em><b>Emprestimos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA__EMPRESTIMOS = 5;

	/**
	 * The number of structural features of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Biblioteca</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PublicacaoImpl
	 * @see Model.impl.ModelPackageImpl#getPublicacao()
	 * @generated
	 */
	int PUBLICACAO = 2;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__TITULO = 0;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO__CODIGO = 1;

	/**
	 * The number of structural features of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Publicacao</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLICACAO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ExemplarImpl
	 * @see Model.impl.ModelPackageImpl#getExemplar()
	 * @generated
	 */
	int EXEMPLAR = 3;

	/**
	 * The feature id for the '<em><b>Codigo Exemplar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__CODIGO_EXEMPLAR = 0;

	/**
	 * The feature id for the '<em><b>Publicacao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__PUBLICACAO = 1;

	/**
	 * The feature id for the '<em><b>Emprestado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__EMPRESTADO = 2;

	/**
	 * The feature id for the '<em><b>Bloqueado</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR__BLOQUEADO = 3;

	/**
	 * The number of structural features of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Exemplar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEMPLAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.EmprestimoImpl
	 * @see Model.impl.ModelPackageImpl#getEmprestimo()
	 * @generated
	 */
	int EMPRESTIMO = 4;

	/**
	 * The feature id for the '<em><b>Codigo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__CODIGO_EMPRESTIMO = 0;

	/**
	 * The feature id for the '<em><b>Data Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DATA_EMPRESTIMO = 1;

	/**
	 * The feature id for the '<em><b>Data Devolucao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__DATA_DEVOLUCAO = 2;

	/**
	 * The feature id for the '<em><b>Multa</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__MULTA = 3;

	/**
	 * The feature id for the '<em><b>Exemplar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__EXEMPLAR = 4;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO__USUARIO = 5;

	/**
	 * The number of structural features of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Emprestimo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPRESTIMO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.UsuarioImpl
	 * @see Model.impl.ModelPackageImpl#getUsuario()
	 * @generated
	 */
	int USUARIO = 5;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__NUMERO_REGISTRO = 0;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__INSTITUTO = 1;

	/**
	 * The feature id for the '<em><b>Emprestimos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMPRESTIMOS = 2;

	/**
	 * The feature id for the '<em><b>Reservas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__RESERVAS = 3;

	/**
	 * The feature id for the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TEMPO_EMPRESTIMO = 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__STATE = 5;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__BIRTHDATE = 7;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ADDRESS1 = 8;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CITY = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CPF = 11;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__LAST_NAME = 12;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__CEP = 13;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__ADDRESS2 = 14;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__COUNTRY = 15;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__PHONE = 16;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO__FIRST_NAME = 17;

	/**
	 * The number of structural features of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_FEATURE_COUNT = 18;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___RESERVAR__PUBLICACAO = 0;

	/**
	 * The operation id for the '<em>Emprestar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO___EMPRESTAR__EXEMPLAR = 1;

	/**
	 * The number of operations of the '<em>Usuario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USUARIO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Model.impl.ReservaImpl <em>Reserva</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ReservaImpl
	 * @see Model.impl.ModelPackageImpl#getReserva()
	 * @generated
	 */
	int RESERVA = 6;

	/**
	 * The feature id for the '<em><b>Usuario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__USUARIO = 0;

	/**
	 * The feature id for the '<em><b>Publicacao</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__PUBLICACAO = 1;

	/**
	 * The feature id for the '<em><b>Data Retirada</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__DATA_RETIRADA = 2;

	/**
	 * The feature id for the '<em><b>Codigo Reserva</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA__CODIGO_RESERVA = 3;

	/**
	 * The number of structural features of the '<em>Reserva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Reserva</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.LivroImpl
	 * @see Model.impl.ModelPackageImpl#getLivro()
	 * @generated
	 */
	int LIVRO = 7;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__TITULO = PUBLICACAO__TITULO;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__CODIGO = PUBLICACAO__CODIGO;

	/**
	 * The feature id for the '<em><b>Ano Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__ANO_PUBLICACAO = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Edicao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EDICAO = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Autores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__AUTORES = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Editora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO__EDITORA = PUBLICACAO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Livro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVRO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.PeriodicoImpl <em>Periodico</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.PeriodicoImpl
	 * @see Model.impl.ModelPackageImpl#getPeriodico()
	 * @generated
	 */
	int PERIODICO = 8;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__TITULO = PUBLICACAO__TITULO;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__CODIGO = PUBLICACAO__CODIGO;

	/**
	 * The feature id for the '<em><b>Data Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__DATA_PUBLICACAO = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editora</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__EDITORA = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Publicacoes Por Semana</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__PUBLICACOES_POR_SEMANA = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Nome Periodico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO__NOME_PERIODICO = PUBLICACAO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Periodico</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODICO_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.TeseImpl
	 * @see Model.impl.ModelPackageImpl#getTese()
	 * @generated
	 */
	int TESE = 9;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__TITULO = PUBLICACAO__TITULO;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__CODIGO = PUBLICACAO__CODIGO;

	/**
	 * The feature id for the '<em><b>Autores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__AUTORES = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ano Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE__ANO_PUBLICACAO = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tese</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESE_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ManualImpl <em>Manual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ManualImpl
	 * @see Model.impl.ModelPackageImpl#getManual()
	 * @generated
	 */
	int MANUAL = 10;

	/**
	 * The feature id for the '<em><b>Titulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__TITULO = PUBLICACAO__TITULO;

	/**
	 * The feature id for the '<em><b>Codigo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__CODIGO = PUBLICACAO__CODIGO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__INSTITUTO = PUBLICACAO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disciplina</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__DISCIPLINA = PUBLICACAO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ano Publicacao</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__ANO_PUBLICACAO = PUBLICACAO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Professores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL__PROFESSORES = PUBLICACAO_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_FEATURE_COUNT = PUBLICACAO_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Manual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_OPERATION_COUNT = PUBLICACAO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.AlunoImpl
	 * @see Model.impl.ModelPackageImpl#getAluno()
	 * @generated
	 */
	int ALUNO = 11;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__NUMERO_REGISTRO = USUARIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__INSTITUTO = USUARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Emprestimos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMPRESTIMOS = USUARIO__EMPRESTIMOS;

	/**
	 * The feature id for the '<em><b>Reservas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__RESERVAS = USUARIO__RESERVAS;

	/**
	 * The feature id for the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TEMPO_EMPRESTIMO = USUARIO__TEMPO_EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__STATE = USUARIO__STATE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__BIRTHDATE = USUARIO__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ADDRESS1 = USUARIO__ADDRESS1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CITY = USUARIO__CITY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__TITLE = USUARIO__TITLE;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__LAST_NAME = USUARIO__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__ADDRESS2 = USUARIO__ADDRESS2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__COUNTRY = USUARIO__COUNTRY;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__PHONE = USUARIO__PHONE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__FIRST_NAME = USUARIO__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO__SUSPENSO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___RESERVAR__PUBLICACAO = USUARIO___RESERVAR__PUBLICACAO;

	/**
	 * The operation id for the '<em>Emprestar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO___EMPRESTAR__EXEMPLAR = USUARIO___EMPRESTAR__EXEMPLAR;

	/**
	 * The number of operations of the '<em>Aluno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALUNO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.ProfessorImpl
	 * @see Model.impl.ModelPackageImpl#getProfessor()
	 * @generated
	 */
	int PROFESSOR = 12;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__NUMERO_REGISTRO = USUARIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__INSTITUTO = USUARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Emprestimos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMPRESTIMOS = USUARIO__EMPRESTIMOS;

	/**
	 * The feature id for the '<em><b>Reservas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__RESERVAS = USUARIO__RESERVAS;

	/**
	 * The feature id for the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TEMPO_EMPRESTIMO = USUARIO__TEMPO_EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__STATE = USUARIO__STATE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__BIRTHDATE = USUARIO__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ADDRESS1 = USUARIO__ADDRESS1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CITY = USUARIO__CITY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__TITLE = USUARIO__TITLE;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__LAST_NAME = USUARIO__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__ADDRESS2 = USUARIO__ADDRESS2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__COUNTRY = USUARIO__COUNTRY;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__PHONE = USUARIO__PHONE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR__FIRST_NAME = USUARIO__FIRST_NAME;

	/**
	 * The number of structural features of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___RESERVAR__PUBLICACAO = USUARIO___RESERVAR__PUBLICACAO;

	/**
	 * The operation id for the '<em>Emprestar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___EMPRESTAR__EXEMPLAR = USUARIO___EMPRESTAR__EXEMPLAR;

	/**
	 * The operation id for the '<em>Bloquear Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR___BLOQUEAR_EXEMPLAR__EXEMPLAR = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSOR_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.FuncionarioImpl
	 * @see Model.impl.ModelPackageImpl#getFuncionario()
	 * @generated
	 */
	int FUNCIONARIO = 13;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__NUMERO_REGISTRO = USUARIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__INSTITUTO = USUARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Emprestimos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__EMPRESTIMOS = USUARIO__EMPRESTIMOS;

	/**
	 * The feature id for the '<em><b>Reservas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__RESERVAS = USUARIO__RESERVAS;

	/**
	 * The feature id for the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TEMPO_EMPRESTIMO = USUARIO__TEMPO_EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__STATE = USUARIO__STATE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__EMAIL = USUARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__BIRTHDATE = USUARIO__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ADDRESS1 = USUARIO__ADDRESS1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CITY = USUARIO__CITY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__TITLE = USUARIO__TITLE;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CPF = USUARIO__CPF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__LAST_NAME = USUARIO__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__CEP = USUARIO__CEP;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__ADDRESS2 = USUARIO__ADDRESS2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__COUNTRY = USUARIO__COUNTRY;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__PHONE = USUARIO__PHONE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__FIRST_NAME = USUARIO__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO__SUSPENSO = USUARIO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_FEATURE_COUNT = USUARIO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___RESERVAR__PUBLICACAO = USUARIO___RESERVAR__PUBLICACAO;

	/**
	 * The operation id for the '<em>Emprestar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO___EMPRESTAR__EXEMPLAR = USUARIO___EMPRESTAR__EXEMPLAR;

	/**
	 * The number of operations of the '<em>Funcionario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCIONARIO_OPERATION_COUNT = USUARIO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Model.impl.BibliotecariaImpl <em>Bibliotecaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Model.impl.BibliotecariaImpl
	 * @see Model.impl.ModelPackageImpl#getBibliotecaria()
	 * @generated
	 */
	int BIBLIOTECARIA = 14;

	/**
	 * The feature id for the '<em><b>Numero Registro</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__NUMERO_REGISTRO = FUNCIONARIO__NUMERO_REGISTRO;

	/**
	 * The feature id for the '<em><b>Instituto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__INSTITUTO = FUNCIONARIO__INSTITUTO;

	/**
	 * The feature id for the '<em><b>Emprestimos</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__EMPRESTIMOS = FUNCIONARIO__EMPRESTIMOS;

	/**
	 * The feature id for the '<em><b>Reservas</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__RESERVAS = FUNCIONARIO__RESERVAS;

	/**
	 * The feature id for the '<em><b>Tempo Emprestimo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__TEMPO_EMPRESTIMO = FUNCIONARIO__TEMPO_EMPRESTIMO;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__STATE = FUNCIONARIO__STATE;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__EMAIL = FUNCIONARIO__EMAIL;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__BIRTHDATE = FUNCIONARIO__BIRTHDATE;

	/**
	 * The feature id for the '<em><b>Address1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__ADDRESS1 = FUNCIONARIO__ADDRESS1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CITY = FUNCIONARIO__CITY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__TITLE = FUNCIONARIO__TITLE;

	/**
	 * The feature id for the '<em><b>Cpf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CPF = FUNCIONARIO__CPF;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__LAST_NAME = FUNCIONARIO__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Cep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CEP = FUNCIONARIO__CEP;

	/**
	 * The feature id for the '<em><b>Address2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__ADDRESS2 = FUNCIONARIO__ADDRESS2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__COUNTRY = FUNCIONARIO__COUNTRY;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__PHONE = FUNCIONARIO__PHONE;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__FIRST_NAME = FUNCIONARIO__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Suspenso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__SUSPENSO = FUNCIONARIO__SUSPENSO;

	/**
	 * The feature id for the '<em><b>Senha Acesso</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__SENHA_ACESSO = FUNCIONARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codigo Bibliotecaria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA__CODIGO_BIBLIOTECARIA = FUNCIONARIO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bibliotecaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA_FEATURE_COUNT = FUNCIONARIO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Reservar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___RESERVAR__PUBLICACAO = FUNCIONARIO___RESERVAR__PUBLICACAO;

	/**
	 * The operation id for the '<em>Emprestar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___EMPRESTAR__EXEMPLAR = FUNCIONARIO___EMPRESTAR__EXEMPLAR;

	/**
	 * The operation id for the '<em>Incluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___INCLUIR_EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Excluir Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Atualizar Exemplar</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR = FUNCIONARIO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bibliotecaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIBLIOTECARIA_OPERATION_COUNT = FUNCIONARIO_OPERATION_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link Model.Terminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal</em>'.
	 * @see Model.Terminal
	 * @generated
	 */
	EClass getTerminal();

	/**
	 * Returns the meta object for the attribute '{@link Model.Terminal#getNumeroTerminal <em>Numero Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Terminal</em>'.
	 * @see Model.Terminal#getNumeroTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_NumeroTerminal();

	/**
	 * Returns the meta object for the attribute '{@link Model.Terminal#getSenhaTerminal <em>Senha Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Senha Terminal</em>'.
	 * @see Model.Terminal#getSenhaTerminal()
	 * @see #getTerminal()
	 * @generated
	 */
	EAttribute getTerminal_SenhaTerminal();

	/**
	 * Returns the meta object for class '{@link Model.Biblioteca <em>Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biblioteca</em>'.
	 * @see Model.Biblioteca
	 * @generated
	 */
	EClass getBiblioteca();

	/**
	 * Returns the meta object for the attribute '{@link Model.Biblioteca#getNomeBiblioteca <em>Nome Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Biblioteca</em>'.
	 * @see Model.Biblioteca#getNomeBiblioteca()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EAttribute getBiblioteca_NomeBiblioteca();

	/**
	 * Returns the meta object for the attribute '{@link Model.Biblioteca#getCodigoBiblioteca <em>Codigo Biblioteca</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Biblioteca</em>'.
	 * @see Model.Biblioteca#getCodigoBiblioteca()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EAttribute getBiblioteca_CodigoBiblioteca();

	/**
	 * Returns the meta object for the reference '{@link Model.Biblioteca#getTerminal <em>Terminal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Terminal</em>'.
	 * @see Model.Biblioteca#getTerminal()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_Terminal();

	/**
	 * Returns the meta object for the reference list '{@link Model.Biblioteca#getPublicacoes <em>Publicacoes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publicacoes</em>'.
	 * @see Model.Biblioteca#getPublicacoes()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_Publicacoes();

	/**
	 * Returns the meta object for the reference list '{@link Model.Biblioteca#getExemplares <em>Exemplares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exemplares</em>'.
	 * @see Model.Biblioteca#getExemplares()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_Exemplares();

	/**
	 * Returns the meta object for the reference '{@link Model.Biblioteca#getEmprestimos <em>Emprestimos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Emprestimos</em>'.
	 * @see Model.Biblioteca#getEmprestimos()
	 * @see #getBiblioteca()
	 * @generated
	 */
	EReference getBiblioteca_Emprestimos();

	/**
	 * Returns the meta object for class '{@link Model.Publicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publicacao</em>'.
	 * @see Model.Publicacao
	 * @generated
	 */
	EClass getPublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getTitulo <em>Titulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titulo</em>'.
	 * @see Model.Publicacao#getTitulo()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Titulo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Publicacao#getCodigo <em>Codigo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo</em>'.
	 * @see Model.Publicacao#getCodigo()
	 * @see #getPublicacao()
	 * @generated
	 */
	EAttribute getPublicacao_Codigo();

	/**
	 * Returns the meta object for class '{@link Model.Exemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exemplar</em>'.
	 * @see Model.Exemplar
	 * @generated
	 */
	EClass getExemplar();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#getCodigoExemplar <em>Codigo Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Exemplar</em>'.
	 * @see Model.Exemplar#getCodigoExemplar()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_CodigoExemplar();

	/**
	 * Returns the meta object for the reference '{@link Model.Exemplar#getPublicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publicacao</em>'.
	 * @see Model.Exemplar#getPublicacao()
	 * @see #getExemplar()
	 * @generated
	 */
	EReference getExemplar_Publicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isEmprestado <em>Emprestado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emprestado</em>'.
	 * @see Model.Exemplar#isEmprestado()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Emprestado();

	/**
	 * Returns the meta object for the attribute '{@link Model.Exemplar#isBloqueado <em>Bloqueado</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bloqueado</em>'.
	 * @see Model.Exemplar#isBloqueado()
	 * @see #getExemplar()
	 * @generated
	 */
	EAttribute getExemplar_Bloqueado();

	/**
	 * Returns the meta object for class '{@link Model.Emprestimo <em>Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emprestimo</em>'.
	 * @see Model.Emprestimo
	 * @generated
	 */
	EClass getEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getCodigoEmprestimo <em>Codigo Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Emprestimo</em>'.
	 * @see Model.Emprestimo#getCodigoEmprestimo()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_CodigoEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getDataEmprestimo <em>Data Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Emprestimo</em>'.
	 * @see Model.Emprestimo#getDataEmprestimo()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_DataEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getDataDevolucao <em>Data Devolucao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Devolucao</em>'.
	 * @see Model.Emprestimo#getDataDevolucao()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_DataDevolucao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Emprestimo#getMulta <em>Multa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multa</em>'.
	 * @see Model.Emprestimo#getMulta()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EAttribute getEmprestimo_Multa();

	/**
	 * Returns the meta object for the reference '{@link Model.Emprestimo#getExemplar <em>Exemplar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exemplar</em>'.
	 * @see Model.Emprestimo#getExemplar()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EReference getEmprestimo_Exemplar();

	/**
	 * Returns the meta object for the reference '{@link Model.Emprestimo#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see Model.Emprestimo#getUsuario()
	 * @see #getEmprestimo()
	 * @generated
	 */
	EReference getEmprestimo_Usuario();

	/**
	 * Returns the meta object for class '{@link Model.Usuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usuario</em>'.
	 * @see Model.Usuario
	 * @generated
	 */
	EClass getUsuario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getNumeroRegistro <em>Numero Registro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numero Registro</em>'.
	 * @see Model.Usuario#getNumeroRegistro()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_NumeroRegistro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getInstituto <em>Instituto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto</em>'.
	 * @see Model.Usuario#getInstituto()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Instituto();

	/**
	 * Returns the meta object for the reference list '{@link Model.Usuario#getEmprestimos <em>Emprestimos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emprestimos</em>'.
	 * @see Model.Usuario#getEmprestimos()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Emprestimos();

	/**
	 * Returns the meta object for the reference list '{@link Model.Usuario#getReservas <em>Reservas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservas</em>'.
	 * @see Model.Usuario#getReservas()
	 * @see #getUsuario()
	 * @generated
	 */
	EReference getUsuario_Reservas();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTempoEmprestimo <em>Tempo Emprestimo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tempo Emprestimo</em>'.
	 * @see Model.Usuario#getTempoEmprestimo()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_TempoEmprestimo();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see Model.Usuario#getState()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_State();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Model.Usuario#getEmail()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Email();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see Model.Usuario#getBirthdate()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Birthdate();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getAddress1 <em>Address1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address1</em>'.
	 * @see Model.Usuario#getAddress1()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Address1();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Model.Usuario#getCity()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_City();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Model.Usuario#getTitle()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Title();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCpf <em>Cpf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpf</em>'.
	 * @see Model.Usuario#getCpf()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cpf();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Model.Usuario#getLastName()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCep <em>Cep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cep</em>'.
	 * @see Model.Usuario#getCep()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Cep();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getAddress2 <em>Address2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address2</em>'.
	 * @see Model.Usuario#getAddress2()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Address2();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see Model.Usuario#getCountry()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Country();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Model.Usuario#getPhone()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Model.Usuario#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Model.Usuario#getFirstName()
	 * @see #getUsuario()
	 * @generated
	 */
	EAttribute getUsuario_FirstName();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#reservar(Model.Publicacao) <em>Reservar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reservar</em>' operation.
	 * @see Model.Usuario#reservar(Model.Publicacao)
	 * @generated
	 */
	EOperation getUsuario__Reservar__Publicacao();

	/**
	 * Returns the meta object for the '{@link Model.Usuario#emprestar(Model.Exemplar) <em>Emprestar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Emprestar</em>' operation.
	 * @see Model.Usuario#emprestar(Model.Exemplar)
	 * @generated
	 */
	EOperation getUsuario__Emprestar__Exemplar();

	/**
	 * Returns the meta object for class '{@link Model.Reserva <em>Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserva</em>'.
	 * @see Model.Reserva
	 * @generated
	 */
	EClass getReserva();

	/**
	 * Returns the meta object for the reference '{@link Model.Reserva#getUsuario <em>Usuario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Usuario</em>'.
	 * @see Model.Reserva#getUsuario()
	 * @see #getReserva()
	 * @generated
	 */
	EReference getReserva_Usuario();

	/**
	 * Returns the meta object for the reference '{@link Model.Reserva#getPublicacao <em>Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Publicacao</em>'.
	 * @see Model.Reserva#getPublicacao()
	 * @see #getReserva()
	 * @generated
	 */
	EReference getReserva_Publicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Reserva#getDataRetirada <em>Data Retirada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Retirada</em>'.
	 * @see Model.Reserva#getDataRetirada()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_DataRetirada();

	/**
	 * Returns the meta object for the attribute '{@link Model.Reserva#getCodigoReserva <em>Codigo Reserva</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Reserva</em>'.
	 * @see Model.Reserva#getCodigoReserva()
	 * @see #getReserva()
	 * @generated
	 */
	EAttribute getReserva_CodigoReserva();

	/**
	 * Returns the meta object for class '{@link Model.Livro <em>Livro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Livro</em>'.
	 * @see Model.Livro
	 * @generated
	 */
	EClass getLivro();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getAnoPublicacao <em>Ano Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ano Publicacao</em>'.
	 * @see Model.Livro#getAnoPublicacao()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_AnoPublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getEdicao <em>Edicao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edicao</em>'.
	 * @see Model.Livro#getEdicao()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Edicao();

	/**
	 * Returns the meta object for the attribute list '{@link Model.Livro#getAutores <em>Autores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Autores</em>'.
	 * @see Model.Livro#getAutores()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Autores();

	/**
	 * Returns the meta object for the attribute '{@link Model.Livro#getEditora <em>Editora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editora</em>'.
	 * @see Model.Livro#getEditora()
	 * @see #getLivro()
	 * @generated
	 */
	EAttribute getLivro_Editora();

	/**
	 * Returns the meta object for class '{@link Model.Periodico <em>Periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodico</em>'.
	 * @see Model.Periodico
	 * @generated
	 */
	EClass getPeriodico();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getDataPublicacao <em>Data Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Publicacao</em>'.
	 * @see Model.Periodico#getDataPublicacao()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_DataPublicacao();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getEditora <em>Editora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editora</em>'.
	 * @see Model.Periodico#getEditora()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_Editora();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getPublicacoesPorSemana <em>Publicacoes Por Semana</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publicacoes Por Semana</em>'.
	 * @see Model.Periodico#getPublicacoesPorSemana()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_PublicacoesPorSemana();

	/**
	 * Returns the meta object for the attribute '{@link Model.Periodico#getNomePeriodico <em>Nome Periodico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nome Periodico</em>'.
	 * @see Model.Periodico#getNomePeriodico()
	 * @see #getPeriodico()
	 * @generated
	 */
	EAttribute getPeriodico_NomePeriodico();

	/**
	 * Returns the meta object for class '{@link Model.Tese <em>Tese</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tese</em>'.
	 * @see Model.Tese
	 * @generated
	 */
	EClass getTese();

	/**
	 * Returns the meta object for the attribute list '{@link Model.Tese#getAutores <em>Autores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Autores</em>'.
	 * @see Model.Tese#getAutores()
	 * @see #getTese()
	 * @generated
	 */
	EAttribute getTese_Autores();

	/**
	 * Returns the meta object for the attribute '{@link Model.Tese#getAnoPublicacao <em>Ano Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ano Publicacao</em>'.
	 * @see Model.Tese#getAnoPublicacao()
	 * @see #getTese()
	 * @generated
	 */
	EAttribute getTese_AnoPublicacao();

	/**
	 * Returns the meta object for class '{@link Model.Manual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual</em>'.
	 * @see Model.Manual
	 * @generated
	 */
	EClass getManual();

	/**
	 * Returns the meta object for the attribute '{@link Model.Manual#getInstituto <em>Instituto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instituto</em>'.
	 * @see Model.Manual#getInstituto()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_Instituto();

	/**
	 * Returns the meta object for the attribute '{@link Model.Manual#getDisciplina <em>Disciplina</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disciplina</em>'.
	 * @see Model.Manual#getDisciplina()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_Disciplina();

	/**
	 * Returns the meta object for the attribute '{@link Model.Manual#getAnoPublicacao <em>Ano Publicacao</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ano Publicacao</em>'.
	 * @see Model.Manual#getAnoPublicacao()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_AnoPublicacao();

	/**
	 * Returns the meta object for the attribute list '{@link Model.Manual#getProfessores <em>Professores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Professores</em>'.
	 * @see Model.Manual#getProfessores()
	 * @see #getManual()
	 * @generated
	 */
	EAttribute getManual_Professores();

	/**
	 * Returns the meta object for class '{@link Model.Aluno <em>Aluno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aluno</em>'.
	 * @see Model.Aluno
	 * @generated
	 */
	EClass getAluno();

	/**
	 * Returns the meta object for the attribute '{@link Model.Aluno#isSuspenso <em>Suspenso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspenso</em>'.
	 * @see Model.Aluno#isSuspenso()
	 * @see #getAluno()
	 * @generated
	 */
	EAttribute getAluno_Suspenso();

	/**
	 * Returns the meta object for class '{@link Model.Professor <em>Professor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professor</em>'.
	 * @see Model.Professor
	 * @generated
	 */
	EClass getProfessor();

	/**
	 * Returns the meta object for the '{@link Model.Professor#bloquearExemplar(Model.Exemplar) <em>Bloquear Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloquear Exemplar</em>' operation.
	 * @see Model.Professor#bloquearExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getProfessor__BloquearExemplar__Exemplar();

	/**
	 * Returns the meta object for class '{@link Model.Funcionario <em>Funcionario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcionario</em>'.
	 * @see Model.Funcionario
	 * @generated
	 */
	EClass getFuncionario();

	/**
	 * Returns the meta object for the attribute '{@link Model.Funcionario#isSuspenso <em>Suspenso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suspenso</em>'.
	 * @see Model.Funcionario#isSuspenso()
	 * @see #getFuncionario()
	 * @generated
	 */
	EAttribute getFuncionario_Suspenso();

	/**
	 * Returns the meta object for class '{@link Model.Bibliotecaria <em>Bibliotecaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bibliotecaria</em>'.
	 * @see Model.Bibliotecaria
	 * @generated
	 */
	EClass getBibliotecaria();

	/**
	 * Returns the meta object for the attribute '{@link Model.Bibliotecaria#getSenhaAcesso <em>Senha Acesso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Senha Acesso</em>'.
	 * @see Model.Bibliotecaria#getSenhaAcesso()
	 * @see #getBibliotecaria()
	 * @generated
	 */
	EAttribute getBibliotecaria_SenhaAcesso();

	/**
	 * Returns the meta object for the attribute '{@link Model.Bibliotecaria#getCodigoBibliotecaria <em>Codigo Bibliotecaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codigo Bibliotecaria</em>'.
	 * @see Model.Bibliotecaria#getCodigoBibliotecaria()
	 * @see #getBibliotecaria()
	 * @generated
	 */
	EAttribute getBibliotecaria_CodigoBibliotecaria();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecaria#incluirExemplar() <em>Incluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incluir Exemplar</em>' operation.
	 * @see Model.Bibliotecaria#incluirExemplar()
	 * @generated
	 */
	EOperation getBibliotecaria__IncluirExemplar();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecaria#excluirExemplar(Model.Exemplar) <em>Excluir Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excluir Exemplar</em>' operation.
	 * @see Model.Bibliotecaria#excluirExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getBibliotecaria__ExcluirExemplar__Exemplar();

	/**
	 * Returns the meta object for the '{@link Model.Bibliotecaria#atualizarExemplar(Model.Exemplar) <em>Atualizar Exemplar</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Atualizar Exemplar</em>' operation.
	 * @see Model.Bibliotecaria#atualizarExemplar(Model.Exemplar)
	 * @generated
	 */
	EOperation getBibliotecaria__AtualizarExemplar__Exemplar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Model.impl.TerminalImpl <em>Terminal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TerminalImpl
		 * @see Model.impl.ModelPackageImpl#getTerminal()
		 * @generated
		 */
		EClass TERMINAL = eINSTANCE.getTerminal();

		/**
		 * The meta object literal for the '<em><b>Numero Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__NUMERO_TERMINAL = eINSTANCE.getTerminal_NumeroTerminal();

		/**
		 * The meta object literal for the '<em><b>Senha Terminal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINAL__SENHA_TERMINAL = eINSTANCE.getTerminal_SenhaTerminal();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecaImpl <em>Biblioteca</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecaImpl
		 * @see Model.impl.ModelPackageImpl#getBiblioteca()
		 * @generated
		 */
		EClass BIBLIOTECA = eINSTANCE.getBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Nome Biblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECA__NOME_BIBLIOTECA = eINSTANCE.getBiblioteca_NomeBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Codigo Biblioteca</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECA__CODIGO_BIBLIOTECA = eINSTANCE.getBiblioteca_CodigoBiblioteca();

		/**
		 * The meta object literal for the '<em><b>Terminal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__TERMINAL = eINSTANCE.getBiblioteca_Terminal();

		/**
		 * The meta object literal for the '<em><b>Publicacoes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__PUBLICACOES = eINSTANCE.getBiblioteca_Publicacoes();

		/**
		 * The meta object literal for the '<em><b>Exemplares</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__EXEMPLARES = eINSTANCE.getBiblioteca_Exemplares();

		/**
		 * The meta object literal for the '<em><b>Emprestimos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIBLIOTECA__EMPRESTIMOS = eINSTANCE.getBiblioteca_Emprestimos();

		/**
		 * The meta object literal for the '{@link Model.impl.PublicacaoImpl <em>Publicacao</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PublicacaoImpl
		 * @see Model.impl.ModelPackageImpl#getPublicacao()
		 * @generated
		 */
		EClass PUBLICACAO = eINSTANCE.getPublicacao();

		/**
		 * The meta object literal for the '<em><b>Titulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__TITULO = eINSTANCE.getPublicacao_Titulo();

		/**
		 * The meta object literal for the '<em><b>Codigo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLICACAO__CODIGO = eINSTANCE.getPublicacao_Codigo();

		/**
		 * The meta object literal for the '{@link Model.impl.ExemplarImpl <em>Exemplar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ExemplarImpl
		 * @see Model.impl.ModelPackageImpl#getExemplar()
		 * @generated
		 */
		EClass EXEMPLAR = eINSTANCE.getExemplar();

		/**
		 * The meta object literal for the '<em><b>Codigo Exemplar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__CODIGO_EXEMPLAR = eINSTANCE.getExemplar_CodigoExemplar();

		/**
		 * The meta object literal for the '<em><b>Publicacao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEMPLAR__PUBLICACAO = eINSTANCE.getExemplar_Publicacao();

		/**
		 * The meta object literal for the '<em><b>Emprestado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__EMPRESTADO = eINSTANCE.getExemplar_Emprestado();

		/**
		 * The meta object literal for the '<em><b>Bloqueado</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXEMPLAR__BLOQUEADO = eINSTANCE.getExemplar_Bloqueado();

		/**
		 * The meta object literal for the '{@link Model.impl.EmprestimoImpl <em>Emprestimo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.EmprestimoImpl
		 * @see Model.impl.ModelPackageImpl#getEmprestimo()
		 * @generated
		 */
		EClass EMPRESTIMO = eINSTANCE.getEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Codigo Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__CODIGO_EMPRESTIMO = eINSTANCE.getEmprestimo_CodigoEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Data Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DATA_EMPRESTIMO = eINSTANCE.getEmprestimo_DataEmprestimo();

		/**
		 * The meta object literal for the '<em><b>Data Devolucao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__DATA_DEVOLUCAO = eINSTANCE.getEmprestimo_DataDevolucao();

		/**
		 * The meta object literal for the '<em><b>Multa</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPRESTIMO__MULTA = eINSTANCE.getEmprestimo_Multa();

		/**
		 * The meta object literal for the '<em><b>Exemplar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESTIMO__EXEMPLAR = eINSTANCE.getEmprestimo_Exemplar();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPRESTIMO__USUARIO = eINSTANCE.getEmprestimo_Usuario();

		/**
		 * The meta object literal for the '{@link Model.impl.UsuarioImpl <em>Usuario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.UsuarioImpl
		 * @see Model.impl.ModelPackageImpl#getUsuario()
		 * @generated
		 */
		EClass USUARIO = eINSTANCE.getUsuario();

		/**
		 * The meta object literal for the '<em><b>Numero Registro</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__NUMERO_REGISTRO = eINSTANCE.getUsuario_NumeroRegistro();

		/**
		 * The meta object literal for the '<em><b>Instituto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__INSTITUTO = eINSTANCE.getUsuario_Instituto();

		/**
		 * The meta object literal for the '<em><b>Emprestimos</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__EMPRESTIMOS = eINSTANCE.getUsuario_Emprestimos();

		/**
		 * The meta object literal for the '<em><b>Reservas</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USUARIO__RESERVAS = eINSTANCE.getUsuario_Reservas();

		/**
		 * The meta object literal for the '<em><b>Tempo Emprestimo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TEMPO_EMPRESTIMO = eINSTANCE.getUsuario_TempoEmprestimo();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__STATE = eINSTANCE.getUsuario_State();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__EMAIL = eINSTANCE.getUsuario_Email();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__BIRTHDATE = eINSTANCE.getUsuario_Birthdate();

		/**
		 * The meta object literal for the '<em><b>Address1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ADDRESS1 = eINSTANCE.getUsuario_Address1();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CITY = eINSTANCE.getUsuario_City();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__TITLE = eINSTANCE.getUsuario_Title();

		/**
		 * The meta object literal for the '<em><b>Cpf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CPF = eINSTANCE.getUsuario_Cpf();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__LAST_NAME = eINSTANCE.getUsuario_LastName();

		/**
		 * The meta object literal for the '<em><b>Cep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__CEP = eINSTANCE.getUsuario_Cep();

		/**
		 * The meta object literal for the '<em><b>Address2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__ADDRESS2 = eINSTANCE.getUsuario_Address2();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__COUNTRY = eINSTANCE.getUsuario_Country();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__PHONE = eINSTANCE.getUsuario_Phone();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USUARIO__FIRST_NAME = eINSTANCE.getUsuario_FirstName();

		/**
		 * The meta object literal for the '<em><b>Reservar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___RESERVAR__PUBLICACAO = eINSTANCE.getUsuario__Reservar__Publicacao();

		/**
		 * The meta object literal for the '<em><b>Emprestar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USUARIO___EMPRESTAR__EXEMPLAR = eINSTANCE.getUsuario__Emprestar__Exemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.ReservaImpl <em>Reserva</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ReservaImpl
		 * @see Model.impl.ModelPackageImpl#getReserva()
		 * @generated
		 */
		EClass RESERVA = eINSTANCE.getReserva();

		/**
		 * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVA__USUARIO = eINSTANCE.getReserva_Usuario();

		/**
		 * The meta object literal for the '<em><b>Publicacao</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVA__PUBLICACAO = eINSTANCE.getReserva_Publicacao();

		/**
		 * The meta object literal for the '<em><b>Data Retirada</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__DATA_RETIRADA = eINSTANCE.getReserva_DataRetirada();

		/**
		 * The meta object literal for the '<em><b>Codigo Reserva</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVA__CODIGO_RESERVA = eINSTANCE.getReserva_CodigoReserva();

		/**
		 * The meta object literal for the '{@link Model.impl.LivroImpl <em>Livro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.LivroImpl
		 * @see Model.impl.ModelPackageImpl#getLivro()
		 * @generated
		 */
		EClass LIVRO = eINSTANCE.getLivro();

		/**
		 * The meta object literal for the '<em><b>Ano Publicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__ANO_PUBLICACAO = eINSTANCE.getLivro_AnoPublicacao();

		/**
		 * The meta object literal for the '<em><b>Edicao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__EDICAO = eINSTANCE.getLivro_Edicao();

		/**
		 * The meta object literal for the '<em><b>Autores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__AUTORES = eINSTANCE.getLivro_Autores();

		/**
		 * The meta object literal for the '<em><b>Editora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVRO__EDITORA = eINSTANCE.getLivro_Editora();

		/**
		 * The meta object literal for the '{@link Model.impl.PeriodicoImpl <em>Periodico</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.PeriodicoImpl
		 * @see Model.impl.ModelPackageImpl#getPeriodico()
		 * @generated
		 */
		EClass PERIODICO = eINSTANCE.getPeriodico();

		/**
		 * The meta object literal for the '<em><b>Data Publicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__DATA_PUBLICACAO = eINSTANCE.getPeriodico_DataPublicacao();

		/**
		 * The meta object literal for the '<em><b>Editora</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__EDITORA = eINSTANCE.getPeriodico_Editora();

		/**
		 * The meta object literal for the '<em><b>Publicacoes Por Semana</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__PUBLICACOES_POR_SEMANA = eINSTANCE.getPeriodico_PublicacoesPorSemana();

		/**
		 * The meta object literal for the '<em><b>Nome Periodico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODICO__NOME_PERIODICO = eINSTANCE.getPeriodico_NomePeriodico();

		/**
		 * The meta object literal for the '{@link Model.impl.TeseImpl <em>Tese</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.TeseImpl
		 * @see Model.impl.ModelPackageImpl#getTese()
		 * @generated
		 */
		EClass TESE = eINSTANCE.getTese();

		/**
		 * The meta object literal for the '<em><b>Autores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESE__AUTORES = eINSTANCE.getTese_Autores();

		/**
		 * The meta object literal for the '<em><b>Ano Publicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESE__ANO_PUBLICACAO = eINSTANCE.getTese_AnoPublicacao();

		/**
		 * The meta object literal for the '{@link Model.impl.ManualImpl <em>Manual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ManualImpl
		 * @see Model.impl.ModelPackageImpl#getManual()
		 * @generated
		 */
		EClass MANUAL = eINSTANCE.getManual();

		/**
		 * The meta object literal for the '<em><b>Instituto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__INSTITUTO = eINSTANCE.getManual_Instituto();

		/**
		 * The meta object literal for the '<em><b>Disciplina</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__DISCIPLINA = eINSTANCE.getManual_Disciplina();

		/**
		 * The meta object literal for the '<em><b>Ano Publicacao</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__ANO_PUBLICACAO = eINSTANCE.getManual_AnoPublicacao();

		/**
		 * The meta object literal for the '<em><b>Professores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL__PROFESSORES = eINSTANCE.getManual_Professores();

		/**
		 * The meta object literal for the '{@link Model.impl.AlunoImpl <em>Aluno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.AlunoImpl
		 * @see Model.impl.ModelPackageImpl#getAluno()
		 * @generated
		 */
		EClass ALUNO = eINSTANCE.getAluno();

		/**
		 * The meta object literal for the '<em><b>Suspenso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALUNO__SUSPENSO = eINSTANCE.getAluno_Suspenso();

		/**
		 * The meta object literal for the '{@link Model.impl.ProfessorImpl <em>Professor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.ProfessorImpl
		 * @see Model.impl.ModelPackageImpl#getProfessor()
		 * @generated
		 */
		EClass PROFESSOR = eINSTANCE.getProfessor();

		/**
		 * The meta object literal for the '<em><b>Bloquear Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROFESSOR___BLOQUEAR_EXEMPLAR__EXEMPLAR = eINSTANCE.getProfessor__BloquearExemplar__Exemplar();

		/**
		 * The meta object literal for the '{@link Model.impl.FuncionarioImpl <em>Funcionario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.FuncionarioImpl
		 * @see Model.impl.ModelPackageImpl#getFuncionario()
		 * @generated
		 */
		EClass FUNCIONARIO = eINSTANCE.getFuncionario();

		/**
		 * The meta object literal for the '<em><b>Suspenso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCIONARIO__SUSPENSO = eINSTANCE.getFuncionario_Suspenso();

		/**
		 * The meta object literal for the '{@link Model.impl.BibliotecariaImpl <em>Bibliotecaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Model.impl.BibliotecariaImpl
		 * @see Model.impl.ModelPackageImpl#getBibliotecaria()
		 * @generated
		 */
		EClass BIBLIOTECARIA = eINSTANCE.getBibliotecaria();

		/**
		 * The meta object literal for the '<em><b>Senha Acesso</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECARIA__SENHA_ACESSO = eINSTANCE.getBibliotecaria_SenhaAcesso();

		/**
		 * The meta object literal for the '<em><b>Codigo Bibliotecaria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIBLIOTECARIA__CODIGO_BIBLIOTECARIA = eINSTANCE.getBibliotecaria_CodigoBibliotecaria();

		/**
		 * The meta object literal for the '<em><b>Incluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIA___INCLUIR_EXEMPLAR = eINSTANCE.getBibliotecaria__IncluirExemplar();

		/**
		 * The meta object literal for the '<em><b>Excluir Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIA___EXCLUIR_EXEMPLAR__EXEMPLAR = eINSTANCE.getBibliotecaria__ExcluirExemplar__Exemplar();

		/**
		 * The meta object literal for the '<em><b>Atualizar Exemplar</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BIBLIOTECARIA___ATUALIZAR_EXEMPLAR__EXEMPLAR = eINSTANCE.getBibliotecaria__AtualizarExemplar__Exemplar();

	}

} //ModelPackage

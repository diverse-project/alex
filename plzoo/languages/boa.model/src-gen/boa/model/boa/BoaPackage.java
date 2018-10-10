/**
 */
package boa.model.boa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see boa.model.boa.BoaFactory
 * @model kind="package"
 * @generated
 */
public interface BoaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "boa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/boa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "boa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BoaPackage eINSTANCE = boa.model.boa.impl.BoaPackageImpl.init();

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.FileImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 0;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__COMMANDS = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.TopLevelCmdImpl <em>Top Level Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.TopLevelCmdImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getTopLevelCmd()
	 * @generated
	 */
	int TOP_LEVEL_CMD = 1;

	/**
	 * The number of structural features of the '<em>Top Level Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CMD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Top Level Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_CMD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ExprImpl <em>Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ExprImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getExpr()
	 * @generated
	 */
	int EXPR = 2;

	/**
	 * The number of structural features of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_FEATURE_COUNT = TOP_LEVEL_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_OPERATION_COUNT = TOP_LEVEL_CMD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.DefImpl <em>Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.DefImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getDef()
	 * @generated
	 */
	int DEF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__NAME = TOP_LEVEL_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF__EXPR = TOP_LEVEL_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_FEATURE_COUNT = TOP_LEVEL_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEF_OPERATION_COUNT = TOP_LEVEL_CMD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.AppImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getApp()
	 * @generated
	 */
	int APP = 4;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__LHS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__RHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.VarImpl <em>Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.VarImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getVar()
	 * @generated
	 */
	int VAR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR__NAME = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ThisImpl <em>This</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ThisImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getThis()
	 * @generated
	 */
	int THIS = 6;

	/**
	 * The number of structural features of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>This</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIS_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.BoolImpl <em>Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.BoolImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getBool()
	 * @generated
	 */
	int BOOL = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.IntImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getInt()
	 * @generated
	 */
	int INT = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.SkipImpl <em>Skip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.SkipImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getSkip()
	 * @generated
	 */
	int SKIP = 9;

	/**
	 * The number of structural features of the '<em>Skip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Skip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKIP_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ProjectImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 10;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VARS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.BObjectImpl <em>BObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.BObjectImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getBObject()
	 * @generated
	 */
	int BOBJECT = 11;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT__FIELDS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOBJECT_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.FieldImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.CopyImpl <em>Copy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.CopyImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getCopy()
	 * @generated
	 */
	int COPY = 13;

	/**
	 * The feature id for the '<em><b>Copy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY__COPY = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Copy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.WithImpl <em>With</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.WithImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getWith()
	 * @generated
	 */
	int WITH = 14;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__LHS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH__RHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>With</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ArithOpImpl <em>Arith Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ArithOpImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getArithOp()
	 * @generated
	 */
	int ARITH_OP = 15;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP__LHS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP__RHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Arith Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Arith Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.NotImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getNot()
	 * @generated
	 */
	int NOT = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__VALUE = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.CmpOpImpl <em>Cmp Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.CmpOpImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOp()
	 * @generated
	 */
	int CMP_OP = 17;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP__LHS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP__RHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cmp Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cmp Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.BoolOpImpl <em>Bool Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.BoolOpImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getBoolOp()
	 * @generated
	 */
	int BOOL_OP = 18;

	/**
	 * The number of structural features of the '<em>Bool Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.IfImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getIf()
	 * @generated
	 */
	int IF = 19;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__COND = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__THEN = EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Els</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__ELS = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.LetImpl <em>Let</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.LetImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getLet()
	 * @generated
	 */
	int LET = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET__NAME = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET__LHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET__RHS = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Let</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_FEATURE_COUNT = EXPR_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Let</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LET_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.FunImpl <em>Fun</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.FunImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getFun()
	 * @generated
	 */
	int FUN = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN__NAME = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN__BODY = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fun</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUN_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.AssignImpl <em>Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.AssignImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getAssign()
	 * @generated
	 */
	int ASSIGN = 22;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__LHS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN__RHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGN_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ArithOpPlusImpl <em>Arith Op Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ArithOpPlusImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpPlus()
	 * @generated
	 */
	int ARITH_OP_PLUS = 23;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_PLUS__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_PLUS__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Op Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_PLUS_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Op Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_PLUS_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ArithOpMinusImpl <em>Arith Op Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ArithOpMinusImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpMinus()
	 * @generated
	 */
	int ARITH_OP_MINUS = 24;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_MINUS__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_MINUS__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Op Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_MINUS_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Op Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_MINUS_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ArithOpTimesImpl <em>Arith Op Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ArithOpTimesImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpTimes()
	 * @generated
	 */
	int ARITH_OP_TIMES = 25;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_TIMES__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_TIMES__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Op Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_TIMES_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Op Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_TIMES_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ArithOpDivideImpl <em>Arith Op Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ArithOpDivideImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpDivide()
	 * @generated
	 */
	int ARITH_OP_DIVIDE = 26;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_DIVIDE__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_DIVIDE__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Op Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_DIVIDE_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Op Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_DIVIDE_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.ArithOpRemainderImpl <em>Arith Op Remainder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.ArithOpRemainderImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpRemainder()
	 * @generated
	 */
	int ARITH_OP_REMAINDER = 27;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_REMAINDER__LHS = ARITH_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_REMAINDER__RHS = ARITH_OP__RHS;

	/**
	 * The number of structural features of the '<em>Arith Op Remainder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_REMAINDER_FEATURE_COUNT = ARITH_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arith Op Remainder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_OP_REMAINDER_OPERATION_COUNT = ARITH_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.BoolOpAndImpl <em>Bool Op And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.BoolOpAndImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getBoolOpAnd()
	 * @generated
	 */
	int BOOL_OP_AND = 28;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_AND__LHS = BOOL_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_AND__RHS = BOOL_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bool Op And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_AND_FEATURE_COUNT = BOOL_OP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bool Op And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_AND_OPERATION_COUNT = BOOL_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.BoolOpOrImpl <em>Bool Op Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.BoolOpOrImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getBoolOpOr()
	 * @generated
	 */
	int BOOL_OP_OR = 29;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_OR__LHS = BOOL_OP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_OR__RHS = BOOL_OP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bool Op Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_OR_FEATURE_COUNT = BOOL_OP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bool Op Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OP_OR_OPERATION_COUNT = BOOL_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.SeqImpl <em>Seq</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.SeqImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getSeq()
	 * @generated
	 */
	int SEQ = 30;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__LHS = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ__RHS = EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_FEATURE_COUNT = EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Seq</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQ_OPERATION_COUNT = EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.CmpOpEqualImpl <em>Cmp Op Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.CmpOpEqualImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOpEqual()
	 * @generated
	 */
	int CMP_OP_EQUAL = 31;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_EQUAL__LHS = CMP_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_EQUAL__RHS = CMP_OP__RHS;

	/**
	 * The number of structural features of the '<em>Cmp Op Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_EQUAL_FEATURE_COUNT = CMP_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cmp Op Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_EQUAL_OPERATION_COUNT = CMP_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.CmpOpUnequalImpl <em>Cmp Op Unequal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.CmpOpUnequalImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOpUnequal()
	 * @generated
	 */
	int CMP_OP_UNEQUAL = 32;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_UNEQUAL__LHS = CMP_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_UNEQUAL__RHS = CMP_OP__RHS;

	/**
	 * The number of structural features of the '<em>Cmp Op Unequal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_UNEQUAL_FEATURE_COUNT = CMP_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cmp Op Unequal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_UNEQUAL_OPERATION_COUNT = CMP_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link boa.model.boa.impl.CmpOpLessImpl <em>Cmp Op Less</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see boa.model.boa.impl.CmpOpLessImpl
	 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOpLess()
	 * @generated
	 */
	int CMP_OP_LESS = 33;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_LESS__LHS = CMP_OP__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_LESS__RHS = CMP_OP__RHS;

	/**
	 * The number of structural features of the '<em>Cmp Op Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_LESS_FEATURE_COUNT = CMP_OP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cmp Op Less</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_OP_LESS_OPERATION_COUNT = CMP_OP_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link boa.model.boa.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see boa.model.boa.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link boa.model.boa.File#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commands</em>'.
	 * @see boa.model.boa.File#getCommands()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Commands();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.TopLevelCmd <em>Top Level Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Cmd</em>'.
	 * @see boa.model.boa.TopLevelCmd
	 * @generated
	 */
	EClass getTopLevelCmd();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expr</em>'.
	 * @see boa.model.boa.Expr
	 * @generated
	 */
	EClass getExpr();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Def <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Def</em>'.
	 * @see boa.model.boa.Def
	 * @generated
	 */
	EClass getDef();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Def#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see boa.model.boa.Def#getName()
	 * @see #getDef()
	 * @generated
	 */
	EAttribute getDef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Def#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see boa.model.boa.Def#getExpr()
	 * @see #getDef()
	 * @generated
	 */
	EReference getDef_Expr();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see boa.model.boa.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.App#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.App#getLhs()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.App#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.App#getRhs()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var</em>'.
	 * @see boa.model.boa.Var
	 * @generated
	 */
	EClass getVar();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Var#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see boa.model.boa.Var#getName()
	 * @see #getVar()
	 * @generated
	 */
	EAttribute getVar_Name();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>This</em>'.
	 * @see boa.model.boa.This
	 * @generated
	 */
	EClass getThis();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool</em>'.
	 * @see boa.model.boa.Bool
	 * @generated
	 */
	EClass getBool();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Bool#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see boa.model.boa.Bool#isValue()
	 * @see #getBool()
	 * @generated
	 */
	EAttribute getBool_Value();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see boa.model.boa.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Int#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see boa.model.boa.Int#getValue()
	 * @see #getInt()
	 * @generated
	 */
	EAttribute getInt_Value();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Skip <em>Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skip</em>'.
	 * @see boa.model.boa.Skip
	 * @generated
	 */
	EClass getSkip();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see boa.model.boa.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link boa.model.boa.Project#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see boa.model.boa.Project#getVars()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Vars();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BObject</em>'.
	 * @see boa.model.boa.BObject
	 * @generated
	 */
	EClass getBObject();

	/**
	 * Returns the meta object for the containment reference list '{@link boa.model.boa.BObject#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see boa.model.boa.BObject#getFields()
	 * @see #getBObject()
	 * @generated
	 */
	EReference getBObject_Fields();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see boa.model.boa.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see boa.model.boa.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see boa.model.boa.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Value();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy</em>'.
	 * @see boa.model.boa.Copy
	 * @generated
	 */
	EClass getCopy();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Copy#getCopy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copy</em>'.
	 * @see boa.model.boa.Copy#getCopy()
	 * @see #getCopy()
	 * @generated
	 */
	EReference getCopy_Copy();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>With</em>'.
	 * @see boa.model.boa.With
	 * @generated
	 */
	EClass getWith();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.With#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.With#getLhs()
	 * @see #getWith()
	 * @generated
	 */
	EReference getWith_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.With#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.With#getRhs()
	 * @see #getWith()
	 * @generated
	 */
	EReference getWith_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.ArithOp <em>Arith Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op</em>'.
	 * @see boa.model.boa.ArithOp
	 * @generated
	 */
	EClass getArithOp();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.ArithOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.ArithOp#getLhs()
	 * @see #getArithOp()
	 * @generated
	 */
	EReference getArithOp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.ArithOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.ArithOp#getRhs()
	 * @see #getArithOp()
	 * @generated
	 */
	EReference getArithOp_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see boa.model.boa.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Not#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see boa.model.boa.Not#getValue()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Value();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.CmpOp <em>Cmp Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Op</em>'.
	 * @see boa.model.boa.CmpOp
	 * @generated
	 */
	EClass getCmpOp();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.CmpOp#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.CmpOp#getLhs()
	 * @see #getCmpOp()
	 * @generated
	 */
	EReference getCmpOp_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.CmpOp#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.CmpOp#getRhs()
	 * @see #getCmpOp()
	 * @generated
	 */
	EReference getCmpOp_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.BoolOp <em>Bool Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Op</em>'.
	 * @see boa.model.boa.BoolOp
	 * @generated
	 */
	EClass getBoolOp();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see boa.model.boa.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.If#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see boa.model.boa.If#getCond()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Cond();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.If#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see boa.model.boa.If#getThen()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Then();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.If#getEls <em>Els</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Els</em>'.
	 * @see boa.model.boa.If#getEls()
	 * @see #getIf()
	 * @generated
	 */
	EReference getIf_Els();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Let <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Let</em>'.
	 * @see boa.model.boa.Let
	 * @generated
	 */
	EClass getLet();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Let#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see boa.model.boa.Let#getName()
	 * @see #getLet()
	 * @generated
	 */
	EAttribute getLet_Name();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Let#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.Let#getLhs()
	 * @see #getLet()
	 * @generated
	 */
	EReference getLet_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Let#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.Let#getRhs()
	 * @see #getLet()
	 * @generated
	 */
	EReference getLet_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Fun <em>Fun</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fun</em>'.
	 * @see boa.model.boa.Fun
	 * @generated
	 */
	EClass getFun();

	/**
	 * Returns the meta object for the attribute '{@link boa.model.boa.Fun#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see boa.model.boa.Fun#getName()
	 * @see #getFun()
	 * @generated
	 */
	EAttribute getFun_Name();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Fun#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see boa.model.boa.Fun#getBody()
	 * @see #getFun()
	 * @generated
	 */
	EReference getFun_Body();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assign</em>'.
	 * @see boa.model.boa.Assign
	 * @generated
	 */
	EClass getAssign();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Assign#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.Assign#getLhs()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Assign#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.Assign#getRhs()
	 * @see #getAssign()
	 * @generated
	 */
	EReference getAssign_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.ArithOpPlus <em>Arith Op Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op Plus</em>'.
	 * @see boa.model.boa.ArithOpPlus
	 * @generated
	 */
	EClass getArithOpPlus();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.ArithOpMinus <em>Arith Op Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op Minus</em>'.
	 * @see boa.model.boa.ArithOpMinus
	 * @generated
	 */
	EClass getArithOpMinus();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.ArithOpTimes <em>Arith Op Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op Times</em>'.
	 * @see boa.model.boa.ArithOpTimes
	 * @generated
	 */
	EClass getArithOpTimes();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.ArithOpDivide <em>Arith Op Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op Divide</em>'.
	 * @see boa.model.boa.ArithOpDivide
	 * @generated
	 */
	EClass getArithOpDivide();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.ArithOpRemainder <em>Arith Op Remainder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arith Op Remainder</em>'.
	 * @see boa.model.boa.ArithOpRemainder
	 * @generated
	 */
	EClass getArithOpRemainder();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.BoolOpAnd <em>Bool Op And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Op And</em>'.
	 * @see boa.model.boa.BoolOpAnd
	 * @generated
	 */
	EClass getBoolOpAnd();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.BoolOpAnd#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.BoolOpAnd#getLhs()
	 * @see #getBoolOpAnd()
	 * @generated
	 */
	EReference getBoolOpAnd_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.BoolOpAnd#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.BoolOpAnd#getRhs()
	 * @see #getBoolOpAnd()
	 * @generated
	 */
	EReference getBoolOpAnd_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.BoolOpOr <em>Bool Op Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Op Or</em>'.
	 * @see boa.model.boa.BoolOpOr
	 * @generated
	 */
	EClass getBoolOpOr();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.BoolOpOr#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.BoolOpOr#getLhs()
	 * @see #getBoolOpOr()
	 * @generated
	 */
	EReference getBoolOpOr_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.BoolOpOr#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.BoolOpOr#getRhs()
	 * @see #getBoolOpOr()
	 * @generated
	 */
	EReference getBoolOpOr_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seq</em>'.
	 * @see boa.model.boa.Seq
	 * @generated
	 */
	EClass getSeq();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Seq#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see boa.model.boa.Seq#getLhs()
	 * @see #getSeq()
	 * @generated
	 */
	EReference getSeq_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link boa.model.boa.Seq#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see boa.model.boa.Seq#getRhs()
	 * @see #getSeq()
	 * @generated
	 */
	EReference getSeq_Rhs();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.CmpOpEqual <em>Cmp Op Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Op Equal</em>'.
	 * @see boa.model.boa.CmpOpEqual
	 * @generated
	 */
	EClass getCmpOpEqual();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.CmpOpUnequal <em>Cmp Op Unequal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Op Unequal</em>'.
	 * @see boa.model.boa.CmpOpUnequal
	 * @generated
	 */
	EClass getCmpOpUnequal();

	/**
	 * Returns the meta object for class '{@link boa.model.boa.CmpOpLess <em>Cmp Op Less</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Op Less</em>'.
	 * @see boa.model.boa.CmpOpLess
	 * @generated
	 */
	EClass getCmpOpLess();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BoaFactory getBoaFactory();

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
		 * The meta object literal for the '{@link boa.model.boa.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.FileImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__COMMANDS = eINSTANCE.getFile_Commands();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.TopLevelCmdImpl <em>Top Level Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.TopLevelCmdImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getTopLevelCmd()
		 * @generated
		 */
		EClass TOP_LEVEL_CMD = eINSTANCE.getTopLevelCmd();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ExprImpl <em>Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ExprImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getExpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getExpr();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.DefImpl <em>Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.DefImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getDef()
		 * @generated
		 */
		EClass DEF = eINSTANCE.getDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEF__NAME = eINSTANCE.getDef_Name();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEF__EXPR = eINSTANCE.getDef_Expr();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.AppImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__LHS = eINSTANCE.getApp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__RHS = eINSTANCE.getApp_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.VarImpl <em>Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.VarImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getVar()
		 * @generated
		 */
		EClass VAR = eINSTANCE.getVar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR__NAME = eINSTANCE.getVar_Name();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ThisImpl <em>This</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ThisImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getThis()
		 * @generated
		 */
		EClass THIS = eINSTANCE.getThis();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.BoolImpl <em>Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.BoolImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getBool()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBool();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL__VALUE = eINSTANCE.getBool_Value();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.IntImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT__VALUE = eINSTANCE.getInt_Value();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.SkipImpl <em>Skip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.SkipImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getSkip()
		 * @generated
		 */
		EClass SKIP = eINSTANCE.getSkip();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ProjectImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__VARS = eINSTANCE.getProject_Vars();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.BObjectImpl <em>BObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.BObjectImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getBObject()
		 * @generated
		 */
		EClass BOBJECT = eINSTANCE.getBObject();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOBJECT__FIELDS = eINSTANCE.getBObject_Fields();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.FieldImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.CopyImpl <em>Copy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.CopyImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getCopy()
		 * @generated
		 */
		EClass COPY = eINSTANCE.getCopy();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COPY__COPY = eINSTANCE.getCopy_Copy();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.WithImpl <em>With</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.WithImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getWith()
		 * @generated
		 */
		EClass WITH = eINSTANCE.getWith();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH__LHS = eINSTANCE.getWith_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH__RHS = eINSTANCE.getWith_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ArithOpImpl <em>Arith Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ArithOpImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getArithOp()
		 * @generated
		 */
		EClass ARITH_OP = eINSTANCE.getArithOp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITH_OP__LHS = eINSTANCE.getArithOp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITH_OP__RHS = eINSTANCE.getArithOp_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.NotImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__VALUE = eINSTANCE.getNot_Value();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.CmpOpImpl <em>Cmp Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.CmpOpImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOp()
		 * @generated
		 */
		EClass CMP_OP = eINSTANCE.getCmpOp();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_OP__LHS = eINSTANCE.getCmpOp_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_OP__RHS = eINSTANCE.getCmpOp_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.BoolOpImpl <em>Bool Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.BoolOpImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getBoolOp()
		 * @generated
		 */
		EClass BOOL_OP = eINSTANCE.getBoolOp();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.IfImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__COND = eINSTANCE.getIf_Cond();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__THEN = eINSTANCE.getIf_Then();

		/**
		 * The meta object literal for the '<em><b>Els</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF__ELS = eINSTANCE.getIf_Els();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.LetImpl <em>Let</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.LetImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getLet()
		 * @generated
		 */
		EClass LET = eINSTANCE.getLet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LET__NAME = eINSTANCE.getLet_Name();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET__LHS = eINSTANCE.getLet_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LET__RHS = eINSTANCE.getLet_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.FunImpl <em>Fun</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.FunImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getFun()
		 * @generated
		 */
		EClass FUN = eINSTANCE.getFun();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUN__NAME = eINSTANCE.getFun_Name();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUN__BODY = eINSTANCE.getFun_Body();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.AssignImpl <em>Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.AssignImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getAssign()
		 * @generated
		 */
		EClass ASSIGN = eINSTANCE.getAssign();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__LHS = eINSTANCE.getAssign_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGN__RHS = eINSTANCE.getAssign_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ArithOpPlusImpl <em>Arith Op Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ArithOpPlusImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpPlus()
		 * @generated
		 */
		EClass ARITH_OP_PLUS = eINSTANCE.getArithOpPlus();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ArithOpMinusImpl <em>Arith Op Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ArithOpMinusImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpMinus()
		 * @generated
		 */
		EClass ARITH_OP_MINUS = eINSTANCE.getArithOpMinus();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ArithOpTimesImpl <em>Arith Op Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ArithOpTimesImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpTimes()
		 * @generated
		 */
		EClass ARITH_OP_TIMES = eINSTANCE.getArithOpTimes();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ArithOpDivideImpl <em>Arith Op Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ArithOpDivideImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpDivide()
		 * @generated
		 */
		EClass ARITH_OP_DIVIDE = eINSTANCE.getArithOpDivide();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.ArithOpRemainderImpl <em>Arith Op Remainder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.ArithOpRemainderImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getArithOpRemainder()
		 * @generated
		 */
		EClass ARITH_OP_REMAINDER = eINSTANCE.getArithOpRemainder();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.BoolOpAndImpl <em>Bool Op And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.BoolOpAndImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getBoolOpAnd()
		 * @generated
		 */
		EClass BOOL_OP_AND = eINSTANCE.getBoolOpAnd();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_OP_AND__LHS = eINSTANCE.getBoolOpAnd_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_OP_AND__RHS = eINSTANCE.getBoolOpAnd_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.BoolOpOrImpl <em>Bool Op Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.BoolOpOrImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getBoolOpOr()
		 * @generated
		 */
		EClass BOOL_OP_OR = eINSTANCE.getBoolOpOr();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_OP_OR__LHS = eINSTANCE.getBoolOpOr_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOL_OP_OR__RHS = eINSTANCE.getBoolOpOr_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.SeqImpl <em>Seq</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.SeqImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getSeq()
		 * @generated
		 */
		EClass SEQ = eINSTANCE.getSeq();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__LHS = eINSTANCE.getSeq_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQ__RHS = eINSTANCE.getSeq_Rhs();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.CmpOpEqualImpl <em>Cmp Op Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.CmpOpEqualImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOpEqual()
		 * @generated
		 */
		EClass CMP_OP_EQUAL = eINSTANCE.getCmpOpEqual();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.CmpOpUnequalImpl <em>Cmp Op Unequal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.CmpOpUnequalImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOpUnequal()
		 * @generated
		 */
		EClass CMP_OP_UNEQUAL = eINSTANCE.getCmpOpUnequal();

		/**
		 * The meta object literal for the '{@link boa.model.boa.impl.CmpOpLessImpl <em>Cmp Op Less</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see boa.model.boa.impl.CmpOpLessImpl
		 * @see boa.model.boa.impl.BoaPackageImpl#getCmpOpLess()
		 * @generated
		 */
		EClass CMP_OP_LESS = eINSTANCE.getCmpOpLess();

	}

} //BoaPackage

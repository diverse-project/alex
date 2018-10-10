/**
 */
package boa.model.boa.util;

import boa.model.boa.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see boa.model.boa.BoaPackage
 * @generated
 */
public class BoaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BoaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BoaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoaSwitch<Adapter> modelSwitch = new BoaSwitch<Adapter>() {
		@Override
		public Adapter caseFile(File object) {
			return createFileAdapter();
		}

		@Override
		public Adapter caseTopLevelCmd(TopLevelCmd object) {
			return createTopLevelCmdAdapter();
		}

		@Override
		public Adapter caseExpr(Expr object) {
			return createExprAdapter();
		}

		@Override
		public Adapter caseDef(Def object) {
			return createDefAdapter();
		}

		@Override
		public Adapter caseApp(App object) {
			return createAppAdapter();
		}

		@Override
		public Adapter caseVar(Var object) {
			return createVarAdapter();
		}

		@Override
		public Adapter caseThis(This object) {
			return createThisAdapter();
		}

		@Override
		public Adapter caseBool(Bool object) {
			return createBoolAdapter();
		}

		@Override
		public Adapter caseInt(Int object) {
			return createIntAdapter();
		}

		@Override
		public Adapter caseSkip(Skip object) {
			return createSkipAdapter();
		}

		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseBObject(BObject object) {
			return createBObjectAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseCopy(Copy object) {
			return createCopyAdapter();
		}

		@Override
		public Adapter caseWith(With object) {
			return createWithAdapter();
		}

		@Override
		public Adapter caseArithOp(ArithOp object) {
			return createArithOpAdapter();
		}

		@Override
		public Adapter caseNot(Not object) {
			return createNotAdapter();
		}

		@Override
		public Adapter caseCmpOp(CmpOp object) {
			return createCmpOpAdapter();
		}

		@Override
		public Adapter caseBoolOp(BoolOp object) {
			return createBoolOpAdapter();
		}

		@Override
		public Adapter caseIf(If object) {
			return createIfAdapter();
		}

		@Override
		public Adapter caseLet(Let object) {
			return createLetAdapter();
		}

		@Override
		public Adapter caseFun(Fun object) {
			return createFunAdapter();
		}

		@Override
		public Adapter caseAssign(Assign object) {
			return createAssignAdapter();
		}

		@Override
		public Adapter caseArithOpPlus(ArithOpPlus object) {
			return createArithOpPlusAdapter();
		}

		@Override
		public Adapter caseArithOpMinus(ArithOpMinus object) {
			return createArithOpMinusAdapter();
		}

		@Override
		public Adapter caseArithOpTimes(ArithOpTimes object) {
			return createArithOpTimesAdapter();
		}

		@Override
		public Adapter caseArithOpDivide(ArithOpDivide object) {
			return createArithOpDivideAdapter();
		}

		@Override
		public Adapter caseArithOpRemainder(ArithOpRemainder object) {
			return createArithOpRemainderAdapter();
		}

		@Override
		public Adapter caseBoolOpAnd(BoolOpAnd object) {
			return createBoolOpAndAdapter();
		}

		@Override
		public Adapter caseBoolOpOr(BoolOpOr object) {
			return createBoolOpOrAdapter();
		}

		@Override
		public Adapter caseSeq(Seq object) {
			return createSeqAdapter();
		}

		@Override
		public Adapter caseCmpOpEqual(CmpOpEqual object) {
			return createCmpOpEqualAdapter();
		}

		@Override
		public Adapter caseCmpOpUnequal(CmpOpUnequal object) {
			return createCmpOpUnequalAdapter();
		}

		@Override
		public Adapter caseCmpOpLess(CmpOpLess object) {
			return createCmpOpLessAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.TopLevelCmd <em>Top Level Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.TopLevelCmd
	 * @generated
	 */
	public Adapter createTopLevelCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Expr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Expr
	 * @generated
	 */
	public Adapter createExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Def <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Def
	 * @generated
	 */
	public Adapter createDefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.App
	 * @generated
	 */
	public Adapter createAppAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Var <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Var
	 * @generated
	 */
	public Adapter createVarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.This <em>This</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.This
	 * @generated
	 */
	public Adapter createThisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Bool
	 * @generated
	 */
	public Adapter createBoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Int
	 * @generated
	 */
	public Adapter createIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Skip <em>Skip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Skip
	 * @generated
	 */
	public Adapter createSkipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.BObject <em>BObject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.BObject
	 * @generated
	 */
	public Adapter createBObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Copy <em>Copy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Copy
	 * @generated
	 */
	public Adapter createCopyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.With
	 * @generated
	 */
	public Adapter createWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.ArithOp <em>Arith Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.ArithOp
	 * @generated
	 */
	public Adapter createArithOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Not
	 * @generated
	 */
	public Adapter createNotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.CmpOp <em>Cmp Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.CmpOp
	 * @generated
	 */
	public Adapter createCmpOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.BoolOp <em>Bool Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.BoolOp
	 * @generated
	 */
	public Adapter createBoolOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Let <em>Let</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Let
	 * @generated
	 */
	public Adapter createLetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Fun <em>Fun</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Fun
	 * @generated
	 */
	public Adapter createFunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Assign <em>Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Assign
	 * @generated
	 */
	public Adapter createAssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.ArithOpPlus <em>Arith Op Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.ArithOpPlus
	 * @generated
	 */
	public Adapter createArithOpPlusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.ArithOpMinus <em>Arith Op Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.ArithOpMinus
	 * @generated
	 */
	public Adapter createArithOpMinusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.ArithOpTimes <em>Arith Op Times</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.ArithOpTimes
	 * @generated
	 */
	public Adapter createArithOpTimesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.ArithOpDivide <em>Arith Op Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.ArithOpDivide
	 * @generated
	 */
	public Adapter createArithOpDivideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.ArithOpRemainder <em>Arith Op Remainder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.ArithOpRemainder
	 * @generated
	 */
	public Adapter createArithOpRemainderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.BoolOpAnd <em>Bool Op And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.BoolOpAnd
	 * @generated
	 */
	public Adapter createBoolOpAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.BoolOpOr <em>Bool Op Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.BoolOpOr
	 * @generated
	 */
	public Adapter createBoolOpOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.Seq <em>Seq</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.Seq
	 * @generated
	 */
	public Adapter createSeqAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.CmpOpEqual <em>Cmp Op Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.CmpOpEqual
	 * @generated
	 */
	public Adapter createCmpOpEqualAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.CmpOpUnequal <em>Cmp Op Unequal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.CmpOpUnequal
	 * @generated
	 */
	public Adapter createCmpOpUnequalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link boa.model.boa.CmpOpLess <em>Cmp Op Less</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see boa.model.boa.CmpOpLess
	 * @generated
	 */
	public Adapter createCmpOpLessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BoaAdapterFactory

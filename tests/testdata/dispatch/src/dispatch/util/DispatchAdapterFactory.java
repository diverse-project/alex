/**
 */
package dispatch.util;

import dispatch.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dispatch.DispatchPackage
 * @generated
 */
public class DispatchAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DispatchPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispatchAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DispatchPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DispatchSwitch<Adapter> modelSwitch =
		new DispatchSwitch<Adapter>() {
			@Override
			public Adapter caseA(A object) {
				return createAAdapter();
			}
			@Override
			public Adapter caseB(B object) {
				return createBAdapter();
			}
			@Override
			public Adapter caseC(C object) {
				return createCAdapter();
			}
			@Override
			public Adapter caseD(D object) {
				return createDAdapter();
			}
			@Override
			public Adapter caseE(E object) {
				return createEAdapter();
			}
			@Override
			public Adapter caseF(F object) {
				return createFAdapter();
			}
			@Override
			public Adapter caseG(G object) {
				return createGAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseH(H object) {
				return createHAdapter();
			}
			@Override
			public Adapter caseI(I object) {
				return createIAdapter();
			}
			@Override
			public Adapter caseJ(J object) {
				return createJAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dispatch.A <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.A
	 * @generated
	 */
	public Adapter createAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.B <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.B
	 * @generated
	 */
	public Adapter createBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.C <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.C
	 * @generated
	 */
	public Adapter createCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.D <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.D
	 * @generated
	 */
	public Adapter createDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.E <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.E
	 * @generated
	 */
	public Adapter createEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.F <em>F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.F
	 * @generated
	 */
	public Adapter createFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.G <em>G</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.G
	 * @generated
	 */
	public Adapter createGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.H <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.H
	 * @generated
	 */
	public Adapter createHAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.I <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.I
	 * @generated
	 */
	public Adapter createIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dispatch.J <em>J</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dispatch.J
	 * @generated
	 */
	public Adapter createJAdapter() {
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

} //DispatchAdapterFactory

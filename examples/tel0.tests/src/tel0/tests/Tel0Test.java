package tel0.tests;

// JUnit 5 imports.
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// imports of the two semantics, in the form of the revisitor 
// generated from the *.ale semantics definition.
import evaluate.revisitor.impl.EvaluateRevisitor;
import prettyprint.revisitor.impl.PrettyprintRevisitor;

// import of the abstract syntax concepts.
import tel0.model.tel0.Exp;
import tel0.model.tel0.LitVal;
import tel0.model.tel0.Sum;
// and the EMF factory used to instantiate the concepts.
import tel0.model.tel0.Tel0Factory;

public class Tel0Test {

	/**
	 * Instantiation of the revisitors. The imported revisitors are 
	 * Java 8 interfaces with default methods. We define anonymous 
	 * classes from the interfaces in order to be able to 
	 * instantiate them (cf. https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html).
	 */
	private final EvaluateRevisitor revExec
		= new EvaluateRevisitor() {};
	private final PrettyprintRevisitor revPrint
		= new PrettyprintRevisitor() {};

	/**
	 * Creation of a simple TEL0 program by metamodel manipulation.
	 * 
	 * @return 1 + 2
	 */
	private Exp createModel0() {

		// Creation of a sum operation.
		final Sum exp = Tel0Factory.eINSTANCE.createSum();
		// Creation a literal value with the value 1.
		final LitVal x = Tel0Factory.eINSTANCE.createLitVal();
		x.setValue(1L);
		// Affectation of the value 1 to the left-hand side of 
		// the sum.
		exp.setLhs(x);

		// Creation and affectation of the value 2 to the right
		// hand side of the sum.
		final LitVal y = Tel0Factory.eINSTANCE.createLitVal();
		y.setValue(2L);
		exp.setRhs(y);

		return exp;
	}

	/**
	 * Execution test.
	 */
	@Test
	void test0Exec() {
		final Exp exp = createModel0();
		Assertions.assertEquals(3L, revExec.$(exp).eval());
	}

	/**
	 * Pretty print test.
	 */
	@Test
	void test0Print() {
		final Exp exp = createModel0();
		Assertions.assertEquals("1 + 2", revPrint.$(exp).print());
	}
}

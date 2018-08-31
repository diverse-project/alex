package tel0.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import evaluate.revisitor.impl.EvaluateRevisitor;
import prettyprint.revisitor.impl.PrettyprintRevisitor;
import tel0.model.tel0.LitVal;
import tel0.model.tel0.Sum;
import tel0.model.tel0.Tel0Factory;

public class Tel0Test {

	private final EvaluateRevisitor revExec = new EvaluateRevisitor() {
	};

	private final PrettyprintRevisitor revPrint = new PrettyprintRevisitor() {
	};

	@Test
	void test0Exec() {
		final Sum exp = createModel0();
		Assertions.assertEquals(3L, revExec.$(exp).eval());
	}

	@Test
	void test0Print() {
		final Sum exp = createModel0();
		Assertions.assertEquals("1 + 2", revPrint.$(exp).print());
	}

	/**
	 * 
	 * @return 1 + 2
	 */
	private Sum createModel0() {
		final Sum exp = Tel0Factory.eINSTANCE.createSum();
		final LitVal x = Tel0Factory.eINSTANCE.createLitVal();
		x.setValue(1L);
		exp.setLhs(x);
		final LitVal y = Tel0Factory.eINSTANCE.createLitVal();
		y.setValue(2L);
		exp.setRhs(y);
		return exp;
	}

}

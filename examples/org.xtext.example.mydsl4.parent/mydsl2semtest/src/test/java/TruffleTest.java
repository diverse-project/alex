import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TruffleTest {

	private Context context;

	@Before
	public void initEngine() throws Exception {

		context = Context.create();
	}

	@After
	public void dispose() {
		context.close();
	}

	@Test
	public void parseAndEval() throws Exception {
		Value eval = context.eval("compilA", "1+2*3");
		Assert.assertEquals(7, eval.asInt());
	}

	@Test
	public void parseAndEval2() throws Exception {
		Value eval = context.eval("compilA", "(-1)+2*3");
		Assert.assertEquals(5, eval.asInt());
	}
}

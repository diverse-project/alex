package fr.mleduc.lang.boa.test;

import com.oracle.truffle.api.nodes.DirectCallNode;
import execboatruffle.Sideeffects;
import lang.Holder;
import org.apache.commons.io.IOUtils;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class TruffleTest extends AbstractBoaTest {

    private Context context;

    @Before
    @Override
    public void init() {
        super.init();
        context = Context.create();
    }

    @Override
    protected String getName() {
        return "truffle";
    }

    @After
    @Override
    public void finish() {
        super.finish();
        context.close();
    }

    @Test
    public void fib2() throws IOException {

        final java.io.File file = new java.io.File("programs/fib2.boa");
        final InputStream stream = new FileInputStream(file);
        final String source = IOUtils.toString(stream, Charset.defaultCharset());

        final Value eval = context.eval("boa", source);

        Sideeffects.TRACE = false;
        timer.before();
        for (int i = 0; i < 1000; i++) {
            DirectCallNode.create(Holder.callProgram()).call(new Object[]{});
        }
        timer.after("fib2");
    }


    @Test
    @Ignore
    public void longfib() throws IOException {

        final java.io.File file = new java.io.File("programs/longfib.boa");
        final InputStream stream = new FileInputStream(file);
        final String source = IOUtils.toString(stream, Charset.defaultCharset());

        final Value eval = context.eval("boa", source);

        Sideeffects.TRACE = false;
        timer.before();
        for (int i = 0; i < 1000; i++) {
            DirectCallNode.create(Holder.callProgram()).call(new Object[]{});
        }
        timer.after("longfib");
    }


    @Override
    void eval(final String pathname, final String expected) throws FileNotFoundException, IOException {
        final java.io.File file = new java.io.File(pathname);
        final InputStream stream = new FileInputStream(file);
        final String source = IOUtils.toString(stream, Charset.defaultCharset());
        context.eval("boa", source);
        timer.before();
        DirectCallNode.create(Holder.callProgram()).call(new Object[]{});
        timer.after(pathname);
        Assert.assertEquals(expected, Sideeffects.SB.toString());
    }
}

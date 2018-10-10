package fr.mleduc.lang.boa.test;

import org.apache.commons.io.IOUtils;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

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

    @After
    @Override
    public void finish() {
        super.finish();
        context.close();
    }


    @Override
    void eval(final String pathname, final String expected) throws FileNotFoundException, IOException {
        final java.io.File file = new java.io.File(pathname);
        final InputStream stream = new FileInputStream(file);
        final String source = IOUtils.toString(stream, Charset.defaultCharset());
        final Value eval = context.eval("boa", source);
        Assert.assertEquals(expected, eval.asString());
    }
}

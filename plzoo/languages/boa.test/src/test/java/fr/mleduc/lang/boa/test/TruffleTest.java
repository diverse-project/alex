package fr.mleduc.lang.boa.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.inject.Injector;

import execboatruffle.ExecboatruffleFactory;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.File;
import execboatruffle.Sideeffects;

public class TruffleTest {

	private Context context;

	@Before
	public void init() {
		context = Context.create();
		Sideeffects.PRINT = false;
	}

	@After
	public void finish() {
		context.close();
		Sideeffects.SB = new StringBuilder();
	}

	@Test
	public void test2plus2() throws IOException {
		eval("programs/2plus2.boa", "4\n");
	}

	@Test
	public void test2minus2() throws IOException {
		eval("programs/2minus2.boa", "0\n");
	}

	@Test
	public void test2times3() throws IOException {
		eval("programs/2times3.boa", "6\n");
	}

	@Test
	public void test2less3() throws IOException {
		eval("programs/2less3.boa", "true\n");
	}

	@Test
	public void ifplus() throws IOException {
		eval("programs/ifplus.boa", "12\n");
	}

	@Test
	public void fun0() throws IOException {
		eval("programs/fun0.boa", "<fun>\n");
	}

	@Test
	public void fun0app7() throws IOException {
		eval("programs/fun0app7.boa", "57\n");
	}

	@Test
	public void deffun0() throws IOException {
		eval("programs/deffun0.boa", "f = <fun>\n");
	}

	@Test
	public void deffun0app7() throws IOException {
		eval("programs/deffun0app7.boa", "f = <fun>\n57\n");
	}

	@Test
	public void skip() throws IOException {
		eval("programs/skip.boa", "{}\n");
	}

	@Test
	public void objx7y8() throws IOException {
		eval("programs/objx7y8.boa", "{x=7, y=8}\n");
	}

	@Test
	public void defpobjx7y8() throws IOException {
		eval("programs/defpobjx7y8.boa", "p = {x=7, y=8}\n");
	}

	@Test
	public void defpobjx7y8_px() throws IOException {
		eval("programs/defpobjx7y8_px.boa", "p = {x=7, y=8}\n7\n");
	}

	@Test
	public void defpobjx7y8_px_px10() throws IOException {
		eval("programs/defpobjx7y8_px_px10.boa", "p = {x=7, y=8}\n7\n10\n");
	}

	@Test
	public void defpobjx7y8_px_px10_p() throws IOException {
		eval("programs/defpobjx7y8_px_px10_p.boa", "p = {x=7, y=8}\n7\n10\n{x=10, y=8}\n");
	}

	@Test
	public void test3with4() throws IOException {
		eval("programs/3with4.boa", "{a=3, b=4}\n");
	}

	@Test
	public void test3with45() throws IOException {
		eval("programs/3with45.boa", "{a=4, b=5}\n");
	}

	@Test
	public void test34with56() throws IOException {
		eval("programs/34with56.boa", "{a=5, b=6, c=4}\n");
	}

	@Test
	public void cowpy() throws IOException {
		eval("programs/cowpy.boa",
				"cow = {horn=7, tail={a=5, b=6}}\n" + "bull = {tail={a=5, b=6}, horn=7}\n" + "8\n"
						+ "{tail={a=5, b=6}, horn=8}\n" + "{horn=7, tail={a=5, b=6}}\n" + "100\n"
						+ "{tail={a=100, b=6}, horn=8}\n" + "{horn=7, tail={a=100, b=6}}\n");
	}

	@Test
	public void recfun() throws IOException {
		eval("programs/recfun.boa", "rec = <fun>\n");
	}

	@Test
	public void list() throws IOException {
		eval("programs/list.boa",
				"list = {nil=<fun>, iterator=<fun>, getTail=<fun>, getHead=<fun>, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>}\n"
						+ "a = {nil=<fun>, head=1000, iterator=<fun>, getTail=<fun>, getHead=<fun>, tail={nil=<fun>, head=2000, iterator=<fun>, getTail=<fun>, getHead=<fun>, tail={nil=<fun>, head=3000, iterator=<fun>, getTail=<fun>, getHead=<fun>, tail={nil=<fun>, iterator=<fun>, getTail=<fun>, getHead=<fun>, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=true}, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=false}, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=false}, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=false}\n"
						+ "{nil=<fun>, iterator=<fun>, getTail=<fun>, getHead=<fun>, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=true}\n"
						+ "{nil=<fun>, head=42, iterator=<fun>, getTail=<fun>, getHead=<fun>, tail={nil=<fun>, iterator=<fun>, getTail=<fun>, getHead=<fun>, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=true}, get=<fun>, isEmpty=<fun>, map=<fun>, cons=<fun>, empty=false}\n"
						+ "x = 1000\n" + "x = 2000\n" + "x = 3000\n");
	}

	private void eval(final String pathname, final String expected) throws FileNotFoundException, IOException {
		final java.io.File file = new java.io.File(pathname);
		final InputStream stream = new FileInputStream(file);
		final Value eval = context.eval("boa", IOUtils.toString(stream, Charset.defaultCharset()));
		Assert.assertEquals(expected, eval.asString());
	}
}

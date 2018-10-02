
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.Assert;
import org.junit.Test;
import org.xtext.example.mydsl4.MyDslStandaloneSetup;

import com.google.inject.Injector;

import compilA.CompilAFactory;
import compilA.CompilAPackage;
import compilA.Expression;
import compilA.impl.LiteralImpl;
import compilA.impl.SumImpl;

public class RefTest {

	@Test
	public void parse() throws Exception {
		final CompilAFactory einstance = CompilAFactory.eINSTANCE;
		final CompilAPackage einstance2 = CompilAPackage.eINSTANCE;

		final Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.mydsl4"));

		final InputStream stream = new ByteArrayInputStream("1+1".getBytes(StandardCharsets.UTF_8));
		resource.load(stream, resourceSet.getLoadOptions());
		final Expression result = (Expression) resource.getContents().get(0);

		Assert.assertNotNull(result);

		final EList<Diagnostic> errors = result.eResource().getErrors();

		Assert.assertTrue(errors.isEmpty());
	}

	@Test
	public void parseAndEval() throws Exception {

		final CompilAFactory einstance = CompilAFactory.eINSTANCE;
		final CompilAPackage einstance2 = CompilAPackage.eINSTANCE;

		final Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
		final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		final Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.mydsl4"));

		final InputStream stream = new ByteArrayInputStream("1+2*3".getBytes(StandardCharsets.UTF_8));
		resource.load(stream, resourceSet.getLoadOptions());
		final Expression result = (Expression) resource.getContents().get(0);

		Assert.assertEquals(7, result.eval());
	}

	@Test
	public void factorialOf5() throws Exception {
		final SumImpl sum = new SumImpl();
		final LiteralImpl lhs = new LiteralImpl();
		lhs.setValue(1);
		sum.setLhs(lhs);
		final LiteralImpl rhs = new LiteralImpl();
		rhs.setValue(2);
		sum.setRhs(rhs);

		System.out.println(sum.eval());
	}

}

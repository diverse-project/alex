package mydsl2semtest.compilA;

import com.google.inject.Injector;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import compilA.CompilAFactory;
import compilA.CompilAPackage;
import compilA.Expression;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.mydsl4.MyDslStandaloneSetup;

import java.io.InputStream;

@TruffleLanguage.Registration(id = "compilA", name = "compilA", mimeType = "application/compilA", contextPolicy = ContextPolicy.SHARED)
@SuppressWarnings("all")
public class CompilALanguage extends com.oracle.truffle.api.TruffleLanguage<Void> {

    public CompilALanguage() {

    }

    @Override
    public Void createContext(final TruffleLanguage.Env env) {
        return null;
    }

    @Override
    public boolean isObjectOfLanguage(final Object object) {
        if (object instanceof EObject) {
            final EObject eObject = (EObject) object;
            return "http://compilA.test.mod".equals(eObject.eClass().getEPackage().getNsURI());
        }

        return false;
    }

    @Override
    public CallTarget parse(final com.oracle.truffle.api.TruffleLanguage.ParsingRequest request) throws Exception {
        final CompilAFactory einstance = CompilAFactory.eINSTANCE;
        final CompilAPackage einstance2 = CompilAPackage.eINSTANCE;

        final Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
        final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        final Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.mydsl4"));

        final InputStream stream = request.getSource().getInputStream();
        resource.load(stream, resourceSet.getLoadOptions());
        final Expression model = (Expression) resource.getContents().get(0);

        return Truffle.getRuntime().createCallTarget(new RootNode(CompilALanguage.this) {
            @Override
            public Object execute(VirtualFrame frame) {
                return model.main();
            }
        });

    }
}

package lang;

import com.google.inject.Injector;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.TruffleLanguage.ContextPolicy;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;
import execboatruffle.ExecboatruffleFactory;
import execboatruffle.ExecboatrufflePackage;
import execboatruffle.File;
import execboatruffle.Sideeffects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import java.io.InputStream;

@TruffleLanguage.Registration(id = "boa", name = "boa", mimeType = "application/boa", contextPolicy = ContextPolicy.SHARED)
@SuppressWarnings("all")
public class BoaLang extends com.oracle.truffle.api.TruffleLanguage<Void> {

    public BoaLang() {

    }

    @Override
    public Void createContext(final TruffleLanguage.Env env) {
        return null;
    }

    @Override
    public boolean isObjectOfLanguage(final Object object) {
        System.out.println(object);
        if (object instanceof EObject) {
            final EObject eObject = (EObject) object;
            return "http://execboatruffle.execboa.boa/".equals(eObject.eClass().getEPackage().getNsURI());
        }

        return false;
    }

    @Override
    public CallTarget parse(final com.oracle.truffle.api.TruffleLanguage.ParsingRequest request) throws Exception {
        final ExecboatruffleFactory einstance = ExecboatruffleFactory.eINSTANCE;
        final ExecboatrufflePackage einstance2 = ExecboatrufflePackage.eINSTANCE;

        final Injector injector = new fr.mleduc.lang.boa.BoaStandaloneSetup().createInjectorAndDoEMFRegistration();
        final XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        final Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.boa"));

        final InputStream stream = request.getSource().getInputStream();
        resource.load(stream, resourceSet.getLoadOptions());
        final File result = (File) resource.getContents().get(0);

        final EList<Diagnostic> errors = result.eResource().getErrors();

        Holder.setCallSite(result, this);

        return Truffle.getRuntime().createCallTarget(new RootNode(BoaLang.this) {
            @Override
            public Object execute(VirtualFrame frame) {
                return 42;
            }
        });

    }
}

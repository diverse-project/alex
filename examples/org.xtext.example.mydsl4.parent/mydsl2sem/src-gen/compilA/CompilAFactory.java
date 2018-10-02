package compilA;

import org.eclipse.emf.ecore.EFactory;

@SuppressWarnings("all")
public interface CompilAFactory extends EFactory {
  CompilAFactory eINSTANCE = compilA.impl.CompilAFactoryImpl.init();
}

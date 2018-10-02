package compilA;

import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Expression extends EObject {
  public abstract long main();
  
  public abstract long eval();
}

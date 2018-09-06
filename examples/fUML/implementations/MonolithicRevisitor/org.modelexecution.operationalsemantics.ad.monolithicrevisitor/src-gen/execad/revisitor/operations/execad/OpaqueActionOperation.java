package execad.revisitor.operations.execad;

import execad.revisitor.operations.execad.ActionOperation;
import execad.revisitor.operations.execad.ActivityNodeOperation;
import execad.revisitor.operations.execad.ExecutableNodeOperation;
import execad.revisitor.operations.execad.NamedElementOperation;

@SuppressWarnings("all")
public interface OpaqueActionOperation extends ActionOperation, ExecutableNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract void doAction();
}

package execad.revisitor.operations.execad;

import execad.revisitor.operations.execad.ActivityNodeOperation;
import execad.revisitor.operations.execad.ControlNodeOperation;
import execad.revisitor.operations.execad.NamedElementOperation;

@SuppressWarnings("all")
public interface MergeNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedElementOperation {
  public abstract boolean hasOffers();
}

package guardedfsmprinting.revisitor.operations.guardedfsmprinting;

import guardedfsmprinting.revisitor.operations.guardedfsmprinting.TransitionOperation;

@SuppressWarnings("all")
public interface GuardedOperation extends TransitionOperation, fsmprinting.revisitor.operations.fsmprinting.TransitionOperation {
  public abstract String print();
}

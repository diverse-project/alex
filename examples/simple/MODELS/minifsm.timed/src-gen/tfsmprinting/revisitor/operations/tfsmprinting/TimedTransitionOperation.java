package tfsmprinting.revisitor.operations.tfsmprinting;

<<<<<<< HEAD
import fsmprinting.revisitor.operations.fsmprinting.TransitionOperation;

@SuppressWarnings("all")
public interface TimedTransitionOperation extends TransitionOperation, tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation {
=======
import tfsmprinting.revisitor.operations.tfsmprinting.TransitionOperation;

@SuppressWarnings("all")
public interface TimedTransitionOperation extends TransitionOperation, fsmprinting.revisitor.operations.fsmprinting.TransitionOperation {
>>>>>>> 3f6de93c322367fd78b1d4d23b20a24edba268d3
  public abstract String print();
}

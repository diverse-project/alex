package activitydiagram_exec.revisitor.operations.activitydiagram_exec;

import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ControlNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;
import activitydiagramruntime.Context;

@SuppressWarnings("all")
public interface JoinNodeOperation extends ControlNodeOperation, ActivityNodeOperation, NamedActivityOperation {
  public abstract void execute(final Context c);
}

package iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec;

import activitydiagram.Context;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActionOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ActivityNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.ExecutableNodeOperation;
import activitydiagram_exec.revisitor.operations.activitydiagram_exec.NamedActivityOperation;

@SuppressWarnings("all")
public interface OpaqueActionOperation extends activitydiagram_exec.revisitor.operations.activitydiagram_exec.OpaqueActionOperation, ActionOperation, iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActionOperation, ExecutableNodeOperation, iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ExecutableNodeOperation, ActivityNodeOperation, iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.ActivityNodeOperation, NamedActivityOperation, iot_simpleexpression_exec.revisitor.operations.iot_simpleexpression_exec.NamedActivityOperation {
  public abstract void execute(final Context c);
}

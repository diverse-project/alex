package idl_exec.revisitor.operations.idl_exec.impl;

import idl_exec.revisitor.operations.idl_exec.ContainedOperation;
import idl_exec.revisitor.operations.idl_exec.ContainerOperation;
import idl_exec.revisitor.operations.idl_exec.ExceptionDefOperation;
import idl_exec.revisitor.operations.idl_exec.FieldOperation;
import idl_exec.revisitor.operations.idl_exec.IDLTypeOperation;
import idl_exec.revisitor.operations.idl_exec.NamedElementOperation;
import idl_exec.revisitor.operations.idl_exec.OperationDefOperation;
import idl_exec.revisitor.operations.idl_exec.ParameterDefOperation;
import idl_exec.revisitor.operations.idl_exec.PrimitiveDefOperation;
import idl_exec.revisitor.operations.idl_exec.TypedOperation;
import idl_exec.revisitor.operations.idl_exec.TypedefDefOperation;
import idl_exec.revisitor.operations.idl_exec.impl.TypedOperationImpl;
import idlmm.revisitor.IdlmmRevisitor;
import org.csu.idl.idlmm.ParameterDef;

@SuppressWarnings("all")
public class ParameterDefOperationImpl extends TypedOperationImpl implements ParameterDefOperation {
  private ParameterDef obj;
  
  private IdlmmRevisitor<? extends ContainedOperation, ? extends ContainerOperation, ? extends ExceptionDefOperation, ? extends FieldOperation, ? extends IDLTypeOperation, ? extends NamedElementOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends TypedOperation, ? extends TypedefDefOperation> alg;
  
  public ParameterDefOperationImpl(final ParameterDef obj, final IdlmmRevisitor<? extends ContainedOperation, ? extends ContainerOperation, ? extends ExceptionDefOperation, ? extends FieldOperation, ? extends IDLTypeOperation, ? extends NamedElementOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends TypedOperation, ? extends TypedefDefOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}

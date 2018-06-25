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
import idlmm.revisitor.IdlmmRevisitor;
import org.csu.idl.idlmm.NamedElement;

@SuppressWarnings("all")
public class NamedElementOperationImpl implements NamedElementOperation {
  private NamedElement obj;
  
  private IdlmmRevisitor<? extends ContainedOperation, ? extends ContainerOperation, ? extends ExceptionDefOperation, ? extends FieldOperation, ? extends IDLTypeOperation, ? extends NamedElementOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends TypedOperation, ? extends TypedefDefOperation> alg;
  
  public NamedElementOperationImpl(final NamedElement obj, final IdlmmRevisitor<? extends ContainedOperation, ? extends ContainerOperation, ? extends ExceptionDefOperation, ? extends FieldOperation, ? extends IDLTypeOperation, ? extends NamedElementOperation, ? extends OperationDefOperation, ? extends ParameterDefOperation, ? extends PrimitiveDefOperation, ? extends TypedOperation, ? extends TypedefDefOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
}

package prettyprint1.revisitor.operations.prettyprint1.impl;

import prettyprint1.revisitor.operations.prettyprint1.ExpOperation;
import prettyprint1.revisitor.operations.prettyprint1.LitValOperation;
import prettyprint1.revisitor.operations.prettyprint1.SumOperation;
import prettyprint1.revisitor.operations.prettyprint1.VarLitOperation;
import prettyprint1.revisitor.operations.prettyprint1.impl.ExpOperationImpl;
import tel1.model.tel1.VarLit;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public class VarLitOperationImpl extends ExpOperationImpl implements VarLitOperation {
  private VarLit obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public VarLitOperationImpl(final VarLit obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public String print() {
    return this.obj.getName();
  }
}

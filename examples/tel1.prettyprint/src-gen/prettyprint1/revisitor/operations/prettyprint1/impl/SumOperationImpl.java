package prettyprint1.revisitor.operations.prettyprint1.impl;

import prettyprint1.revisitor.operations.prettyprint1.ExpOperation;
import prettyprint1.revisitor.operations.prettyprint1.LitValOperation;
import prettyprint1.revisitor.operations.prettyprint1.SumOperation;
import prettyprint1.revisitor.operations.prettyprint1.VarLitOperation;
import tel0.model.tel0.Sum;
import tel1.revisitor.Tel1Revisitor;

@SuppressWarnings("all")
public class SumOperationImpl extends prettyprint.revisitor.operations.prettyprint.impl.SumOperationImpl implements SumOperation {
  private Sum obj;
  
  private Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg;
  
  public SumOperationImpl(final Sum obj, final Tel1Revisitor<? extends ExpOperation, ? extends LitValOperation, ? extends SumOperation, ? extends VarLitOperation> alg) {
    super(obj, alg);
    this.obj = obj;
    this.alg = alg;
  }
}

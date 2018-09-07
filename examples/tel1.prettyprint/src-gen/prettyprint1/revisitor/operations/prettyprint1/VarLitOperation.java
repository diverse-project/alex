package prettyprint1.revisitor.operations.prettyprint1;

import prettyprint1.revisitor.operations.prettyprint1.ExpOperation;

@SuppressWarnings("all")
public interface VarLitOperation extends ExpOperation, prettyprint.revisitor.operations.prettyprint.ExpOperation {
  public abstract String print();
}

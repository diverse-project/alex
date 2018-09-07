package ale2sem.revisitor.operations.ale2sem.impl;

import ale2.B;
import ale2.RB;
import ale2.revisitor.Ale2Revisitor;
import ale2sem.revisitor.operations.ale2sem.BOperation;
import ale2sem.revisitor.operations.ale2sem.RBOperation;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class BOperationImpl implements BOperation {
  private B obj;
  
  private Ale2Revisitor<? extends BOperation, ? extends RBOperation> alg;
  
  public BOperationImpl(final B obj, final Ale2Revisitor<? extends BOperation, ? extends RBOperation> alg) {
    this.obj = obj;
    this.alg = alg;
  }
  
  @Override
  public void printB() {
    InputOutput.<String>println("B");
    final Consumer<RB> _function = (RB it) -> {
      this.alg.$(it).rbPrint();
    };
    this.obj.getRb().forEach(_function);
  }
}

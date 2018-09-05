package test.revisitor.operations.test;

import test.revisitor.operations.test.AOperation;
import test.revisitor.operations.test.COperation;
import test.revisitor.operations.test.FOperation;
import test.revisitor.operations.test.GOperation;

@SuppressWarnings("all")
public interface IOperation extends FOperation, GOperation, COperation, AOperation {
}

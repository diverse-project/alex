package test.revisitor.operations.test;

import test.revisitor.operations.test.AOperation;
import test.revisitor.operations.test.BOperation;
import test.revisitor.operations.test.DOperation;
import test.revisitor.operations.test.EOperation;

@SuppressWarnings("all")
public interface HOperation extends DOperation, EOperation, BOperation, AOperation {
}

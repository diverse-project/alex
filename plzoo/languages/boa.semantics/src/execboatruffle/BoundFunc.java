package execboatruffle;

import java.util.Map;

public class BoundFunc extends Func {
	public final Map<String, Object> th;
	public BoundFunc(Func func, Map<String, Object> th) {
		super(func.name, func.ctx, func.expr);
		this.th = th;
	}
	
	
	
}

package execboatruffle;

import java.util.Map;

public class BoundFunc {
	public final Func func;
	public final Map<String, Object> th;
	public BoundFunc(Func func, Map<String, Object> th) {
		super();
		this.func = func;
		this.th = th;
	}
	
	
	
}

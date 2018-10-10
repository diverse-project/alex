package execboatruffle;

import java.util.Map;
import java.util.Optional;

public class EvalCtx {
	public final Optional<Map<String, Object>> th;
	public final Map<String, Object> env;

	public EvalCtx(Optional<Map<String, Object>> th, Map<String, Object> env) {
		super();
		this.th = th;
		this.env = env;
	}

}

package execboatruffle;

public class Func {
	public final String name;
	public final EvalCtx ctx;
	public final Expr expr;
	
	public Func( String name, EvalCtx ctx, Expr expr) {
		super();
		this.name = name;
		this.ctx = ctx;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "<fun>";
	}
	
	

}

package tel0.revisitor;

public interface Tel0Revisitor<Tel0__ExpT, Tel0__IntLitT extends Tel0__ExpT, Tel0__SumT extends Tel0__ExpT> {
	Tel0__IntLitT tel0__IntLit(final tel0.model.tel0.IntLit it);
	Tel0__SumT tel0__Sum(final tel0.model.tel0.Sum it);

	default Tel0__ExpT $(final tel0.model.tel0.Exp it) {
		if (it.getClass() == tel0.model.tel0.impl.IntLitImpl.class)
			return tel0__IntLit((tel0.model.tel0.IntLit) it);
		if (it.getClass() == tel0.model.tel0.impl.SumImpl.class)
			return tel0__Sum((tel0.model.tel0.Sum) it);
		return null;
	}
	default Tel0__IntLitT $(final tel0.model.tel0.IntLit it) {
		return tel0__IntLit(it);
	}
	default Tel0__SumT $(final tel0.model.tel0.Sum it) {
		return tel0__Sum(it);
	}
}

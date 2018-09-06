package tel1.revisitor;

public interface Tel1Revisitor<Tel0__ExpT, Tel0__LitValT extends Tel0__ExpT, Tel0__SumT extends Tel0__ExpT, Tel1__VarLitT extends Tel0__ExpT>
	extends tel0.revisitor.Tel0Revisitor<Tel0__ExpT, Tel0__LitValT, Tel0__SumT> {
	Tel1__VarLitT tel1__VarLit(final tel1.model.tel1.VarLit it);

	default Tel0__ExpT $(final tel0.model.tel0.Exp it) {
		if (it.getClass() == tel0.model.tel0.impl.LitValImpl.class)
			return tel0__LitVal((tel0.model.tel0.LitVal) it);
		if (it.getClass() == tel0.model.tel0.impl.SumImpl.class)
			return tel0__Sum((tel0.model.tel0.Sum) it);
		if (it.getClass() == tel1.model.tel1.impl.VarLitImpl.class)
			return tel1__VarLit((tel1.model.tel1.VarLit) it);
		return null;
	}
	default Tel0__LitValT $(final tel0.model.tel0.LitVal it) {
		return tel0__LitVal(it);
	}
	default Tel0__SumT $(final tel0.model.tel0.Sum it) {
		return tel0__Sum(it);
	}
	default Tel1__VarLitT $(final tel1.model.tel1.VarLit it) {
		return tel1__VarLit(it);
	}
}

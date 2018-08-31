package tel0.revisitor;

public interface Tel0Revisitor<Tel0__ExpT, Tel0__LitValT extends Tel0__ExpT, Tel0__SumT extends Tel0__ExpT> {
	Tel0__LitValT tel0__LitVal(final tel0.model.tel0.LitVal it);
	Tel0__SumT tel0__Sum(final tel0.model.tel0.Sum it);

	default Tel0__ExpT $(final tel0.model.tel0.Exp it) {
		if (it.getClass() == tel0.model.tel0.impl.LitValImpl.class)
			return tel0__LitVal((tel0.model.tel0.LitVal) it);
		if (it.getClass() == tel0.model.tel0.impl.SumImpl.class)
			return tel0__Sum((tel0.model.tel0.Sum) it);
		return null;
	}
	default Tel0__LitValT $(final tel0.model.tel0.LitVal it) {
		return tel0__LitVal(it);
	}
	default Tel0__SumT $(final tel0.model.tel0.Sum it) {
		return tel0__Sum(it);
	}
}

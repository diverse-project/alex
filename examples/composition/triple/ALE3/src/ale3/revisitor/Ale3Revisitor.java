package ale3.revisitor;

public interface Ale3Revisitor<Ale3__C1T, Ale3__C2T> {
	Ale3__C1T ale3__C1(final ale3.C1 it);
	Ale3__C2T ale3__C2(final ale3.C2 it);

	default Ale3__C1T $(final ale3.C1 it) {
		return ale3__C1(it);
	}
	default Ale3__C2T $(final ale3.C2 it) {
		return ale3__C2(it);
	}
}

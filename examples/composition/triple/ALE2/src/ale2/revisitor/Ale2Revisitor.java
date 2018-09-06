package ale2.revisitor;

public interface Ale2Revisitor<Ale2__BT, Ale2__RBT> {
	Ale2__BT ale2__B(final ale2.B it);

	default Ale2__BT $(final ale2.B it) {
		return ale2__B(it);
	}
	Ale2__RBT $(final ale2.RB it);
}

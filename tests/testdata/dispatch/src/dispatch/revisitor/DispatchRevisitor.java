package dispatch.revisitor;

public interface DispatchRevisitor<Dispatch__AT, Dispatch__BT extends Dispatch__AT, Dispatch__CT extends Dispatch__AT, Dispatch__ContainerT, Dispatch__DT extends Dispatch__BT, Dispatch__ET extends Dispatch__BT, Dispatch__FT extends Dispatch__CT, Dispatch__GT extends Dispatch__CT, Dispatch__HT, Dispatch__HT_AS_Dispatch__DT extends Dispatch__DT, Dispatch__HT_AS_Dispatch__ET extends Dispatch__ET, Dispatch__IT, Dispatch__IT_AS_Dispatch__FT extends Dispatch__FT, Dispatch__IT_AS_Dispatch__GT extends Dispatch__GT, Dispatch__JT, Dispatch__JT_AS_Dispatch__DT extends Dispatch__DT, Dispatch__JT_AS_Dispatch__ET extends Dispatch__ET, Dispatch__JT_AS_Dispatch__FT extends Dispatch__FT, Dispatch__JT_AS_Dispatch__GT extends Dispatch__GT, Dispatch__JT_AS_Dispatch__HT extends Dispatch__HT, Dispatch__JT_AS_Dispatch__IT extends Dispatch__IT> {
	Dispatch__AT dispatch__A(final dispatch.A it);
	Dispatch__BT dispatch__B(final dispatch.B it);
	Dispatch__CT dispatch__C(final dispatch.C it);
	Dispatch__ContainerT dispatch__Container(final dispatch.Container it);
	Dispatch__DT dispatch__D(final dispatch.D it);
	Dispatch__ET dispatch__E(final dispatch.E it);
	Dispatch__FT dispatch__F(final dispatch.F it);
	Dispatch__GT dispatch__G(final dispatch.G it);
	Dispatch__HT dispatch__H(final dispatch.H it);
	Dispatch__HT_AS_Dispatch__DT dispatch__H__AS__dispatch__D(final dispatch.H it);
	Dispatch__HT_AS_Dispatch__ET dispatch__H__AS__dispatch__E(final dispatch.H it);
	Dispatch__IT dispatch__I(final dispatch.I it);
	Dispatch__IT_AS_Dispatch__FT dispatch__I__AS__dispatch__F(final dispatch.I it);
	Dispatch__IT_AS_Dispatch__GT dispatch__I__AS__dispatch__G(final dispatch.I it);
	Dispatch__JT dispatch__J(final dispatch.J it);
	Dispatch__JT_AS_Dispatch__DT dispatch__J__AS__dispatch__D(final dispatch.J it);
	Dispatch__JT_AS_Dispatch__ET dispatch__J__AS__dispatch__E(final dispatch.J it);
	Dispatch__JT_AS_Dispatch__FT dispatch__J__AS__dispatch__F(final dispatch.J it);
	Dispatch__JT_AS_Dispatch__GT dispatch__J__AS__dispatch__G(final dispatch.J it);
	Dispatch__JT_AS_Dispatch__HT dispatch__J__AS__dispatch__H(final dispatch.J it);
	Dispatch__JT_AS_Dispatch__IT dispatch__J__AS__dispatch__I(final dispatch.J it);

	default Dispatch__AT $(final dispatch.A it) {
		if (it.getClass() == dispatch.impl.BImpl.class)
			return dispatch__B((dispatch.B) it);
		if (it.getClass() == dispatch.impl.CImpl.class)
			return dispatch__C((dispatch.C) it);
		if (it.getClass() == dispatch.impl.DImpl.class)
			return dispatch__D((dispatch.D) it);
		if (it.getClass() == dispatch.impl.EImpl.class)
			return dispatch__E((dispatch.E) it);
		if (it.getClass() == dispatch.impl.FImpl.class)
			return dispatch__F((dispatch.F) it);
		if (it.getClass() == dispatch.impl.GImpl.class)
			return dispatch__G((dispatch.G) it);
		if (it.getClass() == dispatch.impl.HImpl.class)
			return dispatch__H__AS__dispatch__D((dispatch.H) it);
		if (it.getClass() == dispatch.impl.IImpl.class)
			return dispatch__I__AS__dispatch__F((dispatch.I) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__D((dispatch.J) it);
		return dispatch__A(it);
	}
	default Dispatch__BT $(final dispatch.B it) {
		if (it.getClass() == dispatch.impl.DImpl.class)
			return dispatch__D((dispatch.D) it);
		if (it.getClass() == dispatch.impl.EImpl.class)
			return dispatch__E((dispatch.E) it);
		if (it.getClass() == dispatch.impl.HImpl.class)
			return dispatch__H__AS__dispatch__D((dispatch.H) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__D((dispatch.J) it);
		return dispatch__B(it);
	}
	default Dispatch__CT $(final dispatch.C it) {
		if (it.getClass() == dispatch.impl.FImpl.class)
			return dispatch__F((dispatch.F) it);
		if (it.getClass() == dispatch.impl.GImpl.class)
			return dispatch__G((dispatch.G) it);
		if (it.getClass() == dispatch.impl.IImpl.class)
			return dispatch__I__AS__dispatch__F((dispatch.I) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__F((dispatch.J) it);
		return dispatch__C(it);
	}
	default Dispatch__ContainerT $(final dispatch.Container it) {
		return dispatch__Container(it);
	}
	default Dispatch__DT $(final dispatch.D it) {
		if (it.getClass() == dispatch.impl.HImpl.class)
			return dispatch__H__AS__dispatch__D((dispatch.H) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__D((dispatch.J) it);
		return dispatch__D(it);
	}
	default Dispatch__ET $(final dispatch.E it) {
		if (it.getClass() == dispatch.impl.HImpl.class)
			return dispatch__H__AS__dispatch__E((dispatch.H) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__E((dispatch.J) it);
		return dispatch__E(it);
	}
	default Dispatch__FT $(final dispatch.F it) {
		if (it.getClass() == dispatch.impl.IImpl.class)
			return dispatch__I__AS__dispatch__F((dispatch.I) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__F((dispatch.J) it);
		return dispatch__F(it);
	}
	default Dispatch__GT $(final dispatch.G it) {
		if (it.getClass() == dispatch.impl.IImpl.class)
			return dispatch__I__AS__dispatch__G((dispatch.I) it);
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__G((dispatch.J) it);
		return dispatch__G(it);
	}
	default Dispatch__HT $(final dispatch.H it) {
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__H((dispatch.J) it);
		return dispatch__H(it);
	}
	default Dispatch__IT $(final dispatch.I it) {
		if (it.getClass() == dispatch.impl.JImpl.class)
			return dispatch__J__AS__dispatch__I((dispatch.J) it);
		return dispatch__I(it);
	}
	default Dispatch__JT $(final dispatch.J it) {
		return dispatch__J(it);
	}
}

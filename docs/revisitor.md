---
layout: default
title: Revisitor
---

# TEL0 example

```java
interface Tel0Revisitor<ExpT, IntLitT extends ExpT, SumT extends ExpT> {
	IntLitT intLit(final IntLit it);

	SumT sum(final Sum it);

	default ExpT $(final Exp it) {
		if (it.getClass() == IntLitImpl.class)
			return intLit((IntLit) it);
		if (it.getClass() == SumImpl.class)
			return sum((Sum) it);
		return null;
	}

	default IntLitT $(final IntLit it) {
		return intLit(it);
	}

	default SumT $(final Sum it) {
		return sum(it);
	}
}
```

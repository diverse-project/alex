package alex.xtext.tests

import com.google.inject.Inject
import ^dispatch.DispatchFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AlexInjectorProvider)
class DispatchTests {
	@Inject extension AlexTestHelper
	val fact = DispatchFactory::eINSTANCE

	@Before
	def void setUp() {
		EPackage.Registry.INSTANCE.put(GenModelPackage::eNS_URI, GenModelPackage::eINSTANCE)
	}

	@Test
	def void testNoOverride() {
		'''
			behavior testNoOverride
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class Container {
				def java.util.List<String> collect() {
					return obj.objs.map[alg.$(it).foo()]
				}
			}
		'''.with(fact.createContainer => [
			objs += fact.createA
			objs += fact.createB
			objs += fact.createC
			objs += fact.createD
			objs += fact.createE
			objs += fact.createF
			objs += fact.createG
			objs += fact.createH
			objs += fact.createI
			objs += fact.createJ
		]).call("collect").assertEvaluatesTo(#[
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()",
			"A::foo()"
		])
	}

	@Test
	def void testAllOverride() {
		'''
			behavior testAllOverride
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A { def String foo() { return "A::foo()" } }
			open class B { override String foo() { return "B::foo()" } }
			open class C { override String foo() { return "C::foo()" } }
			open class D { override String foo() { return "D::foo()" } }
			open class E { override String foo() { return "E::foo()" } }
			open class F { override String foo() { return "F::foo()" } }
			open class G { override String foo() { return "G::foo()" } }
			open class H { override String foo() { return "H::foo()" } }
			open class I { override String foo() { return "I::foo()" } }
			open class J { override String foo() { return "J::foo()" } }
			open class Container {
				def java.util.List<String> collect() {
					return obj.objs
						.map[alg.$(it).foo()]
				}
			}
		'''.with(fact.createContainer => [
			objs += fact.createA
			objs += fact.createB
			objs += fact.createC
			objs += fact.createD
			objs += fact.createE
			objs += fact.createF
			objs += fact.createG
			objs += fact.createH
			objs += fact.createI
			objs += fact.createJ
		]).call("collect").assertEvaluatesTo(#[
			"A::foo()",
			"B::foo()",
			"C::foo()",
			"D::foo()",
			"E::foo()",
			"F::foo()",
			"G::foo()",
			"H::foo()",
			"I::foo()",
			"J::foo()"
		])
	}

	@Test
	def void testImplicitSuperCall1() {
		'''
			behavior testImplicitSuperCall1
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class B {
				override String foo() { return "B::foo()" }
			}
			open class D {
				override String foo() {
					return super.foo();
				}
			}
		'''.with(fact.createD).call("foo").assertEvaluatesTo("B::foo()")
	}

	@Test
	def void testImplicitSuperCall2() {
		'''
			behavior testImplicitSuperCall2
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class D {
				override String foo() {
					return super.foo();
				}
			}
		'''.with(fact.createD).call("foo").assertEvaluatesTo("A::foo()")
	}

	@Test
	def void testImplicitSuperCallMulti1() {
		'''
			behavior testImplicitSuperCallMulti1
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class B {
				override String foo() { return "B::foo()" }
			}
			open class C {
				override String foo() { return "C::foo()" }
			}
			open class D {
				override String foo() { return "D::foo()" }
			}
			open class E {
				override String foo() { return "E::foo()" }
			}
			open class H {
				override String foo() {
					return super.foo()
				}
			}
			open class Container {
				def java.util.List<String> collect() {
					return obj.objs
						.map[alg.$(it).foo()]
				}
			}
		'''.with(fact.createContainer => [
			objs += fact.createH
		]).call("collect").assertEvaluatesTo(#[
			"D::foo()"
		])
		// So, super() defaults to the leftmost parent implementation
	}

	@Test
	def void testImplicitSuperCallMulti2() {
		'''
			behavior testImplicitSuperCallMulti2
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class D {
				override String foo() { return "D::foo()" }
			}
			open class E {
				override String foo() { return "E::foo()" }
			}
			open class F {
				override String foo() { return "F::foo()" }
			}
			open class G {
				override String foo() { return "G::foo()" }
			}
			open class H {
				override String foo() { return super.foo() }
			}
			open class I {
				override String foo() { return super.foo() }
			}
			open class J {
				override String foo() { return super.foo() }
			}
			open class Container {
				def java.util.List<String> collect() {
					return obj.objs
						.map[alg.$(it).foo()]
				}
			}
		'''.with(fact.createContainer => [
			objs += fact.createJ
		]).call("collect").assertEvaluatesTo(#[
			"D::foo()"
		])
		// So, super() defaults to the leftmost parent implementation
	}

	@Test
	def void testExplicitSuperCall() {
		'''
			behavior testExplicitSuperCall
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class B {
				override String foo() { return "B::foo()" }
			}
			open class D {
				override String foo() {
					return alg.dispatch__A(obj).foo() + " -- " + alg.dispatch__B(obj).foo()
				}
			}
		'''.with(fact.createD).call("foo").assertEvaluatesTo("A::foo() -- B::foo()")
	}

	@Test
	def void testExplicitSuperCallMulti() {
		'''
			behavior testExplicitSuperCallMulti
			import ecore "../testdata/dispatch/model/Dispatch.ecore"
			open class A {
				def String foo() { return "A::foo()" }
			}
			open class B {
				override String foo() { return "B::foo()" }
			}
			open class C {
				override String foo() { return "C::foo()" }
			}
			open class D {
				override String foo() { return "D::foo()" }
			}
			open class E {
				override String foo() { return "E::foo()" }
			}
			open class F {
				override String foo() { return "F::foo()" }
			}
			open class G {
				override String foo() { return "G::foo()" }
			}
			open class H {
				override String foo() { return "H::foo()" }
			}
			open class I {
				override String foo() { return "I::foo()" }
			}
			open class J {
				override String foo() {
					return
						alg.dispatch__A(obj).foo() + " - " +
						alg.dispatch__B(obj).foo() + " - " +
						alg.dispatch__C(obj).foo() + " - " +
						alg.dispatch__D(obj).foo() + " - " +
						alg.dispatch__E(obj).foo() + " - " +
						alg.dispatch__F(obj).foo() + " - " +
						alg.dispatch__G(obj).foo() + " - " +
						alg.dispatch__H(obj).foo() + " - " +
						alg.dispatch__I(obj).foo() + " - " +
						"J::foo()"
				}
			}
			open class Container {
				def java.util.List<String> collect() {
					return obj.objs
						.map[alg.$(it).foo()]
				}
			}
		'''.with(fact.createContainer => [
			objs += fact.createJ
		]).call("collect").assertEvaluatesTo(#[
			"A::foo() - " +
			"B::foo() - " +
			"C::foo() - " +
			"D::foo() - " +
			"E::foo() - " +
			"F::foo() - " +
			"G::foo() - " +
			"H::foo() - " +
			"I::foo() - " +
			"J::foo()"
		])
	}
}

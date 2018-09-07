package fr.inria.diverse.alex.xtext.tests

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexPackage
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.validation.AlexValidator
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.util.JavaVersion
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AlexInjectorProvider)
class AlexEditorTest {
	@Inject extension ParseHelper<AlexRoot>
	@Inject extension CompilationTestHelper compilationHelper
	@Inject extension ValidationTestHelper

	private static final String header =
		'''
			behavior test
			import ecore "../testdata/boolexp/model/BoolExp.genmodel"
		'''
	
	@Before
	def void setUp() {
		EPackage.Registry.INSTANCE.put(GenModelPackage.eNS_URI, GenModelPackage.eINSTANCE)
		compilationHelper.javaVersion = JavaVersion::JAVA8
	}

	@Test
	def void testInvalidEcore() {
		'''
			behavior test
			import ecore "data/metamodels/404.genmodel"
		'''.parse.ecoreImport.assertError(
			AlexPackage.Literals::ECORE_IMPORT,
			AlexValidator::SYNTAX_NOT_FOUND
		)
	}

	@Test
	def void testOpenExistingClass() {
		'''
			«header»
			open class Exp {}
			open class BinaryExp {}
			open class Lit {}
			open class And {}
			open class Or {}
			open class Tru {}
			open class Fals {}
		'''.parse.assertNoIssues
	}

	@Test
	def void testOpenUnknownClass() {
		'''
			«header»
			open class A {}
		'''.parse.assertError(
			AlexPackage.Literals::ALEX_CLASS,
			AlexValidator::UNKNOWN_OPENCLASS
		)
	}

	@Test
	def void testAbstractMethodsAreImplemented() {
		'''
			«header»
			open abstract class Exp {
				abstract def void foo()
			}
			open class Lit {
				
			}
		'''.parse.assertError(
			AlexPackage.Literals::ALEX_CLASS,
			AlexValidator::ABSTRACT_METHOD_NOT_IMPL
		)
	}

	@Test
	def void testOverrideIsHere() {
		'''
			«header»
			open class Exp {
				abstract def void foo()
			}
			open class And { def void foo() {} }
			open class Or { override void foo() {} }
			open class Tru { override void foo() {} }
			open class Fals { override void foo() {} }
		'''.parse.assertError(
			AlexPackage.Literals::ALEX_METHOD,
			AlexValidator::OVERRIDE_MISSING
		)
	}

	@Test
	def void testOverrideIsHere2() {
		'''
			«header»
			open class Exp {
				def void foo() {}
			}
			open class And { def void foo() {} }
		'''.parse.assertError(
			AlexPackage.Literals::ALEX_METHOD,
			AlexValidator::OVERRIDE_MISSING
		)
	}

	@Test
	def void testNoSuperfluousOverride() {
		'''
			«header»
			open class Exp {
				abstract def void foo()
			}
			open class And { override void foo() {} }
			open class Or { override void foo() {} }
			open class Tru { override void foo() {} }
			open class Fals {
				override void foo() {}
				override void bar() {}
			}
		'''.parse.assertError(
			AlexPackage.Literals::ALEX_METHOD,
			AlexValidator::SUPERFLUOUS_OVERRIDE
		)
	}
}

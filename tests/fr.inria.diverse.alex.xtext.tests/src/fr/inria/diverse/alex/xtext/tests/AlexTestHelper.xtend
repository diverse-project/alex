package  fr.inria.diverse.alex.xtext.tests

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexRoot
import fr.inria.diverse.alex.xtext.utils.NamingUtils
import java.lang.invoke.MethodHandles
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.util.JavaVersion
import org.eclipse.xtext.xbase.testing.CompilationTestHelper
import org.eclipse.xtext.xbase.testing.CompilationTestHelper.Result
import org.junit.Assert

class AlexTestHelper {
	@Inject extension NamingUtils
	@Inject extension ParseHelper<AlexRoot>
	@Inject extension CompilationTestHelper compilationHelper

	def Object invokeRevisitorMethod(Result res, Object obj, String rvName, String methodName, Object[] args) {
		val rvIntf = res.compiledClasses.get(rvName)
		val dollar = rvIntf.methods.findFirst[name == "$" && parameters.head.type.isAssignableFrom(obj.class)]

		val construct = typeof(MethodHandles.Lookup).getDeclaredConstructor(typeof(Class), typeof(int))
		construct.accessible = true

		val rvImpl = Proxy::newProxyInstance(
			res.classLoader,
			#[rvIntf],
			new InvocationHandler() {
				override invoke(Object proxy, Method method, Object[] args) throws Throwable {
					if (method.^default) {
						val decl = method.declaringClass
						return
							construct.newInstance(decl, MethodHandles.Lookup::PRIVATE)
							.unreflectSpecial(method, decl)
							.bindTo(proxy)
							.invokeWithArguments(args)
					}
				}
		})

		val operationObj = dollar.invoke(rvImpl, obj)
		val method = operationObj.class.methods.findFirst[name == methodName]

		return method.invoke(operationObj, args)
	}

	def Object invokeRevisitorMethod(Result res, Object obj, String rvName, String methodName) {
		return invokeRevisitorMethod(res, obj, rvName, methodName, null)
	}

	def AlexCompileResult with(CharSequence pgm, Object m) {
		val alexRes = new AlexCompileResult => [
			model = m
			alexRoot = pgm.parse
		]

		compilationHelper.javaVersion = JavaVersion::JAVA8
		pgm.compile[res |
				alexRes.compileRes = res
		]


		if (!alexRes.compileRes.errorsAndWarnings.empty)
			Assert.fail(alexRes.compileRes.errorsAndWarnings.toString)

		return alexRes
	}

	def AlexCompileResult with(CharSequence pgm, String model) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI::createURI(model), true)
		return pgm.with(res.contents.head)
	}

	def Object call(AlexCompileResult res, String methodName) {
		return res.compileRes.invokeRevisitorMethod(
			res.model,
			res.alexRoot.revisitorInterfaceFqn,
			methodName
		)
	}

	def void assertEvaluatesTo(Object actual, Object expected) {
		Assert.assertEquals(expected, actual)
	}
}

class AlexCompileResult {
	@Accessors AlexRoot alexRoot
	@Accessors Result compileRes
	@Accessors Object model
}

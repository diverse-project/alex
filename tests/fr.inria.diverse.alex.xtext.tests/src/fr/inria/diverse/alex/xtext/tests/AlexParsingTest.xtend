/*
 * generated by Xtext 2.12.0
 */
package fr.inria.diverse.alex.xtext.tests

import fr.inria.diverse.alex.xtext.alex.AlexRoot
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(AlexInjectorProvider)
class AlexParsingTest {
	@Inject
	ParseHelper<AlexRoot> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			behavior fsmprinting
			
			import ecore "platform:/resource/minifsm/model/MiniFsm.genmodel"
			
			open class Machine {
				def String print() {
					return obj.states.map[s|alg.$(s).print()].join("\n")
				}
			}
			
			open class State {
			
				def String print() {
					return "State " + obj.name + "\n" + obj.out.map[t|"\t" + alg.$(t).print()].join("\n")
				}
			}
			
			open class FinalState {
				override String print() {
					return "* " + alg.state(obj).print();
				}
			}
			
			open class Transition {
				def String print() {
					return obj.event + " => " + obj.tgt.name
				}
			}

		''')
		Assert.assertNotNull(result)
		Assert.assertTrue(result.eResource.errors.isEmpty)
	}
}
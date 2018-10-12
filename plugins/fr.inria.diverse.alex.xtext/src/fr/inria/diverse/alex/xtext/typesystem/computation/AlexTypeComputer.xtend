package fr.inria.diverse.alex.xtext.typesystem.computation

import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer
import org.eclipse.xtext.EcoreUtil2
import fr.inria.diverse.alex.xtext.alex.AlexClass
import fr.inria.diverse.alex.xtext.alex.DefMethod

class AlexTypeComputer extends XbaseTypeComputer {
	override void _computeTypes(XAbstractFeatureCall featureCall, ITypeComputationState state) {
		// println('''«featureCall» «state»''')
 		val candidates = state.getLinkingCandidates(featureCall);

		val alexClass = EcoreUtil2.getContainerOfType(featureCall, AlexClass)
		if (alexClass !== null) {
			super._computeTypes(featureCall, state)
		} else {
			super._computeTypes(featureCall, state)

		}
	}
}

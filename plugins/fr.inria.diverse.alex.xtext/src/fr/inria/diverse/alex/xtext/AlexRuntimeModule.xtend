/*
 * generated by Xtext 2.10.0
 */
package fr.inria.diverse.alex.xtext

import fr.inria.diverse.alex.xtext.compiler.AlexJvmModelGenerator
import fr.inria.diverse.alex.xtext.emf.EcoreFragmentProvider
import fr.inria.diverse.alex.xtext.typesystem.computation.AlexTypeComputer
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputer

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AlexRuntimeModule extends AbstractAlexRuntimeModule {
	def Class<? extends ITypeComputer> bindITypeComputer() {
		AlexTypeComputer
	}

	override bindIGenerator() {
		AlexJvmModelGenerator

	}

	override bindIFragmentProvider() {
		EcoreFragmentProvider
	}

}

/*
 * generated by Xtext 2.15.0
 */
package fr.mleduc.lang.boa


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BoaStandaloneSetup extends BoaStandaloneSetupGenerated {

	def static void doSetup() {
		new BoaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
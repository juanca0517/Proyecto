/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class PilaStandaloneSetup extends PilaStandaloneSetupGenerated {

	def static void doSetup() {
		new PilaStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
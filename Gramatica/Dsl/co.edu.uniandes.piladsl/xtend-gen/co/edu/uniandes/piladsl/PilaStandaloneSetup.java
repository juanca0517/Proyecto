/**
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl;

import co.edu.uniandes.piladsl.PilaStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class PilaStandaloneSetup extends PilaStandaloneSetupGenerated {
  public static void doSetup() {
    PilaStandaloneSetup _pilaStandaloneSetup = new PilaStandaloneSetup();
    _pilaStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
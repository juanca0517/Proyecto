/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.ui.tests;

import co.edu.uniandes.piladsl.ui.internal.PiladslActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class PilaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return PiladslActivator.getInstance().getInjector("co.edu.uniandes.piladsl.Pila");
	}

}

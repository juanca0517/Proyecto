/*
 * generated by Xtext 2.10.0
 */
package co.edu.uniandes.piladsl.ui;

import co.edu.uniandes.piladsl.ui.internal.PiladslActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PilaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return PiladslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return PiladslActivator.getInstance().getInjector(PiladslActivator.CO_EDU_UNIANDES_PILADSL_PILA);
	}
	
}

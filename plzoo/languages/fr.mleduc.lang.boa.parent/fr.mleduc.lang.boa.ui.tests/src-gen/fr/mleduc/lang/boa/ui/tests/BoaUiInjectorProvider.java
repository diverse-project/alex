/*
 * generated by Xtext 2.14.0
 */
package fr.mleduc.lang.boa.ui.tests;

import com.google.inject.Injector;
import fr.mleduc.lang.boa.ui.internal.BoaActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class BoaUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BoaActivator.getInstance().getInjector("fr.mleduc.lang.boa.Boa");
	}

}

/*
 * generated by Xtext 2.14.0
 */
package fr.inria.diverse.alex.xtext.ui.tests;

import com.google.inject.Injector;
import fr.inria.diverse.alex.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AlexUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("fr.inria.diverse.alex.xtext.Alex");
	}

}

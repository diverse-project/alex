/*
 * generated by Xtext 2.12.0
 */
package ale.xtext.ui.tests;

import ale.xtext.ui.internal.XtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class AleUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("ale.xtext.Ale");
	}

}
/*
 * generated by Xtext 2.14.0
 */
package calc.xtext.ui.tests;

import calc.xtext.ui.internal.XtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CalcUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("calc.xtext.Calc");
	}

}
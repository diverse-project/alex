package alex.xtext.ui.labeling

import alex.xtext.alex.AlexMethod
import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

class AlexLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def String text(AlexMethod it)
		'''«name»(«params.map[name].join(", ")»)'''

}

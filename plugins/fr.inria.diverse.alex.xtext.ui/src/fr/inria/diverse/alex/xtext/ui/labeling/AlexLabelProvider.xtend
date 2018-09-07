package fr.inria.diverse.alex.xtext.ui.labeling

import com.google.inject.Inject
import fr.inria.diverse.alex.xtext.alex.AlexMethod
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

class AlexLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def String text(AlexMethod it) '''«name»(«params.map[name].join(", ")»)'''

}

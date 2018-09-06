package alex.xtext.ui.outline

import alex.xtext.alex.AlexMethod
import org.eclipse.xtext.ui.editor.outline.IOutlineNode
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.xtype.XImportSection

class AlexOutlineTreeProvider extends DefaultOutlineTreeProvider {
	protected def void _createNode(IOutlineNode parent, XImportSection it) {
		// Nope
	}

	// Don't show method bodies
	protected def boolean _isLeaf(AlexMethod m) {
		return true
	}
}

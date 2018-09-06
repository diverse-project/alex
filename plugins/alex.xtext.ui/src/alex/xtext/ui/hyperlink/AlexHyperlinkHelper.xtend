package alex.xtext.ui.hyperlink

import org.eclipse.xtext.xbase.ui.navigation.XbaseHyperLinkHelper

class AlexHyperlinkHelper extends XbaseHyperLinkHelper {
//	override createHyperlinksByOffset(XtextResource res, int offset, IHyperlinkAcceptor acceptor) {
//		val elem = EObjectAtOffsetHelper.resolveElementAt(res, offset)
//		val nodes = NodeModelUtils::findNodesForFeature(elem, AlexPackage.Literals::ECORE_IMPORT__)
//		val region = nodes.map[textRegion].filter[contains(offset)].head
//
//		if (elem instanceof EcoreImport) {
//			val uriConverter = res.resourceSet.URIConverter
//			val uri = URI::createURI(elem.uri)
//
//			acceptor.accept(hyperlinkProvider.get() => [
//				hyperlinkRegion = new Region(region.offset, region.length)
//				URI = if (uri.isPlatformResource) uri else uriConverter.normalize(uri)
//				hyperlinkText = "Open Ecore file"
//			])
//		}
//	}
}

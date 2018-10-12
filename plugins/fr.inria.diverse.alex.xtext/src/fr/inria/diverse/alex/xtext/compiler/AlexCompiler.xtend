package fr.inria.diverse.alex.xtext.compiler

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import org.eclipse.xtext.linking.ILinkingService
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.EObjectAtOffsetHelper
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.TextRegion
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver

class AlexCompiler extends XbaseCompiler {

//	@Inject IBatchTypeResolver batchTypeResolver
//	@Inject ILinkingService linker
//	@Inject EObjectAtOffsetHelper eObjectAtOffsetHelper
//	@Inject IBatchTypeResolver typeResolver

	override doInternalToJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {

//		val resolved = batchTypeResolver.resolveTypes(obj)
//		val resolveTypes = typeResolver.resolveTypes(obj.eResource as Resource);
//
//		// val scoped = scope.getScope(obj, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE)
//		// resolved.
//		val obj2 = NodeModelUtils.getNode(obj)
//		if (obj2 !== null) {
//			val res = obj.eResource as XtextResource
//			val offset = obj2.offset
//			val region = new TextRegion(offset, 0)
////			val a = if (obj.toString.contains('callFunc'))
////					eObjectAtOffsetHelper.getCrossReferencedElement(obj2)
////				else
////					null
//			val a2 = eObjectAtOffsetHelper.getCrossReferenceNode(res, region)
//			val a3 = eObjectAtOffsetHelper.resolveContainedElementAt(res, offset)
//			val a4 = eObjectAtOffsetHelper.resolveCrossReferencedElementAt(res, offset)
//			val a5 = eObjectAtOffsetHelper.resolveElementAt(res, offset)
//			if(a4 instanceof XExpression)
//				resolveTypes.getActualType(a4 as XExpression)
//			if(a5 instanceof XExpression)
//				resolveTypes.getActualType(a5 as XExpression)
//			if(a4 instanceof JvmIdentifiableElement)
//				resolveTypes.getActualType(a4 as JvmIdentifiableElement)
//			if(a5 instanceof JvmIdentifiableElement)
//				resolveTypes.getActualType(a5 as JvmIdentifiableElement)	
//				
//			println('''yolo''')
//		}
////		val cross = if(obj3 !== null) 
////			eObjectAtOffsetHelper.getCrossReferencedElement(obj3) 
////			else null
////		if(obj3 !== null && obj3 instanceof XAbstractFeatureCall) {
////			//val act = resolveTypes.getActualType(obj3 as XAbstractFeatureCall)
////			println('''«obj» ==== «obj3»''')
////			
////			} 
//		// val res = linker.getLinkedObjects(obj, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE, null)
		super.doInternalToJavaStatement(obj, appendable, isReferenced)
	}
}

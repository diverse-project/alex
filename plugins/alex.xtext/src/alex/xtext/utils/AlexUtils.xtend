package alex.xtext.utils

import alex.xtext.alex.AbstractMethod
import alex.xtext.alex.AlexClass
import alex.xtext.alex.AlexMethod
import alex.xtext.alex.AlexRoot
import alex.xtext.alex.ConcreteMethod
import com.google.inject.Inject
import java.util.List
import java.util.Set
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference
import org.eclipse.xtext.xbase.typesystem.references.StandardTypeReferenceOwner
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices

class AlexUtils {
	@Inject extension EcoreUtils
	@Inject NamingUtils namingUtils
	@Inject CommonTypeComputationServices services

	def AlexClass findNearestGeneratedParent(AlexClass cls) {
		return cls.matchingEClass.getAllAlexClasses(cls.root).filter[it != cls].findFirst[generated]
	}

	def List<AlexRoot> getAllParents(AlexRoot root, boolean includeSelf) {
		val ret = newHashSet
		if (includeSelf)
			ret += root
		if(root?.alexImports !== null) root?.alexImports.filter[it !== null].forEach[getAllParentsRec(ref, ret)]
		return ret.filter[it !== null].toList
	}

	def List<AlexClass> getAllAlexClasses(AlexRoot root) {
		return root.getAllParents(true).map[classes].flatten.toList
	}

	def AlexRoot getRoot(AlexClass cls) {
		return cls.eContainer as AlexRoot
	}

	def dispatch EClass getMatchingEClass(AlexClass cls) {
		return cls.root.allEClasses.findFirst[name == cls.name]
	}

	def boolean isAbstract(AlexClass cls) {
		return !cls.getAllMethods(false).filter(AbstractMethod).empty
	}

	def List<EPackage> getAllEPackages(AlexRoot root) {
		val roots = root.getAllParents(true)
		return roots.filterNull.map[ecoreImport?.uri].filterNull.map[loadGenmodel.getEPackage].toList
	}

	def List<EClass> getAllEClasses(AlexRoot root) {
		return root.getAllEPackages.allClasses
	}

	def List<AlexClass> getAlexClasses(EClass eCls, AlexRoot root) {
		return root.allAlexClasses.filter[name == eCls.name].toList
	}

	def List<AlexClass> getAllAlexClasses(EClass eCls, AlexRoot root) {
		val ret = newArrayList

		ret += eCls.getAlexClasses(root)
		if (eCls?.EAllSuperTypes !== null) {
			ret += eCls.EAllSuperTypes.sortWith [ a, b |
				if (a.EAllSuperTypes.contains(b))
					-1
				else if(b.EAllSuperTypes.contains(a)) 1 else 0
			].map[getAlexClasses(root)].flatten
		}

		return ret
	}

	def List<AlexMethod> getAllMethods(AlexClass alexCls, boolean withOverride) {
		val ret = newArrayList
		val correspondingEClass = alexCls.matchingEClass

		correspondingEClass.getAllAlexClasses(alexCls.root).map[methods].flatten.sortWith [ a, b |
			if (a instanceof ConcreteMethod)
				-1
			else if(b instanceof ConcreteMethod) 1 else 0
		].sortWith [ a, b |
			if (a.overrides(b))
				-1
			else if(b.overrides(a)) 1 else 0
		].sortWith [ a, b |
			if ((a.eContainer as AlexClass).matchingEClass.EAllSuperTypes.contains(
				(b.eContainer as AlexClass).matchingEClass))
				-1
			else if((b.eContainer as AlexClass).matchingEClass.EAllSuperTypes.contains(
				(a.eContainer as AlexClass).matchingEClass)) 1 else 0
		].forEach [ m1 |
			if (withOverride || !ret.exists[m2|m2.overrides(m1)])
				ret += m1
		]

		return ret
	}

	def getContainingAlexClass(AlexMethod m) {
		return m.eContainer as AlexClass
	}

	def List<AlexMethod> getOverridenMethods(AlexMethod m) {
		return m.containingAlexClass.getAllMethods(true).filter[mp|m != mp && m.overrides(mp)].toList
	}

	def boolean isGenerated(AlexClass alexCls) {
		return true
	}

	def boolean overrides(AlexMethod m1, AlexMethod m2) {
		return m1.name == m2.name && ((m1.type === null && m2.type === null) || m1.type.isSubtypeOf(m2.type)) &&
			parametersEqual(m1.params, m2.params)
	}

	private def boolean parametersEqual(List<JvmFormalParameter> p1, List<JvmFormalParameter> p2) {
		if (p1.size != p2.size)
			return false

		for (i : 0 ..< p1.size)
			if (p1.get(i).parameterType.qualifiedName != p2.get(i).parameterType.qualifiedName)
				return false

		return true
	}

	def boolean isSubtypeOf(JvmTypeReference r1, JvmTypeReference r2) {
		return if (r1 !== null && r2 !== null)
			r1.toLightweightTypeReference(r1.eResource).isSubtypeOf(r2.type)
		else
			false
	}

	def LightweightTypeReference toLightweightTypeReference(JvmTypeReference typeRef, Resource context) {
		return if (typeRef !== null && context !== null)
			new StandardTypeReferenceOwner(services, context).toLightweightTypeReference(typeRef)
		else
			null
	}

	private def void getAllParentsRec(AlexRoot root, Set<AlexRoot> ret) {
		ret += root
		root.alexImports.forEach[getAllParentsRec(ref, ret)]
	}
}

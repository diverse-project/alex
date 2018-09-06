package alex.xtext.validation

import alex.xtext.alex.AbstractMethod
import alex.xtext.alex.AlexClass
import alex.xtext.alex.AlexPackage
import alex.xtext.alex.AlexRoot
import alex.xtext.alex.ConcreteMethod
import alex.xtext.alex.DefMethod
import alex.xtext.alex.EcoreImport
import alex.xtext.alex.OverrideMethod
import alex.xtext.utils.AlexUtils
import alex.xtext.utils.EcoreUtils
import com.google.inject.Inject
import java.util.List
import org.eclipse.xtext.validation.Check

class AlexValidator extends AbstractAlexValidator {
	@Inject extension EcoreUtils
	@Inject extension AlexUtils

	public static final String SYNTAX_NOT_FOUND = "SYNTAX_NOT_FOUND"
	public static final String SEMANTICS_IMPORT_LOOP = "SEMANTICS_IMPORT_LOOP"
	public static final String UNKNOWN_OPENCLASS = "UNKNOWN_OPENCLASS"
	public static final String ABSTRACT_METHOD_NOT_IMPL = "ABSTRACT_METHOD_NOT_IMPL"
	public static final String NO_ABSTRACT_METHOD_IF_NO_SUBCLASS = "NO_ABSTRACT_METHOD_IF_NO_SUBCLASS"
	public static final String ALEXCLASS_NAME_UNIQUENESS = "ALEXCLASS_NAME_UNIQUENESS"
	public static final String OVERRIDE_MISSING = "OVERRIDE_MISSING"
	public static final String SUPERFLUOUS_OVERRIDE = "SUPERFLUOUS_OVERRIDE"
	public static final String NO_CONCRETE_IN_REQUIRED = "NO_CONCRETE_IN_REQUIRED"
	public val CONCRETE_CLASS_WITH_ABSTRACT_METHODS = "CONCRETE_CLASS_WITH_ABSTRACT_METHODS"

	@Check
	def void checkValidSyntax(EcoreImport syntax) {
		if (syntax.uri.loadEPackage === null) {
			error(
				"Couldn't not find an EPackage at the URI " + syntax.uri,
				syntax,
				AlexPackage.Literals.ECORE_IMPORT__URI,
				SYNTAX_NOT_FOUND
			)
		}
	}

	private def void loadAllSemantics(AlexRoot root, List<AlexRoot> sems) {
		val List<AlexRoot> alexs = root.alexImports.map[ref]
		for (alex : alexs) {
			if (!sems.contains(alex)) {
				sems.add(alex)
				alex.loadAllSemantics(sems)
			}
		}
	}

	@Check
	def void checkImportSemanticNonCyclic(AlexRoot root) {
		val recDeps = newArrayList()
		root.loadAllSemantics(recDeps)
		if (recDeps.contains(root)) {
			error("Alex dependencies loop", root, AlexPackage.Literals.ALEX_ROOT__NAME, SEMANTICS_IMPORT_LOOP)
		}
	}

	@Check
	def void checkIsOpenClassImported(AlexClass alexClass) {
		if (!alexClass.root.allEClasses.exists[name == alexClass.name])
			error(
				"Cannot find corresponding concept " + alexClass.name,
				alexClass,
				AlexPackage.Literals.ALEX_CLASS__NAME, 
				UNKNOWN_OPENCLASS
			)
	}

	@Check
	def void checkNoAbstractMethodsIfNoSubclasses(AlexClass alexCls) {
		val root = alexCls.root
		val eCls = alexCls.getMatchingEClass

		if (!alexCls.abstract && !eCls.hasRequiredAnnotation && !root.allEClasses.exists[ESuperTypes.contains(eCls)]) {
			alexCls.methods.filter(AbstractMethod).forEach[m |
				error('''The method «m.name» cannot be abstract as there are no subclasses to implement it.''',
					m,
					AlexPackage.Literals.ALEX_METHOD__NAME,
					NO_ABSTRACT_METHOD_IF_NO_SUBCLASS
				)
			]
		}
	}

	@Check
	def void checkAlexClassUniqueness(AlexClass alexCls) {
		if (alexCls.root.classes.exists[alexCls != it && name == alexCls.name])
			error("Duplicate open-class " + alexCls.name + " in " + alexCls.root.name,
				alexCls,
				AlexPackage.Literals.ALEX_CLASS__NAME,
				alex.xtext.validation.AlexValidator.ALEXCLASS_NAME_UNIQUENESS
			)
	}

	@Check
	def void checkAbstractMethodsAreImplemented(AlexClass alexCls) {
		val root = alexCls.root
		val eCls = alexCls.getMatchingEClass

		if (!alexCls.abstract && !eCls.hasRequiredAnnotation && !root.allEClasses.exists[ESuperTypes.contains(eCls)]) {
			val abst = alexCls.getAllMethods(true).filter(AbstractMethod)

			val notImpl =
				abst.filter[am |
					!alexCls.getAllMethods(true)
					.filter(ConcreteMethod)
					.exists[cm | cm != am && cm.overrides(am)]
				]

			if (!notImpl.empty)
				error('''«alexCls.name» must implement the following inherited abstract methods: «notImpl.map[name].join(", ")»''',
					alexCls,
					AlexPackage.Literals.ALEX_CLASS__NAME,
					ABSTRACT_METHOD_NOT_IMPL
				)
		}
	}

	@Check
	def void checkNoMissingOverride(DefMethod m) {
		if (!m.overridenMethods.empty)
			error(
				"Method " + m.name + " must use the 'override' keyword as it overrides a supertype method.",
				m,
				AlexPackage.Literals::ALEX_METHOD__NAME,
				OVERRIDE_MISSING
			)
	}

	@Check
	def void checkSuperfluousOverride(OverrideMethod m) {
		if (m.overridenMethods.empty)
			error(
				"Method " + m.name + " does not override a supertype method.",
				m,
				AlexPackage.Literals::ALEX_METHOD__NAME,
				SUPERFLUOUS_OVERRIDE
			)
	}

	@Check
	def void checkNoConcreteMethodsForRequired(AlexClass cls) {
		val eCls = cls.matchingEClass
		val cMethods = cls.methods.filter(ConcreteMethod)

		if (eCls !== null && eCls.hasRequiredAnnotation && !cMethods.empty)
			error(
				"Cannot insert concrete methods in @Required concepts.",
				cls,
				AlexPackage.Literals::ALEX_CLASS__NAME,
				NO_CONCRETE_IN_REQUIRED
			)
	}
	
	@Check
	def void concreteClassWithAbstractMethods(AlexClass alexClass) {
		if(!alexClass.abstract && !alexClass.methods.filter(AbstractMethod).empty) {
			error('''A class with abstract methods must be declared abstract''', alexClass, AlexPackage.Literals::ALEX_CLASS__NAME, CONCRETE_CLASS_WITH_ABSTRACT_METHODS)
		}		
	}
}

package boolexp.main

import boolexp.BoolexpFactory
import boolexp.Exp
import evalexp.revisitor.impl.EvalexpRevisitor
import printexp.revisitor.impl.PrintexpRevisitor

class DemoMain {
	BoolexpFactory f = BoolexpFactory.eINSTANCE
	
	def void run() {
		// Revisitors
		val printRv = new PrintexpRevisitor() {};
		val evalRv  = new EvalexpRevisitor() {};
		
		// Models
		val exp1 = makeSimpleTrueExp()
		val exp2 = makeSimpleFalseExp()

		// Run
		println(printRv.$(exp1).print() + " == " + evalRv.$(exp1).eval())
		println(printRv.$(exp2).print() + " == " + evalRv.$(exp2).eval())
	}

	// (F ∨ T) ∧ T
	def Exp makeSimpleTrueExp() {
		return f.createAnd => [
			lhs = f.createOr => [
				lhs = f.createFals
				rhs = f.createTru
			]
			rhs = f.createTru
		]
	}
	
	// F ∧ (T ∨ F)
	def Exp makeSimpleFalseExp() {
		return f.createAnd => [
			lhs = f.createFals
			rhs = f.createOr => [
				lhs = f.createTru
				rhs = f.createFals
			]
		]
	}

	def static void main(String[] args) {
		new DemoMain().run()
	}
}

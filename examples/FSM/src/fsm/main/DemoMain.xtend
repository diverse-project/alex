package fsm.main

import evalfsm.revisitor.impl.EvalfsmRevisitor
import fsm.FsmFactory
import fsm.Machine
import fsm.dyn.Context
import printfsm.revisitor.impl.PrintfsmRevisitor

class DemoMain {
	FsmFactory f = FsmFactory.eINSTANCE
	
	def void run() {
		// Revisitors
		val printRv = new PrintfsmRevisitor() {};
		val evalRv  = new EvalfsmRevisitor() {};
		
		// Model
		val machine = makeTurnstileMachine()
		
		// Print machine
		println(printRv.$(machine).print())
		
		// Execute machine
		val ctx = new Context()
		evalRv.$(machine).execute(
			#["push", "coin", "coin", "push", "push", "coin", "push"],
			ctx
		)
		
		// Execution trace
		println(ctx.trace.map[name].join(" -> "))
	}

	def Machine makeTurnstileMachine() {
		return f.createMachine => [
			name = "Turnstile"
			
			val locked = f.createInitialState => [
				name = "Locked"
			]
			val unlocked = f.createState => [
				name = "Unlocked"
			]
			
			transitions += f.createTransition => [
				event = "push"
				source = locked
				target = locked
			]
			
			transitions += f.createTransition => [
				event = "coin"
				source = locked
				target = unlocked
			]
			
			transitions += f.createTransition => [
				event = "coin"
				source = unlocked
				target = unlocked
			]
			
			transitions += f.createTransition => [
				event = "push"
				source = unlocked
				target = locked
			]
			
			states += locked
			states += unlocked
		]
	}

	def static void main(String[] args) {
		new DemoMain().run()
	}
}

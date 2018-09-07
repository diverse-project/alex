package fr.inria.diverse.alex.xtext.utils

import java.lang.Exception

class AlexException extends Exception {
	new() {
		super()
	}
	
	new(String s) {
		super(s)
	}
	
	new(Throwable t) {
		super(t)
	}
	
	new (String s, Throwable t) {
		super(s, t)
	}
}

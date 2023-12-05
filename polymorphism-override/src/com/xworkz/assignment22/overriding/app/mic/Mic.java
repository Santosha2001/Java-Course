package com.xworkz.assignment22.overriding.app.mic;

public class Mic {
	
	public void micSound() {
		System.out.println("mic sound in super class");
	}
	
	public char micSize(char size) {
		System.out.println("mic size in super class is: " + size);
		return 'M';
	}
}

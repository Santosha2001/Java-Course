package com.xworkz.assignment22.overriding.app.drum;

public class Drum {
	public void drum() {
		System.out.println("Drum in super class");
	}
	
	public double drum(double weight) {
		System.out.println("Drum weoght in super class: " + weight);
		return 20;
	}
}

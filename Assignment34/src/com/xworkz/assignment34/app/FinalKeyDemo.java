package com.xworkz.assignment34.app;

public class FinalKeyDemo {

	// Kite final variables
	final String color = "Red"; // by literal
	final String shape;

	// kite final methods
	public final void kiteFly() {
		System.out.println("Kite is flying");
	}

	// initializing shape using constructor
	public FinalKeyDemo(String shape) {
		super();
		this.shape = shape;
		System.out.println("Kite color: " + shape);
	}

	public String getColor() {
		return color;
	}

}

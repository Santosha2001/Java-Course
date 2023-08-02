package com.xworkz.assignment18.inheritance.app;

public class Tiger extends Animal {
	public String color = "Brown";

	public Tiger() {
		System.out.println("Calling default Constructor of Tiger Class");
	}

	public void tigerMethod() {
		System.out.println("Running Tiger Method");
		System.out.println("Color of Tiger : " + color);
	}
}

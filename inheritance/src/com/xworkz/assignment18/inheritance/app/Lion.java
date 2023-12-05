package com.xworkz.assignment18.inheritance.app;

public class Lion extends Animal {
	public double weight = 2;

	public Lion() {
		System.out.println("Calling default Constructor of Lion Class");
	}

	public void lionMethod() {
		System.out.println("Running Lion Method");
		System.out.println("Weight of Lion : " + weight);
	}
}

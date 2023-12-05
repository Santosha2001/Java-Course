package com.xworkz.assignment18.inheritance.app;

public class Cow extends Animal {
	public double milkInLiter = 2;

	public Cow() {
		System.out.println("Calling default Constructor of Cow Class");
	}

	public void cowMethod() {
		System.out.println("Running Cow Method");
		System.out.println("Milk in liters : " + milkInLiter);
	}
}

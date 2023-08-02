package com.xworkz.assignment18.inheritance.app;

public class Dog extends Animal {
	public int noOfLegs = 2;

	public Dog() {
		System.out.println("Calling default Constructor of Dog Class");
	}

	public void dogMethod() {
		System.out.println("Running Dog Method");
		System.out.println("NO of Legs Dog have : " + noOfLegs);
	}
}

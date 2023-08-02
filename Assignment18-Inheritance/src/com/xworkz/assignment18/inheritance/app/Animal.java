package com.xworkz.assignment18.inheritance.app;

public class Animal {
	int noOfEyes = 2;

	public Animal() {
		System.out.println("Calling default Constructor of Animal Class");
	}

	public void animalMethod() {
		System.out.println("Running Parent Class");
		System.out.println("No of Eyes Animal have : " + noOfEyes);
	}
}

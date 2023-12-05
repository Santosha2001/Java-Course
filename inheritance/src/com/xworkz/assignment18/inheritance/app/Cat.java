package com.xworkz.assignment18.inheritance.app;

public class Cat extends Animal {
	public int noOffingers = 4;

	public Cat() {
		System.out.println("Calling default Constructor of Cat Class");
	}

	public void catMethod() {

		System.out.println("Runnig Cat Mehtod");
		System.out.println("No of Fingers Cat have : " + noOffingers);
	}
}

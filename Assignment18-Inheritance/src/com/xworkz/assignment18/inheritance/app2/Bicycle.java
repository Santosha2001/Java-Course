package com.xworkz.assignment18.inheritance.app2;

public class Bicycle extends Vehicle {
	public int noOfWheels = 4;

	public Bicycle() {
		System.out.println("Invoking Default Contructer of Vehicle Class");
	}

	public void bicycleMethod() {
		System.out.println("Calling Bicycle method");
		System.out.println("Number of Wheels : " + noOfWheels);
	}

}

package com.xworkz.assignment18.inheritance.app2;

public class Bike extends Vehicle{
	public String name = "Royal Enfeild";

	public Bike() {
		System.out.println("Invoking Default Contructer of Bike Class");
	}

	public void bikeMethod() {
		System.out.println("Calling Bike method");
		System.out.println("Name : " + name);
	}
}

package com.xworkz.assignment18.inheritance.app2;

public class Scooty extends Vehicle {
	public String name = "Duet";

	public Scooty() {
		System.out.println("Invoking Default Contructer of Scooty Class");
	}

	public void scootyMethod() {
		System.out.println("Calling Scoty method");
		System.out.println("Name : " + name);
	}
}

package com.xworkz.assignment18.inheritance.app;

public class Bear extends Animal {
	public String type = "Polar Bear";

	public Bear() {
		System.out.println("Calling default Constructor of Bear Class");
	}

	public void bearMethod() {
		System.out.println("Running Bear Method");
		System.out.println("Type of Bear : " + type);
	}
}

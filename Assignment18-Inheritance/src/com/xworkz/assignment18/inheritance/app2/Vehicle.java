package com.xworkz.assignment18.inheritance.app2;

public class Vehicle {
	public String modeOfTransport = "Road";

	public Vehicle() {
		System.out.println("Invoking Default Contructer of Vehicle Class");
	}

	public void vehicleMethod() {
		System.out.println("Calling Vehicle method");
		System.out.println("Mode of Transport : " + modeOfTransport);
	}
}

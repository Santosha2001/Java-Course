package com.xworkz.assignment18.inheritance.app2;

public class Airplane extends Vehicle {
	public String brand = "Quatar Airways";

	public Airplane() {
		System.out.println("Invoking Default Contructer of Airplane Class");
	}

	public void airplaneMethod() {
		System.out.println("Calling AirPlane method");
		System.out.println("Brandt : " + brand);
	}
}

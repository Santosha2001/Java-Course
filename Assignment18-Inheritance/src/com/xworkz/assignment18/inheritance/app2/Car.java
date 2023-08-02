package com.xworkz.assignment18.inheritance.app2;

public class Car extends Vehicle {
	public String brand = "Ferrari";

	public Car() {
		System.out.println("Invoking Default Contructer of Car Class");
	}

	public void carMethod() {
		System.out.println("Calling Car method");
		System.out.println("Brand Name : " + brand);
	}
}

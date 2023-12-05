package com.xworkz.assignment25.abstrct.app.car;

public abstract class Car {
	public abstract void start();

	public abstract void accelerate();

	public abstract void brake();

	public abstract void stop();

	public abstract void displayInfo();

	public void honk() {
		System.out.println("car is honking.");
	}

	public void turnLightsOn() {
		System.out.println(" car's lights are turned on.");
	}

	public void turnLightsOff() {
		System.out.println("car's lights are turned off.");
	}

	public void refuel() {
		System.out.println("car is being refueled.");
	}
}

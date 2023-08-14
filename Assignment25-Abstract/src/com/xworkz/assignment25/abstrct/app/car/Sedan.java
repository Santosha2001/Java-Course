package com.xworkz.assignment25.abstrct.app.car;

public class Sedan extends Car {

	@Override
	public void start() {
		System.out.println("sedan is starting.");
	}

	@Override
	public void accelerate() {
		System.out.println("sedan is accelerating.");
	}

	@Override
	public void brake() {
		System.out.println("sedan is braking.");
	}

	@Override
	public void stop() {
		System.out.println("sedan is stopping.");
	}

	@Override
	public void displayInfo() {
		System.out.println("Sedan: Brand");
	}
}

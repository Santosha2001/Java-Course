package com.xworkz.assignment18.inheritance.app;

public class Cheeta extends Animal {
	public double speed = 180;

	public Cheeta()
		{
			System.out.println("Calling default Constructor of Cheetha Class");
		}

	public void cheethaMethod() {
		System.out.println("Running Cheetha Method");
		System.out.println("Speed per hour : " + speed);
	}
}

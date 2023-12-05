package com.xworkz.assignment25.abstrct.app.employee;

public abstract class Employee {
	abstract void calculateSalary();

	public abstract void displaySalary();

	public abstract void calculateBonus();

	public abstract void displayDetails();

	public abstract void promote();

	public void attendMeeting() {
		System.out.println("attending a meeting.");
	}

	public void takeBreak() {
		System.out.println("taking a break.");
	}

	public void submitReport() {
		System.out.println("submitting a report.");
	}

	public void work() {
		System.out.println("working.");
	}
}

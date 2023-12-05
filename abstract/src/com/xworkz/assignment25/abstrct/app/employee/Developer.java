package com.xworkz.assignment25.abstrct.app.employee;

public class Developer extends Employee {
	@Override
	public void calculateSalary() {
		System.out.println("Salary in subclass of calculate");
	}

	@Override
	public void displaySalary() {
		System.out.println("Salary of Developer");
	}

	@Override
	public void calculateBonus() {
		System.out.println("Bonus calculated for Developer");
	}

	@Override
	public void displayDetails() {
		System.out.println("Developer Details:");

	}

	@Override
	public void promote() {
		System.out.println("Developer  promoted to Senior Developer.");
	}
}

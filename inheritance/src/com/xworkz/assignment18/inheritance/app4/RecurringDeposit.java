package com.xworkz.assignment18.inheritance.app4;

public class RecurringDeposit extends Bank {
	public double amount = 9876587;

	public RecurringDeposit() {
		System.out.println("Calling Constructor of RecurringDeposit Account Class");
	}
	
	public void recurAccMethod() {
		System.out.println("Amount : "+amount);
	}
}

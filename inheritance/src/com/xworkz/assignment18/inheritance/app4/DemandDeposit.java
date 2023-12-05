package com.xworkz.assignment18.inheritance.app4;

public class DemandDeposit extends Bank {
	public double amount = 9997656;

	public DemandDeposit() {
		System.out.println("Calling Constructor of Demand Account Class");
	}
	
	public void demandAccMethod() {
		System.out.println("Amount : "+amount);
	}
}

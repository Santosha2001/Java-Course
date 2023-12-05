package com.xworkz.assignment18.inheritance.app4;

public class FixedDeposit extends Bank {
	public double amount = 5000000;

	public FixedDeposit() {
		System.out.println("Calling Constructor of Fixed Account Class");
	}
	
	public void fixedAccMethod() {
		System.out.println("Amount : "+amount);
	}
}

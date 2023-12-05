package com.xworkz.assignment18.inheritance.app4;

public class SavingAccount extends Bank{
	public double amount = 4567456;

	public SavingAccount() {
		System.out.println("Calling Constructor of Saving Account Class");
	}
	
	public void savingAccMethod() {
		System.out.println("Amount : "+amount);
	}
}

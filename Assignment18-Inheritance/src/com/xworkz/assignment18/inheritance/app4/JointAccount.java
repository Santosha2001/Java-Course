package com.xworkz.assignment18.inheritance.app4;

public class JointAccount extends Bank {
	public double amount = 34567;

	public JointAccount() {
		System.out.println("Calling Constructor of Joint Account Class");
	}
	
	public void jointAccMethod() {
		System.out.println("Amount : "+amount);
	}
}

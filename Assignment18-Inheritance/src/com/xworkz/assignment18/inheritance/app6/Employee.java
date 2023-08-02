package com.xworkz.assignment18.inheritance.app6;

public class Employee extends Person{
public double salary=300000;
	
	public Employee() {
		System.out.println("Calling Default Constructor");
	}
	
	public void empMethod()
	{
		System.out.println("Salary : "+salary);
	}
}

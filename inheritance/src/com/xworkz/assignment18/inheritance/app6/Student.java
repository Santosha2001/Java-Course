package com.xworkz.assignment18.inheritance.app6;

public class Student extends Person {
public boolean isStudying=true;
	
	public Student() {
		System.out.println("Calling Default Constructor");
	}
	
	public void studentMethod()
	{
		System.out.println("IS Studying : "+isStudying);
	}
}

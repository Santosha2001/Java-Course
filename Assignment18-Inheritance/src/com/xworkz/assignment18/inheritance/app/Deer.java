package com.xworkz.assignment18.inheritance.app;

public class Deer extends Animal {
	public int noOfHorns = 6;

	public Deer() {
		System.out.println("Calling default Constructor of DeerClass");
	}

	public void deerMethod() {
		System.out.println("Running deer Method");
		System.out.println("NO of Legs Dog have : " + noOfHorns);
	}
}

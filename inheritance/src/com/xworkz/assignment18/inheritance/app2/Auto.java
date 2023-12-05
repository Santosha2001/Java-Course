package com.xworkz.assignment18.inheritance.app2;

public class Auto extends Vehicle {
	public boolean hasMeterReader = true;

	public Auto() {
		System.out.println("Invoking Default Contructer of Auto Class");
	}

	public void autoMethod() {
		System.out.println("Calling Auto method");
		System.out.println("Has meter reader in auto : " + hasMeterReader);
	}
}

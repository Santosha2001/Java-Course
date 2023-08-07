package com.xworkz.assignment21.app.spects;

public class Spects {
	public void spects() {
		System.out.println("no parameter");
	}
	
	public void spects(double power) {
		System.out.println("power: " + power);
		this.spects(power,"cancave");
	}
	
	public void spects(String lens) {
		System.out.println("lens: " + lens);
	}
	
	public void spects(double power, String lens) {
		System.out.println("power: " + power);
		System.out.println("lens: " + lens);
		this.spects();
	}
}

package com.xworkz.assignment16.app;

public class Hotel {
Cook cook = new Cook();
	
	public void hotel() {
		System.out.println("hotel info");
		
		this.cook.chef();
		this.cook.chefSalary();
		
		if(cook != null) {
			System.out.println("cook points to memory");
		}
		else {
			System.out.println("NullPointerEception");
		}
	}
}

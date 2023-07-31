package com.xworkz.assignment16.app;

public class Garage {
Mechanic mechanic = new Mechanic();
	
	public void garage() {
		System.out.println("Garage method");
		
		this.mechanic.experience();
		this.mechanic.repair();
		
		if(mechanic != null) {
			System.out.println("mechanic points to memory");
		}else {
			System.out.println("NullPointerException");
		}
	}
}

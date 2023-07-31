package com.xworkz.assignment16.app;

public class Browser {
Internet internet = new Internet();
	
	public void browser() {
		System.out.println("Browser is chrome");
		
		this.internet.internetSpeed();
		this.internet.internetConnectionType();
		
		if(internet != null) {
			System.out.println("Internet is pointing to memory");
		}
		else {
			System.out.println("NullPointerEception");
		}
	}
}

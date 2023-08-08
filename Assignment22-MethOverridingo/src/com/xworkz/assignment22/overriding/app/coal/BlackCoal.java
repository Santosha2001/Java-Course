package com.xworkz.assignment22.overriding.app.coal;

public class BlackCoal extends Coal {
	
	public boolean burn() {
		System.out.println("coal in derived class");
		return false;
	}
}

package com.xworkz.assignment22.overriding.app.bangle;

public class GoldBangle extends Bangle {
	
	@Override
	public String color(String color) {
		System.out.println("bangle color in derived class: " + color);
		return "Green";
	}
}

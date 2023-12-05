package com.xworkz.assignment22.overriding.app.bangle;

public class Bangle {
	public void sound() {
		System.out.println("bangle in super class");
	}
	
	public String color(String color) {
		System.out.println("bangle color in super class: " + color);
		return "Green";
	}
}

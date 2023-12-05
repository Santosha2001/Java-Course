package com.xworkz.assignment23.app.bakery;

public class Bakery {
	public void barkey() {
		System.out.println("bakey method super class");
	}

	public void bakery(String name) {
		System.out.println("name of the bakey in super class: " + name);
	}

	public void bakery(String name, String location) {
		System.out.println("name of the bakey in super class: " + name);
		System.out.println("bakery location in super class: " + location);
	}

	public void bakery(int time) {
		System.out.println("bakery time in super class: " + time);
	}

	public void bakery(int time, int closingTime) {
		System.out.println("bakery time in super class: " + time);
		System.out.println("bakery closing time in super class: " + closingTime);
	}

	public void bakery(double price) {
		System.out.println("bakery items price in super class: " + price);
	}
}

package com.xworkz.assignment21.app.hotel;

public class Hotel {
	public void hotel() {
		System.out.println("no parameter method");
		this.hotel("Kottureswara");
		this.hotel("Davanagere", 22342);
	}
	
	public void hotel(String name) {
		System.out.println("Name: " + name);
		this.hotel(60);
	}
	
	public void hotel(double pricePerMeals) {
		System.out.println("Price per meals: " + pricePerMeals);
	}
	
	public void hotel(String location, int gstNumber) {
		System.out.println("Loaction: " + location);
		System.out.println("gat Number: " + gstNumber);
	}
}

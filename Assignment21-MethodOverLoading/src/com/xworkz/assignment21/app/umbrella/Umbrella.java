package com.xworkz.assignment21.app.umbrella;

public class Umbrella {
	public void umbrella() {
		System.out.println("no parameter");
		this.umbrella('M');
	}
	
	public void umbrella(char size) {
		System.out.println("size: " + size);
	}
	
	public void umbrella(double price) {
		System.out.println("price: " + price);
	}
	
	public void umbrella(char size,double price) {
		System.out.println("size: " + size);
		System.out.println("price: " + price);
		this.umbrella(size);
		this.umbrella(price);
	}
}

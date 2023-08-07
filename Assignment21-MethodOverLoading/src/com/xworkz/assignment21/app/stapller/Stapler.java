package com.xworkz.assignment21.app.stapller;

public class Stapler {
	public void stapler() {
		System.out.println("no parameter");
	}
	
	public void stapler(char size) {
		System.out.println("size: " + size);
		this.stapler(200);
	}
	
	public void stapler(int price) {
		System.out.println("price: " + price);
	}
	
	public void stapler(char size, int price) {
		System.out.println("size: " + size);
		System.out.println("price: " + price);
		this.stapler(size);
	}
}

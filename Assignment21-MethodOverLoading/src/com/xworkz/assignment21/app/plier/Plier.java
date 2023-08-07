package com.xworkz.assignment21.app.plier;

public class Plier {
	public void plier() {
		System.out.println("no parameter");
		this.plier(null, 0);
		this.plier(200);
	}
	
	public void plier(String brand) {
		System.out.println("brand: " + brand);
		this.plier(100);
	}
	
	public void plier(int cost) {
		System.out.println("cost: " + cost);
	}
	
	public void plier(String brand,int cost) {
		System.out.println("brand: " + brand);
		System.out.println("cost: " + cost);
	}
}

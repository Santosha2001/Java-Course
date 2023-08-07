package com.xworkz.assignment21.app.ironbox;

public class IronBox {
	public void ironBox() {
		System.out.println("no parameter");
	}
	
	public void ironBox(double price) {
		System.out.println("price: " + price);
		this.ironBox(true);
//		this.ironBox(price);
	}
	
	public void ironBox(boolean electric) {
		System.out.println("electric: " + electric);
	}
	
	public void ironBox(boolean electric, String brands) {
		System.out.println("electric: " + electric);
		System.out.println("brands: " + brands);
		this.ironBox();
	}
}

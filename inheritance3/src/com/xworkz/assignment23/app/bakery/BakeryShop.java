package com.xworkz.assignment23.app.bakery;

public class BakeryShop extends Bakery {
	@Override
	public void barkey() {
		System.out.println("bakey method derived class");
	}

	@Override
	public void bakery(String name) {
		System.out.println("name of the bakey in derived class: " + name);
	}

	@Override
	public void bakery(String name, String location) {
		System.out.println("name of the bakey in derived class: " + name);
		System.out.println("bakery location in derived class: " + location);
	}

	@Override
	public void bakery(int time) {
		System.out.println("bakery time in derived class: " + time);
	}

	@Override
	public void bakery(int time, int closingTime) {
		System.out.println("bakery time in derived class: " + time);
		System.out.println("bakery closing time in derived class: " + closingTime);
	}

	@Override
	public void bakery(double price) {
		System.out.println("bakery items price in derived class: " + price);
	}
}

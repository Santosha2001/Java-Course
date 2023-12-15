package com.xworkz.collection.boot;

public class AnimalImpl implements Animal {

	@Override
	public void name() {
		// TODO Auto-generated method stub

	}

	@Override
	public void color() {
		System.out.println("default method in subclass");
		Animal.super.color();
	}

//	public void noOfLegs() {
//		System.out.println("static method in subclass");
//	}

	public static void tiger() {
		System.out.println("static tiger in parent class");
	}

	public void lion() {
		System.out.println("lion in parent class");
	}

}

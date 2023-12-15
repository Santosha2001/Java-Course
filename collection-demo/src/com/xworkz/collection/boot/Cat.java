package com.xworkz.collection.boot;

public class Cat extends AnimalImpl {

	@Override
	public void lion() {
		System.out.println("lion in child class");
		super.lion();
	}
	
	
}

package com.xworkz.collection.boot;

public interface Animal {

	void name();

	static void noOfLegs() {
		System.out.println("static method in interface");
	}

	default void color() {
		System.out.println("default method in interface");
	}
}

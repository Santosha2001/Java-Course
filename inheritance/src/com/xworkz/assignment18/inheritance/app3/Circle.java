package com.xworkz.assignment18.inheritance.app3;

public class Circle extends Shape {
	public String area;

	public Circle() {
		System.out.println("Calling default Constructer of Circle");
	}

	public double circleMethod(double r) {
		return 3.14 * r * r;
	}
}

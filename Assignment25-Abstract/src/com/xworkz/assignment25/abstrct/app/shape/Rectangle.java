package com.xworkz.assignment25.abstrct.app.shape;

public class Rectangle extends Shape {
	double width, height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		double area = width * height;
		System.out.println("Rectangle Area: " + area);
		return area;
	}

	@Override
	public double calculatePerimeter() {
		double perimeter = 2 * (width + height);
		System.out.println("Rectangle Perimeter: " + perimeter);
		return perimeter;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle.");
	}

	@Override
	public void resize(double factor) {
		width *= factor;
		height *= factor;
		System.out.println("Resized rectangle by a factor of " + factor);
	}

	@Override
	public void displayInfo() {
		System.out.println("Rectangle: width=" + width + ", height=" + height);
	}
}

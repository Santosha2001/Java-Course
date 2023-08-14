package com.xworkz.assignment25.abstrct.app.shape;

public abstract class Shape {
	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	public abstract void draw();
	public abstract void resize(double factor);
	public abstract void displayInfo();
    
	public void moveTo(double x, double y) {
        System.out.println("Moving shape to (" + x + ", " + y + ").");
    }
    
	public void rotate(double angle) {
        System.out.println("Rotating shape by " + angle + " degrees.");
    }
    
	public void fill(String color) {
        System.out.println("Filling shape with " + color + " color.");
    }
    
	public void highlight() {
        System.out.println("Highlighting shape.");
    }
}

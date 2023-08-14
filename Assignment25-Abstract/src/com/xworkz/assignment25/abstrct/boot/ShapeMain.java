package com.xworkz.assignment25.abstrct.boot;

import com.xworkz.assignment25.abstrct.app.shape.Rectangle;
import com.xworkz.assignment25.abstrct.app.shape.Shape;

public class ShapeMain {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(4, 6);
		rectangle.displayInfo();
		rectangle.draw();
		rectangle.resize(1.5);
		rectangle.calculateArea();
		rectangle.calculatePerimeter();

		System.out.println();

		rectangle.moveTo(10, 5);
		rectangle.rotate(30);
		rectangle.fill("red");
		rectangle.highlight();
	}
}

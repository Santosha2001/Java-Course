package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app3.*;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape =new Shape();
		shape.shapeMethod();
		System.out.println("----------------------");
		
		Circle circle=new Circle();
		Shape circle1 =new Circle();
		System.out.println(circle.circleMethod(6));
		circle.shapeMethod();
		System.out.println("----------------------");
		
		Rectangle rectangle=new Rectangle();
		Shape rectangle1 =new Rectangle();
		rectangle.shapeMethod();
		System.out.println(rectangle.rectangleMethod(5, 6));
		System.out.println("----------------------");
		
		Square square=new Square();
		Shape square1 =new Shape();
		square.shapeMethod();
		System.out.println(square.squareMethod(5));
		System.out.println("----------------------");
		
		Pentagon pentagon=new Pentagon();
		Shape pentagon1 =new Pentagon();
		pentagon.shapeMethod();
		pentagon.pentagonMethod();
		System.out.println("----------------------");
		
		Oval oval=new Oval();
		Shape oval2 =new Oval();
		oval.ovalMethod();
		oval.shapeMethod();
		System.out.println("----------------------");
		
		Rombus rombus=new Rombus();
		Shape rombus2 =new Rombus();
		rombus.rombusMethod();
		rombus.shapeMethod();
	}
}

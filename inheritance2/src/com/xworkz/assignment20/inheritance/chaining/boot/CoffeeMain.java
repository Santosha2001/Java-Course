package com.xworkz.assignment20.inheritance.chaining.boot;

import com.xworkz.assignment20.inheritance.chaining.app.coffee.BlackCoffee;

public class CoffeeMain {
	public static void main(String[] args) {
		BlackCoffee blackCoffee = new BlackCoffee();
		System.out.println("No argument constructor");
		System.out.println(blackCoffee.price);
		System.out.println(blackCoffee.quantity);
		System.out.println(blackCoffee.shopLoaction);
		System.out.println(blackCoffee.tasty);
		
		BlackCoffee blackCoffee2 = new BlackCoffee(2,true,20,"Dvg");
		System.out.println("Parameterized constructor");
		System.out.println(blackCoffee2.price);
		System.out.println(blackCoffee2.quantity);
		System.out.println(blackCoffee2.shopLoaction);
		System.out.println(blackCoffee2.tasty);
	}
}

package com.xworkz.assignment20.inheritance.chaining.app.coffee;

public class BlackCoffee extends Coffee {
	
	public BlackCoffee() {
		super(1, false, 10, "aa");
	}
	
	public BlackCoffee(int quantity,boolean tasty,double price,String shopLoaction) {
//		super(7, true, 50,"Dvg");
		super(quantity, tasty, price, shopLoaction);
	}

}

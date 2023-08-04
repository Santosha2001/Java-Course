package com.xworkz.assignment20.inheritance.chaining.app.mushroom;

public class PoisonMushroom extends Mushroom {
	public PoisonMushroom() {
		// TODO Auto-generated constructor stub
		super("land", 100, true, 'M');
	}
	
	public PoisonMushroom(String foundLocation,double price,boolean growArtificialy,char size) {
		super(foundLocation, price, growArtificialy, size);
	}
}

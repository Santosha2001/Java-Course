package com.xworkz.assignment21.app.gadget;

public class Gadget {
	public void gadget() {
		System.out.println("no parameters");
		this.gadget("Mobile");
		this.gadget(10000, "Amazon");
	}
	
	public void gadget(String gadgetName) {
		System.out.println("gadgetName: " + gadgetName);
	}
	
	public void gadget(double gadgetPrice) {
		System.out.println("gadgetPrice: " + gadgetPrice);
		
	}
	
	public void gadget(double gadgetPrice,String gadgetPurchasedFrom) {
		System.out.println("gadgetPrice: " + gadgetPrice);
		System.out.println("gadgetPurchasedFrom: " + gadgetPurchasedFrom);
		this.gadget(gadgetPrice);
		this.gadget(gadgetPurchasedFrom);
	}
}

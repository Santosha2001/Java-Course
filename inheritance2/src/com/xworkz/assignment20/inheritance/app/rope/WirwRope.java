package com.xworkz.assignment20.inheritance.app.rope;

public class WirwRope extends Rope {
	public WirwRope() {
		// TODO Auto-generated constructor stub
		super(20, 200, 'S', "Tying");
	}
	
	public WirwRope(int meters,double cost,char thicknes,String usedFor) {
		super(meters, cost, thicknes, usedFor);
	}
}

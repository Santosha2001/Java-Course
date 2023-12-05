package com.xworkz.assignment22.overriding.app.gate;

public class SchoolGate extends Gate {
	
	@Override
	public String mouseGate(String gateType) {
		System.out.println("gate in derived class type is: " + gateType);
		return "House";
	}
}

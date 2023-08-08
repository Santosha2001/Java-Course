package com.xworkz.assignment22.overriding.app.gate;

public class Gate {

	public void gate() {
		System.out.println("gate in super class");
	}

	public String mouseGate(String gateType) {
		System.out.println("gate in super class type is: " + gateType);
		return "House";
	}
}

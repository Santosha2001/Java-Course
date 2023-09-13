package com.xworkz.festival.app.rule;

public interface RTORule {

	double payRoadTax();

	default int payCess() {
		System.out.println("Default or dummy method it will not force the calss to implement it.");
		return 1;
	}
	
	static void run() {
		
	}

}

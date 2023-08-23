package com.xworkz.assignment30.interfaces.app.impl;

import com.xworkz.assignment30.interfaces.app.Engineering;

public class EngineeringMain {
	public static void main(String[] args) {
		Engineering engineering = new EngineeringImpl();

		engineering.attendance(75);
		engineering.classTime(8);
		engineering.engineeringBranch("CSE");
	}
}

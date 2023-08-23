package com.xworkz.assignment30.interfaces.app.impl;

import com.xworkz.assignment30.interfaces.app.Engineering;

public class EngineeringImpl implements Engineering {

	@Override
	public String engineeringBranch(String branch) {
		System.out.println("Branch: " + branch);
		return branch;
	}

	@Override
	public double classTime(double time) {
		System.out.println("class time: " + time);
		return time;
	}

	@Override
	public boolean attendance(int percent) {
		System.out.println("Minimum attendance is: " + percent);
		return true;
	}

}

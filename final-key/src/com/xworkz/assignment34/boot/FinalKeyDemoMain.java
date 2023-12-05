package com.xworkz.assignment34.boot;

import com.xworkz.assignment34.app.FinalKeyDemo;

public class FinalKeyDemoMain {

	public static void main(String[] args) {

		// each instance can have variable values

		FinalKeyDemo demo = new FinalKeyDemo("Pink");
		// System.out.println(demo);

		System.out.println(demo.getColor());
		
		
		demo.kiteFly();
	}

}

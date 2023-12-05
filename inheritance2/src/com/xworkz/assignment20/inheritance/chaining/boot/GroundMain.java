package com.xworkz.assignment20.inheritance.chaining.boot;

import com.xworkz.assignment20.inheritance.app.ground.Stadium;

public class GroundMain {
	public static void main(String[] args) {
		Stadium stadium = new Stadium();
		System.out.println("No argument");
		System.out.println(stadium.chairs);
		System.out.println(stadium.location);
		System.out.println(stadium.name);
		System.out.println(stadium.squareFeets);
		
		Stadium stadium2 = new Stadium("wankede","Mumbai",400,true);
		System.out.println("Parameter argument");
		System.out.println(stadium2.chairs);
		System.out.println(stadium2.location);
		System.out.println(stadium2.name);
		System.out.println(stadium2.squareFeets);
	}
}

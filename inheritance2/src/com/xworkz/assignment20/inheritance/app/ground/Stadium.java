package com.xworkz.assignment20.inheritance.app.ground;

public class Stadium extends Ground {
	public Stadium() {
		// TODO Auto-generated constructor stub
		super("Chinnaswami", "Bengalore", 300, true);
	}
	
	public Stadium(String name,String location,double squareFeets,boolean chairs) {
		super(name, location, squareFeets, chairs);
	}
}

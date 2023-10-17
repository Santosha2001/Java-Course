package com.xworkz.farmer.app;

public class Farmer {

	private Land land;
	private String name;

	public Farmer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setLand(Land land) {
		this.land = land;
	}

	public void farming() {
		System.out.println("Land method associated in Farmer class");
		this.land.land();
	}

}

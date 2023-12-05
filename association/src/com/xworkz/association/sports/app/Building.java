package com.xworkz.association.sports.app;

public class Building {
	public Floor[] floors;
	public Lift[] lifts;

	public Building(Floor[] floors, Lift[] lifts) {
		// TODO Auto-generated constructor stub
		this.floors = floors;
		this.lifts = lifts;
	}

	public void buildingMethod() {
		for (int i = 0; i < floors.length; i++) {
			Floor ref = floors[i];
			ref.floorMethod();
		}

		for (int j = 0; j < lifts.length; j++) {
			Lift ref1 = lifts[j];
			ref1.liftMethod();
		}
	}
}

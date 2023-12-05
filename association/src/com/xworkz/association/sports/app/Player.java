package com.xworkz.association.sports.app;

public class Player {
	public String playerName;
	public double experience;
	public Building building;
	public HomeTown homeTown;

	public Player(String playerName, double experience, Building building, HomeTown homeTown) {
		// TODO Auto-generated constructor stub
		this.playerName = playerName;
		this.experience = experience;
		this.building = building;
		this.homeTown = homeTown;
	}

	public void playerMethod() {
		System.out.println("playerName: " + playerName);
		System.out.println("experience: " + experience);

		building.buildingMethod();

		homeTown.homeTownMethod();
	}
}

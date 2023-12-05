package com.xworkz.association.sports.app;

public class Corporator {
	public String corporatorName;
	public Building[] buildings;

	public Corporator(String corporatorName, Building[] buildings) {
		this.corporatorName = corporatorName;
		this.buildings = buildings;
	}

	public void corporatorMethod() {
		System.out.println("corporatorName: " + corporatorName);

		for (int index = 0; index < buildings.length; index++) {
			Building buildingIndex = buildings[index];
			buildingIndex.buildingMethod();
		}

	}
}

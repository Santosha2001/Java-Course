package com.xworkz.association.sports.app;

public class Floor {
	public int floorNumber;
	public int totalFloors;

	public Floor(int i, int j) {
		this.floorNumber = i;
		this.totalFloors = j;
	}

	public void floorMethod() {
		System.out.println("floorNumber: " + floorNumber);
		System.out.println("totalFloors: " + totalFloors);
	}
}

package com.xworkz.association.sports.app;

public class HomeTown {
	public String townName;
	public double pincode;
	public Area[] area;

	public HomeTown(String townName, double pincode, Area[] area) {
		// TODO Auto-generated constructor stub
		this.townName = townName;
		this.pincode = pincode;
		this.area = area;
	}

	public void homeTownMethod() {
		System.out.println("townName: " + townName);
		System.out.println("pincode: " + pincode);

		for (int index = 0; index < area.length; index++) {
			Area areaRef = area[index];
			areaRef.areaMethod();
		}
	}
}

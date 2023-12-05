package com.xworkz.association.sports.app;

public class Area {
	public String areaName;
	public Corporator corporator;

	public Area(String areaName, Corporator corporator) {
		// TODO Auto-generated constructor stub
		this.areaName = areaName;
		this.corporator = corporator;
	}

	public void areaMethod() {
		System.out.println("areaName: " + areaName);
		corporator.corporatorMethod();
	}
}

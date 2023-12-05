package com.xworkz.assignment26.tostring.app;

public class Flag {
	private String manufacturedAt;
	private int noOfColors;
	private String flagCountry;

	public Flag() {
		System.out.println("No parameters");
	}

	public Flag(String manufacturedAt, int noOfColors, String flagCountry) {
		super();
		this.manufacturedAt = manufacturedAt;
		this.noOfColors = noOfColors;
		this.flagCountry = flagCountry;
	}

	@Override
	public String toString() {
		return "Flag [manufacturedAt=" + manufacturedAt + ", noOfColors=" + noOfColors + ", flagCountry=" + flagCountry
				+ "]";
	}

}

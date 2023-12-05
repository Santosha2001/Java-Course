package com.xworkz.assignment30.interfaces.app.impl;

import com.xworkz.assignment30.interfaces.app.Military;

public class MilitaryImpl implements Military {

	@Override
	public String countryOfMilitary(String countryName) {
		System.out.println("Country name: " + countryName);
		return countryName;
	}

	@Override
	public int noOfSoilders(int number, String majorName) {
		System.out.println("number of soilders: " + number);
		System.out.println("Major name: " + majorName);
		return 0;
	}

	@Override
	public boolean havePowerfullWeapons(boolean weapon) {
		System.out.println("Military weapons: " + weapon);
		return weapon;
	}

}

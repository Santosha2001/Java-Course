package com.xworkz.assignment30.interfaces.boot;

import com.xworkz.assignment30.interfaces.app.Military;
import com.xworkz.assignment30.interfaces.app.impl.MilitaryImpl;

public class MilitaryMain {
	public static void main(String[] args) {
		Military military = new MilitaryImpl();
		military.countryOfMilitary("India");
		military.havePowerfullWeapons(true);
		military.noOfSoilders(10000, "Santosh");
	}
}

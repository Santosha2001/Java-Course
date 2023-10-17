package com.xworkz.farmer.boot;

import com.xworkz.farmer.app.Farmer;
import com.xworkz.farmer.app.Land;

public class FArmerMain {

	public static void main(String[] args) {
		Farmer farmer = new Farmer("Santhu");

		Land land = new Land();
		farmer.setLand(land);
		
		farmer.farming();

	}
}

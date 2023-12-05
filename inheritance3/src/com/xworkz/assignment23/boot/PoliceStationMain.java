package com.xworkz.assignment23.boot;

import com.xworkz.assignment23.app.policestatiion.FireStation;
import com.xworkz.assignment23.app.policestatiion.PoliceStation;

public class PoliceStationMain {
	public static void main(String[] args) {
		PoliceStation policeStation = new PoliceStation();
		policeStation.station();
		policeStation.station("Magadi station");
		policeStation.station("Magadi station","magadi");
		policeStation.station("Magadi station","magadi",10);
		policeStation.station("Magadi station","magadi",10,"Karnataka");
		policeStation.station("Magadi station","magadi",10,"Karnataka",true);
		
		System.out.println("\n");
		
		PoliceStation policeStation2 = new FireStation();
		policeStation2.station();
		policeStation2.station("nitivalli");
		policeStation2.station("nitivalli","nitivalli");
		policeStation2.station("nitivalli","nitivalli",10);
		policeStation2.station("nitivalli","nitivalli",10,"Karnataka");
		policeStation2.station("nitivalli","nitivalli",10,"Karnataka",true);
	}
}

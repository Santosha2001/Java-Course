package com.xworkz.assignment36.boot;

import com.xworkz.assignment36.app.repositary.LocationRepositary;
import com.xworkz.assignment36.app.repositary.LocationRepositaryImpl;
import com.xworkz.assignment36.app.services.LocationService;
import com.xworkz.assignment36.app.services.LocationServiceImpl;

public class LocationMain {

	public static void main(String[] args) {
		LocationRepositary locationRepositary = new LocationRepositaryImpl();
		LocationService locationService = new LocationServiceImpl(locationRepositary);

//		String[] loc = { "Hampi", "Hospete", null, "", "a" };
//		for (int index = 0; index < loc.length; index++) {
//			locationService.storeAndValidate(loc[index]);
//		}

		locationService.storeAndValidate("Davanagere");

		locationService.storeAndValidate(null);

		locationService.storeAndValidate("a");

		locationService.storeAndValidate("");

		locationService.storeAndValidate("Davanagere");
		
		locationService.storeAndValidate("Hampi");
		
		locationService.storeAndValidate("Hampi");
	}
}

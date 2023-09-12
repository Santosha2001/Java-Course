package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.historicalplaces.HistoricalPlacesRepositary;
import com.xworkz.assignment35.app.repositary.historicalplaces.HistoricalPlacesRepositaryImpl;
import com.xworkz.assignment35.app.services.historicalplaces.HistoricalPlacesServices;
import com.xworkz.assignment35.app.services.historicalplaces.HistoricalPlacesServicesImpl;

public class HistoricalPlacesServicesMain {

	public static void main(String[] args) {
		System.out.println("Historical places in HistoricalPlacesServices");
		System.out.println();

		HistoricalPlacesRepositary historicalPlacesRepositary = new HistoricalPlacesRepositaryImpl();

		HistoricalPlacesServices historicalPlacesServices = new HistoricalPlacesServicesImpl(
				historicalPlacesRepositary);

		historicalPlacesServices.placesValidate("Hampi");
		historicalPlacesServices.placesValidate("Mysore");
		System.out.println();

		historicalPlacesServices.placesValidate(null);
		System.out.println();

		historicalPlacesServices.placesValidate("");
		System.out.println();

		historicalPlacesServices.placesValidate("a");
	}
}

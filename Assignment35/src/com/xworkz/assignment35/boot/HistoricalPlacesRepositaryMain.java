package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.historicalplaces.HistoricalPlacesRepositary;
import com.xworkz.assignment35.app.repositary.historicalplaces.HistoricalPlacesRepositaryImpl;

public class HistoricalPlacesRepositaryMain {

	public static void main(String[] args) {

		HistoricalPlacesRepositary historicalPlacesRepositary = new HistoricalPlacesRepositaryImpl();

		System.out.println("Places implementing in Historical Implementing");

		historicalPlacesRepositary.places("Hampi");
		historicalPlacesRepositary.places("Beluru");
		historicalPlacesRepositary.places("Halebidu");
		historicalPlacesRepositary.places("Mysore");
		historicalPlacesRepositary.places("Hasan");
		historicalPlacesRepositary.places("Golgumbug");
		historicalPlacesRepositary.places("Taj Mahal");
		historicalPlacesRepositary.places("Kerala");
		historicalPlacesRepositary.places("Moodbidre");
		historicalPlacesRepositary.places("Kalasa");

		historicalPlacesRepositary.places("KedarNath");

	}

}

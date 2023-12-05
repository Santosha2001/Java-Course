package com.xworkz.assignment35.app.services.historicalplaces;

import com.xworkz.assignment35.app.repositary.historicalplaces.HistoricalPlacesRepositary;

public class HistoricalPlacesServicesImpl implements HistoricalPlacesServices {

	private HistoricalPlacesRepositary placesRepositary;

	public HistoricalPlacesServicesImpl(HistoricalPlacesRepositary placesRepositary) {
		super();
		this.placesRepositary = placesRepositary;
	}

	@Override
	public boolean placesValidate(String places) {
		if (places != null && !places.isEmpty() && places.length() > 3) {
			System.out.println("Places are valid");
			this.placesRepositary.places(places);
		} else {
			System.out.println("Places are not valid");
		}
		return false;
	}

}

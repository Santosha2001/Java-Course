package com.xworkz.assignment35.app.repositary.historicalplaces;

public class HistoricalPlacesRepositaryImpl implements HistoricalPlacesRepositary {

	private String[] placesArray = new String[NO_OF_PLACES];
	private int position;

	@Override
	public void places(String place) {
		if (this.position < NO_OF_PLACES) {
			this.placesArray[position] = place;
			System.out.println(placesArray[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBOundException");
		}

	}

}

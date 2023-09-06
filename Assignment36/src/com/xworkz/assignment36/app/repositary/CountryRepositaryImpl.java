package com.xworkz.assignment36.app.repositary;

public class CountryRepositaryImpl implements CountryRepositary {

	private String[] countries = new String[TOTAL_COUNTRIES];
	int position;

	@Override
	public void storeCountry(String country) {
		if (position < TOTAL_COUNTRIES) {
			this.countries[position] = country;
			System.out.println(this.countries[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("Country store is OutOfBound");
		}

	}

	@Override
	public boolean isExist(String country) {
		for (int index = 0; index <= position; index++) {
			String temp = countries[index];
			if (temp != null && temp.equals(country)) {
				return true;
			}
		}
		return CountryRepositary.super.isExist(country);
	}

}

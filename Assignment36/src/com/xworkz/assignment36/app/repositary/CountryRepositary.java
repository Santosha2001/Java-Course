package com.xworkz.assignment36.app.repositary;

public interface CountryRepositary {

	int TOTAL_COUNTRIES = 5;

	void storeCountry(String country);

	default boolean isExist(String country) {
		return false;
	}
}

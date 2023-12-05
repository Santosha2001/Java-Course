package com.xworkz.assignment36.app.services;

import com.xworkz.assignment36.app.repositary.CountryRepositary;

public class CountryServiceImpl implements CountryService {

	private CountryRepositary countryRepositary;

	public CountryServiceImpl(CountryRepositary countryRepositary) {
		super();
		this.countryRepositary = countryRepositary;
	}

	@Override
	public boolean countryStoreAndValidate(String country) {
		if (country != null && !country.isEmpty() && country.length() > 2 && country.length() <= 20) {
			if (!countryRepositary.isExist(country)) {
				countryRepositary.storeCountry(country);
				System.out.println("Country is stored");
				return true;
			} else {
				System.err.println("Country is already exists..");
			}
		} else {
			System.err.println("Country is not valid");
		}

		return false;

	}

}

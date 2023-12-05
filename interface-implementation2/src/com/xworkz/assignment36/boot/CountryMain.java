package com.xworkz.assignment36.boot;

import com.xworkz.assignment36.app.repositary.CountryRepositary;
import com.xworkz.assignment36.app.repositary.CountryRepositaryImpl;
import com.xworkz.assignment36.app.services.CountryService;
import com.xworkz.assignment36.app.services.CountryServiceImpl;

public class CountryMain {

	public static void main(String[] args) {
		CountryRepositary countryRepositary = new CountryRepositaryImpl();

		CountryService countryService = new CountryServiceImpl(countryRepositary);

		String[] count = { "India", "Sri Lanka", "", null, "a", "India", "Japan" };

		for (int index = 0; index < count.length; index++) {
			countryService.countryStoreAndValidate(count[index]);
		}
	}
}

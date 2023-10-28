package com.xworkz.collections.app.dto;

import java.time.LocalDate;

public class CountryDTO {

	private int id;
	private String countryName;
	private String capitalCity;
	private long population;
//	private boolean independent;
	private String independenceDate;
	private int noOfStates;
	private String primaryReligion;
	private String nationalAnimal;
	private String nationalBird;
	private String nationalSport;
	private String PMName;

	public CountryDTO(int id, String countryName, String capitalCity, long population, String independenceDate,
			int noOfStates, String primaryReligion, String nationalAnimal, String nationalBird, String nationalSport,
			String pMName) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.population = population;
		this.independenceDate = independenceDate;
		this.noOfStates = noOfStates;
		this.primaryReligion = primaryReligion;
		this.nationalAnimal = nationalAnimal;
		this.nationalBird = nationalBird;
		this.nationalSport = nationalSport;
		PMName = pMName;
	}

	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", countryName=" + countryName + ", capitalCity=" + capitalCity
				+ ", population=" + population + ", independenceDate=" + independenceDate + ", noOfStates=" + noOfStates
				+ ", primaryReligion=" + primaryReligion + ", nationalAnimal=" + nationalAnimal + ", nationalBird="
				+ nationalBird + ", nationalSport=" + nationalSport + ", PMName=" + PMName + "]";
	}

}

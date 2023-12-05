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

	public CountryDTO() {
		System.out.println("NO-argument constructor");
	}

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

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof CountryDTO) {
				CountryDTO countryDTO = (CountryDTO) obj;
				if (countryDTO.countryName.equals(countryName)) {
					return true;
				}
			}
		}
		return super.equals(obj);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getIndependenceDate() {
		return independenceDate;
	}

	public void setIndependenceDate(String independenceDate) {
		this.independenceDate = independenceDate;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public String getPrimaryReligion() {
		return primaryReligion;
	}

	public void setPrimaryReligion(String primaryReligion) {
		this.primaryReligion = primaryReligion;
	}

	public String getNationalAnimal() {
		return nationalAnimal;
	}

	public void setNationalAnimal(String nationalAnimal) {
		this.nationalAnimal = nationalAnimal;
	}

	public String getNationalBird() {
		return nationalBird;
	}

	public void setNationalBird(String nationalBird) {
		this.nationalBird = nationalBird;
	}

	public String getNationalSport() {
		return nationalSport;
	}

	public void setNationalSport(String nationalSport) {
		this.nationalSport = nationalSport;
	}

	public String getPMName() {
		return PMName;
	}

	public void setPMName(String pMName) {
		PMName = pMName;
	}
	
	

}

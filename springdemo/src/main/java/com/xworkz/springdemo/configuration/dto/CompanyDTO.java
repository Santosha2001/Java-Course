package com.xworkz.springdemo.configuration.dto;

public class CompanyDTO {

	private String companyName;
	private String companyLocation;
	private String companyState;

	public CompanyDTO(String companyName, String companyLocation, String companyState) {
		super();
		this.companyName = companyName;
		this.companyLocation = companyLocation;
		this.companyState = companyState;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyLocation() {
		return companyLocation;
	}

	public String getCompanyState() {
		return companyState;
	}

}

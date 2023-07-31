package com.xworkz.association.app;

public class Company {
	public String companyName;
	public String companyCeo;
	public String companyOriginCountry;

	public Company(String companyName, String companyCeo, String companyOriginCountry) {
		this.companyName = companyName;
		this.companyCeo = companyCeo;
		this.companyOriginCountry = companyOriginCountry;
	}

	public void companyMethod() {
		System.out.println("companyName: " + companyName);
		System.out.println("companyCeo: " + companyCeo);
		System.out.println("companyOriginCountry: " + companyOriginCountry);
	}
}

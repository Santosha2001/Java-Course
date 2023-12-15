package com.xworkz.collection.app.dto;

import java.time.LocalDate;

public class ApplicationDTO {

	private String name;
	private String version;
	private String companyName;
	private LocalDate createDate;
	private double ratings;

	public ApplicationDTO() {
		System.out.println("No-argument constructor");
	}

	public ApplicationDTO(String name, String version, String companyName, LocalDate createDate, double ratings) {
		super();
		this.name = name;
		this.version = version;
		this.companyName = companyName;
		this.createDate = createDate;
		this.ratings = ratings;

	}

	@Override
	public String toString() {
		return "ApplicationDTO [name=" + name + ", version=" + version + ", companyName=" + companyName
				+ ", createDate=" + createDate + ", ratings=" + ratings + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	

}

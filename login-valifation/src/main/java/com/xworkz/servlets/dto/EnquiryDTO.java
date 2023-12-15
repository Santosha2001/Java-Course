package com.xworkz.servlets.dto;

public class EnquiryDTO {

	private String name;
	private String number;
	private String email;
	private String dob;
	private String location;
	private String password;

	public EnquiryDTO(String name, String number, String email, String dob, String location, String password) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.dob = dob;
		this.location = location;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

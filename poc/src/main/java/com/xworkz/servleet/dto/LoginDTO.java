package com.xworkz.servleet.dto;

public class LoginDTO {

	private String userId;
	private String password;
	private String number;
	private String state;
	private String street;
	private String city;
	private String country;

	public LoginDTO(String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public LoginDTO(String number, String state, String street, String city, String country) {
		super();
		this.number = number;
		this.state = state;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}

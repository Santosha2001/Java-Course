package com.xworkz.newspaperdto.app.dto;

import java.io.Serializable;

public class WeatherDTO implements Serializable {

	private String temperature;
	private double windSpeed;
	private String wind;

	public WeatherDTO() {
		// TODO Auto-generated constructor stub
	}

	public WeatherDTO(String temperature, double windSpeed, String wind) {
		super();
		this.temperature = temperature;
		this.windSpeed = windSpeed;
		this.wind = wind;
	}

	@Override
	public String toString() {
		return "WeatherDTO [temperature=" + temperature + ", windSpeed=" + windSpeed + ", wind=" + wind + "]";
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWind() {
		return wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

}

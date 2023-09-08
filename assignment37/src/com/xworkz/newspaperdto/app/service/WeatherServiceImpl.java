package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.WeatherDTO;
import com.xworkz.newspaperdto.app.repository.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {

	private WeatherRepository weatherRepository;

	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		super();
		this.weatherRepository = weatherRepository;
	}

	@Override
	public boolean weatherValidate(WeatherDTO dto) {

		if (dto != null) {
			String temperature = dto.getTemperature();
			double windSpeed = dto.getWindSpeed();
			String wind = dto.getWind();

			if (windSpeed > 0.0) {
				System.out.println(dto.getWindSpeed() + " is valid");
			} else {
				System.err.println("Wind Speed is not valid");
				return false;
			}

			if (temperature != null && !temperature.isEmpty() && temperature.length() > 2 && temperature.length() <= 20
					&& wind != null && !wind.isEmpty() && wind.length() > 2 && wind.length() <= 20) {
				System.out.println(dto.getTemperature() + "  is valid");
				System.out.println(dto.getWind() + "  is valid");
			} else {
				System.err.println("Temperature and Wind are not valid");
				return false;
			}

			this.weatherRepository.save(dto);

			System.out.println("Weather is not null");
			System.out.println();

		}
		return false;
	}

}

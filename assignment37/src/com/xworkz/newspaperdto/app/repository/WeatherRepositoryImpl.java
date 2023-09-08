package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository {

	private WeatherDTO[] dtos = new WeatherDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(WeatherDTO dto) {
		if (this.position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at index " + position);
			
			this.position++;
		} else {
			System.err.println("Out of range");
		}

	}

}

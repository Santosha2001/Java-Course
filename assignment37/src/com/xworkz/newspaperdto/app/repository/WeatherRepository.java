package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.WeatherDTO;

public interface WeatherRepository {

	int TOTAL_ITEMS = 5;

	void save(WeatherDTO dto);
}

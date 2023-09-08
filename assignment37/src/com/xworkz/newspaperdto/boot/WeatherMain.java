package com.xworkz.newspaperdto.boot;

import com.xworkz.newspaperdto.app.dto.WeatherDTO;
import com.xworkz.newspaperdto.app.repository.WeatherRepository;
import com.xworkz.newspaperdto.app.repository.WeatherRepositoryImpl;
import com.xworkz.newspaperdto.app.service.WeatherService;
import com.xworkz.newspaperdto.app.service.WeatherServiceImpl;

public class WeatherMain {

	public static void main(String[] args) {

		WeatherRepository repository = new WeatherRepositoryImpl();

		WeatherService service = new WeatherServiceImpl(repository);

		WeatherDTO dto = new WeatherDTO("Hot", 135, "Normal");

		WeatherDTO dto2 = new WeatherDTO(null, 0, null);

		WeatherDTO dto3 = new WeatherDTO("Cool", 120, null);

		WeatherDTO dto4 = new WeatherDTO("Normal", 122.3, "Strong");

		service.weatherValidate(dto);

		service.weatherValidate(dto2);

		service.weatherValidate(dto3);

		service.weatherValidate(dto4);

	}
}

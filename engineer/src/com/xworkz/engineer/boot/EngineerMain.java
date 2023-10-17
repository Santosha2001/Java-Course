package com.xworkz.engineer.boot;

import com.xworkz.engineer.app.dto.EngineerDTO;
import com.xworkz.engineer.app.repository.EngineerRepository;
import com.xworkz.engineer.app.repository.EngineerRepositoryImpl;
import com.xworkz.engineer.app.service.EngineerService;
import com.xworkz.engineer.app.service.EngineerServiceImpl;

public class EngineerMain {

	public static void main(String[] args) {
		EngineerRepository engineerRepository = new EngineerRepositoryImpl();

		EngineerService engineerService = new EngineerServiceImpl(engineerRepository);

		EngineerDTO dto = new EngineerDTO(2, "Santhu", "ubdt");

		EngineerDTO dto2 = new EngineerDTO(4, "AMruth", "ubdt");

		EngineerDTO dto3 = new EngineerDTO(2, "Santhu", "ubdt");

		EngineerDTO dto4 = new EngineerDTO(5, "Bindhu", "ubdt");

		engineerService.saveAndValidate(dto);

		engineerService.saveAndValidate(dto2);

		engineerService.saveAndValidate(dto3);

		engineerService.saveAndValidate(dto4);

		engineerRepository.findByName("Santhu");
	}
}

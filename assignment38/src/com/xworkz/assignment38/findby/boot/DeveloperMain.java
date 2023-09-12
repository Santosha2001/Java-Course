package com.xworkz.assignment38.findby.boot;

import com.xworkz.assignment38.findby.app.dto.DeveloperDTO;
import com.xworkz.assignment38.findby.app.repository.DeveloperRepository;
import com.xworkz.assignment38.findby.app.repository.DeveloperRepositoryImpl;
import com.xworkz.assignment38.findby.app.service.DeveloperService;
import com.xworkz.assignment38.findby.app.service.DeveloperServiceImpl;

public class DeveloperMain {

	public static void main(String[] args) {
		DeveloperRepository developerRepository = new DeveloperRepositoryImpl();
		DeveloperService developerService = new DeveloperServiceImpl(developerRepository);

		DeveloperDTO developerDTO = new DeveloperDTO("Santosh", "Xworkz", "Trainer", 3, 10000, false);

		DeveloperDTO developerDTO2 = new DeveloperDTO("Santosh", "Xworkz", "Trainer", 3, 10000, false);

		developerService.saveAndValidate(developerDTO);

		developerService.saveAndValidate(developerDTO2);

		developerRepository.findyByNameWorking("Santosh", "Xworkz", "Trainer");
	}
}

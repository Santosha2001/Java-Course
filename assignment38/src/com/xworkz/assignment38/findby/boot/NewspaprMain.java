package com.xworkz.assignment38.findby.boot;

import com.xworkz.assignment38.findby.app.dto.NewspaperDTO;
import com.xworkz.assignment38.findby.app.repository.NewspaperRepository;
import com.xworkz.assignment38.findby.app.repository.NewspaperRepositoryImpl;
import com.xworkz.assignment38.findby.app.service.NewspaperService;
import com.xworkz.assignment38.findby.app.service.NewspaperServiceImpl;

public class NewspaprMain {

	public static void main(String[] args) {
		NewspaperRepository newspaperRepository = new NewspaperRepositoryImpl();
		NewspaperService newspaperService = new NewspaperServiceImpl(newspaperRepository);

		NewspaperDTO dto = new NewspaperDTO("Prajavani", 20, 5);

		NewspaperDTO dto2 = new NewspaperDTO("Prajavani", 20, 5);

		NewspaperDTO dto3 = new NewspaperDTO(null, 0, 0);

		NewspaperDTO dto4 = new NewspaperDTO(null, 20, 5);

		NewspaperDTO dto5 = new NewspaperDTO("Udayavani", 25, 15);

		newspaperService.saveAndValidate(dto);

		newspaperService.saveAndValidate(dto2);

		newspaperService.saveAndValidate(dto3);

		newspaperService.saveAndValidate(dto4);

		newspaperService.saveAndValidate(dto5);

		newspaperRepository.findByPublisher("Udayavani");

	}
}

package com.xworkz.newspaperdto.boot;

import com.xworkz.newspaperdto.app.dto.NewspaperDTO;
import com.xworkz.newspaperdto.app.repository.NewspaperRepository;
import com.xworkz.newspaperdto.app.repository.NewspaperRepositoryImpl;
import com.xworkz.newspaperdto.app.service.NewspaperService;
import com.xworkz.newspaperdto.app.service.NewspaperServiceImpl;

public class NewspaperMain {

	public static void main(String[] args) {
//		NewspaperDTO dto = new NewspaperDTO();

		NewspaperDTO dto2 = new NewspaperDTO("DEC", 5, "Santhu");
		NewspaperRepository newspaperRepository = new NewspaperRepositoryImpl();

		NewspaperService newspaperService = new NewspaperServiceImpl(newspaperRepository);

		newspaperService.saveAndValidate(dto2);
	}
}

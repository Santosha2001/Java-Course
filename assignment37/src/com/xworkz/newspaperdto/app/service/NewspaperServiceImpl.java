package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.NewspaperDTO;
import com.xworkz.newspaperdto.app.repository.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperRepository newspaperRepository;

	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		super();
		this.newspaperRepository = newspaperRepository;
	}

	@Override
	public boolean saveAndValidate(NewspaperDTO dto) {
		if (dto != null) {
			String name = dto.getName();
			int pages = dto.getPages();
			String publisher = dto.getPublisher();

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("Newspaper " + dto.getName() + "is valid");
			} else {
				System.err.println(dto.getName() + " is not valid");
				return false;
			}

			if (pages >= 0) {
				System.out.println("pages " + dto.getPages() + " are valid ");
			} else {
				System.err.println(dto.getPages() + "is not valid");
			}

			if (publisher != null && !publisher.isEmpty() && publisher.length() >= 3 && publisher.length() <= 20) {
				System.out.println(dto.getPublisher() + " is valid");
			} else {
				System.err.println(dto.getPublisher() + " is not valid");
			}

			this.newspaperRepository.save(dto);

			System.out.println("News paper in not null");
			System.out.println();
		}
		return false;
	}

}

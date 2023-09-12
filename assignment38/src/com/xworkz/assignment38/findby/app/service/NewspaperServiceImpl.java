package com.xworkz.assignment38.findby.app.service;

import com.xworkz.assignment38.findby.app.dto.NewspaperDTO;
import com.xworkz.assignment38.findby.app.repository.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {

	private NewspaperRepository rep;

	public NewspaperServiceImpl(NewspaperRepository rep) {
		super();
		this.rep = rep;
	}

	@Override
	public boolean saveAndValidate(NewspaperDTO dto) {

		if (dto != null) {
			String publisher = dto.getPublisher();
			int pages = dto.getPages();
			double price = dto.getPrice();

			if (publisher != null && !publisher.isEmpty() && publisher.length() >= 3 && publisher.length() <= 20) {
				System.out.println(dto.getPublisher() + " is valid");
			} else {
				System.err.println(dto.getPublisher() + " is invalid");
				return false;
			}

			if (price > 0 && pages > 0) {
				System.out.println(dto.getPages() + " is valid");
				System.out.println(dto.getPrice() + " is valid");

			} else {
				System.err.println("Pages and price are in-valid");
				return false;
			}

			if (!rep.isExist(dto)) {
				this.rep.save(dto);
				System.out.println();
				return true;
			}
		}

		return false;
	}

}

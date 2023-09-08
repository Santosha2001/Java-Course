package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.PrinterDTO;
import com.xworkz.newspaperdto.app.repository.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {

	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		super();
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean saveAndValidate(PrinterDTO dto) {
		if (dto != null) {
			String brand = dto.getBrand();
			String size = dto.getSize();
			double costPerPaper = dto.getCostPerPaper();

			if (costPerPaper > 0) {
				System.out.println(dto.getCostPerPaper() + " is valid");
			} else {
				System.err.println("Cost is invalid");
				return false;
			}

			if (brand != null && !brand.isEmpty() && brand.length() > 2 && brand.length() <= 20 && size != null
					&& !size.isEmpty() && size.length() > 2 && size.length() <= 20) {
				System.out.println(dto.getBrand() + " is valid");
				System.out.println(dto.getSize() + " is valid");
			} else {
				System.err.println("Brand and size is not valid");
				return false;
			}

			this.printerRepository.save(dto);
			System.out.println("Printer is not null");
			System.out.println();
		}
		return false;
	}

}

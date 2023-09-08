package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {

	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_SIZE];
	private int position;

	@Override
	public void save(PrinterDTO dto) {

		if (this.position < TOTAL_SIZE) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at position " + position);
			
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBoundException");
		}

	}

}

package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.PrinterDTO;

public interface PrinterRepository {

	int TOTAL_SIZE = 5;

	void save(PrinterDTO dto);
}

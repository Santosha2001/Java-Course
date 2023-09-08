package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.PrinterDTO;

public interface PrinterService {

	boolean saveAndValidate(PrinterDTO dto);
}

package com.xworkz.assignment38.findby.app.service;

import com.xworkz.assignment38.findby.app.dto.NewspaperDTO;

public interface NewspaperService {

	boolean saveAndValidate(NewspaperDTO dto);
}
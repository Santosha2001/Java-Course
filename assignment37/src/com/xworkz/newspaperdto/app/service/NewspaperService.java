package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.NewspaperDTO;

public interface NewspaperService {

	boolean saveAndValidate(NewspaperDTO dto);
}

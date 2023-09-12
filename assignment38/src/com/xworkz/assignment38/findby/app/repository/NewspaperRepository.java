package com.xworkz.assignment38.findby.app.repository;

import com.xworkz.assignment38.findby.app.dto.NewspaperDTO;

public interface NewspaperRepository {

	int PAPERS = 5;

	void save(NewspaperDTO dto);

	boolean isExist(NewspaperDTO dto);

	NewspaperDTO findByPublisher(String name);
}

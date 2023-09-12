package com.xworkz.assignment38.findby.app.repository;

import com.xworkz.assignment38.findby.app.dto.DeveloperDTO;

public interface DeveloperRepository {

	int SIZE = 5;

	void save(DeveloperDTO developerDTO);

	boolean isExist(DeveloperDTO developerDTO);

	DeveloperDTO findyByNameWorking(String name, String working, String designation);
}

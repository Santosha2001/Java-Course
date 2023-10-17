package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public interface EngineerRepository {

	int TOTAL_STUDENTS = 5;

	void save(EngineerDTO dto);

	boolean isExist(EngineerDTO dto);

	EngineerDTO findByName(String name);
}

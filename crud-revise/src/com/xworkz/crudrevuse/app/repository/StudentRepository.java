package com.xworkz.crudrevuse.app.repository;

import com.xworkz.crudrevuse.app.dto.StudentDTO;

public interface StudentRepository {

	int SIZE = 5;

	void save(StudentDTO dto);

	boolean isExist(StudentDTO dto);

	StudentDTO findByName(String name);

	StudentDTO findByAll(String name, int age, String college);

}

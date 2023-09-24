package com.xworkz.crudrevuse.app.service;

import com.xworkz.crudrevuse.app.dto.StudentDTO;

public interface StudentService {

	boolean saveAndValidate(StudentDTO dto);
}

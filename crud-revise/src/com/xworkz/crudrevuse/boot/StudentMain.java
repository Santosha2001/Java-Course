package com.xworkz.crudrevuse.boot;

import com.xworkz.crudrevuse.app.dto.StudentDTO;
import com.xworkz.crudrevuse.app.repository.StudentRepository;
import com.xworkz.crudrevuse.app.repository.StudentRepositoryImpl;
import com.xworkz.crudrevuse.app.service.StudentService;
import com.xworkz.crudrevuse.app.service.StudentServiceImpl;

public class StudentMain {

	public static void main(String[] args) {
		StudentRepository repository = new StudentRepositoryImpl();

		StudentService service = new StudentServiceImpl(repository);

		StudentDTO dto = new StudentDTO("Santosh", 22, "ubdt");

		StudentDTO dto2 = new StudentDTO("Sateesh", 12, "vidyanjali");

		StudentDTO dto3 = new StudentDTO(null, 0, null);

		StudentDTO dto4 = new StudentDTO("Santosh", 22, "ubdt");

		service.saveAndValidate(dto);

		service.saveAndValidate(dto2);

		service.saveAndValidate(dto3);

		service.saveAndValidate(dto4);

		repository.findByName("Santosh");

		repository.findByAll("Santosh", 22, "ubdt");

	}
}

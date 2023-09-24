package com.xworkz.crudrevuse.app.service;

import com.xworkz.crudrevuse.app.dto.StudentDTO;
import com.xworkz.crudrevuse.app.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {

	private StudentRepository repo;

	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndValidate(StudentDTO dto) {

		if (dto != null) {
			String name = dto.getName();
			String college = dto.getCollege();
			int age = dto.getAge();

			if (name != null && !name.isEmpty() && name.length() > 2 && name.length() <= 20 && college != null
					&& !college.isEmpty() && college.length() > 2 && college.length() <= 20) {
				System.out.println("name is valid");
				System.out.println("college is valid");
			} else {
				System.err.println("name is in-valid");
				System.err.println("college is in-valid");
				return false;
			}

			if (age > 0) {
				System.out.println("age is valid");
			} else {
				System.err.println("age is invalid");
				return false;
			}

			if (!repo.isExist(dto)) {
				this.repo.save(dto);
				System.out.println();
				return true;
			}
		}
		return false;
	}

}

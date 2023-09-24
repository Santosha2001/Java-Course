package com.xworkz.crudrevuse.app.repository;

import com.xworkz.crudrevuse.app.dto.StudentDTO;

public class StudentRepositoryImpl implements StudentRepository {

	private int position;
	private StudentDTO[] dtos = new StudentDTO[SIZE];

	@Override
	public void save(StudentDTO dto) {

		if (position < SIZE) {
			this.dtos[position] = dto;
			System.out.println(dto + " at index " + position);
			this.position++;
		} else {
			System.err.println("dto out of bound");
		}
	}

	@Override
	public boolean isExist(StudentDTO dto) {

		for (int index = 0; index <= this.position; index++) {
			StudentDTO dto2 = dtos[index];
			if (dto2 != null && dto2.equals(dto)) {
				System.out.println("dto already exist");
				System.out.println();
				return true;
			}
		}
		return false;
	}

	@Override
	public StudentDTO findByName(String name) {

		for (int index = 0; index < this.position; index++) {
			StudentDTO dto = dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("dto is found by name--> " + name);
				return dto;
			}
		}
		return null;
	}

	@Override
	public StudentDTO findByAll(String name, int age, String college) {

		for (int index = 0; index < this.position; index++) {
			StudentDTO dto = dtos[index];
			if (dto.getName().equals(name) && dto.getAge() == age && dto.getCollege().equals(college)) {
				System.out.printf("dto is found by name,age,college--> %s, %d,%s", name, age, college);
				System.out.println();
				return dto;
			}
		}
		return null;
	}

}

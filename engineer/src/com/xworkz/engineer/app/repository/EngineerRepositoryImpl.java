package com.xworkz.engineer.app.repository;

import com.xworkz.engineer.app.dto.EngineerDTO;

public class EngineerRepositoryImpl implements EngineerRepository {

	private int position;
	private EngineerDTO[] dtos = new EngineerDTO[TOTAL_STUDENTS];

	@Override
	public void save(EngineerDTO dto) {

		if (this.position < TOTAL_STUDENTS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at index " + position);
			this.position++;
		}
	}

	@Override
	public boolean isExist(EngineerDTO dto) {

		for (int index = 0; index <= position; index++) {
			EngineerDTO dto2 = this.dtos[index];
			if (dto2 != null && dto2.equals(dto)) {
				System.out.println("dto already exist");
				System.out.println();
				return true;
			}

		}

		return false;
	}

	@Override
	public EngineerDTO findByName(String name) {

		System.out.println("ruuning findByName, args passed--> " + name);
		System.out.println("Current position " + this.position);

		for (int index = 0; index < this.position; index++) {
			EngineerDTO dto = dtos[index];

			if (dto.getName().equals(name)) {
				System.out.println("name is found--> " + name);
				return dto;
			}
		}

		return null;
	}

}

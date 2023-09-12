package com.xworkz.assignment38.findby.app.repository;

import com.xworkz.assignment38.findby.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository {

	private int position;
	private NewspaperDTO[] dtos = new NewspaperDTO[PAPERS];

	@Override
	public void save(NewspaperDTO dto) {

		if (this.position < PAPERS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at index--> " + position);
			this.position++;
		} else {
			System.err.println("Index out of range");
		}

	}

	@Override
	public boolean isExist(NewspaperDTO dto) {

		for (int index = 0; index <= this.position; index++) {
			NewspaperDTO dto2 = dtos[index];
			if (dto2 != null && dto2.equals(dto)) {
				System.out.println("already exist at position--> ");
				return true;
			}
		}

		return false;
	}

	@Override
	public NewspaperDTO findByPublisher(String name) {

		System.out.println();
		System.out.println("Current position--> " + this.position);
		for (int index = 0; index < this.position; index++) {
			NewspaperDTO dto = dtos[index];
			if (dto.getPublisher().equals(name)) {
				System.out.println("Name is found--> " + name);
				return dto;
			}
		}

		return null;
	}

}

package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository {
	private NewspaperDTO[] dtos = new NewspaperDTO[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(NewspaperDTO dto) {
		if (position < TOTAL_ITEMS) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at index " + position);
			
			this.position++;
		} else {
			System.err.println("not save");
		}
	}

//	@Override
//	public boolean isEXist(NewspaperDTO dto) {
//		for (int i = 0; i <= position; i++) {
//			NewspaperDTO dto2 = dtos[i];
//			if (dto2 != null && dto2.equals(dto)) {
//				System.out.println("It can't store");
//				return true;
//			} 
//		}
//		return NewspaperRepository.super.isEXist(dto);
//	}

}

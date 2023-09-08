package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.NewspaperDTO;

public interface NewspaperRepository {

	int TOTAL_ITEMS = 5;

	void save(NewspaperDTO dto);

//	default boolean isEXist(NewspaperDTO dto) {
//		return false;
//	}
}

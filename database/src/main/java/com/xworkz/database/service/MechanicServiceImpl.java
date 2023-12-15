package com.xworkz.database.service;

import com.xworkz.database.dto.MechanicDTO;
import com.xworkz.database.repository.MechanicRepository;
import com.xworkz.database.repository.MechanicRepositoryImpl;

public class MechanicServiceImpl implements MechanicService {

	@Override
	public void saveAndValidateMechanicDetails(MechanicDTO dto) {
		MechanicRepository mechanicRepository = new MechanicRepositoryImpl();
		mechanicRepository.saveMechaincDetail(dto);
	}
}

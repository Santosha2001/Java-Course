package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.AadharDTO;

public interface AadharRepository {

	int NUMBER = 5;

	void saveAadharInfo(AadharDTO aadharDTO);
}

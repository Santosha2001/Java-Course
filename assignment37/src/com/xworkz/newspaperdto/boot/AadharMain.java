package com.xworkz.newspaperdto.boot;

import com.xworkz.newspaperdto.app.dto.AadharDTO;
import com.xworkz.newspaperdto.app.repository.AadharRepository;
import com.xworkz.newspaperdto.app.repository.AadharRepositoryImpl;
import com.xworkz.newspaperdto.app.service.AadharService;
import com.xworkz.newspaperdto.app.service.AadharServiceImpl;

public class AadharMain {

	public static void main(String[] args) {

		AadharRepository aadharRepository = new AadharRepositoryImpl();

		AadharService aadharService = new AadharServiceImpl(aadharRepository);

		AadharDTO aadharDTO = new AadharDTO(744116519748L, "Santosh", "Hadagali");

		AadharDTO aadharDTO2 = new AadharDTO(278176267837L, "Rathid", "Hospete");

		AadharDTO aadharDTO3 = new AadharDTO(0, "Sameer", "Hansi");

		AadharDTO aadharDTO4 = new AadharDTO(172387456372L, null, null);

		AadharDTO aadharDTO5 = new AadharDTO(0, null, null);

		aadharService.aadharValidate(aadharDTO);

		aadharService.aadharValidate(aadharDTO2);

		aadharService.aadharValidate(aadharDTO3);

		aadharService.aadharValidate(aadharDTO4);

		aadharService.aadharValidate(aadharDTO5);
	}
}

package com.xworkz.database.boot;

import com.xworkz.database.dto.MechanicDTO;
import com.xworkz.database.service.MechanicService;
import com.xworkz.database.service.MechanicServiceImpl;

public class MechanicMain {

	public static void main(String[] args) {
		MechanicDTO dto = new MechanicDTO("Ramesh", 1, "Ramesh Shop");

		MechanicService mechanicService = new MechanicServiceImpl();
		mechanicService.saveAndValidateMechanicDetails(dto);

		System.out.println(dto);

	}
}

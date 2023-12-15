package com.xworkz.database.boot;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.xworkz.database.dto.AutomobileDTO;
import com.xworkz.database.repository.AutomobileRepository;
import com.xworkz.database.repository.AutomobileRepositoryImpl;
import com.xworkz.database.service.AutomobileService;
import com.xworkz.database.service.AutomobileServiceImpl;

public class AutomobileMain {

	public static void main(String[] args) {
		AutomobileDTO automobileDTO = new AutomobileDTO("BMW", "silver", "Car", 1);

		AutomobileRepository automobileRepository = new AutomobileRepositoryImpl();
		AutomobileService automobileService = new AutomobileServiceImpl(automobileRepository);

		automobileService.saveAndValidate(automobileDTO);

		Set<AutomobileDTO> automobileDTOs = new HashSet<AutomobileDTO>();
		automobileDTOs.add(new AutomobileDTO("Ferrari", "Blue", "Car", 3));
		automobileDTOs.add(new AutomobileDTO("Honda", "Silver", "Bike", 3));
		automobileDTOs.add(new AutomobileDTO("Honda", "Silver", "Bike", 3));

		automobileService.saveAndValidate(automobileDTOs);

//		automobileService.saveUpadateDetails(automobileDTO);

		automobileRepository.updateVehicleDetails(automobileDTO);

		automobileRepository.updateVehicleDetaols(automobileDTOs);

		automobileService.fetchAll();

		automobileService.deleteVehicle("BMW");
	}
}
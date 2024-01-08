package com.xworkz.database.service;

import java.util.List;
import java.util.Set;

import com.xworkz.database.dto.AutomobileDTO;

public interface AutomobileService {

	boolean saveAndValidate(AutomobileDTO automobileDTO);

	boolean saveAndValidate(Set<AutomobileDTO> automobileDTOs);

//	void saveUpadateDetails(AutomobileDTO automobileDTO);

	List<AutomobileDTO> fetchAll();

	void deleteVehicle(String vehicleName);

}

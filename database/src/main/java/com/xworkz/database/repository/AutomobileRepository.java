package com.xworkz.database.repository;

import java.util.List;
import java.util.Set;

import com.xworkz.database.dto.AutomobileDTO;

public interface AutomobileRepository {

	void saveDetails(AutomobileDTO automobileDTO);

	void saveDetails(Set<AutomobileDTO> automobileDTOs);

	void updateVehicleDetails(AutomobileDTO automobileDTO);

	void updateVehicleDetaols(Set<AutomobileDTO> automobileDTOs);

	List<AutomobileDTO> fetchAllVehicleDetails();

	// existence check
//	boolean isExst(List<AutomobileDTO> automobileDTOs);

	void deleteVehicleByName(String vehicleName);

//	void deleteVehicleByName(List<AutomobileDTO> automobileDTOs);
}

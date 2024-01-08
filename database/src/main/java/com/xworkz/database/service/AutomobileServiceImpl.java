package com.xworkz.database.service;

import java.util.List;
import java.util.Set;

import com.xworkz.database.dto.AutomobileDTO;
import com.xworkz.database.repository.AutomobileRepository;
import com.xworkz.database.repository.AutomobileRepositoryImpl;

public class AutomobileServiceImpl implements AutomobileService {

	private AutomobileRepository repo;

	public AutomobileServiceImpl(AutomobileRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndValidate(AutomobileDTO automobileDTO) {

		if (automobileDTO != null) {
			String name = automobileDTO.getName();
			String color = automobileDTO.getColor();
			String vehicleType = automobileDTO.getVehicleType();
			int model = automobileDTO.getModel();

			if (name != null && !name.isEmpty()) {
				System.out.println("Name is not null");
			} else {
				System.out.println("Name is null exit.....");
				return false;
			}
			if (color != null && !color.isEmpty()) {
				System.out.println("COlor is not null");
			} else {
				System.out.println("Color is null exit...");
			}

			if (vehicleType != null && !vehicleType.isEmpty()) {
				System.out.println();
			} else {
				System.out.println("Vehicle type is null exist...");
				return false;
			}
			if (model != 0) {
				System.out.println("Model is not null");
			} else {
				System.out.println("model is null exit....");
				return false;
			}

			this.repo.saveDetails(automobileDTO);
		}
		return false;
	}

	@Override
	public boolean saveAndValidate(Set<AutomobileDTO> automobileDTOs) {
		for (AutomobileDTO automobileDTO : automobileDTOs) {
			if (automobileDTO.getName() != null && automobileDTO.getColor() != null
					&& automobileDTO.getVehicleType() != null && automobileDTO.getModel() != 0) {
				System.out.println("List of values inserted...");
			} else {
				System.out.println("values not inserted...");
				return false;
			}
			this.repo.saveDetails(automobileDTO);
		}
		return false;
	}

//	@Override
//	public void saveUpadateDetails(AutomobileDTO automobileDTO) {
//		if (automobileDTO.getColor() != null && automobileDTO.getModel() != 0 && automobileDTO.getId() != 0) {
//			System.out.println("values updated");
//		} else {
//			System.out.println("values not updated..");
//		}
//		this.repo.updateVehicleDetails(automobileDTO);
//	}

	@Override
	public List<AutomobileDTO> fetchAll() {
		AutomobileRepository automobileRepository = new AutomobileRepositoryImpl();
//		List<AutomobileDTO> list = automobileRepository.fetchAllVehicleDetails();
//		list.forEach(a -> System.out.println(a));

		List<AutomobileDTO> dtoList = automobileRepository.fetchAllVehicleDetails();
		for (AutomobileDTO automobileDTO : dtoList) {
			System.out.println("*********************************");
			System.out.println(automobileDTO.getId());
			System.out.println(automobileDTO.getName());
			System.out.println(automobileDTO.getColor());
			System.out.println(automobileDTO.getVehicleType());
			System.out.println(automobileDTO.getModel());
		}
		return null;
	}

	@Override
	public void deleteVehicle(String vehicleName) {

		if (vehicleName != null) {
			System.out.println("Vehicle deleted..");
		} else {
			System.out.println("Vehicle is not deleted..");
		}
		this.repo.deleteVehicleByName(vehicleName);
	}

}

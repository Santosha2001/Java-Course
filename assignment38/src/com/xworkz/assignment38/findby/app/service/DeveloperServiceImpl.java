package com.xworkz.assignment38.findby.app.service;

import com.xworkz.assignment38.findby.app.dto.DeveloperDTO;
import com.xworkz.assignment38.findby.app.repository.DeveloperRepository;

public class DeveloperServiceImpl implements DeveloperService {

	private DeveloperRepository repo;

	public DeveloperServiceImpl(DeveloperRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndValidate(DeveloperDTO developerDTO) {

		if (developerDTO != null) {
			String name = developerDTO.getName();
			String working = developerDTO.getWorkingFor();
			String designation = developerDTO.getDesignation();
			int exp = developerDTO.getExperience();
			double salary = developerDTO.getSalary();

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20 && working != null
					&& !working.isEmpty() && working.length() >= 3 && working.length() <= 20 && designation != null
					&& !designation.isEmpty() && designation.length() >= 3 && designation.length() <= 20) {

				System.out.println("Name--> " + developerDTO.getName() + " is valid");
				System.out.println("Working--> " + developerDTO.getWorkingFor() + " is valid");
				System.out.println("Designation--> " + developerDTO.getDesignation() + " is valid");

			} else {
				System.err.println("Name, Working, Designation are not valid");
				return false;
			}

			if (exp > 0 && salary > 0) {
				System.out.println("Experience--> " + developerDTO.getExperience() + " is valid");
				System.out.println("Salary--> " + developerDTO.getSalary() + " is valid");
				System.out.println();

			} else {
				System.err.println("Experience and Salary are not valid");
				return false;
			}

			if (!repo.isExist(developerDTO)) {
				this.repo.save(developerDTO);
				System.out.println();
				return true;
			}

		}

		return false;
	}

}

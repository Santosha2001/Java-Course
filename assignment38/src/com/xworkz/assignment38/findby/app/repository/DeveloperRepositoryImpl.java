package com.xworkz.assignment38.findby.app.repository;

import com.xworkz.assignment38.findby.app.dto.DeveloperDTO;

public class DeveloperRepositoryImpl implements DeveloperRepository {

	private int position;
	private DeveloperDTO[] dtos = new DeveloperDTO[SIZE];

	@Override
	public void save(DeveloperDTO developerDTO) {

		if (this.position < SIZE) {
			this.dtos[position] = developerDTO;
			System.out.println(developerDTO + " is at inedx--> " + this.position);
			this.position++;
		} else {
			System.err.println("Index out of range");
		}
	}

	@Override
	public boolean isExist(DeveloperDTO developerDTO) {

		for (int inedx = 0; inedx < this.position; inedx++) {
			DeveloperDTO developerDTO2 = dtos[inedx];
			if (developerDTO2 != null && developerDTO2.equals(developerDTO)) {
				System.out.println("dto already exist");
				System.out.println();
				return true;
			}
		}

		return false;
	}

	@Override
	public DeveloperDTO findyByNameWorking(String name, String working, String designation) {

//		System.out.printf("findyByNameWorking, by args--> ", name, working, designation);
		for (int inedx = 0; inedx < this.position; inedx++) {
			DeveloperDTO developerDTO = dtos[inedx];
			if (developerDTO.getName().equals(name) && developerDTO.getWorkingFor().equals(working)
					&& developerDTO.getDesignation().equals(designation)) {

				System.out.println("Fond by--> " + name);
				System.out.println("Fond by--> " + working);
				System.out.println("Fond by--> " + designation);

				return developerDTO;
			}
		}

		return null;
	}

}

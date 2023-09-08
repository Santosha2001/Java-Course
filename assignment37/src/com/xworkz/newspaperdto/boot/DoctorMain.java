package com.xworkz.newspaperdto.boot;

import com.xworkz.newspaperdto.app.dto.DoctorDTO;
import com.xworkz.newspaperdto.app.repository.DoctorRepository;
import com.xworkz.newspaperdto.app.repository.DoctorRepositoryImpl;
import com.xworkz.newspaperdto.app.service.DoctorService;
import com.xworkz.newspaperdto.app.service.DoctorServiceImpl;

public class DoctorMain {

	public static void main(String[] args) {

		DoctorRepository doctorRepository = new DoctorRepositoryImpl();

		DoctorService doctorService = new DoctorServiceImpl(doctorRepository);

		DoctorDTO doctorDTO = new DoctorDTO("Santhu", "Heart", 3, 100);

		DoctorDTO doctorDTO2 = new DoctorDTO(null, null, 0, 0);

		DoctorDTO doctorDTO3 = new DoctorDTO("Santosh", "Eye", 0, 0);

		DoctorDTO doctorDTO4 = new DoctorDTO(null, null, 2, 200);

		DoctorDTO doctorDTO5 = new DoctorDTO("Rathod", "Head", 5, 200);

		doctorService.saveAndValidate(doctorDTO);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO2);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO3);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO4);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO5);
	}
}

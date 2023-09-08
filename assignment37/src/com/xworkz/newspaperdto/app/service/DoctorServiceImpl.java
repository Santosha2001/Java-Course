package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.DoctorDTO;
import com.xworkz.newspaperdto.app.repository.DoctorRepository;

public class DoctorServiceImpl implements DoctorService {

	private DoctorRepository doctorRepository;

	public DoctorServiceImpl(DoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	@Override
	public boolean saveAndValidate(DoctorDTO doctorDTO) {

		if (doctorDTO != null) {
			String name = doctorDTO.getName();
			String specialist = doctorDTO.getSpecialist();
			int expeience = doctorDTO.getExpeience();
			double consultancyCharge = doctorDTO.getConsultancyCharge();

			if (expeience > 0 && consultancyCharge > 0) {
				System.out.println(doctorDTO.getExpeience() + " of experience so valid");
				System.out.println(doctorDTO.getConsultancyCharge() + " has minimum charge is valid");
			} else {
				System.err.println("Experience and Consultancy are in-valid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() > 2 && name.length() <= 20 && specialist != null
					&& !specialist.isEmpty() && specialist.length() > 2 && specialist.length() <= 20) {
				System.out.println(doctorDTO.getName() + " is valid");
				System.out.println(doctorDTO.getSpecialist() + " is valid");
			} else {
				System.err.println("Name and Specialist are not valid");
				return false;
			}
			this.doctorRepository.saveDoctorInfo(doctorDTO);
			System.out.println("Doctor info is not null");
			System.out.println();
		}

		return false;
	}

}

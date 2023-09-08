package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.DoctorDTO;

public interface DoctorRepository {

	int COUNT = 5;

	void saveDoctorInfo(DoctorDTO doctorDTO);
}

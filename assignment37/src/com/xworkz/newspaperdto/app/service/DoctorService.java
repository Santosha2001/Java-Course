package com.xworkz.newspaperdto.app.service;

import com.xworkz.newspaperdto.app.dto.DoctorDTO;

public interface DoctorService {

	boolean saveAndValidate(DoctorDTO doctorDTO);
}

package com.xworkz.newspaperdto.app.repository;

import com.xworkz.newspaperdto.app.dto.DoctorDTO;

public class DoctorRepositoryImpl implements DoctorRepository {

	private DoctorDTO[] dtos = new DoctorDTO[COUNT];
	private int position;

	@Override
	public void saveDoctorInfo(DoctorDTO doctorDTO) {

		if (this.position < COUNT) {
			this.dtos[position] = doctorDTO;
			System.out.println(doctorDTO + " is at position " + position);
			
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBoundException");
		}

	}

}

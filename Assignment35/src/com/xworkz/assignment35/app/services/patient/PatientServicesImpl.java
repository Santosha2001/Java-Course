package com.xworkz.assignment35.app.services.patient;

import com.xworkz.assignment35.app.repositary.patient.PatientRepositary;

public class PatientServicesImpl implements PatientServices {

	private PatientRepositary parientRepo;

	public PatientServicesImpl(PatientRepositary parientRepo) {
		super();
		this.parientRepo = parientRepo;
	}

	@Override
	public boolean patientValidate(String patient) {
		if (patient != null && !patient.isEmpty() && patient.length() > 2) {
			System.out.println("Data is valid");
			this.parientRepo.patient(patient);
		} else {
			System.out.println("data is not valid");
		}
		return false;
	}

}

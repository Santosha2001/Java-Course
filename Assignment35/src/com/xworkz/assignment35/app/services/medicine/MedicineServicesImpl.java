package com.xworkz.assignment35.app.services.medicine;

import com.xworkz.assignment35.app.repositary.medicine.MedicineRepositary;

public class MedicineServicesImpl implements MedicineServices {

	private MedicineRepositary medicineRepo;

	public MedicineServicesImpl(MedicineRepositary medicineRepo) {
		super();
		this.medicineRepo = medicineRepo;
	}

	@Override
	public boolean medicineValidate(String medicine) {
		if (medicine != null && !medicine.isEmpty() && medicine.length() > 2) {
			System.out.println("Medicine is valid");
			this.medicineRepo.medicenes(medicine);
		} else {
			System.out.println("Medicine is not valid");
		}
		return false;
	}

}

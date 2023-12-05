package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.medicine.MedicineRepositary;
import com.xworkz.assignment35.app.repositary.medicine.MedicineRepositaryImpl;
import com.xworkz.assignment35.app.services.medicine.MedicineServices;
import com.xworkz.assignment35.app.services.medicine.MedicineServicesImpl;

public class MedicineServicesMain {

	public static void main(String[] args) {
		System.out.println("Medicine is in MedicineServices");
		System.out.println();

		MedicineRepositary medicineRepositary = new MedicineRepositaryImpl();
		MedicineServices medicineServices = new MedicineServicesImpl(medicineRepositary);

		medicineServices.medicineValidate("Dollo");
		System.out.println();

		medicineServices.medicineValidate(null);
		System.out.println();

		medicineServices.medicineValidate("");
		System.out.println();

		medicineServices.medicineValidate("a");
	}
}

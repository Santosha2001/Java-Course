package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.medicine.MedicineRepositary;
import com.xworkz.assignment35.app.repositary.medicine.MedicineRepositaryImpl;

public class MedicineRepositaryMain {

	public static void main(String[] args) {

		MedicineRepositary medicineRepositary = new MedicineRepositaryImpl();

		System.out.println("Medicene is implementing in MedicineRepositaryImpl");

		medicineRepositary.medicenes("Dolo");
		medicineRepositary.medicenes("Vicks");
		medicineRepositary.medicenes("Anacine");
		medicineRepositary.medicenes("Paracetamel");
		medicineRepositary.medicenes("Syrup");
		medicineRepositary.medicenes("caughSyrup");
		medicineRepositary.medicenes("Tincher");
		medicineRepositary.medicenes("Bandage");
		medicineRepositary.medicenes("Powder");
		medicineRepositary.medicenes("Drops");

		medicineRepositary.medicenes("Aintment");

	}

}

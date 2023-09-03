package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.patient.PatientRepositary;

import medicineRepositary.PatientRepositaryImpl;

public class PatientRepositaryMain {

	public static void main(String[] args) {
		PatientRepositary patientRepositary = new PatientRepositaryImpl();

		System.out.println("Patient is implementing in PatientRepositaryImpl");

		patientRepositary.patient("Santhu");
		patientRepositary.patient("Sampath");
		patientRepositary.patient("Santeesh");
		patientRepositary.patient("Prashanth");
		patientRepositary.patient("Praveen");
		patientRepositary.patient("Abhinandan");
		patientRepositary.patient("Santosh");
		patientRepositary.patient("Kumar");
		patientRepositary.patient("Manjunath");
		patientRepositary.patient("Harish");

		patientRepositary.patient("Aman");

	}

}

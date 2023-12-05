package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.patient.PatientRepositary;
import com.xworkz.assignment35.app.services.patient.PatientServices;
import com.xworkz.assignment35.app.services.patient.PatientServicesImpl;

import medicineRepositary.PatientRepositaryImpl;

public class PatientServicesMain {

	public static void main(String[] args) {
		System.out.println("Patient is in PatientServices");
		System.out.println();
		
		PatientRepositary patientRepositary=new PatientRepositaryImpl();
		
		PatientServices patientServices=new PatientServicesImpl(patientRepositary);
		
		patientServices.patientValidate("Santhu");
		System.out.println();
		
		patientServices.patientValidate(null);
		System.out.println();
		
		patientServices.patientValidate("");
		System.out.println();
		
		patientServices.patientValidate("a");
	}
}

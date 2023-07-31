package com.xworkz.assignment16.app;

public class Hospital {
	Doctor doctor = new Doctor();
	Nurse nurse = new Nurse();
	Patient patient = new Patient();
	
	public void hospital() {
		System.out.println("hospital details");
		
		this.doctor.doctorName();
		this.doctor.dutyTime();
		
		this.nurse.nurseShiftTime();
		this.nurse.nurseExperience();
		
		this.patient.patientDesece();
		this.patient.patientWard();
		
		if(doctor!=null && nurse!=null && patient!=null) {
			System.out.println("hospital points to memory");
		}else {
			System.out.println("NullPointerException");
		}
	}
}

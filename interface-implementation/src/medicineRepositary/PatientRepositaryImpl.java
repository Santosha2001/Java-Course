package medicineRepositary;

import com.xworkz.assignment35.app.repositary.patient.PatientRepositary;

public class PatientRepositaryImpl implements PatientRepositary {

	private String[] patientArray = new String[NO_PATIENT];
	int position;

	@Override
	public void patient(String patient) {
		if (this.position < NO_PATIENT) {
			this.patientArray[position] = patient;
			System.out.println(patientArray[position] + " is at index " + position);
			this.position++;
		} else {
			System.out.println("ArrayIndexOutOfBoundException");
		}

	}

}

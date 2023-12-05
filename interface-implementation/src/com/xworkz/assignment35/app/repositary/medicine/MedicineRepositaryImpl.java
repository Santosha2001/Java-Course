package com.xworkz.assignment35.app.repositary.medicine;

public class MedicineRepositaryImpl implements MedicineRepositary {

	private String[] mediceArray = new String[MEDICINE];
	int tposition;

	@Override
	public void medicenes(String medicine) {
		if (this.tposition < MEDICINE) {
			this.mediceArray[tposition] = medicine;
			System.out.println(mediceArray[tposition] + " is at index " + tposition);
			this.tposition++;
		} else {
			System.out.println("ArrayIndexOutOfBoundException");
		}

	}

}

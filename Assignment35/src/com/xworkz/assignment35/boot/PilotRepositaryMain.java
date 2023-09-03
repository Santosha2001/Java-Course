package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.pilot.PilotRepositary;
import com.xworkz.assignment35.app.repositary.pilot.PilotRepositaryImpl;

public class PilotRepositaryMain {

	public static void main(String[] args) {
		PilotRepositary pilotRepositary = new PilotRepositaryImpl();

		System.out.println("Pilot is implementing in PilotRepositaryImpl");

		pilotRepositary.pilot("Santhu");
		pilotRepositary.pilot("Sateesh");
		pilotRepositary.pilot("Sampath");
		pilotRepositary.pilot("Prashanth");
		pilotRepositary.pilot("Praveen");
		pilotRepositary.pilot("Abhinandan");
		pilotRepositary.pilot("Shreya");
		pilotRepositary.pilot("Santosh");
		pilotRepositary.pilot("Kumar");
		pilotRepositary.pilot("Harish");

		pilotRepositary.pilot("Manjunath");

	}
}

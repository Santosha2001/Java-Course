package com.xworkz.assignment35.app.services.politician;

import com.xworkz.assignment35.app.repositary.politician.PoliticianRepositary;
import com.xworkz.assignment35.app.repositary.politician.PoliticianRepositaryImpl;

public class PoliticianServicesMain {

	public static void main(String[] args) {
		System.out.println("Politician is in PoliticianServices");
		System.out.println();

		PoliticianRepositary politicianRepositary = new PoliticianRepositaryImpl();

		PoliticianServices politicianServices = new PoliticianServicesImpl(politicianRepositary);

		politicianServices.politicianValidate("Santhu");
		politicianServices.politicianValidate("amruth");
		System.out.println();

		politicianServices.politicianValidate(null);
		System.out.println();

		politicianServices.politicianValidate("");
		System.out.println();

		politicianServices.politicianValidate("s");
	}
}

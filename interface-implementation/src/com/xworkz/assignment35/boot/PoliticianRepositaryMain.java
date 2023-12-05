package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.politician.PoliticianRepositary;
import com.xworkz.assignment35.app.repositary.politician.PoliticianRepositaryImpl;

public class PoliticianRepositaryMain {
	public static void main(String[] args) {
		PoliticianRepositary politicianRepositary = new PoliticianRepositaryImpl();

		System.out.println("Politician is implementing in PoliticianRepositaryImpl");

		politicianRepositary.politician("Santhu");
		politicianRepositary.politician("Sateesh");
		politicianRepositary.politician("Sampath");
		politicianRepositary.politician("Prashanth");
		politicianRepositary.politician("Praveen");
		politicianRepositary.politician("Abhinandan");
		politicianRepositary.politician("Shreya");
		politicianRepositary.politician("Santosh");
		politicianRepositary.politician("Kumar");
		politicianRepositary.politician("Harish");

		politicianRepositary.politician("Manjunath");
	}

}

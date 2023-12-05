package com.xworkz.assignment36.boot;

import com.xworkz.assignment36.app.repositary.PincodeRepositary;
import com.xworkz.assignment36.app.repositary.PincodeRepositaryImpl;
import com.xworkz.assignment36.app.services.PincodeService;
import com.xworkz.assignment36.app.services.PincodeServiceImpl;

public class PincodeMain {

	public static void main(String[] args) {
		PincodeRepositary pincodeRepositary = new PincodeRepositaryImpl();

		PincodeService pincodeService = new PincodeServiceImpl(pincodeRepositary);

		long[] pincodes = { 583219, 577004, 577002, 577001, 0, 583219 };

		for (long l : pincodes) {
			pincodeService.pincodeValidate(l);
		}
	}
}

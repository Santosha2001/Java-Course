package com.xworkz.assignment36.boot;

import com.xworkz.assignment36.app.repositary.MobileRepositary;
import com.xworkz.assignment36.app.repositary.MobileRepositaryImpl;
import com.xworkz.assignment36.app.services.MobileService;
import com.xworkz.assignment36.app.services.MobileServiceImpl;

public class MobileNunberMain {

	public static void main(String[] args) {
		MobileRepositary mobileRepositary = new MobileRepositaryImpl();

		MobileService mobileService = new MobileServiceImpl(mobileRepositary);

		long[] numbers = { 702259020, 815201070, 984448296, 0, 702259020 };

		for (long l : numbers) {
			mobileService.numberValidate(l);
		}
	}
}

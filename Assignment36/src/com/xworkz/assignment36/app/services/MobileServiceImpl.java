package com.xworkz.assignment36.app.services;

import com.xworkz.assignment36.app.repositary.MobileRepositary;

public class MobileServiceImpl implements MobileService {

	private MobileRepositary mobileRepositary;

	public MobileServiceImpl(MobileRepositary mobileRepositary) {
		super();
		this.mobileRepositary = mobileRepositary;
	}

	@Override
	public boolean numberValidate(long number) {
		if (number != 0 && number > 100000000 && number < 999999999) {
			if (!this.mobileRepositary.isExisis(number)) {
				this.mobileRepositary.storeMobileNo(number);
				return true;
			} else {
				System.err.println("Number is already exists..");
			}
		} else {
			System.err.println("Number is not valid");
		}
		return false;
	}

}

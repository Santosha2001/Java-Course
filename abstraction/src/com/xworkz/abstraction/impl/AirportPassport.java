package com.xworkz.abstraction.impl;

import com.xworkz.abstraction.app.customer.PassportVerification;

public class AirportPassport implements PassportVerification {

	@Override
	public void varification() {
		System.out.println("Airport impliments verification");

	}

}

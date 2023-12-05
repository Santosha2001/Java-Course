package com.xworkz.abstraction.impl;

import com.xworkz.abstraction.app.customer.PassportVerification;

public class GovtPassportVerify implements PassportVerification {

	@Override
	public void varification() {
		System.out.println("Passport verification in Govt");

	}

}

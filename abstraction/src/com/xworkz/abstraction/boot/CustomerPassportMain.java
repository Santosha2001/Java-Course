package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.customer.CustomerPassport;
import com.xworkz.abstraction.app.customer.PassportVerification;
import com.xworkz.abstraction.impl.AirportPassport;
import com.xworkz.abstraction.impl.GovtPassportVerify;

public class CustomerPassportMain {

	public static void main(String[] args) {
		CustomerPassport customerPassport = new CustomerPassport();

		PassportVerification passportVerification = new AirportPassport();

		customerPassport.setPassportVerification(passportVerification);
		customerPassport.verification();

		System.out.println();

		GovtPassportVerify govtPassportVerify = new GovtPassportVerify();
		customerPassport.setGovtPassportVerify(govtPassportVerify);
		customerPassport.verificationInTightCoupling();

	}

}

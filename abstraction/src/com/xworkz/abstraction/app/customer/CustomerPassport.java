package com.xworkz.abstraction.app.customer;

import com.xworkz.abstraction.impl.GovtPassportVerify;

public class CustomerPassport {

	private PassportVerification passportVerification; // loose coupling

	private GovtPassportVerify govtPassportVerify; // tight coupling

	public void verification() {
		System.out.println("Customer passport verification");
		this.passportVerification.varification();
	}

	public void setPassportVerification(PassportVerification passportVerification) {
		this.passportVerification = passportVerification;
	}

	// tight coupling
	public void verificationInTightCoupling() {
		System.out.println("Customer passport verification in tight coupling");
		this.govtPassportVerify.varification();
	}

	public void setGovtPassportVerify(GovtPassportVerify govtPassportVerify) {
		this.govtPassportVerify = govtPassportVerify;
	}
}

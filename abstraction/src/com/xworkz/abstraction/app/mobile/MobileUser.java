package com.xworkz.abstraction.app.mobile;

import com.xworkz.abstraction.impl.SmartMobile;

public class MobileUser {

	private Mobile mobile; // loose coupling
	private SmartMobile mobile2; // tight coupling

	public void makeCall() {
		System.out.println("Make call using mobile in user");
		this.mobile.makeCall();
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public void makeCallInTightCoupling() {
		System.out.println("Make call using smart mobile");
		this.mobile2.makeCall();
	}

	public void setMobile2(SmartMobile mobile2) {
		this.mobile2 = mobile2;
	}

}

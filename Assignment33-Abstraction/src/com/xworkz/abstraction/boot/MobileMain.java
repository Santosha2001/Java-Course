package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.mobile.Mobile;
import com.xworkz.abstraction.app.mobile.MobileUser;
import com.xworkz.abstraction.impl.BasicMobile;
import com.xworkz.abstraction.impl.SmartMobile;

public class MobileMain {

	public static void main(String[] args) {
		MobileUser mobileUser = new MobileUser();
		Mobile mobile = new BasicMobile();

		mobileUser.setMobile(mobile);
		mobileUser.makeCall();

		System.out.println();

		// tight coupling
		SmartMobile mobile2 = new SmartMobile();

		mobileUser.setMobile2(mobile2);
		mobileUser.makeCallInTightCoupling();

	}

}

package com.xworkz.abstraction.impl;

import com.xworkz.abstraction.app.mobile.Mobile;

public class BasicMobile implements Mobile {

	@Override
	public void makeCall() {
		System.out.println("Make call using basic mobile");

	}

}
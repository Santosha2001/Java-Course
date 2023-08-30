package com.xworkz.abstraction.impl;

import com.xworkz.abstraction.app.browser.Internet;

public class Wifi implements Internet {

	@Override
	public void connect() {
		System.out.println("Wifi connecting to internet");

	}

}

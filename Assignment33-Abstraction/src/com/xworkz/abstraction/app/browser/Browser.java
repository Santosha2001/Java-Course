package com.xworkz.abstraction.app.browser;

import com.xworkz.abstraction.impl.Wifi;

public class Browser {

	private Internet internet; // loose coupling
	private Wifi wifi = new Wifi(); // tight coupling

	public void connect() {
		System.out.println("Browser uses Internet");
		this.internet.connect();
	}

	public void setInternet(Internet internet) {
		this.internet = internet;
		System.out.println("Internet: " + internet);
	}

	public void connectMethodInTightCoupling() {
		System.out.println("Wifi instantiation using tight coupling");
		this.wifi.connect();
	}

	public void setWifi(Wifi wifi) {
		this.wifi = wifi;
		System.out.println("Tight coupling: " + wifi);
	}
}

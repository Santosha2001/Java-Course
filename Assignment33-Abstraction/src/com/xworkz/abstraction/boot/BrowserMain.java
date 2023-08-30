package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.browser.Browser;
import com.xworkz.abstraction.app.browser.Internet;
import com.xworkz.abstraction.impl.Router;
import com.xworkz.abstraction.impl.Wifi;

public class BrowserMain {

	public static void main(String[] args) {
		Internet internet = new Router();

		Browser browser = new Browser();

		browser.setInternet(internet);
		browser.connect();
		System.out.println();
		
		// tight coupling
		Wifi wifi=new Wifi();
		Browser browser2=new Browser();
		
		browser2.setWifi(wifi);
		browser2.connectMethodInTightCoupling();
	}
}

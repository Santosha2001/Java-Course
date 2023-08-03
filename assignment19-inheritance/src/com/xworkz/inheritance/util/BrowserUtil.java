package com.xworkz.inheritance.util;

import com.xworkz.inheritance.app.browser.*;
//import com.xworkz.inheritance.app.browser.Chrome;

public class BrowserUtil extends Browser {
	
	public void browserUtil(Browser browser) {
		Browser browser2 = new Browser();
		browser2.browser();
		
		if(browser instanceof Chrome) {
			Browser browser3 = new Chrome();
//			browser3.browser();
			
			Chrome chrome = (Chrome)browser3;
			chrome.chrome();
		}
		
		if(browser instanceof Firefox) {
			Browser browser4 = new Firefox();
			Firefox firefox = (Firefox)browser4;
			firefox.fireFox();
		}
	}
}

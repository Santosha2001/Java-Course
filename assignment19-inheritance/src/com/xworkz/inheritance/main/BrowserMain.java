package com.xworkz.inheritance.main;

import com.xworkz.inheritance.app.browser.*;
import com.xworkz.inheritance.util.BrowserUtil;

public class BrowserMain {

	public static void main(String[] args) {
		
		Browser browser = new Browser();
		System.out.println(browser.browserUsedFor);
		
		Chrome chrome = new Chrome();
		System.out.println(chrome.chromeVersion);
		
		Firefox firefox = new Firefox();
		System.out.println(firefox.fireFoxVersion);
		
		BrowserUtil browserUtil = new BrowserUtil();
		browserUtil.browserUtil(browser);
		browserUtil.browserUtil(chrome);
		browserUtil.browserUtil(firefox);
	}

}

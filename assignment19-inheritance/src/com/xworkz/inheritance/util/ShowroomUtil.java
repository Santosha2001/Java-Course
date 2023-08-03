package com.xworkz.inheritance.util;

import com.xworkz.inheritance.app.showroom.MobileShowroom;
import com.xworkz.inheritance.app.showroom.Showroom;
import com.xworkz.inheritance.app.showroom.WatechShowroom;

public class ShowroomUtil extends Showroom {

	
	public void showroomUtil(Showroom showroom) {
		Showroom showroom2 = new Showroom();
		showroom2.showroomTime();
		
		if(showroom instanceof WatechShowroom) {
			Showroom showroom3 = new WatechShowroom();
			showroom3.showroomTime();
			
			WatechShowroom watechShowroom = (WatechShowroom)showroom3;
			watechShowroom.watchName();
		}
		
		if(showroom instanceof MobileShowroom) {
			Showroom showroom4 = new MobileShowroom();
			showroom4.showroomTime();
			
			MobileShowroom mobileShowroom = (MobileShowroom)showroom4;
			mobileShowroom.mobilePrice();
		}
	}
}

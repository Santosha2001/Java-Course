package com.xworkz.inheritance.main;

import com.xworkz.inheritance.app.showroom.MobileShowroom;
import com.xworkz.inheritance.app.showroom.Showroom;
import com.xworkz.inheritance.app.showroom.WatechShowroom;
import com.xworkz.inheritance.util.ShowroomUtil;

public class ShowroomMain {

	public static void main(String[] args) {
		Showroom showroom = new Showroom();
		System.out.println(showroom.openTiming);

		ShowroomUtil showroomUtil = new ShowroomUtil();
		showroomUtil.showroomUtil(showroom);

		WatechShowroom showroom2 = new WatechShowroom();
		showroomUtil.showroomUtil(showroom2);
		System.out.println(showroom2.watchName);

		MobileShowroom mobileShowroom = new MobileShowroom();
		showroomUtil.showroomUtil(mobileShowroom);
		System.out.println(mobileShowroom.price);
	}

}

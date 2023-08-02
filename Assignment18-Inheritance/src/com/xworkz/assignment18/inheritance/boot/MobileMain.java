package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app5.*;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.mobileMethod();
		System.out.println("-------------------");

		SmartPhone smart = new SmartPhone();
		Mobile smart1 = new SmartPhone();
		smart.smartMetod();
		smart.mobileMethod();
		System.out.println("-------------------");

		Android android = new Android();
		Mobile android2 = new Android();
		android.androidMetod();
		android.mobileMethod();
		System.out.println("-------------------");

		FlipPhone flip = new FlipPhone();
		Mobile flip1 = new FlipPhone();
		flip.mobileMethod();
		flip.flipPhoneMetod();
		System.out.println("-------------------");

		SliderPhone phone = new SliderPhone();
		Mobile phone2 = new SliderPhone();
		phone.mobileMethod();
		phone.sliderPhoneMetod();
		System.out.println("-------------------");

	}
}

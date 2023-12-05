package com.xworkz.assignment32.boot;

import com.xworkz.assignment32.app.Charger;
import com.xworkz.assignment32.app.Mobile;

public class MobileMain {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("mi", 10000, 13, 64);

		Charger charger = new Charger();

		mobile.setCharger(charger);

	}
}

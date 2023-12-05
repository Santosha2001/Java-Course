package com.xworkz.assignment23.boot;

import com.xworkz.assignment23.app.bakery.Bakery;
import com.xworkz.assignment23.app.bakery.BakeryShop;


public class BakeryMain {
	public static void main(String[] args) {
		Bakery bakery = new Bakery();
		bakery.barkey();
		bakery.bakery(20);
		bakery.bakery(9);
		bakery.bakery("Varier");
		bakery.bakery(10,11);
		bakery.bakery("Varier", "Davanagere");
		
		System.out.println("\n");
		
		Bakery bakery2 = new BakeryShop();
		bakery2.barkey();
		bakery2.bakery(30);
		bakery2.bakery(8);
		bakery2.bakery("Nalanda");
		bakery2.bakery(10,11);
		bakery2.bakery("Nalanda", "Davanagere");
	}
}

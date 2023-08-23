package com.xworkz.assignment30.interfaces.app.impl;

import com.xworkz.assignment30.interfaces.app.Metro;

public class MetroImpl implements Metro {

	@Override
	public void metroName(String name) {
		System.out.println("Name of the metro: " + name);

	}

	@Override
	public String metroLineColor(String color) {
		System.out.println("Color of the metro line: " + color);
		return color;
	}

	@Override
	public boolean aceptOnlinePayment(boolean payment, int pricePerHead) {
		System.out.println("Online payment: " + payment);
		System.out.println("Price per head: " + pricePerHead);
		return true;
	}

}

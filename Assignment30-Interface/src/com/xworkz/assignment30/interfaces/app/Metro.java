package com.xworkz.assignment30.interfaces.app;

public interface Metro {
	public abstract void metroName(String name);

	public abstract String metroLineColor(String color);

	public abstract boolean aceptOnlinePayment(boolean payment, int pricePerHead);
}

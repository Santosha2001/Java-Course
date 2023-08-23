package com.xworkz.assignment30.interfaces.boot;

import com.xworkz.assignment30.interfaces.app.Metro;
import com.xworkz.assignment30.interfaces.app.impl.MetroImpl;

public class MetroMain {
	public static void main(String[] args) {
		Metro metro = new MetroImpl();

		metro.metroName("Rajajinagar");

		metro.aceptOnlinePayment(true, 35);

		metro.metroLineColor("Green");
	}
}

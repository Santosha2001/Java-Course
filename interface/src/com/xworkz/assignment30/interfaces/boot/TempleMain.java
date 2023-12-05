package com.xworkz.assignment30.interfaces.boot;

import com.xworkz.assignment30.interfaces.app.Temple;
import com.xworkz.assignment30.interfaces.app.impl.TempleImpl;

public class TempleMain {
	public static void main(String[] args) {
		Temple temple = new TempleImpl();

		temple.location("Rajajinagar");

		temple.openTime(7);

		temple.templeName("Isckon temple");
	}
}

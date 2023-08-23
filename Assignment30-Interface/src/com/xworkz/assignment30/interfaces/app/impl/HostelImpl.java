package com.xworkz.assignment30.interfaces.app.impl;

import com.xworkz.assignment30.interfaces.app.Hostel;

public class HostelImpl implements Hostel {

	@Override
	public boolean hostelRooms(int number) {
		System.out.println("Number of rooms: " + number);
		return false;
	}

	@Override
	public String hostelName(String name) {
		System.out.println("Hostel name: " + name);
		return name;
	}

	@Override
	public double closeTime() {
		System.out.println("Close time: 10");
		return 10;
	}

}

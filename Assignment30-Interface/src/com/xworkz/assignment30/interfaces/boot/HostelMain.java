package com.xworkz.assignment30.interfaces.boot;

import com.xworkz.assignment30.interfaces.app.Hostel;
import com.xworkz.assignment30.interfaces.app.impl.HostelImpl;

public class HostelMain {
	public static void main(String[] args) {
		Hostel hostel = new HostelImpl();

		hostel.closeTime();
		hostel.hostelName("Kaveri");
		hostel.hostelRooms(19);
	}
}

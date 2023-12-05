package com.xworkz.assignment32.boot;

import com.xworkz.assignment32.app.Bus;
import com.xworkz.assignment32.app.Passenger;

public class BusMain {

	public static void main(String[] args) {
		Bus bus = new Bus();
		Passenger passenger = new Passenger();

		bus.setBusNumber(187);
		bus.setPassenger(passenger);

		bus.busName();
	}
}

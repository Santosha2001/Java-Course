package com.xworkz.abstraction.app.car;

import com.xworkz.abstraction.impl.TwoWeeler;

public class Car {

	private Vehicle vehicle;
	private TwoWeeler twoWeeler;

	public void run() {
		System.out.println("Run method in Car");
		this.vehicle.run();
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void runTwoWeeler() {
		System.out.println("Run method in Two weeler");
		this.twoWeeler.run();
	}
	
	public void setTwoWeeler(TwoWeeler twoWeeler) {
		this.twoWeeler = twoWeeler;
	}
}

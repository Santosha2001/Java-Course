package com.xworkz.assignment25.abstrct.boot;

import com.xworkz.assignment25.abstrct.app.car.Car;
import com.xworkz.assignment25.abstrct.app.car.Sedan;

public class CarMain {
	public static void main(String[] args) {
		Car sedan = new Sedan();
		sedan.displayInfo();
		sedan.start();
		sedan.accelerate();
		sedan.brake();
		sedan.stop();

		System.out.println();

		sedan.honk();
		sedan.turnLightsOff();
		sedan.turnLightsOn();
		sedan.refuel();
	}
}

package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.car.Car;
import com.xworkz.abstraction.app.car.Vehicle;
import com.xworkz.abstraction.impl.Fourweeler;
import com.xworkz.abstraction.impl.TwoWeeler;

public class CarMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Fourweeler();

		Car car = new Car();

		car.setVehicle(vehicle);
		car.run();

		System.out.println();

		TwoWeeler twoWeeler = new TwoWeeler();
		car.setTwoWeeler(twoWeeler);

		car.runTwoWeeler();

	}

}

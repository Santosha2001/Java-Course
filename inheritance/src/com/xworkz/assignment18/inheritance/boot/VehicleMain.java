package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app2.*;

public class VehicleMain {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.vehicleMethod();
		System.out.println("----------------------");

		Car car = new Car();
		Vehicle vehicle1 = new Car();
		car.vehicleMethod();
		car.carMethod();
		System.out.println("----------------------");

		Bike bike = new Bike();
		Vehicle vehicle2 = new Bike();
		bike.vehicleMethod();
		bike.bikeMethod();
		System.out.println("----------------------");

		Bicycle bicycle = new Bicycle();
		Vehicle vehicle3 = new Bicycle();
		bicycle.vehicleMethod();
		bicycle.bicycleMethod();
		System.out.println("----------------------");

		Airplane airplane = new Airplane();
		Vehicle vehicle4 = new Airplane();
		airplane.vehicleMethod();
		airplane.airplaneMethod();
		System.out.println("----------------------");

		Ship ship = new Ship();
		Vehicle vehicle5 = new Ship();
		ship.vehicleMethod();
		ship.vehicleMethod();
		System.out.println("----------------------");

		Scooty scooty = new Scooty();
		Vehicle vehicle6 = new Scooty();
		scooty.vehicleMethod();
		scooty.scootyMethod();
		System.out.println("----------------------");

		Auto auto = new Auto();
		Vehicle vehicle7 = new Auto();
		auto.autoMethod();
		auto.vehicleMethod();
	}
}

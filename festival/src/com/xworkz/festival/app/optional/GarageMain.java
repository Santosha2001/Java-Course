package com.xworkz.festival.app.optional;

import java.util.Optional;

public class GarageMain {

	public static void main(String[] args) {
		Optional<String> op = Garage.getName("Santhu", "Rathod");

		if (op.isPresent()) {
			System.out.println("Name are");
			String st = op.get();
			System.out.println(st);
		} else {
			String st = op.get();
			System.err.println(st);
		}
	}
}

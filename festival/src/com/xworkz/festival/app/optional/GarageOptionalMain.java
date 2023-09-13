package com.xworkz.festival.app.optional;

import java.util.Optional;

public class GarageOptionalMain {

	public static void main(String[] args) {

		Optional<String> opt = Garage.getAddrs("Bengalore");

		if (opt.isPresent()) {
			System.out.println("Address is " + opt.get());
		} else {
			System.err.println("IS empty " + opt.get());
		}
		
	}
}

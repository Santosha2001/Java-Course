package com.xworkz.festival.app.optional;

import java.util.Optional;

public class Garage {

	public static Optional<String> getName(String fname, String lname) {

		if (fname != null && lname != null) {
			System.out.println("fname and lname are not empty");
			return Optional.of(fname + " " + lname);

		} else {
			System.out.println("fname and lname are null");
			return Optional.empty();
		}

	}

	public static Optional<String> getAddrs(String addrs) {

		if (addrs != null) {
			System.out.println("Address is--> " + addrs);
			return Optional.of(addrs);
		} else {
			System.err.println("Address is empty");
			return Optional.empty();
		}

	}
}

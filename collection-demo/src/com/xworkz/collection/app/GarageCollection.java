package com.xworkz.collection.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class GarageCollection {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>(
				Arrays.asList("Piller", "Spanner", "Hammer", "Saw", "Screw Driver", "Jack", "Cutter"));

		Collection<String> collection2 = new ArrayList<String>(Arrays.asList("Saw", "Cutter"));
		Collection<String> collection3 = new ArrayList<String>(Arrays.asList("Spanner", "Screw"));

		Collection<String> collection4 = new ArrayList<String>(Arrays.asList("Flash Light", "Wrench"));

		boolean b = collection.containsAll(collection4);
		System.err.println(b);

		System.out.println(collection2);

		boolean d = collection.removeAll(collection4);
		System.out.println("boolean " + d);

		boolean e = collection.removeAll(collection3);
		System.err.println("boolean check--> " + e);

		boolean c = collection3.removeAll(collection3);
		System.out.println(c);
		
		System.out.println(collection);
	}
}

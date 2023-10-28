package com.xworkz.collections.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Cities {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>(Arrays.asList("Bengalore", "Davnagere", "Mandya",
				"Mysore", "Hospete", "Bellary", "Hubli", "Durga", "Haveri", "Mangalore", "Moodbidre", "Kodagu",
				"Kudlogi", "H B halli", "Hadagali", "Kotturu", "hampi", "Kolara", "Udupi", "Manipal", "Karkala"));

		Collection<String> collection2 = new ArrayList<String>(
				Arrays.asList("Bengalore", "Davnagere", "Mandya", "Mysore", "Hospete", "Bellary", "Hubli", "Durga",
						"Haveri", "Mangalore", "Moodbidre", "Kodagu", "Kudlogi", "H B halli", "Hadagali", "Kotturu"));

		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println();

		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		collection.add("Shivamogga");
		System.out.println(collection.size());

		collection.remove("Bellary");
		System.out.println(collection.size());

		System.out.println();

		for (Iterator<String> iterator2 = collection.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}

		boolean b = collection.contains("Bengalore");
		boolean c = collection.containsAll(collection2);

		System.out.println();
		System.out.println(b);
		System.out.println(c);

		System.out.println();
		collection2.removeAll(collection2);
		System.out.println(collection2.size());
		
		System.out.println(collection.size());

	}
}

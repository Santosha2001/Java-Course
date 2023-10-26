package com.xworkz.collections.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class States {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>(Arrays.asList("Karnataka", "Kerala", "Tamil nadu",
				"Andra pradesh", "Maharastra", "Goa", "Telangana", "Dehli", "Mijoram", "Jammu", "Uttarakhand",
				"Manipur", "West bengal", "Meghalaya", "madya pradesh", "Punjab", "Chattisgarh", "Gujarath", "Tripura",
				"Jarkhand", "Rajastan", "Bihar", "Odisha"));

		Collection<String> collection2 = new ArrayList<String>(Arrays.asList("Karnataka", "Kerala", "Tamil nadu",
				"Andra pradesh", "Maharastra", "Goa", "Telangana", "Dehli", "Mijoram", "Jammu", "Uttarakhand",
				"Manipur", "West bengal", "Meghalaya", "madya pradesh", "Punjab", "Rajastan", "Bihar"));

		System.out.println(collection);

		System.out.println(collection.size());

//		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
		Iterator<String> iterator = collection.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println(collection.size());
		System.out.println();

		collection.remove("Goa");
		System.out.println(collection.size());

		Iterator<String> iterator2 = collection.iterator();
		while (iterator2.hasNext()) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}
		System.out.println();

		boolean b = collection.contains("Karnataka");
		boolean c = collection.contains("Sikkim");

		System.out.println(b);
		System.err.println(c);

		boolean d = collection.containsAll(collection2);
		System.err.println(d);

		boolean e = collection.containsAll(collection);
		System.err.println(e);

		System.out.println(collection2.size());
		collection2.removeAll(collection2);
		System.out.println(collection2.size());

	}
}

package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ActorsMain {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>(Arrays.asList("Puneeth", "Raj Kumar", "Darshan", "Sudeep",
				"Shivaraj Kumar", "Yash", "Prem", "Ganesh", "Sharan", "Sri murali"));

		for (String string : collection) {
			System.out.println(string);
		}

		collection.add("Vijay");

		System.out.println("Size " + collection.size());

		boolean b = collection.contains("Vijay");
		System.out.println("B " + b);
		System.out.println();

		Collection<String> collection2 = new ArrayList<String>(Arrays.asList("Vajra muni", "Lokesh", "SRK"));

		for (String string : collection2) {
			System.out.println(string);
		}
		System.out.println(collection2.size());
		System.out.println();

		boolean c = collection.containsAll(collection2);
		System.err.println("c " + c);
		System.out.println();

		Collection<String> collection3 = new ArrayList<String>(Arrays.asList("Amir khan", "Srujan", "Abishek"));

		for (String string : collection3) {
			System.out.println(string);
		}

		boolean d = collection3.remove("Srujan");
		System.out.println("d " + d);
		System.out.println(collection3);

		System.out.println();
		collection.addAll(collection3);
		System.out.println(collection);

		boolean e = collection.removeAll(collection3);
		System.out.println("e " + e);

		System.out.println();
		System.out.println(collection);

		collection3.stream().filter((actor) -> actor.startsWith("Pu")).forEach(ac -> System.out.println(ac));
	}
}

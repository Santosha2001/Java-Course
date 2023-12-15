package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NameAndAadharMap {

	public static void main(String[] args) {
		Map<Long, String> nameAadharPair = new HashMap<Long, String>();

		System.out.println("Before adding: " + nameAadharPair.isEmpty());
		nameAadharPair.put(256378497363L, "Jack");
		nameAadharPair.put(256378452063L, "Smith");
		nameAadharPair.put(926378497363L, "David");
		nameAadharPair.put(257926397363L, "Mithel");
		nameAadharPair.put(256892607363L, "Steve");
		nameAadharPair.put(263583447363L, "Jack");
		nameAadharPair.put(297248227363L, "Smith");
		nameAadharPair.put(257524897363L, "Jacob");
		nameAadharPair.put(256382587363L, "Jack Sparrow");
		nameAadharPair.put(297258297363L, "William");
		nameAadharPair.put(282582937363L, "Henrry");

		System.out.println("size " + nameAadharPair.size());
		System.out.println("After adding: " + nameAadharPair.isEmpty());

		Set<Long> keySets = nameAadharPair.keySet();
		System.out.println("Keys");
		keySets.forEach(a -> System.out.println(a));

		Collection<String> valuesCollections = nameAadharPair.values();
		System.out.println("\nValues collections");
		valuesCollections.forEach(a -> System.out.println(a));

		Set<Entry<Long, String>> entries = nameAadharPair.entrySet();
		System.out.println("Entries(Keys value) pair");
		entries.forEach(a -> System.out.println(a));

		boolean b = nameAadharPair.containsKey(282582937363L);
		System.out.println("Key present: " + b);

		Map<Long, String> nameAadharPair1 = new HashMap<Long, String>();
		nameAadharPair1.put(123456789101L, "Modi");

		boolean c = nameAadharPair.containsKey(nameAadharPair1);
		System.out.println("Key present checking: " + c);

	}
}

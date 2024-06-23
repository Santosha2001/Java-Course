package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		// default capacity is 16
		HashSet hashSet = new HashSet();

		hashSet.add(100);
		hashSet.add("Java");
		hashSet.add(10.80);
		hashSet.add(true);
		hashSet.add(null);

		System.out.println(hashSet);

		// remove element
		hashSet.remove(null);

		System.out.println("\nafter removing element: " + hashSet);

		System.out.println("\nobject contains: " + hashSet.contains("Java"));
		System.out.println("\nobject contains: " + hashSet.contains("Python"));

		System.out.println("is hashset empty: " + hashSet.isEmpty() + "\n");

		// reading elements
		// 1) for each
		for (Object object : hashSet) {
			System.out.println(object);
		}
		System.out.println();

		// 2) iterator
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

	}
}

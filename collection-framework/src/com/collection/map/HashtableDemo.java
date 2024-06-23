package com.collection.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

/**
 * Implementation of the Map Initial capacity is 11 and load factor is 0.75 null
 * is not allowed as a key or value.
 */
public class HashtableDemo {

	public static void main(String[] args) {

		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

		hashtable.put(100, "java");
		hashtable.put(101, "c");
		hashtable.put(102, "python");
		hashtable.put(103, "sql");
		hashtable.put(104, "c#");
		// hashtable.put(105, null);
		// hashtable.put(null, "c++);

		System.out.println(hashtable);

		System.out.println(hashtable.get(103)); // sql

		Object remove = hashtable.remove(103);
		System.out.println("removed object: " + remove);

		System.out.println(hashtable);

		// contains key
		System.out.println("contains key: " + hashtable.containsKey(101));
		System.out.println("contains key: " + hashtable.containsKey(103));

		// contains value
		System.out.println("contains value: " + hashtable.containsValue("java"));
		System.out.println("contains value: " + hashtable.containsValue("c"));

		// is map empty -> isEmpty
		System.out.println("map empty: " + hashtable.isEmpty());

		Set<Integer> keySet = hashtable.keySet();
		System.out.println("key set: " + keySet);

		System.out.println();

		Collection<String> values = hashtable.values();
		System.out.println("value set: " + values);
		for (Object object : values) {
			System.out.println(object);
		}
		System.out.println();
	}
}

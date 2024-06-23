package com.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		// adding element
		map.put(100, "java");
		map.put(101, "python");
		map.put(102, "c#");
		map.put(103, "c++");

		/*
		 * if trying to duplicate key with different value then existing value will be
		 * replaced
		 * 
		 */
		map.put(103, "ruby");

		System.out.println(map);

		// get value from the key
		System.out.println(map.get(102));

		Object remove = map.remove(103);
		System.out.println("removed object: " + remove);

		System.out.println(map);

		// contains key
		System.out.println("contains key: " + map.containsKey(101));
		System.out.println("contains key: " + map.containsKey(103));

		// contains value
		System.out.println("contains value: " + map.containsValue("java"));
		System.out.println("contains value: " + map.containsValue("c"));

		// is map empty -> isEmpty
		System.out.println("map empty: " + map.isEmpty());

		Set<Integer> keySet = map.keySet();
		System.out.println("key set: " + keySet);

		for (Object object : keySet) {
			System.out.println(object);
		}
		System.out.println();

		Collection<String> values = map.values();
		System.out.println("value set: " + values);
		for (Object object : values) {
			System.out.println(object);
		}
		System.out.println();

		// Entry methods
		// entrySet
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println("entry set: " + entrySet);

		for (Object object : entrySet) {
			System.out.println(object);
		}
		System.out.println();

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

		// iterator
		Set<Entry<Integer, String>> entrySet2 = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet2.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();

			System.out.println(entry.getKey() + "   " + entry.getValue());
		}

	}
}

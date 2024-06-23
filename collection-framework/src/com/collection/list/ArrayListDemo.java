package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("santhu");
		list.add("Ubdt");
		list.add("davanagere");
		list.add("hospete");

		// add element with index.
		list.add(1, "college");

		// contains()
		boolean contains = list.contains("santhu");

		System.out.println(list);
		System.out.println(contains); // true
		System.out.println(list.contains("book")); // false

		// list iteration
		// 1) for loop
		// get() is to get the element
		System.out.println("\nfor loop.");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 2) for each
		System.out.println("******%nfor each loop********");
		for (String string : list) {
			System.out.println(string);
		}

		// 3) forEach()
		System.out.println("\n******forEach()********");
		list.forEach(System.out::println);

		// 4) iterator
		System.out.println("\n******iterator*******");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		// element can removed using remove(index) or remove(value)
		// list.remove(0);
		list.remove("santhu");
		System.out.println("\nlist after remove index 0: " + list);

		// list.clear();
		// System.out.println("list clear: "+list);
	}
}

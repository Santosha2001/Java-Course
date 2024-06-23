package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		linkedList.add("welcome");
		linkedList.add(12);
		linkedList.add('A');
		linkedList.add(23.5);
		linkedList.add(true);
		linkedList.add(null);

		System.out.println(linkedList);
		System.out.println(linkedList.size());

		// to remove the element
		linkedList.remove(2);
		System.out.println("\nlist after removing element: " + linkedList);

		// insert element at specific index
		linkedList.add(3, 'B');
		System.out.println("after inserting item: " + linkedList);

		System.out.println("element at index 3: " + linkedList.get(3));

		// replace value at specific index
		linkedList.set(3, "Java");
		System.out.println(linkedList);

		System.out.println(linkedList.contains("java"));
		System.out.println(linkedList.contains("Java"));

		// iterating with for loop
		System.out.println("\n**********for loop**********");
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}

		// for each loop
		System.out.println("\n**********for each loop**********");
		for (Object object : linkedList) {
			System.out.println(object);
		}

		// iterator
		System.out.println("\n**********iterator**********");
		Iterator iterator = linkedList.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}

		// addFirst,addLast, removeFirst, removeLast, getFirst, getLast
		System.out.println("\naddFirst,addLast, removeFirst, removeLast, getFirst, getLast");

		linkedList.addFirst("santhu");

		linkedList.addLast("Rathod");

		// linkedList.removeFirst();
		// linkedList.removeLast();

		System.out.println(linkedList);

		System.out.println("getFirst: " + linkedList.getFirst());
		System.out.println("getlast: " + linkedList.getLast());

	}
}

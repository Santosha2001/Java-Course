package com.xworkz.collection.app;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> str = new ArrayList<String>();

		str.add("Santhu");
		str.add("Amruth");
		str.add("Bindhu");

		System.out.println(str.size());

		Iterator<String> ite = str.iterator();

		while (ite.hasNext()) {
			String string = ite.next();
			System.out.println(string);
		}
		System.out.println();

//		for (Iterator iterator = str.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}

		str.remove("Santhu"); // to remove item

		Iterator<String> iterator = str.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		boolean b = str.contains("Bindhu");
		System.out.println(b);

		boolean c = str.containsAll(str);
		System.out.println(c);

		str.removeAll(str);
		System.out.println(str);

	}
}

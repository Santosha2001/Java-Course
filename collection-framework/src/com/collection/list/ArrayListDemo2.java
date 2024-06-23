package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		String[] emails = { "aa@gmail.com", "dd@gmail.com", "ee@gmail.com", "bb@gmail.com", "cc@gmail.com" };

		for (String string : emails) {

			System.out.println(string);
		}
		System.out.println();

		// converting array into ArrayList
		List<String> list = new ArrayList<String>(Arrays.asList(emails));
		System.out.println(list);

		// sorting an list
		Collections.sort(list);
		System.out.println("list after sorting: " + list);

		// sorting in reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("list in reverse order: " + list);

		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);

		}

	}
}

package com.xworkz.collections.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IndianStates {

	public static void main(String[] args) {

//		Collection<String> List = new ArrayList<String>(
//				Arrays.asList("Mizoram", "Manipur", "Megalaya", "Punjab", "Hariyana", "Jarkhand"));
//		ArrayList<String> List1 = new ArrayList<String>(
//				Arrays.asList("Mizoram", "Manipur", "Megalaya", "Punjab", "Hariyana", "Jarkhand"));

		Collection<String> abc = Stream.of("Mizoram", "Manipur", "Megalaya", "Punjab", "Hariyana", "Jarkhand")
				.collect(Collectors.toList());

//		collection.stream().forEach(e -> System.err.println(e));
		
//		Iterator<String> iterator=collection.iterator();
		
//		for (int i=0;i<List1.size();i++) {
//			System.out.println(List1.get(0));
//		}
//		
		
		
//		while (iterator.hasNext()) {
//			String string = iterator.next();
//			
//		}

//		System.out.println(abc.toString());

//		System.out.println("the size of the collection is " + collection.size());

//		Iterator<String> iterator = collection.iterator();

//		while (iterator.hasNext()) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}
		
		System.out.println(abc);
		System.out.println(abc.size());
	}
}

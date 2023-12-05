package com.xworkz.collection.app.hashcode.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collection.app.hashcode.dto.FireDTO;

public class FireMain {

	public static void main(String[] args) {

		FireDTO fire1 = new FireDTO("Forest Fire A", "Forest A", 80, false);
		FireDTO fire2 = new FireDTO("House Fire B", "Street B", 60, true);
		FireDTO fire3 = new FireDTO("Wildfire C", "Wilderness C", 90, false);
		FireDTO fire4 = new FireDTO("Industrial Fire D", "Industrial Area D", 75, true);
		FireDTO fire5 = new FireDTO("Brush Fire E", "Grassland E", 70, false);
		FireDTO fire6 = new FireDTO("Apartment Fire F", "Street F", 55, true);
		FireDTO fire7 = new FireDTO("Campfire G", "Campsite G", 40, true);
		FireDTO fire8 = new FireDTO("Campfire G", "Campsite G", 40, true);

		List<FireDTO> collection = new LinkedList<FireDTO>();
		collection.add(fire1);
		collection.add(fire2);
		collection.add(fire3);
		collection.add(fire4);
		collection.add(fire5);
		collection.add(fire6);
		collection.add(fire7);
		collection.add(fire8);
		System.out.println(fire8.hashCode());
		System.out.println(fire7.hashCode());

		FireDTO fire9 = new FireDTO("Home fire", "Campsite G", 34, true);

		collection.add(fire9);

//		collection.add(1, fire9);

		List<FireDTO> collection2 = new LinkedList<FireDTO>();
		FireDTO fire10 = new FireDTO("Gas fire", "Campsite G", 44, true);
		collection2.add(fire10);

		collection.addAll(0, collection2);

		System.err.println(collection.subList(2, 5));

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
		System.out.println();

		List<String> dtos = new LinkedList<String>();
		dtos.add("Biscut");
		dtos.add("Board");
		dtos.add("Water-melon");
		dtos.add("Jelly");
		dtos.add("Candy");

		dtos.add(5, "Apple");
		dtos.add(3, "Mango");
		System.out.println();

		System.err.println(dtos.get(3));

		System.out.println("removing element: " + dtos.remove(4));

		dtos.set(2, "Clothes");

		System.err.println("sub list: " + dtos.subList(0, 4));

		System.out.println();
		ListIterator<String> a = dtos.listIterator();
		while (a.hasPrevious()) {
			String string = (String) a.previous();
			System.out.println(string);
//			a.set("Banana");
		}

		System.out.println();
		dtos.forEach(b -> System.out.println(b));

	}
}

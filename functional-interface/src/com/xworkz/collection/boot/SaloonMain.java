package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.SaloonItemDTO;

public class SaloonMain {

	public static void main(String[] args) {

		Collection<SaloonItemDTO> collection = new ArrayList<SaloonItemDTO>();
		collection.add(new SaloonItemDTO(1, "New saloon", 100, "Hair cut", true));
		collection.add(new SaloonItemDTO(2, "Bombay saloon", 150, "Head Massage", true));
		collection.add(new SaloonItemDTO(3, "Ladies Barber", 500, "Hair cut", false));
		collection.add(new SaloonItemDTO(4, "Sciser point", 120, "Hair cut", true));
		collection.add(new SaloonItemDTO(5, "Syle look", 150, "Hair cut", true));

		for (SaloonItemDTO saloonItemDTO : collection) {
			System.out.println(saloonItemDTO);
		}
		System.out.println("collection size " + collection.size());

		SaloonItemDTO dto = new SaloonItemDTO(6, "Ladies beautique", 400, "Fsce wash", false);
		collection.add(dto);
		boolean a = collection.contains(dto);
		System.out.println("dto contain " + a);

		// creating new collection
		Collection<SaloonItemDTO> collection2 = new ArrayList<SaloonItemDTO>();
		collection2.add(new SaloonItemDTO(11, "Sylish hair cut", 200, "Hair cut", true));
		collection2.add(new SaloonItemDTO(12, "New look", 210, "Hair cut", true));
		System.out.println("\ncollection2 size " + collection2.size());

		// checking collection contains collection2 before adding
		boolean b = collection.containsAll(collection2);
		System.err.println("Before adding " + b);

		// checking collection contains collection2 after adding
		collection.addAll(collection2);
		boolean c = collection.containsAll(collection2);
		System.out.println("After adding " + c);

		System.out.println("collection size " + collection.size());

		// collection3
		Collection<SaloonItemDTO> collection3 = new ArrayList<SaloonItemDTO>();
		collection3.add(new SaloonItemDTO(21, "Ladies beautique", 400, "Fsce wash", false));
		collection3.add(new SaloonItemDTO(21, "Sciser point", 120, "Hair cut", true));
		collection3.add(new SaloonItemDTO(21, "Syle look", 150, "Hair cut", true));

		SaloonItemDTO dto2 = new SaloonItemDTO(2, "Bombay saloon", 150, "Head Massage", true);

		// removing dto2 from collection3 before adding
		boolean d = collection3.remove(dto2);
		System.err.println("\nRemoving dto2 from collection3 before adding " + d);

		// after adding dto2 to collection3
		collection3.add(dto2);
		boolean e = collection3.remove(dto2);
		System.out.println("\nRemoving dto2 from collection3 after adding " + e);

		// collection4
		Collection<SaloonItemDTO> collection4 = new ArrayList<SaloonItemDTO>();

		collection4.add(new SaloonItemDTO(41, "Hair cut saloon", 120, "Hair cut", true));
		collection4.add(new SaloonItemDTO(41, "Barber saloon", 150, "Hair cut", true));

		System.out.println("\ncollection4 size " + collection4.size());

		// adding collectin4 to collection3
		collection3.addAll(collection4);
		System.out.println("\ncollection3 size " + collection3.size());

		boolean f = collection3.removeAll(collection4);
		System.out.println("Removing all " + f);
	}
}

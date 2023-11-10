package com.xworkz.collection.app.hashcode.boot;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

import com.xworkz.collection.app.hashcode.dto.KnifeDTO;

public class KnifeMain {

	public static void main(String[] args) {
		KnifeDTO knife1 = new KnifeDTO("Pocket Knife", "Stainless Steel", 3.5, true);
		KnifeDTO knife2 = new KnifeDTO("Chef's Knife", "High Carbon Steel", 8.0, false);
		KnifeDTO knife3 = new KnifeDTO("Hunting Knife", "Damascus Steel", 5.5, true);
		KnifeDTO knife4 = new KnifeDTO("Bread Knife", "Serrated Stainless Steel", 7.0, false);
		KnifeDTO knife5 = new KnifeDTO("Throwing Knife", "High Carbon Steel", 6.0, true);
		KnifeDTO knife6 = new KnifeDTO("Throwing Knife", "High Carbon Steel", 6.0, true);
		KnifeDTO knife7 = new KnifeDTO("Cleaver", "Carbon Steel", 6.5, false);

		Collection<KnifeDTO> collection = new HashSet<KnifeDTO>();

		collection.add(knife1);
		collection.add(knife2);
		collection.add(knife3);
		collection.add(knife4);
		collection.add(knife5);
		collection.add(knife6);
		collection.add(knife7);

		System.out.println(collection.stream().sorted().count());
		collection.stream().collect(Collectors.toSet()).forEach(a -> System.out.println(a));
	}
}

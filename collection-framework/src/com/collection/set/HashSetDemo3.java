package com.collection.set;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);

		System.out.println("hashSet: " + hashSet);

		HashSet<Integer> hashSet2 = new HashSet<Integer>();

		hashSet2.add(3);
		hashSet2.add(4);
		hashSet2.add(5);
		hashSet2.add(5);

		System.out.println("hashSet2: " + hashSet2);

		// union of sets
		hashSet.addAll(hashSet2);
		System.out.println("Union: " + hashSet);

		// intersection of sets
//		hashSet.retainAll(hashSet2);
//		System.out.println("Intersection: "+hashSet);

		// difference between two sets
//		hashSet.removeAll(hashSet2);
//		System.out.println("Difference: "+hashSet);

		System.out.println("contains: " + hashSet.containsAll(hashSet2));

	}
}

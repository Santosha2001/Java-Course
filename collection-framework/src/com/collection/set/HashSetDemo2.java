package com.collection.set;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(2);
		hashSet.add(4);
		hashSet.add(6);

		System.out.println(hashSet);

		HashSet<Integer> hashSet2 = new HashSet<Integer>();

		// addAll()
		hashSet2.addAll(hashSet);
		hashSet2.add(10);

		System.out.println(hashSet2);

		hashSet2.removeAll(hashSet);
		System.out.println(hashSet2);

	}
}

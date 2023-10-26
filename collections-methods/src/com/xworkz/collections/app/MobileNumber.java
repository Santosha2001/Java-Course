package com.xworkz.collections.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		Collection<Long> collection = new ArrayList<Long>(Arrays.asList(7022590204L, 9019770673L, 8152010705L,
				984482963L, 9986687398L, 9986687323L, 9986127398L, 9886687398L, 9986680998L, 9786687398L, 9986587398L,
				9986683398L, 7022590201L, 7022589204L, 7028590204L, 7022599004L, 7024390204L, 7095590204L));

		Collection<Long> collection2 = new ArrayList<Long>(Arrays.asList(7022590204L, 9019770673L, 8152010705L,
				984482963L, 9986687398L, 9986687323L, 9986127398L, 9886687398L, 9986680998L, 9786687398L, 9986587398L,
				9986683398L, 7022590201L, 7022589204L, 7028590204L, 7022599004L, 7024390204L, 7095590204L));

		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println(collection2);
		System.out.println(collection.size());

		Iterator<Long> iterator = collection.iterator();
		while (iterator.hasNext()) {
			Long long1 = (Long) iterator.next();
			System.out.println(long1);
		}
		System.out.println();

		collection.remove(9986127398L);
		System.out.println(collection.size());

		System.out.println();

		boolean b = collection.contains(7022590204L);
		boolean c = collection.containsAll(collection2);

		System.out.println(b);
		System.out.println(c);

		System.out.println();

		collection2.removeAll(collection2);
		System.out.println(collection2.size());
	}
}

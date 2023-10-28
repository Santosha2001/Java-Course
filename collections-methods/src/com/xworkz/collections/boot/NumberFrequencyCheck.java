package com.xworkz.collections.boot;

public class NumberFrequencyCheck {

	public static void main(String[] args) {
		int[] originalArray = { 2, 3, 2, 6, 3, 5, 6, 7, 10 };
		int[] copyArray = new int[originalArray.length];

		int visited = -1;

		for (int i = 0; i < originalArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < originalArray.length; j++) {

				if (originalArray[i] == originalArray[j]) {
					count++;
					copyArray[j] = visited;
				}
			}
			if (copyArray[i] != visited) {
				copyArray[i] = count;
			}
		}

		for (int i = 0; i < copyArray.length; i++) {
			if (copyArray[i] != visited) {
				System.out.println("Number " + originalArray[i] + " repeted: " + copyArray[i] + " times.");
			}
		}

	}
}

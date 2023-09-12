package com.xworkz.curdoperationdemo.app.repositary;

public class GroceryRepositaryImpl implements GroceryRepositary {

	private String[] items = new String[TOTAL_SIZE];

	private int position = 0;

	@Override
	public void groceryItems(String item) {

		if (this.position < TOTAL_SIZE) {
			this.items[position] = item;
			System.out.println(items[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBOundException");
		}

	}

}

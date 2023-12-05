package com.xworkz.assignment35.app.services.grocery;

import com.xworkz.assignment35.app.repositary.grocery.GroceryRepositary;

public class GroceryServicesImpl implements GroceryServices {

	private GroceryRepositary groceryRepositary;

	public GroceryServicesImpl(GroceryRepositary groceryRepositary) {
		super();
		this.groceryRepositary = groceryRepositary;
	}

	@Override
	public boolean groceryValidate(String groceryItem) {
		if (groceryItem != null && groceryItem.length() > 2 && !groceryItem.isEmpty()) {
			System.out.println("Item is valid");
			this.groceryRepositary.groceryItems(groceryItem);
		} else {
			System.out.println("Item is not valid");
		}
		return false;
	}

}

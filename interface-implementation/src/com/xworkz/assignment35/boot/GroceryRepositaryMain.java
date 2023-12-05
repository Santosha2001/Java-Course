package com.xworkz.assignment35.boot;

import com.xworkz.assignment35.app.repositary.grocery.GroceryRepositary;
import com.xworkz.assignment35.app.repositary.grocery.GroceryRepositaryIpl;

public class GroceryRepositaryMain {

	public static void main(String[] args) {

		GroceryRepositary groceryRepositary = new GroceryRepositaryIpl();

		System.out.println("Grocery items implimenting in groceryrepositaryimpl class");

		groceryRepositary.groceryItems("Onion");
		groceryRepositary.groceryItems("Tomato");
		groceryRepositary.groceryItems("Ginger");
		groceryRepositary.groceryItems("Garlic");
		groceryRepositary.groceryItems("Potato");
		groceryRepositary.groceryItems("Beans");
		groceryRepositary.groceryItems("Carrot");
		groceryRepositary.groceryItems("Rice");
		groceryRepositary.groceryItems("Turmaric");
		groceryRepositary.groceryItems("Weat");

		// ArrayIndexOutOfBOundException
		groceryRepositary.groceryItems("Banana");
	}

}

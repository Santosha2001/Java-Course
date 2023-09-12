package com.xworkz.curdoperationdemo.boot;

import com.xworkz.curdoperationdemo.app.repositary.GroceryRepositary;
import com.xworkz.curdoperationdemo.app.repositary.GroceryRepositaryImpl;

public class GroceryMain {

	public static void main(String[] args) {
		GroceryRepositary groceryRepositary = new GroceryRepositaryImpl();
		
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

		//ArrayIndexOutOfBOundException
		groceryRepositary.groceryItems("Banana");

	}

}

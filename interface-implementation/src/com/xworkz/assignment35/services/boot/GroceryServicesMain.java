package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.grocery.GroceryRepositary;
import com.xworkz.assignment35.app.repositary.grocery.GroceryRepositaryIpl;
import com.xworkz.assignment35.app.services.grocery.GroceryServices;
import com.xworkz.assignment35.app.services.grocery.GroceryServicesImpl;

public class GroceryServicesMain {

	public static void main(String[] args) {
		System.out.println("Grocry items in GroceryServices");
		System.out.println();

		GroceryRepositary groceryRepositary = new GroceryRepositaryIpl();

		GroceryServices groceryServices = new GroceryServicesImpl(groceryRepositary);

		groceryServices.groceryValidate("Tooth paste");
		groceryServices.groceryValidate("Utensiles");
		System.out.println();
		
		groceryServices.groceryValidate(null);
		System.out.println();
		
		groceryServices.groceryValidate("");
		System.out.println();

		groceryServices.groceryValidate("a");
	}
}

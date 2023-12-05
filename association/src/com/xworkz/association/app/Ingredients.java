package com.xworkz.association.app;

public class Ingredients {
	public String nameOfIngredients;
	public double quantity;
	public double cost;

	public Ingredients(String nameOfIngredients, double quantity, double cost) {
		// TODO Auto-generated constructor stub
		this.nameOfIngredients = nameOfIngredients;
		this.quantity = quantity;
		this.cost = cost;
	}

	public void ingredientsMethod() {
		System.out.println("nameOfIngredients: " + nameOfIngredients);
		System.out.println("quantity: " + quantity);
		System.out.println("cost: " + cost);
	}
}

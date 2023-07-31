package com.xworkz.association.app;

public class ToothPaste {
	public String pasteName;
	public String pasteBrand;
	public Company company;
	public Ingredients[] ingredients;

	public ToothPaste(String pasteName, String pasteBrand, Company company, Ingredients[] ingredients) {
		this.pasteName = pasteName;
		this.pasteBrand = pasteBrand;
		this.company = company;
		this.ingredients = ingredients;
	}

	public void toothPasteMethod() {
		System.out.println("pasteName: " + pasteName);
		System.out.println("pasteBrand: " + pasteBrand);

		company.companyMethod();

		for (int index = 0; index < ingredients.length; index++) {

			Ingredients ingredi = ingredients[index];
			ingredi.ingredientsMethod();

		}
	}
}

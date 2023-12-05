package com.xworkz.association.boot;

import com.xworkz.association.app.Company;
import com.xworkz.association.app.Ingredients;
import com.xworkz.association.app.ToothPaste;

public class ToothPasteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameOfPaste = "Colgate";
		String brandOfPaste = "Indian Colgate";

		Company company = new Company("Colgate", "santhu", "India");

		Ingredients ingredientsSalt = new Ingredients("Salt", 20, 35);
		Ingredients ingredientsGarlic = new Ingredients("Garlic", 25, 45);
		Ingredients ingredientsGinger = new Ingredients("Ginger", 30, 55);
		Ingredients ingredientsGlysarin = new Ingredients("Glysarin", 35, 65);
		Ingredients ingredientsCalcium = new Ingredients("Calcium", 40, 75);

		Ingredients[] ingredients = { ingredientsSalt, ingredientsGarlic, ingredientsGinger, ingredientsGlysarin,
				ingredientsCalcium };

		ToothPaste paste = new ToothPaste(nameOfPaste, brandOfPaste, company, ingredients);
		paste.toothPasteMethod();
	}

}

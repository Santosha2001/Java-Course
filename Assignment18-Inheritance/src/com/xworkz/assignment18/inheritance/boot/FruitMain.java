package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app7.*;

public class FruitMain {
	public static void main(String[] args) {
		Fruit fruit=new Fruit();
		fruit.name="Mango";
		System.out.println("Fruit Name : "+fruit.name);
		System.out.println("Quantity : "+fruit.fruitMethod(10));
		System.out.println("-------------------------");
		
		Cherry cherry=new Cherry();
		Fruit cherry1=new Cherry();
		System.out.println("Scientific Name of Cherry : "+cherry.scificName);
		System.out.println("Quantity : "+cherry.fruitMethod(20));
		System.out.println("-------------------------");
		
		Kiwi kiwi=new Kiwi();
		Fruit kiwi2=new Kiwi();
		System.out.println("Scientific Name of kiwi : "+kiwi.scificName);
		System.out.println("Quantity : "+kiwi.fruitMethod(30));
		System.out.println("-------------------------");
	}
}

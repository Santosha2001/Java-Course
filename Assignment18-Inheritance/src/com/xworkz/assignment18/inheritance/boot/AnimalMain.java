package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app.*;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalMethod();
		System.out.println("--------------------------");

		Animal dog2=new Dog();
		Dog dog=new Dog();
		dog.animalMethod();
		dog.dogMethod();
		
		System.out.println("--------------------------");
		Animal cat1=new Cat();
		Cat cat = new Cat();
		cat.animalMethod();
		cat.catMethod();
		
		System.out.println("--------------------------");
		Animal lion1=new Lion();
		Lion lion=new Lion();
		lion.animalMethod();
		lion.lionMethod();
		
		System.out.println("--------------------------");
		Animal tiger1=new Tiger();
		Tiger tiger = new Tiger();
		tiger.tigerMethod();
		tiger.animalMethod();
		
		System.out.println("--------------------------");
		Animal cow1=new Animal();
		Cow cow=new Cow();
		cow.animalMethod();
		cow.cowMethod();
		
		System.out.println("--------------------------");
		Animal cheetha1=new Cheeta();
		Cheeta cheetha=new Cheeta();
		cheetha.animalMethod();
		cheetha.cheethaMethod();
		
		System.out.println("--------------------------");
		Animal deer=new Deer();
		Deer deer1 = new Deer();
		deer.animalMethod();
		deer1.deerMethod();
		
		System.out.println("--------------------------");
		Animal bear1=new Bear();
		Bear bear = new Bear();
		bear.bearMethod();
		bear.animalMethod();
		
	}

}

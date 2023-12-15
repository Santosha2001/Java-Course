package com.xworkz.gddiscussion.configuration;

import org.springframework.stereotype.Component;

@Component
public class Temple {
	private Generator generator;
	private Title title;
	private Elevetar elevetar;

	public Temple(Generator generator, Title title, Elevetar elevetar) {
		super();
		System.out.println("Temple created...");
		this.generator = generator;
		this.title = title;
		this.elevetar = elevetar;
		System.out.println("generator: " + this.generator);
		System.out.println("title: " + this.title);
		System.out.println("elevetar: " + this.elevetar);
	}

}

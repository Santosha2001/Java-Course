package com.xworkz.gddiscussion.configuration;

import org.springframework.stereotype.Component;

@Component
public class Radio {
	private Generator generator;

	public Radio(Generator generator) {
		super();
		System.out.println("Radio");
		this.generator = generator;
		System.out.println("generator: " + this.generator);
	}

}

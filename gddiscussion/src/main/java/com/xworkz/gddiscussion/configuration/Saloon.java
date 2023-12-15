package com.xworkz.gddiscussion.configuration;

import org.springframework.stereotype.Component;

@Component
public class Saloon {
	private Ajama ajama;

	public Saloon(Ajama ajama) {
		super();
		System.out.println("Saloon created..");
		this.ajama = ajama;
		System.out.println("ajama: " + this.ajama);
	}

}

package com.xworkz.gddiscussion.configuration;

import org.springframework.stereotype.Component;

@Component
public class Microwave {
	private Radio radio;
	private Bulb bulb;

	public Microwave(Radio radio, Bulb bulb) {
		super();
		System.out.println("Microwave");
		this.radio = radio;
		this.bulb = bulb;
		System.out.println("radio: " + this.radio);
		System.out.println("bulb: " + this.bulb);
	}

}

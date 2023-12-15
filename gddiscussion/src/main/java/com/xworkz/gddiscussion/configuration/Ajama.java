package com.xworkz.gddiscussion.configuration;

import org.springframework.stereotype.Component;

@Component
public class Ajama {
	private Scissor sci;

	public Ajama(Scissor sci) {
		super();
		System.out.println("Ajama created..");
		this.sci = sci;
		System.out.println("scissor: " + this.sci);
	}

}

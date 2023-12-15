package com.xworkz.gddiscussion.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Stamp {

	private Bottle bottle;

	@Autowired
	public Stamp(Bottle bottle) {
		super();
		System.out.println("Stamp created..");
		this.bottle = bottle;
		System.out.println("Bottle: " + this.bottle);
	}

}

package com.xworkz.gddiscussion.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Title {

	private Perfume perfume;

	@Autowired
	public Title(Perfume perfume) {
		super();
		System.out.println("Title");
		this.perfume = perfume;
		System.out.println("perfume: " + this.perfume);
	}

}

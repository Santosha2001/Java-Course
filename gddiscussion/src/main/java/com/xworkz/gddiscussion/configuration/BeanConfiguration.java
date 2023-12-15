package com.xworkz.gddiscussion.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.gddiscussion")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("BeanConfiguration cvreated..");
	}

	@Bean
	public Bottle bottle() {
		return new Bottle();
	}

	@Bean
	public Bulb bulb() {
		return new Bulb();
	}

	@Bean
	public Perfume perfume() {
		return new Perfume();
	}

	@Bean
	public Generator generator() {
		return new Generator();
	}

	@Bean
	public Elevetar elevetar(Perfume perfume) {
		return new Elevetar();
	}

	@Bean
	public Scissor sci() {
		return new Scissor();
	}

	@Bean
	public Scissor blad() {
		return new Scissor();
	}
}

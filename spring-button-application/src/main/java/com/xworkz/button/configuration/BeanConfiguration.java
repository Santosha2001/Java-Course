package com.xworkz.button.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.button")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("BeanConfiguration");
	}
}

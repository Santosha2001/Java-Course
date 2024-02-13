package com.amazon.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.amazon")
public class BeanConfiguration {

	public BeanConfiguration() {
		System.out.println("BeanConfiguration created");
	}
}

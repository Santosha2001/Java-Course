package com.xworkz.songApplication.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.songApplication")
@EnableWebMvc
public class Beanconfiguration {
	public Beanconfiguration() {
		System.out.println("Beanconfiguration");
	}

	@Bean
	public ViewResolver viewResolver() {
		ViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}
}

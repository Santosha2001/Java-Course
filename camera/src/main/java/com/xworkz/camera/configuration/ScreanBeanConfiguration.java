package com.xworkz.camera.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.camera")
public class ScreanBeanConfiguration {
	public ScreanBeanConfiguration() {
		System.out.println("ScreanBeanConfiguration created..");
	}
}

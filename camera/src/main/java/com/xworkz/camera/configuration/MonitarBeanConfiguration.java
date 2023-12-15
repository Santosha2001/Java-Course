package com.xworkz.camera.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.camera")
public class MonitarBeanConfiguration {
	public MonitarBeanConfiguration() {
		System.out.println("MonitarBeanConfiguration created..");
	}

	@Bean
	public CricketBeanConfigurtion beanConfigurtion() {
		return new CricketBeanConfigurtion();
	}

	@Bean
	public FootBallBeanConfiguration ballBeanConfiguration() {
		return new FootBallBeanConfiguration();
	}

	@Bean
	public KoKoBeanConfiguration koKoBeanConfiguration() {
		return new KoKoBeanConfiguration();
	}

	@Bean
	public ChessBeanConfiguration chessBeanConfiguration() {
		return new ChessBeanConfiguration();
	}

	@Bean
	public CarromBeanConfiguration carromBeanConfiguration() {
		return new CarromBeanConfiguration();
	}

	@Bean
	public HockeyBeanConfiguration hockeyBeanConfiguration() {
		return new HockeyBeanConfiguration();
	}

	@Bean
	public KabbadiBeanConfiguration kabbadiBeanConfiguration() {
		return new KabbadiBeanConfiguration();
	}

	@Bean
	public VolleyBallBeanConfiguration volleyBallBeanConfiguration() {
		return new VolleyBallBeanConfiguration();
	}
}

package com.santosh.bean.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyBeanConfiguration {

	@Bean
	// @Scope(value = "singleton") //default scope
	@Scope(value = "prototype")
	public MyBean myBean() {
		return new MyBean();
	}

}

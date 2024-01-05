package com.xworkz.student.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.student")
@EnableWebMvc
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("BeanConfiguration");
	}

	/*
	 * // if the method name is different, you must define the bean name manually
	 * like this :
	 * 
	 * @Bean(name = "multipartResolver") public MultipartResolver
	 * createMultipartResolver() { return new StandardServletMultipartResolver(); }
	 */

	// Bean name must be "multipartResolver", by default Spring uses method name as
	// bean name.
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}

	@Bean
	public ViewResolver viewResolver() {
		ViewResolver resolver = new InternalResourceViewResolver("/", ".jsp");
		return resolver;
	}

}

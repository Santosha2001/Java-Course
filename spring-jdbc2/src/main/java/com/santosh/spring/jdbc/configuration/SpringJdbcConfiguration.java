package com.santosh.spring.jdbc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.santosh.spring.jdbc")
public class SpringJdbcConfiguration {

	@Bean
	public DriverManagerDataSource datasource() {
		DriverManagerDataSource source = new DriverManagerDataSource("jdbc:mysql://localhost:3306/springjdbc", "root",
				"Santhu@7022");
		return source;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate(datasource());
		return template;
	}

}

package com.santosh.hibernate.configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.santosh.hibernate")
public class BeanConfiguration {
	public BeanConfiguration() {
		System.out.println("BeanConfiguration created..");
	}

	// DataSource object using DriverManagerDataSource
	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		source.setUsername("root");
		source.setPassword("Santhu@7022");
		return source;
	}

	Properties additionalProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57InnoDBDialect");
		return properties;
	}

	// SessionFactory using LocalSessionFactoryBean
	@Bean
	public LocalSessionFactoryBean sessionFactoryBean() {
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(dataSource());
		bean.setPackagesToScan(new String[] { "com.santosh.hibernate" });
		bean.setHibernateProperties(additionalProperties());
		return bean;
	}

	@Bean(name = "hibernate")
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate template = new HibernateTemplate();
		template.setSessionFactory((SessionFactory) sessionFactoryBean());
		return template;
	}

}

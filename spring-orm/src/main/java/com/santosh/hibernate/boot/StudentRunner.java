package com.santosh.hibernate.boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.santosh.hibernate.configuration.BeanConfiguration;
import com.santosh.hibernate.entities.StudentEntity;
import com.santosh.hibernate.repository.StudentRepository;

public class StudentRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		StudentEntity studentEntity = new StudentEntity(1, "Santosh", 22, 7022590204L, "Hadagali");

		studentRepository.insert(studentEntity);

		context.close();
	}
}

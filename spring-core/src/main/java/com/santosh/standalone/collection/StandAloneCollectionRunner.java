package com.santosh.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StandAloneCollectionRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santosh/standalone/collection/standAloneCollectionConfig.xml");

		Person person = context.getBean("person", Person.class);

		System.out.println(person);
		System.out.println(person.getName());
		System.out.println(person.getFriends());
		System.out.println(person.getSubjectMarks());

	}
}

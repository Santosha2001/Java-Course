package com.santosh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentRunner {

	public static void main(String[] args) {

		/*
		 * ApplicationContext: is the container to create beans. for specifying one
		 * bean. ApplicationContext context = new
		 * ClassPathXmlApplicationContext("configuration.xml");
		 * 
		 * if multiple beans are present then string[] is used
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "com/santosh/config/configuration.xml", "com/santosh/config/configuration1.xml" });

		Object bean1 = context.getBean("student");
		Object bean2 = context.getBean("student2");
		Object bean3 = context.getBean("student3");

		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);

		boolean containsBean = context.containsBean("student");
		System.out.println("containsBean: " + containsBean); // true

		boolean containsBeanDefinition = context.containsBeanDefinition("student");
		System.out.println("containsBeanDefinition: " + containsBeanDefinition); // true

	}
}

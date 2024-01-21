package com.santosh.sterotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BakeryComponentRunner {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/santosh/sterotype/annotations/sterotypeAnnotationConfig.xml");

		BakeryComponent component = context.getBean("bakeryComponent", BakeryComponent.class);

		System.out.println(component);
		System.out.println(component.getClass());
		System.out.println(component.getCakeName());
		System.out.println(component.getCakeShape());
		System.out.println(component.getBranches());
		System.out.println(component.getBranches().getClass().getName());
		System.out.println("________________________________________________________________");

		BakeryComponent component2 = context.getBean("bakeryComponent", BakeryComponent.class);
		System.out.println(component2);

		System.out.println("________________________________________________________________");

		System.out.println(component.hashCode());
		System.out.println(component2.hashCode());
	}
}

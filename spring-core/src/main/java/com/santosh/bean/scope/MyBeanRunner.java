package com.santosh.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBeanRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(MyBeanConfiguration.class);
		context.refresh();

		// 1st bean
		MyBean bean = context.getBean(MyBean.class);
		System.out.println(bean);
		System.out.println("Bean1 hashcode: " + bean.hashCode());
		System.out.println("______________________________");

		// 2nd bean
		MyBean bean2 = context.getBean(MyBean.class);
		System.out.println(bean2);
		System.out.println("Bean1 hashcode: " + bean2.hashCode());
		System.out.println("_______________________________");
		
		System.out.println((bean == bean2) ? "Pointing same memory" : "Beans are different");
		context.close();
	}
}

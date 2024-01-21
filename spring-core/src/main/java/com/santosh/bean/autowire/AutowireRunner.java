package com.santosh.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/santosh/bean/autowire/beanAutowire.xml");

		Employee bean = (Employee) applicationContext.getBean("employee");

		Address bean1 = (Address) applicationContext.getBean("address");

		System.out.println(bean);
		System.out.println("Address: " + bean1);

	}
}

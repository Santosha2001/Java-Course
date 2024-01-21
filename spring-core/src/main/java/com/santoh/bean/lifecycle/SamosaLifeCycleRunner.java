package com.santoh.bean.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaLifeCycleRunner {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/santoh/bean/lifecycle/beanLifeCycle.xml");

		applicationContext.registerShutdownHook();
		SamosaBean bean = (SamosaBean) applicationContext.getBean("samosa");

		System.out.println(bean);
	}
}

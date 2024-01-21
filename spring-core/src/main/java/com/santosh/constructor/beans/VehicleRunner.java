package com.santosh.constructor.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/santosh/constructor/beans/constroctorconfig.xml");

		VehicleBean bean = (VehicleBean) applicationContext.getBean("vehicle");
		System.out.println(bean);
	}
}

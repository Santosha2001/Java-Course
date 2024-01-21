package com.santosh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.santosh.beans.CollectionOfStudentBean;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/santosh/config/configurationBean.xml");

		CollectionOfStudentBean bean = (CollectionOfStudentBean) context.getBean("studentWithCollection");

		System.out.println(bean);

	}
}

package com.xworkz.exception.boot;

import javax.naming.NamingException;

import com.xworkz.exception.app.event.ExceptionsDemo;

public class ExceptionDemoMain {

	public static void main(String[] args) {
		ExceptionsDemo demo = new ExceptionsDemo();
		try {
			demo.dasara();
			Class.forName("com.just.not.work");
		} catch (NamingException e) {
			e.printStackTrace();
			System.out.println("NamingException handling " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException handling");
//			e.printStackTrace();
		}

//		demo.dipawali();

//		demo.dasara();
	}
}

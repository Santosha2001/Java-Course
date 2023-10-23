package com.xworkz.exception.app.event;

import javax.naming.NamingException;

import com.xworkz.exceptions.WorkRUntimeException;

public class ExceptionsDemo {

//	checked exception
	public void dasara() throws NamingException {
		System.out.println("Dasara fest goining on....");
		throw new NamingException();
	}

//	unchecked exception
	public void dipawali() {
		System.out.println("Dipawali yet to come...");
//		throw new ClassCastException();

		throw new WorkRUntimeException();
	}

}

package com.xworkz.exception.app;

import org.w3c.dom.ranges.RangeException;

public class SantoshException {

	public void run() {
		System.out.println("day is running..");
		this.getName();
	}

	public void getName() {
		System.out.println("today is saturday..");
		this.village();
	}

	public void village() {
		System.out.println("hadagali..");
		this.district();
	}

	public void district() {
		System.out.println("hostepe..");
		try {
			this.sleep();
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("exception event is handled");
		}
		System.out.println("after handling");
	}

	public void sleep() {
		System.out.println("Sleeping..");

		throw new IndexOutOfBoundsException();
	}

}

package com.xworkz.assignment22.overriding.app.ticket;

public class BlackTicket extends Ticket {
	
	@Override
	public void ticket() {
		System.out.println("ticket in derived class");
	}
}

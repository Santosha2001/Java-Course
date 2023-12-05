package com.xworkz.assignment24.boot;

import com.xworkz.assignme24.encapsulation.app.phonepay.PhonePay;

public class PhonePayMain {
	public static void main(String[] args) {
		PhonePay pay = new PhonePay();
		pay.setSize(3);
		System.out.println(pay.getSize());

		pay.setUserName("Santhu");
		System.out.println(pay.getUserName());

		pay.setUpi("Santhu@upi");
		System.out.println(pay.getUpi());
		pay.setTax(3333);
		System.out.println(pay.getTax());

		pay.setSafe(true);
		System.out.println(pay.isSafe());

		pay.setTxnId(3123);
		System.out.println(pay.getTxnId());

		pay.setSize(3);
		System.out.println(pay.getSize());

		pay.setSenderName("suhas");
		System.out.println(pay.getSenderName());

		pay.setReceiverName("Santhu");
		System.out.println(pay.getReceiverName());

		pay.setTime(2);
		System.out.println(pay.getTime());

		pay.setFast(true);
		System.out.println(pay.isFast());

		pay.setCreditCard(true);
		System.out.println(pay.isCreditCard());

		pay.setAmount(3000);
		System.out.println(pay.getAmount());

		pay.setBank("SBI");
		System.out.println(pay.getBank());

		pay.setLocation("Dvg");
		System.out.println(pay.getLocation());

	}
}

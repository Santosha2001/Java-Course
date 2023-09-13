package com.xworkz.festival.app.impl;

import com.xworkz.festival.app.rule.RTORule;
import com.xworkz.festival.app.rule.TaxPayerRule;

public class Citizen implements RTORule, TaxPayerRule {

	@Override
	public double payRoadTax() {
		System.out.println("Citizen rules for payingn tax");
		return 0;
	}

	@Override
	public void noticePeriod() {
		System.out.println("notice period for the citizen to the tax");

	}

	@Override
	public void payAmount() {
		System.out.println("amount citizen have to have");

	}
	
	@Override
	public int payCess() {
		System.out.println("invoking payCess in citizen");
		RTORule.super.payCess();
		RTORule.run();
//		RTORule.super.payRoadTax();
		return RTORule.super.payCess();
	}
	

}






















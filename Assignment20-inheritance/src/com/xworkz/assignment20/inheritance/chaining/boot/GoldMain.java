package com.xworkz.assignment20.inheritance.chaining.boot;

import com.xworkz.assignment20.inheritance.app.gold.Silver;

public class GoldMain {
	public static void main(String[] args) {
		Silver silver = new Silver();
		System.out.println("No argumnets");
		System.out.println(silver.cost);
		System.out.println(silver.extractFrom);
		System.out.println(silver.goldItem);
		System.out.println(silver.pureGold);
		
		Silver silver2 = new Silver("Chain",45090,24,"miniral");
		System.out.println("Parameter argumnets");
		System.out.println(silver2.cost);
		System.out.println(silver2.extractFrom);
		System.out.println(silver2.goldItem);
		System.out.println(silver2.pureGold);
	}
}

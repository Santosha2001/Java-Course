package com.xworkz.assignment20.inheritance.app.gold;

public class Silver extends Gold {
	public Silver() {
		// TODO Auto-generated constructor stub
		super("Ring", 40000, 24, "miniral");
	}
	
	public Silver(String goldItem,double cost,int pureGold,String extractFrom) {
		super(goldItem, cost, pureGold, extractFrom);
	}
}

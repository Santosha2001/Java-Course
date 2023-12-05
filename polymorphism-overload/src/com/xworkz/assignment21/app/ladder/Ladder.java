package com.xworkz.assignment21.app.ladder;

public class Ladder {
	public void ladder() {
		System.out.println("no parameter");
	}
	
	public void ladder(String type) {
		System.out.println("type: " + type);
		this.ladder();
	}
	
	public void ladder(int cost) {
		System.out.println("cost: " + cost);
	}
	
	public void ladder(String type,int cost) {
		System.out.println("type: " + type);
		System.out.println("cost: " + cost);
		this.ladder(cost);
		this.ladder(type);
	}
}

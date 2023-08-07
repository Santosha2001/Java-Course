package com.xworkz.assignment21.app.mouse;

public class Mouse {
	public void mouse() {
		System.out.println("no parameter");
		this.mouse(true, 300);
	}
	
	public void mouse(boolean wired) {
		System.out.println("wired: " + wired);
		this.mouse(200);
		this.mouse(wired, 20);
	}
	
	public void mouse(int cost) {
		System.out.println("cost: " + cost);
	}
	
	public void mouse(boolean wired,int cost) {
		System.out.println("wired: " + wired);
		System.out.println("cost: " + cost);
	}
}

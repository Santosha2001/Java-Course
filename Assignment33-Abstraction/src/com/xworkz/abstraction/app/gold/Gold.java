package com.xworkz.abstraction.app.gold;

import com.xworkz.abstraction.impl.RoleGold;

public class Gold {

	private Juwellary juwellary;

	private RoleGold gold;

	public void juwellary() {
		System.out.println("Gold juwellary Gold class");
		this.juwellary.juwels();
	}

	public void setJuwellary(Juwellary juwellary) {
		this.juwellary = juwellary;
	}

	public void juwellaryRoleGold() {
		System.out.println("Role Gold juwellary in Gold class");
		this.gold.juwels();
	}

	public void setGold(RoleGold gold) {
		this.gold = gold;
	}

}

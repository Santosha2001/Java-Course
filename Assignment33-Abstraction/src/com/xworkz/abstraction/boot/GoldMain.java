package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.gold.Gold;
import com.xworkz.abstraction.impl.RoleGold;

public class GoldMain {

	public static void main(String[] args) {
		RoleGold gold = new RoleGold();

		Gold gold2 = new Gold();

		gold2.setJuwellary(gold);
		gold2.juwellary();
		
		System.out.println();

		RoleGold gold3 = new RoleGold();

		gold2.setGold(gold3);

		gold2.juwellaryRoleGold();

	}

}

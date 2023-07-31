package com.xworkz.assignment16.app;

public class PowerBank {
public PowerBankBattery battery = new PowerBankBattery();
	
	public void ports() {
		System.out.println("power bank");
		
		this.battery.batterName();
		this.battery.batteryWolts();
		
		if(this.battery != null) {
			System.out.println("battery points to memory");
		}
		else {
			System.out.println("NullPointerEception");
		}
	}
}

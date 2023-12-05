package com.xworkz.assignment25.abstrct.app.atmmachine;

public class SavingsATM extends ATMMachine {
	@Override
	public void displayBalance() {
		System.out.println("Savings Account Balance: $");
	}

	@Override
	public void deposit(int amount) {

		System.out.println("$" + amount + " deposited into Savings Account.");
	}

	@Override
	public void withdraw(int amount) {
		System.out.println("total amount withdrawn");
	}

	@Override
	public void changePIN(int newPIN) {
		System.out.println("Savings Account PIN changed to " + newPIN);
	}

	@Override
	public void displayOptions() {
		System.out.println("Options available: Deposit, Withdraw, Change PIN");
	}
}

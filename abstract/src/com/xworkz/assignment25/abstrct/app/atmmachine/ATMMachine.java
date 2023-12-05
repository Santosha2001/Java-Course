package com.xworkz.assignment25.abstrct.app.atmmachine;

public abstract class ATMMachine {
	public abstract void displayBalance();

	public abstract void deposit(int amount);

	public abstract void withdraw(int amount);

	public abstract void changePIN(int newPIN);

	public abstract void displayOptions();

	public void showWelcomeMessage() {
		System.out.println("Welcome to the ATM Machine!");
	}

	public void withdrawDate() {
		System.out.println("withdraw date in ATM Machine!");
	}

	public void cardlessWithdraw() {
		System.out.println("cardless withdraw in ATM Machine!");
	}

	public void cardlessDeposit() {
		System.out.println("cardless deposit in ATM Machine!");
	}

	public void showGoodbyeMessage() {
		System.out.println("Thank you for using the ATM Machine. Goodbye!");
	}
}

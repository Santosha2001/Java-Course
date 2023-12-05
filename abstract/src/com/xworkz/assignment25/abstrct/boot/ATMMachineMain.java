package com.xworkz.assignment25.abstrct.boot;

import com.xworkz.assignment25.abstrct.app.atmmachine.ATMMachine;
import com.xworkz.assignment25.abstrct.app.atmmachine.SavingsATM;

public class ATMMachineMain {
	public static void main(String[] args) {
		ATMMachine savingsATM = new SavingsATM();
		savingsATM.showWelcomeMessage();
		savingsATM.displayOptions();
		savingsATM.displayBalance();
		savingsATM.deposit(500);
		savingsATM.withdraw(200);
		savingsATM.changePIN(1234);
		savingsATM.showGoodbyeMessage();

		System.out.println();

		savingsATM.showWelcomeMessage();
		savingsATM.withdrawDate();
		savingsATM.cardlessWithdraw();
		savingsATM.cardlessDeposit();
		savingsATM.showGoodbyeMessage();
	}
}

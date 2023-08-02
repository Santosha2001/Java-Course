package com.xworkz.assignment18.inheritance.boot;

import com.xworkz.assignment18.inheritance.app4.*;

public class BankMain {
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.bankMethod();
		System.out.println("--------------------");
		
		SavingAccount account=new SavingAccount();
		Bank sacc=new SavingAccount();
		account.bankMethod();
		account.savingAccMethod();
		System.out.println("--------------------");
		
		FixedDeposit deposit=new FixedDeposit();
		Bank deposit1=new FixedDeposit();
		deposit.fixedAccMethod();
		deposit.bankMethod();
		System.out.println("--------------------");
		
		JointAccount account2=new JointAccount();
		Bank jacc=new JointAccount();
		account2.bankMethod();
		account2.jointAccMethod();
		System.out.println("--------------------");
		
		RecurringDeposit deposit2=new RecurringDeposit();
		Bank rbank=new RecurringDeposit();
		deposit2.bankMethod();
		deposit2.recurAccMethod();
		System.out.println("--------------------");
		
		DemandDeposit demandDeposit=new DemandDeposit();
		Bank demandDeposit1=new DemandDeposit();
		demandDeposit.bankMethod();
		demandDeposit.demandAccMethod();
		
	}
}

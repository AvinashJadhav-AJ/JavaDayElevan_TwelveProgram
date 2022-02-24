package com.BridgeLabz.java;

import java.util.Scanner;

public class BankAccount {
	static Scanner scanner = new Scanner(System.in);
	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void debit(double balance) {
		System.out.println("Enter The Withdraw Amount");
		double withdraw = scanner.nextDouble();
		if (withdraw > balance)
			System.out.println("Debit amount exceeded account balance.");
		else
			balance = balance - withdraw;
		System.out.println("Remaining balance is " + balance);

	}

	public static void main(String[] args) {
		System.out.println("Mention The Account Balance");
		BankAccount account = new BankAccount(scanner.nextDouble());
		account.debit(account.balance);
	}

}

package com.exceptiontask;

import java.util.Scanner;

public class Bank implements Atm {

	public int amount;
	public int savingamount = 50000;
	public int totalamount = 0;

	public Bank() {
		super();

	}

	public void withdrawl() {

		while (true) {
			System.out.println("Enter the withdrawl amount");
			Scanner sc = new Scanner(System.in);
			amount = sc.nextInt();

			if (this.amount < savingamount) {
				System.out.println("Amount is debited.....!!!!");
				totalamount = savingamount - this.amount;
				System.out.println("Balance Amount: " + totalamount);
			} else {

				throw new InvalidAmountException("Entered amount is not available");

			}
			System.out.println("Withdrawl Amount: " + amount);

		}

	}

}

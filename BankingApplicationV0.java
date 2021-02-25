/**
 * 
 */
package BankingApplication;

import java.util.Scanner;

/**
 * 
 * @author Josh Janoe
 * @version 0
 * created February 24, 2021
 * 
 * Basic banking application created using online tutorial by Help People on YouTube
 * Tutorial can be found at https://www.youtube.com/watch?v=wQbEH4tVMJA&feature=emb_logo
 * 
 * This file contains the unmodified code from the tutorial, for a very basic banking application
 *
 */
public class BankingApplicationV0 {

	/**
	 * 
	 */
	public BankingApplicationV0() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccountV0 obj1 = new BankAccountV0("XYZ","BA0001");
		obj1.showMenu();
		
	}

}


class BankAccountV0{
	
	int balance;
	int prevTransaction;
	String custName;
	String custID;
	
	BankAccountV0(String name, String id){
		custName = name;
		custID = id;
	}
	
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			prevTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTransaction = -amount;
		}
	}
	
	void getPrevTransaction() {
		if (prevTransaction > 0) {
			System.out.println("Deposited: "+prevTransaction);
		}
		else if (prevTransaction < 0) {
			System.out.println("Withdrawn: "+Math.abs(prevTransaction));
		}
		else {
			System.out.println("No Transaction occured");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Welcome " + custName);
		System.out.println("Your ID is " + custID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. View Previous Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("======================================");
			System.out.println("Enter an option");
			System.out.println("======================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			
			case 'A':
				System.out.println("--------------------------------------");
				System.out.println("Your balance is: "+balance);
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("--------------------------------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("--------------------------------------");
				int depositAmount = scanner.nextInt();
				deposit(depositAmount);
				System.out.println("\n");
				break;	
			
			case 'C':
				System.out.println("--------------------------------------");
				System.out.println("Enter an amount to withdraw:");
				System.out.println("--------------------------------------");
				int withdrawAmount = scanner.nextInt();
				withdraw(withdrawAmount);
				System.out.println("\n");
				break;		
				
			case 'D':
				System.out.println("--------------------------------------");
				getPrevTransaction();
				System.out.println("--------------------------------------");
				System.out.println("\n");
				break;		
				
			case 'E':				
				System.out.println("**************************************");
				System.out.println("**************************************");
				System.out.println("\n");
				break;			
				
			default:
				System.out.println("Invalid option!! Please enter again");
				break;
				
			}
		
		}
		while (option != 'E');
		
		System.out.println("Thank You for using our services");
	}
	
}

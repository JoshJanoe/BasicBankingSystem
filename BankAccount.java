/**
 * 
 */
package BankingApplication;

import java.util.Scanner;

/**
 * @author Josh Janoe
 * @version 1
 * 
 * Basic banking application account functionality
 * Allows user to intereact with program to
 * deposit, withdraw, check balance, etc
 *
 */
public class BankAccount {
	
	int balance;
	int prevTransactionAmount;
	String custName;
	String custID;
	
	/**
	 * 
	 */
	public BankAccount(String name, String id) {
		// TODO Auto-generated constructor stub
		custName = name;
		custID = id;
	}

	//adds money to account in the amount of the int "amount"
	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			prevTransactionAmount = amount;
			System.out.println("You're deposit for $"+amount+" is complete.  "
							+ "\nYou're new account balance is: $"+balance);
		}
	}
	
	//removes money from account in the amount of the int "amount"
	public void withdraw(int amount) {
		//if amount > balance, do not allow
		if (amount > balance) {
			System.out.println("The amount entered in greater than the available funds");
		}
		
		//if amount is greater than 0 withdraw amount, and balance > amount
		if (amount > 0 && balance > amount) {
			balance -= amount;
			prevTransactionAmount = -amount;
			System.out.println("You're withdraw for $"+amount+" is complete.  "
					+ "\nYou're new account balance is: $"+balance);
		}		
	}
	
	//prints previous transaction details to the console
	public void getPrevTransaction() {
		System.out.print("Your last transaction was a ");
		if (prevTransactionAmount > 0) {
			System.out.println("DEPOSIT in the amount of: $"+prevTransactionAmount);
		}
		else if (prevTransactionAmount < 0) {
			System.out.println("WITHDRAW in the amount of: $"+Math.abs(prevTransactionAmount));
		}
		else {
			System.out.println("No previous transactions recorded");
		}
	}
	
	//prints a home screen with basic data and menu for customer to interact with
	public void showMenu() {
		System.out.println("Welcome " + custName);
		System.out.println("Your ID is " + custID);
		System.out.println("");
		menuOptions();		
	}
	
	//provides the user with several options to input for account transactions
	private void menuOptions() {
		
		String option = "";
		Scanner scanner = new Scanner(System.in);
		
		//basic menu listing
		System.out.println("");
		System.out.print("A. Check Balance");
		System.out.println("\tB. Deposit");
		System.out.print("C. Withdraw");
		System.out.println("\t\tD. View Previous Transaction");
		System.out.println("E. Exit");
		
		System.out.println("======================================");
		System.out.println("Please enter an option from the menu above");
		System.out.println("======================================");
		option = scanner.next().toUpperCase();
		
		//if x, they perform the appropriate function/method
		if (option.equals("A")) {
			System.out.println("--------------------------------------");
			System.out.println("Your balance is: $"+balance);
			menuOptions();
		}
			
		if (option.equals("B")) {
			System.out.println("--------------------------------------");
			System.out.println("Enter an amount to deposit:");
			System.out.println("--------------------------------------");
			int depositAmount = scanner.nextInt();
			deposit(depositAmount);
			menuOptions();	
		}
		
		if (option.equals("C")) {
			System.out.println("--------------------------------------");
			System.out.println("Enter an amount to withdraw:");
			System.out.println("--------------------------------------");
			int withdrawAmount = scanner.nextInt();
			withdraw(withdrawAmount);
			menuOptions(); 
		}
		
		if (option.equals("D")) {
			System.out.println("--------------------------------------");
			getPrevTransaction();
			System.out.println("--------------------------------------");
			menuOptions();	 
		}
		
		if (option.equals("E")) {
			System.out.println("**************************************");
			System.out.println("**************************************");
			System.out.println("Thank You for using our services.  Goodbye!");
		}
		
		//if none of the designated options is selected prompt to try again
		if (option.equals("[^ABCDE]")) {
			System.out.println("Invalid option. Please try again\n\n");
			menuOptions();				
		}		
		
	}
	
	/*
	 * Basic getters and setters.  
	 * 
	 * Not much use as is, 
	 * but should provide function
	 * as the program expands.
	 * 
	 */
	public int getBalance() {
		return balance;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public String getCustID() {
		return custID;
	}
	
	private void setCustName(String name) {
		custName = name;
	}
	
	private void setCustID(String id) {
		custID = id;
	}
	
	/**
	 * standard main method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

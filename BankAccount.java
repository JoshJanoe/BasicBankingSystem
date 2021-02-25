/**
 * 
 */
package BankingApplication;

import java.util.Scanner;

/**
 * @author Josh
 *
 */
public class BankAccount {
	
	int balance;
	int prevTransaction;
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

	public void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			prevTransaction = amount;
			System.out.println("You're deposit for $"+amount+" is complete.  "
							+ "\nYou're new account balance is: $"+balance);
		}
	}
	
	public void withdraw(int amount) {
		//if amount > balance, do not allow
		if (amount > balance) {
			System.out.println("The amount entered in greater than the available funds");
		}
		
		//if amount is greater than 0 withdraw amount, and balance > amount
		if (amount > 0 && balance > amount) {
			balance -= amount;
			prevTransaction = -amount;
			System.out.println("You're withdraw for $"+amount+" is complete.  "
					+ "\nYou're new account balance is: $"+balance);
		}		
	}
	
	public void getPrevTransaction() {
		System.out.print("Your last transaction was a ");
		if (prevTransaction > 0) {
			System.out.println("DEPOSIT in the amount of: $"+prevTransaction);
		}
		else if (prevTransaction < 0) {
			System.out.println("WITHDRAW in the amount of: $"+Math.abs(prevTransaction));
		}
		else {
			System.out.println("No previous transactions recorded");
		}
	}
	
	public void showMenu() {
		System.out.println("Welcome " + custName);
		System.out.println("Your ID is " + custID);
		System.out.println("");
		menuOptions();		
	}
	
	private void menuOptions() {
		
		String option = "";
		Scanner scanner = new Scanner(System.in);
		
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
			
		if (option.equals("[^ABCDE]")) {
			System.out.println("Invalid option. Please try again\n\n");
			menuOptions();				
		}		
		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public String getCustID() {
		return custID;
	}
	
	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

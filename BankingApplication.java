/**
 * The following application has been heavily modified from the base code
 * found in the below described tutorial.  Listed are some of the changes.
 * 
 * -Variables and sample names changed for clarity
 * -If statements added for some edge cases
 * -Refactored to utilize more classes and helper methods
 * 
 * To add:
 * -password
 * -array of recent transactions/session report
 * -graphical interface
 * -split BankAccount class into Account and Transaction classes
 * 
 */
package BankingApplication;

//import java.util.Scanner;

/**
 * 
 * @author Josh Janoe
 * @version 1
 * created February 24, 2021
 * 
 * Basic banking application created using online tutorial by Help People on YouTube
 * Tutorial can be found at https://www.youtube.com/watch?v=wQbEH4tVMJA&feature=emb_logo
 * 
 * The above description lists previous and future changes.
 *
 */
public class BankingApplication {

	/**
	 * 
	 */
	public BankingApplication() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount("Joe Customer","BA0001");
		account.showMenu();
		
	}

}
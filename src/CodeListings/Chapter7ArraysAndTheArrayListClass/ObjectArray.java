package CodeListings.Chapter7ArraysAndTheArrayListClass;
import CodeListings.Chapter6AFirstLookAtClasses.BankAccount;
import java.util.Scanner;

public class ObjectArray {
	public static void main(String[] args) {
		Scanner kbi0 = new Scanner(System.in);
		
		System.out.print("\nthe number of bank accounts: ");
		
		int numberOfAccounts = kbi0.nextInt();
		
		// create an array, referenced by the accounts variable, whose elements are reference variables related to the BankAccount objects
		// by default the elements are initialized with null as they haven't referenced any object yet
		// to utilize these elements, class objects must be individually created for each element & referenced by them (array elements must reference class objects)
		BankAccount[] accounts = new BankAccount[numberOfAccounts];
		
		createAccounts(accounts);
		
		System.out.println("\nthe balances of each account: ");
		
		for(int index = 0; index < accounts.length; index++) {
			System.out.println("\n\taccount #" + (index + 1) + ": $" + accounts[index].getBalance());
		}
		
		kbi0.close();
	}
	
	
	/**
	 * this method creates individual BankAccount objects for the elements of an array
	 * the user is asked to enter each account's balance
	 * @param array the array to hold references to the BankAccount objects 
	 */
	private static void createAccounts(BankAccount[] array) {
		Scanner kbi1 = new Scanner(System.in);
		
		for(int index = 0; index < array.length; index++) {
			System.out.print("\n\tthe balance for account #" + (index + 1) + ": $");
			
			double balance = kbi1.nextDouble();
			
			// create the objects for the array's elements to reference & provide values (balances) for those elements
			array[index] = new BankAccount(balance); 
		}
		
		kbi1.close();
	}
}

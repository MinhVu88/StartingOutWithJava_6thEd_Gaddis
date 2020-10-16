package CodeListings.Chapter7ArraysAndTheArrayListClass;
import CodeListings.Chapter6AFirstLookAtClasses.BankAccount;

public class VarargsDemo2 {
	public static void main(String[] args) {
		double totalBalances;
		
		// create the BankAccount class's instances
		BankAccount acc1 = new BankAccount(100.0);
		
		BankAccount acc2 = new BankAccount(350.7);
		
		BankAccount acc3 = new BankAccount(98.41);
		
		// call the calculateTotalBalance method with 1 arg
		totalBalances = calculateTotalBalances(acc1);
		
		System.out.println("\naccount 1's balances: $" + totalBalances);
		
		// call the calculateTotalBalance method with 2 args
		totalBalances = calculateTotalBalances(acc1, acc2);
		
		System.out.println("\naccount 1's & account 2's balances: $" + totalBalances);
		
		// call the calculateTotalBalance method with 3 args
		totalBalances = calculateTotalBalances(acc1, acc2, acc3);
		
		System.out.println("\nthe balances of all 3 accounts: $" + totalBalances);
	}
	
	/**
	 * this method takes a variable number of the BankAccount instances & return their total balances
	 * @param accounts an array of the BankAccount instances
	 * @return The sum of the account balances
	 */
	public static double calculateTotalBalances(BankAccount...accounts) {
		double sum = 0.0; // accumulator
		
		// add all the objects' values (balances) to the accumulator
		for(BankAccount accObjects : accounts) {
			sum += accObjects.getBalance();
		}
		
		return sum;
	}
}

package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.ArrayList;

import code_listings.ch_06_a_1st_look_at_classes.BankAccount;

// This program demonstrates how to store BankAccount objects in an ArrayList

public class ArrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<BankAccount> accList = new ArrayList<>();
		
		// add 3 BankAccount instances to accList
		accList.add(new BankAccount(101.7));
		
		accList.add(new BankAccount(78.23));
		
		accList.add(new BankAccount(18.61));
		
		System.out.println("\nthe bank accounts' balances: ");
		
		BankAccount acc = new BankAccount();
		
		for(int index = 0; index < accList.size(); index++) {
			acc = accList.get(index);
			
			System.out.println("\n\t acc #" + (index + 1) + ": $" + acc.getBalance());
		}
	}

}

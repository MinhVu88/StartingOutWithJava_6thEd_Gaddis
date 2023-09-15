package code_listings.ch_08_a_2nd_look_at_classes_and_objects;
import javax.swing.JOptionPane;

import code_listings.ch_06_a_1st_look_at_classes.BankAccount;

public class ReturnObject {

	public static void main(String[] args) {
		// acc is assigned a reference to an instance of the BankAccount class, returned from the method call
		BankAccount acc = getAccount();
		
		JOptionPane.showMessageDialog(null, "the account balance: $" + acc.getBalance());
	}
	
	
	/**
	 * this method creates an instance of the BankAccount class with the balance specified by the user
	 * the method's return data type is of BankAccount, listed in its header
	 * @return a reference to the BankAccount instance
	 */
	public static BankAccount getAccount() {
		double balance = Double.parseDouble(JOptionPane.showInputDialog("enter the balance: $"));
		
		// create a BankAccount instance 
		// pass a copy of the balance variable as an argument to the constructor
		// return the reference to the instance to where the method is called
		return new BankAccount(balance);
	}
}

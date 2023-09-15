package code_listings.ch_06_a_1st_look_at_classes;
import javax.swing.JOptionPane;

public class AccountTest {
	public static void main(String[] args) {
		
		// version 1:				
		double startingBalance, depositAccount, withdrawalAmount;
		
		startingBalance = Double.parseDouble(JOptionPane.showInputDialog("your starting balance:"));
		
		BankAccount account = new BankAccount(startingBalance);
		
		depositAccount = Double.parseDouble(JOptionPane.showInputDialog("how much do you want to deposit?"));
		account.deposit(depositAccount);
		
		// check the new balance
		JOptionPane.showMessageDialog(null, "your deposit account has been updated & your current balance is " + account.getBalance());
		
		// withdraw some cash from the account
		withdrawalAmount = Double.parseDouble(JOptionPane.showInputDialog("how much do you want to withdraw?"));
		account.withdraw(withdrawalAmount);
		
		// check the new balance again
		JOptionPane.showMessageDialog(null, "your current balance after the withdrawal is " + account.getBalance());
		
		
		/*
		// version 2:		
		String input = JOptionPane.showInputDialog("your starting balance:");
		
		BankAccount account = new BankAccount(input);
		
		input = JOptionPane.showInputDialog("how much do you want to deposit?");
		
		account.deposit(input);
		
		// check the new balance
		JOptionPane.showMessageDialog(null, "your deposit account has been updated & your current balance is " + account.getBalance());
		
		// withdraw some cash from the account
		input = JOptionPane.showInputDialog("how much do you want to withdraw?");
		account.withdraw(input);
		
		// check the new balance again
		JOptionPane.showMessageDialog(null, "your current balance after the withdrawal is " + account.getBalance());
		*/
		
		System.exit(0);
	}
}

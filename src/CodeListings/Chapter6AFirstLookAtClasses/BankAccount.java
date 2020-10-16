package CodeListings.Chapter6AFirstLookAtClasses;

public class BankAccount {
	private double balance;
	
	// create 3 overloaded constructors named bankAccount
	/**
	 * @param startingBalance
	 */
	public BankAccount(double startingBalance) {
		this.balance = startingBalance;
	}
	
	// a no-arg constructor
	public BankAccount() {
		this.balance = 0.0;
	}
	
	/**
	 * @param str the starting balance as a string
	 */
	public BankAccount(String str) {
		this.balance = Double.parseDouble(str);
	}
	
	/**
	 * programming challenges #2 - pg 554 - chapter 8
	 * 
	 * this's a copy constructor
	 * 
	 * @param anotherBankAccInstance a reference to a BankAccount instance
	 */
	public BankAccount(BankAccount anotherBankAccInstance) {
		this.balance = anotherBankAccInstance.balance;
	}
	
	// create 2 overloaded methods named deposit
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}
	
	// create 2 overloaded methods named withdraw
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void withdraw(String str) {
		balance -= Double.parseDouble(str);
	}
	
	// create 2 overloaded methods named setBalance
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}
	
	// the only non-overloaded method
	public double getBalance() {
		return balance;
	}
}

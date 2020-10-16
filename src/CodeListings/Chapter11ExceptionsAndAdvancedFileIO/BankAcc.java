package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

import java.io.Serializable;

public class BankAcc implements Serializable {
	private double balance;
	
	// create 3 overloaded constructors named bankAccount
	/**
	 * code listing 11-11 (chapter 11, pg.732)
	 * 
	 * Note that NegativeStartingBalance extends the Exception class 
	 * 
	 * This means that it is a checked exception class 
	 * 
	 * Because of this, the constructor header must have a throws clause listing the exception type
	 * 
	 * @param startingBalance
	 * 
	 * @exception NegativeStartingBalance when startingBalance is negative
	 */
	public BankAcc(double startingBalance) throws NegativeStartingBalance {
		if(startingBalance < 0) {
			throw new NegativeStartingBalance(startingBalance);
		}
		
		this.balance = startingBalance;
	}

	/**
	 * @param balance
	 */
	public BankAcc() {
		this.balance = 0.0;
	}

	/**
	 * @param balance
	 */
	public BankAcc(String str) {
		this.balance = Double.parseDouble(str);
	}
	
	/**
	 * programming challenges #2 - pg 554 - chapter 8
	 * 
	 * this's a copy constructor
	 * 
	 * @param anotherBankAccInstance a reference to a BankAccount instance
	 */
	public BankAcc(BankAcc anotherBankAccInstance) {
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

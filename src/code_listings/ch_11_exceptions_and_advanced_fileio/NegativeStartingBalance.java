package code_listings.ch_11_exceptions_and_advanced_fileio;

/*
- To meet the needs of a specific class or application, you can create your own exception classes 
	by extending the Exception class or 1 of its subclasses

- Let�s look at an example that uses programmer-defined exceptions

- BankAcc.java holds the data for a bank account

- There are a number of errors that could cause a BankAcc object to perform its duties incorrectly 

- Here are some specific examples:

	� A negative starting balance is passed to the constructor

	� A negative number is passed to the deposit method

	� A negative number is passed to the withdraw method

	� The amount passed to the withdraw method exceeds the account�s balance

- We can create our own exceptions that represent each of these error conditions

- The BankAcc class will throw 1 of our custom exceptions when any of these errors occur

- Let�s start by creating an exception class for a negative starting balance
*/

public class NegativeStartingBalance extends Exception {
	/*
	- The no-arg constructor passes the string "Error: Negative starting balance" to the superclass constructor

	- This is the error message that is retrievable from an object�s getMessage method
	 */
	public NegativeStartingBalance() {super("Error: Negative starting balance");}
	
	/**
	 * The 2nd constructor accepts the starting balance as a double argument. 
	 * 
	 * This amount is used to pass a more detailed error message containing the starting balance amount to the superclass constructor
	 * 
	 * @param amount the starting balance
	 */
	public NegativeStartingBalance(double amount) {super("Error: Negative starting balance: " + amount);}
}

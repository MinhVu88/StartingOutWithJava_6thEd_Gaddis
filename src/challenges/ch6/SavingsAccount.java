package challenges.ch6;

/*
- Design a SavingsAccount class that stores a savings account�s annual interest rate & balance

- The class constructor should accept the amount of the savings account�s starting balance 

- The class should also have methods for: 

	+ subtracting the amount of a withdrawal 
	
	+ adding the amount of a deposit 
	
	+ adding the amount of monthly interest to the balance

- The monthly interest rate = the annual interest rate / 12 

- To add the monthly interest to the balance, multiply the monthly interest rate by the balance & add the result to the balance

**********************************************************************************************************************************************************************

- Test the class in a program that calculates the balance of a savings account at the end of a period of time 

- It should ask the user for the annual interest rate, the starting balance & the number of months that have passed since the account was established 

A loop should then iterate once for every month, performing the following:

	a. Ask the user for the amount deposited into the account during the month 

		+ Use the class method to add this amount to the account balance

	b. Ask the user for the amount withdrawn from the account during the month 

		+ Use the class method to subtract this amount from the account balance

	c. Use the class method to calculate the monthly interest

		+ After the last iteration, the program should display: 
		
			# the ending balance 
			
			# the total amount of deposits 
			
			# the total amount of withdrawals  
			
			# the total interest earned
*/

public class SavingsAccount {
	private double balance, annualInterestRate;

	/**
	 * @param startingBalance
	 */
	public SavingsAccount(double startingBalance, double yearlyInterestRate) {
		balance = startingBalance;
		
		annualInterestRate = yearlyInterestRate;
	}

	public SavingsAccount() {
		this.balance = 0.0;
		
		this.annualInterestRate = 0.0;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * @return the annualInterestRate
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	/**
	 * @param annualInterestRate the annualInterestRate to set
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public void withdrawFromBalance(double withdrawal) {
		this.balance -= withdrawal;
	}
	
	public void addDepositToBalance(double deposit) {
		this.balance += deposit;
	}
	
	public double addMonthlyInterestRateToBalance() {
		double monthlyInterest = this.annualInterestRate / 12;
		
		this.balance += (monthlyInterest * this.balance);
		
		return monthlyInterest;
	}
}

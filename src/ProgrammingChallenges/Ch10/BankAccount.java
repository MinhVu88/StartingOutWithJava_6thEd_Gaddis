package ProgrammingChallenges.Ch10;

/*
- Design an abstract class named BankAccount to hold the following data for a bank account:

	• Balance
	• Number of deposits this month
	• Number of withdrawals
	• Annual interest rate
	• Monthly service charges

- The class should have the following methods:

* Constructor: The constructor should accept arguments for the balance & annual interest rate.

* deposit: A method that accepts an argument for the amount of the deposit.
	The method should add the argument to the account balance. 
	It should also increment the variable holding the number of deposits.

* withdraw: A method that accepts an argument for the amount of the withdrawal.
	The method should subtract the argument from the balance. 
	It should also increment the variable holding the number of withdrawals.

* calcInterest: A method that updates the balance by calculating the monthly interest earned by the account & adding this interest to the balance.
	This is performed by the following formulas:
	
		Monthly Interest Rate = (Annual Interest Rate / 12)
		Monthly Interest = Balance * Monthly Interest Rate
		Balance = Balance + Monthly Interest

* monthlyProcess: A method that subtracts the monthly service charges from the balance, calls the calcInterest method & 
					then sets the variables that hold the number of withdrawals, number of deposits & monthly service charges to zero

- Next, design a SavingsAccount class that extends the BankAccount class. 
*/

public class BankAccount {
	private double balance, monthlyDeposits, withdrawals, annualInterestRate, monthlyServiceCharges;
	
	// a no-arg constructor
	public BankAccount() {}

	/**
	 * @param balance
	 * @param annualInterestRate
	 */
	public BankAccount(double balance, double annualInterestRate) {
		this.balance = balance;
		
		this.annualInterestRate = annualInterestRate;
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
	 * @return the monthlyDeposits
	 */
	public double getMonthlyDeposits() {
		return monthlyDeposits;
	}

	/**
	 * @param monthlyDeposits the monthlyDeposits to set
	 */
	public void setMonthlyDeposits(double monthlyDeposits) {
		this.monthlyDeposits = monthlyDeposits;
	}

	/**
	 * @return the withdrawals
	 */
	public double getWithdrawals() {
		return withdrawals;
	}

	/**
	 * @param withdrawals the withdrawals to set
	 */
	public void setWithdrawals(double withdrawals) {
		this.withdrawals = withdrawals;
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

	/**
	 * @return the monthlyServiceCharges
	 */
	public double getMonthlyServiceCharges() {
		return monthlyServiceCharges;
	}

	/**
	 * @param monthlyServiceCharges the monthlyServiceCharges to set
	 */
	public void setMonthlyServiceCharges(double monthlyServiceCharges) {
		this.monthlyServiceCharges = monthlyServiceCharges;
	}
	
	public void deposit(double d) {
		this.balance += d;
		
		this.monthlyDeposits++;
	}
	
	public void withdraw(double w) {
		this.balance -= w;
		
		this.withdrawals++;
	}
	
	public void calcInterest() {
		double monthlyInterestRate = this.annualInterestRate / 12;
		
		double monthlyInterest = this.balance * monthlyInterestRate;
		
		this.balance += monthlyInterest;
	}
	
	public void monthlyProcess() {
		this.balance -= this.monthlyServiceCharges;
		
		calcInterest();
		
		this.monthlyDeposits = 0;
		
		this.withdrawals = 0;
		
		this.monthlyServiceCharges = 0;
	}
}

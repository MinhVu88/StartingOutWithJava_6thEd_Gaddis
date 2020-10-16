package ProgrammingChallenges.Ch10;

/*
- Design a SavingsAccount class that extends the BankAccount class. 

- The SavingsAccount class should have a status field to represent an active or inactive account. 

- If the balance of a savings account falls below $25, it becomes inactive (The status field could be a boolean variable) 

- No more withdrawals may be made until the balance is raised above $25, at which time the account becomes active again. 

- The savings account class should have the following methods:

* withdraw: A method that determines whether the account is inactive before a withdrawal is made (No withdrawal will be allowed if the account is not active) 
			A withdrawal is then made by calling the superclass version of the method.

* deposit: A method that determines whether the account is inactive before a deposit is made. 
			If the account is inactive & the deposit brings the balance above $25, the account becomes active again. 
			A deposit is then made by calling the superclass version of the method.

* monthlyProcess: Before the superclass method is called, this method checks the number of withdrawals. 
					If the number of withdrawals for the month is more than 4, a service charge of $1 for each withdrawal above 4 is 
					added to the superclass field that holds the monthly service charges.
					(Don’t forget to check the account balance after the service charge is taken. If the balance falls below $25, the account becomes inactive)

- In your demo program, create a SavingsAccount object by making up a starting balance & interest rate, write a loop that iterates 5 times & 
	generate a random deposit & withdrawal (values 1 - 100) in each iteration on the account using your methods. 

- Print out the status of the account (balance, charges, number of transactions) after each transaction
*/

public class SavingsAccount extends BankAccount {
	private boolean active;
	
	private final int MIN_ACTIVE_BALANCE = 25;
	
	// a no-arg constructor
	public SavingsAccount() {}

	/**
	 * @param active
	 */
	public SavingsAccount(boolean active) {
		this.active = active;
	}	

	/**
	 * @param balance
	 * @param annualInterestRate
	 */
	public SavingsAccount(double balance, double annualInterestRate) {
		super(balance, annualInterestRate);
		
		if(balance < MIN_ACTIVE_BALANCE) {
			active = false;
		}else {
			active = true;
		}
	}

	/**
	 * @param balance
	 * @param annualInterestRate
	 */
	public SavingsAccount(double balance, double annualInterestRate, boolean active) {
		super(balance, annualInterestRate);
		
		this.active = active;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return active;
	}

	/**
	 * @param active the status to set
	 */
	public void setStatus(boolean active) {
		this.active = active;
	}
	
	@Override
	public void withdraw(double amount) {
		if(super.getBalance() >= MIN_ACTIVE_BALANCE) {
			this.active = true;
			
			super.withdraw(amount);
		}else {
			this.active = false;
			
			System.out.println("\nThe account is inactive due to insufficient balance (below $25) -> withdrawals are not allowed in this case");
		}
	}
	
	@Override
	public void deposit(double amount) {
		if(super.getBalance() >= MIN_ACTIVE_BALANCE) {
			this.active = true;
			
			super.deposit(amount);
		}else {
			super.setBalance(MIN_ACTIVE_BALANCE);			
		}
	}
	
	@Override
	public void monthlyProcess() {
		if(super.getWithdrawals() > 4) {
			this.active = true;
			
			for(int w = 1; w <= super.getWithdrawals(); w++) {
				super.setMonthlyServiceCharges(super.getWithdrawals() - 4);
			}
		}
		
		super.monthlyProcess();
		
		if(super.getBalance() < MIN_ACTIVE_BALANCE) {
			this.active = false;
		}
	}
	
	public void display() {
		System.out.println("\nthe balance: $" + super.getBalance());
		
		System.out.println("\nthe monthly service charges: $" + super.getMonthlyServiceCharges());
		
		System.out.println("\nthe number of transactions: " + (super.getMonthlyDeposits() + super.getWithdrawals()));
	}
}

package challenges.ch6;
import java.util.Scanner;

public class SavingsAccountTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		double annualInterestRate, startingBalance, deposit, withdrawal, 
				totalDeposit = 0.0, totalWithdrawal = 0.0, totalInterestEarned = 0.0;
		
		int months;
		
		System.out.print("\nthe annual interest rate (in percentage): ");
		
		annualInterestRate = kbi.nextDouble();
		
		System.out.print("\nthe starting balance: $");
		
		startingBalance = kbi.nextDouble();
		
		System.out.print("\nthe number of months that have passed since the account was established: ");
		
		months = kbi.nextInt();
		
		SavingsAccount acc = new SavingsAccount(startingBalance, annualInterestRate);
		
		for(int month = 1; month <= months; month++) {
			System.out.println("\n* month #" + month + ": ");
			
			System.out.print("\n- the amount deposited into the account during the month: $");
			
			deposit = kbi.nextDouble();
			
			// Use the class method to add this amount to the account balance
			acc.addDepositToBalance(deposit);
			
			totalDeposit += deposit;
			
			System.out.print("\n- the amount withdrawn from the account during the month: $");
			
			withdrawal = kbi.nextDouble();
			
			// Use the class method to subtract this amount from the account balance
			acc.withdrawFromBalance(withdrawal);
			
			totalWithdrawal += withdrawal;
			
			// Use the class method to calculate the monthly interest
			totalInterestEarned += acc.addMonthlyInterestRateToBalance();
		}
		
		System.out.println("\n\tthe ending balance: $" + acc.getBalance() + "\n\n\tthe total amount of deposits: $" + totalDeposit 
							+ "\n\n\tthe total amount of withdrawals: $" + totalWithdrawal + "\n\n\tthe total interest earned: $" + totalInterestEarned);
		
		kbi.close();
	}
}

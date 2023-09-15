package challenges.ch6;
import java.io.*;
import java.util.Scanner;

/*
- Use Notepad or another text editor to create a text file named Deposits.txt 

- The file should contain the following numbers, one per line:

100.00
124.00
78.92
37.55

- Next, create a text file named Withdrawals.txt 

- The file should contain the following numbers, one per line:

29.88
110.00
27.52
50.00
12.90

- The numbers in the Deposits.txt file are the amounts of deposits that were made to a savings account during the month and 
	the numbers in the Withdrawals.txt file are the amounts of withdrawals that were made during the month 

- Write a program that creates an instance of the SavingsAccount class that you wrote in SavingsAccount.java 

- The starting balance for the object is 500.00 

- The program should read the values from the Deposits.txt file and use the object�s method to add them to the account balance 

- The program should read the values from the Withdrawals.txt file and use the object�s method to subtract them from the account balance 

- The program should call the class method to calculate the monthly interest and then display the ending balance and the total interest earned
*/

public class DepositAndWithdrawalFiles {

	public static void main(String[] args) throws IOException {
		final double STARTING_BALANCE = 500.0;
		
		double deposit, withdrawal, totalDeposits = 0.0, totalWithdrawals = 0.0, totalInterestEarned = 0.0;
		
		// create 2 instances of the File class, referenced by file1 & file2, to represent the 2 text files, which will be read by a Scanner object later
		File file1 = new File("Deposits.txt");
		
		File file2 = new File("Withdrawals.txt");
		
		// create an instance of the PrintWriter class, referenced by file3, to write the program's output to a text file
		File file3 = new File("SavingsAccountsResult.txt");
		
		if(!file3.exists()) {
			System.out.println("\nSavingsAccountsResult.txt isn't created yet");
		}else {
			System.out.println("\nSavingsAccountsResult.txt has been created");
		}
		
		PrintWriter outputFile = new PrintWriter(file3);
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe annual interest rate (in percentage): ");
		
		double annualInterestRate = kbi.nextDouble();
		
		System.out.print("\nthe number of months that have passed since the account was established: ");
		
		int months = kbi.nextInt();
		
		SavingsAccount acc = new SavingsAccount(STARTING_BALANCE, annualInterestRate);
		
		// create 2 instances of the Scanner class to read the values in the files
		Scanner inputFile1 = new Scanner(file1);
		
		Scanner inputFile2 = new Scanner(file2);
		
		for(int month = 1; month <= months; month++) {
			// read the files
			while(inputFile1.hasNext()) {
				deposit = inputFile1.nextDouble();
				
				acc.addDepositToBalance(deposit);
				
				totalDeposits += deposit;
			}
			
			//inputFile1.close();
			
			while(inputFile2.hasNext()) {
				withdrawal = inputFile2.nextDouble();
				
				acc.withdrawFromBalance(withdrawal);
				
				totalWithdrawals += withdrawal;
			}
			
			//inputFile2.close();
			
			totalInterestEarned += acc.addMonthlyInterestRateToBalance();
		}
		
		System.out.println("\n\tthe ending balance: $" + acc.getBalance() + "\n\n\tthe total amount of deposits: $" + totalDeposits 
				+ "\n\n\tthe total amount of withdrawals: $" + totalWithdrawals + "\n\n\tthe total interest earned: $" + totalInterestEarned);
		
		outputFile.println("the ending balance: $" + acc.getBalance());
		
		outputFile.println();
		
		outputFile.println("the total amount of deposits: $" + totalDeposits); 
		
		outputFile.println();
		
		outputFile.println("the total amount of withdrawals: $" + totalWithdrawals); 
		
		outputFile.println();
		
		outputFile.println("the total interest earned: $" + totalInterestEarned);
		
		inputFile1.close();
		inputFile2.close();
		outputFile.close();
		kbi.close();
	}

}

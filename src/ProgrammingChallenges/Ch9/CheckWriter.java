package ProgrammingChallenges.Ch9;

import java.util.Scanner;

/*
- Write a program that displays a simulated paycheck 

- The program should ask the user to enter the date, the payee’s name and the amount of the check 

- It should then display a simulated check with the dollar amount spelled out, as shown here:

															Date: 11/24/2012
Pay to the Order of: John Phillips 							$1920.85
One thousand nine hundred twenty and 85 cents
*/

public class CheckWriter {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the date (MM/DD/YYYY): ");
		
		String date = kbi.nextLine();
		
		System.out.print("\nenter your name: ");
		
		String name = kbi.nextLine();
		
		kbi.nextLine();
		
		System.out.print("enter the amount of the check in number: $");
		
		int amount = kbi.nextInt();
		
		NumbersToWords converter = new NumbersToWords();
		
		System.out.println("\n\tPay to the Order of: " + name);
		
		System.out.println("\n\tDate: " + date);
		
		System.out.println("\n\tthe amount of the check in words: " + converter.convert(amount) + " dollars");
		
		kbi.close();
	}

}

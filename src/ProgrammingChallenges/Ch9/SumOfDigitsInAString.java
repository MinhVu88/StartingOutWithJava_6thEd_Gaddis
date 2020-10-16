package ProgrammingChallenges.Ch9;

import java.util.Scanner;

/*
- Write a program that asks the user to enter a series of single digit numbers with nothing separating them 

- The program should display the sum of all the single digit numbers in the string 

- For example, if the user enters 2514, the method should return 12, which is the sum of 2, 5, 1 and 4 

- The program should also display the highest and lowest digits in the string (Hint: Convert the string to an array.)
*/

public class SumOfDigitsInAString {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a series of single digit numbers with nothing separating them: ");
		
		String digits = kbi.nextLine();
		
		String[] digitsArray = digits.split("");
		
		int sum = 0;
		
		for(String digit : digitsArray) {
			sum += Integer.parseInt(digit);
		}
		
		System.out.println("\nthe sum of the digits entered: " + sum);
		
		int max = Integer.parseInt(digitsArray[0]), min = Integer.parseInt(digitsArray[0]);
		
		for(int index = 0; index < digitsArray.length; index++) {
			if(max < Integer.parseInt(digitsArray[index])) {
				max = Integer.parseInt(digitsArray[index]);
			}
		}
		
		System.out.println("\nthe highest digit: " + max);
		
		for(int index = 0; index < digitsArray.length; index++) {
			if(min > Integer.parseInt(digitsArray[index])) {
				min = Integer.parseInt(digitsArray[index]);
			}
		}
		
		System.out.println("\nthe lowest digit: " + min);
		
		kbi.close();
	}

}

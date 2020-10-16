package ProgrammingChallenges.Ch9;

import java.util.Scanner;

/*
- Write a program that asks the user to enter a series of numbers separated by commas 

- Here is an example of valid input: 7,9,10,2,18,6

- The program should calculate and display the sum of all the numbers
*/

public class SumOfNumbersInAString {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the values, separated by commas, without whitespaces between them: ");
		
		String values = kbi.nextLine();
		
		String[] tokens = values.split(",");
		
		int sum = 0;
		
		for(String value : tokens) {
			sum += Integer.parseInt(value);
		}
		
		System.out.println("\nthe sum of the values entered: " + sum);
		
		kbi.close();
	}

}

package code_listings.ch_10_inheritance;

import java.util.Scanner;

// this program demonstrate a simple lambda expression

public class LambdDemo {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		IntCalculator square = x -> x * x; // a lambda expression that creates an object that implements the interface
		
		System.out.print("\nenter an int number: ");
		
		int number = kbi.nextInt();
		
		System.out.println("\nthe square of a number: " + square.calculate(number));
		
		kbi.close();
	}

}

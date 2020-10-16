package CodeListings.Chapter10Inheritance;

import java.util.Scanner;

public class AnonymousClassDemo {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		/*
		  - 1st, declare an IntCalculator interface reference variable named square -> it can reference any object that implements the IntCalculator interface
		 
		  - the variable is then assigned a reference to an instance of an anonymous class, created by the expression "new IntCalculator()"
		  
		  - the anonymous class body, in which the calculate method is overridden, is enclosed in curly braces & ends with a semicolon
		 */
		IntCalculator square = new IntCalculator() {
			@Override
			public int calculate(int number) {
				return number * number;
			}
		};
		
		System.out.print("\nenter an int number: ");
		
		int no = kbi.nextInt();
		
		System.out.println("\nthe square of a number: " + square.calculate(no));
		
		kbi.close();
	}

}

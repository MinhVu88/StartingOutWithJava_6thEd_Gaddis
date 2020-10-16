package CodeListings.Chapter10Inheritance;

import java.util.Scanner;

// this program demonstrates a lambda expression that uses a local final variable

public class LambdDemo2 {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int factor = 10;
		
		IntCalculator multiplier = x -> x * factor;
		
		System.out.print("\nenter an int number: ");
		
		int number = kbi.nextInt();
		
		System.out.println("\nmultiplied by 10, that number is: " + multiplier.calculate(number));
		
		kbi.close();
	}

}

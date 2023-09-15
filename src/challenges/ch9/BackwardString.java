package challenges.ch9;

import java.util.Scanner;

/*
- Write a method that accepts a String object as an argument and displays its contents backward

- For instance, if the string argument is �gravity� the method should display �ytivarg�

- Demonstrate the method in a program that asks the user to input a string and then passes it to the method
*/

public class BackwardString {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a string: ");
		
		StringBuilder strB = new StringBuilder(kbi.nextLine());
				
		System.out.println("\nthe backward string: " + strB.reverse());
		
		kbi.close();
	}
	
}

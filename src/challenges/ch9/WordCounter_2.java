package challenges.ch9;

import java.util.Scanner;

/*
- Write a method that accepts a String object as an argument and returns the number of words it contains 

- For instance, if the argument is �Four score and seven years ago� the method should return the number 6 

- Demonstrate the method in a program that asks the user to input a string and then passes it to the method 

- The number of words in the string should be displayed on the screen
*/

public class WordCounter_2 {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a string: ");
		
		String str = kbi.nextLine();
		
		String[] words = str.split(" ");
		
		System.out.println("\nthe number of words: " + words.length);
		
		kbi.close();
	}

}

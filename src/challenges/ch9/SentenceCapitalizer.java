package challenges.ch9;

import java.util.Scanner;

/*
- Write a method that accepts a String object as an argument and 
	returns a copy of the string with the 1st character of each sentence capitalized 

- For instance, if the argument is �hello. my name is Joe. what is your name?� 

- The method should return the string �Hello. My name is Joe. What is your name?� 

- Demonstrate the method in a program that asks the user to input a string and then passes it to the method 

- The modified string should be displayed on the screen
*/

public class SentenceCapitalizer {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter a string: ");
		
		StringBuilder strB = new StringBuilder(kbi.nextLine());
		
		int index = 0;
		
		boolean isUpperCase = true;
		
		while(index < strB.length()) {
			if(strB.charAt(index) == '.' || strB.charAt(index) == '!' || strB.charAt(index) == '?') {
				isUpperCase = true;
			}else if(isUpperCase && !Character.isWhitespace(strB.charAt(index))) {
				strB.setCharAt(index, Character.toUpperCase(strB.charAt(index)));
				
				isUpperCase = false;
			}
			
			index++;
		}
		
		System.out.println("\n" + strB.toString());
		
		kbi.close();
	}
}

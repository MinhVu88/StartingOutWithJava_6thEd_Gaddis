package ProgrammingChallenges.Ch4;
import java.util.Scanner;

/* 
- Write a program that asks the user to enter a string & then asks the user to enter a character
- The program should count & display the number of times that the specified character appears in the string 
*/

public class pc5pg263 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter a string: ");
		String aString = kb.nextLine();
		
		System.out.print("enter a char: ");
		char aChar = kb.nextLine().charAt(0);
		
		int charTotal = 0;
		
		for(int charCount = 0; charCount < aString.length(); charCount++) {
			if(aString.charAt(charCount) == aChar) {
				charTotal++;
			}
		} 
		
		System.out.println("\n\t" + aChar + " appears " + charTotal + " times in the string");
		
		kb.close();
	}
}

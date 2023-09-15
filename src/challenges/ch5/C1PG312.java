package challenges.ch5;
import java.util.Scanner;

/*
- Write a method named showChar, which accepts 2 arguments: a reference to a String object & an integer 

- The integer argument is a character position within the String, with the 1st character being at position 0 

- When the method executes, it should display the character at that character position 

- Here is an example of a call to the method: showChar("New York", 2);

- In this call, the method will display the character w because it is in position 2 

- Demonstrate the method in a complete program
 */

public class C1PG312 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("enter the string: ");
		String aString = kbi.nextLine();
		
		System.out.print("the character index position in the string: ");
		//char charPosition = aString.charAt(kbi.nextInt());
		int charPosition = kbi.nextInt();
		char charIndexPosition = aString.charAt(charPosition);
		showChar(aString, charIndexPosition);
		
		kbi.close();
	}
	
	public static void showChar(String a_string, char char_Position) {
		System.out.println("\n\t" + a_string + ", " + char_Position);
	}
}

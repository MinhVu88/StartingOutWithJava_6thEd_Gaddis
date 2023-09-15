package code_listings.ch_05_methods;
import java.util.Scanner;

/* description: This program demonstrates a method that returns a reference to a String object */

public class ReturnString {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("your 1st name: ");
		String first_name = kb.nextLine();
		
		System.out.print("your last name: ");
		String last_name = kb.nextLine();
		
		String full_name = fullName(first_name, last_name);
		
		System.out.println(full_name);
		
		kb.close();
	}
	
	public static String fullName(String firstName, String lastName) {
		return "\n\tmy full name is " + firstName + " " + lastName;
	}
}

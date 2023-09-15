package checkpoints.ch5;
import java.util.Scanner;

/* Write a void method that displays your full name. The method should be named displayName */

public class CP55PG279 {
	public static void main(String[] args) {
		displayName();
	}
	
	public static void displayName() {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("first name: ");
		String firstName = kb.nextLine();
		
		System.out.print("middle name: ");
		String middleName = kb.nextLine();
		
		System.out.print("last name: ");
		String lastName = kb.nextLine();
		
		System.out.println("full name: " + firstName + " " + middleName + " " + lastName);
		
		kb.close();
	}
}

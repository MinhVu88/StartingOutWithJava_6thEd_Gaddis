package code_listings.ch_05_methods;
import java.util.Scanner;

/* description:

- Frequently there is a need for a method that tests an argument & returns a true or false value indicating whether or not a condition exists 
- Such a method would return a boolean value 
- For example, the validOrNot() method accepts an argument & returns true if the argument is within the range of 1 through 100 or false otherwise
*/

public class BooleanMethod {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter a number: ");
		int number = kb.nextInt();
		
		if(validOrNot(number)) {
			System.out.println(number + " is in the range between 1 & 100");
		}else {
			System.out.println(number + " is out of the range");
		}
		
		kb.close();
	}
	
	public static boolean validOrNot(int value) {
		boolean status;
		
		if(value > 0 && value < 101) {
			status = true;
		}else {
			status = false;
		}
		
		return status;
	}
}

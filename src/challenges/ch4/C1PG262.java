package challenges.ch4;
import java.util.Scanner;

/* Sum of Numbers:

- Write a program that asks the user for a positive nonzero integer value 
- The program should use a loop to get the sum of all the integers from 1 up to the number entered 
- For example, if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50
*/

public class C1PG262 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter a positive nonzero integer value: ");
		int number = kb.nextInt(), 
			sum = 0;
		
		for(int count = 1; count <= number; count++) {
			sum += count;
		}
		
		System.out.println("sum: " + sum);
		
		kb.close();
	}
}

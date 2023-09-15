package challenges.ch7;
import java.util.Scanner;

/*
- In a program, write a method that accepts 2 arguments: an array and a number n 

- Assume that the array contains integers 

- The method should display all of the numbers in the array that are greater than the number n
*/

public class LargerThanN {

	public static void main(String[] args) {
		int counter = 0;
		
		int[] array = new int[100];
		
		for(int index = 0; index < array.length; index++) {
			if(counter < 100) {
				array[index] = counter;
				
				counter++;
			}
		}
		
		System.out.print("\nthe array's elements: ");
		
		for(int e : array) {
			System.out.print(" " + e);
		}
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\n\nenter a value: ");
		
		int value = kbi.nextInt();
		
		System.out.println("\nthe values that are greater than " + value + " in the array:\n");
		
		display(array, value);
		
		kbi.close();
	}
	
	private static void display(int[] array, int no) {
		for(int element : array) {
			if(element > no) {
				System.out.print(" " + element);
			}
		}
	}
}

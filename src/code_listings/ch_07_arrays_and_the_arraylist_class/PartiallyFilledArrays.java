package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.Scanner;

public class PartiallyFilledArrays {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int ARRAY_SIZE = 100;
		
		int[] array = new int[ARRAY_SIZE];
		
		int indexCounter = 0;
		
		System.out.print("\nenter a number or enter -1 to quit: ");
		
		int number = kbi.nextInt();
		
		while(number != -1 && indexCounter < array.length) {
			array[indexCounter] = number;
			
			indexCounter++;
			
			System.out.print("\nenter a number or enter -1 to quit: ");
			
			number = kbi.nextInt();
		}
		
		// display all the valid elements in the array
		for(int index = 0; index < indexCounter; index++) {
			System.out.println("\n\t" + array[index]);
		}
		
		kbi.close();
	}
}

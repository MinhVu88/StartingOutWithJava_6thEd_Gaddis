package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.Scanner;

public class PassArray {
	public static void main(String[] args) {
		final int ARRAY_SIZE = 5;
		
		int[] numbers = new int[ARRAY_SIZE];
		
		getArrayValues(numbers);
		
		System.out.println();
		
		showArrayValues(numbers);
	}
	
	public static void getArrayValues(int[] array) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.println("\nenter the values:");
		
		for(int index = 0; index < array.length; index++) {
			System.out.print("\n\tvalue #" + (index + 1) + ": ");
			array[index] = kbi.nextInt();
		}
		
		kbi.close();
	}
	
	public static void showArrayValues(int[] array) {
		System.out.print("\nthe values entered: ");
		
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " | ");
		}
	}
}

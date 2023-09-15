package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.Scanner;

// this program uses for loops to insert new pieces of data into the array & display them on the console

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int EMPLOYEES = 3;
		
		int[] workingHours = new int[EMPLOYEES];
		
		// inputting the values into the array
		for(int index = 0; index < workingHours.length; index++) {
			System.out.print("\nemployee " + (index + 1) + ": ");
			
			workingHours[index] = kbi.nextInt();
		}
		
		System.out.println("\nthe working hours: ");
		
		// displaying the contents of the array
		for(int index = 0; index < workingHours.length; index++) {
			System.out.println("\t\t\t-> " + workingHours[index]);
		}
		
		kbi.close();
	}
}

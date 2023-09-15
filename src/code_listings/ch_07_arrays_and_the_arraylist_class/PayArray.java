package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.Scanner;

public class PayArray {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int EMPLOYEES = 5;
		double hourlyPay;
		
		int[] workingHours = new int[EMPLOYEES];
		
		System.out.println("\nenter the working hours of the " + EMPLOYEES + " employees");
		
		for(int index = 0; index < workingHours.length; index++) {
			System.out.print("\n\temployee #" + (index + 1) + ": ");
			workingHours[index] = kbi.nextInt();
		}
		
		System.out.print("\nenter the hourly pay per employee: $");
		hourlyPay = kbi.nextDouble();
		
		System.out.println("\nthe gross pay of the " + EMPLOYEES + " employees:");
		
		for(int index = 0; index < workingHours.length; index++) {
			System.out.println("\n\temployee #" + (index + 1) + ": $" + (workingHours[index] * hourlyPay));
		}
		
		kbi.close();
	}
}

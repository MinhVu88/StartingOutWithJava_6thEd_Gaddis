package code_listings.ch_07_arrays_and_the_arraylist_class;
import java.util.Random;
import java.util.Scanner;

/*
- this is a modification of PayArray.java

- this program includes overtime wages in the gross pay 

- If an employee works more than 40 hours, an overtime pay rate of 1.5 times the regular pay rate is used for the excess hours
*/

public class Overtime {
	public static void main(String[] args) {
		Random randomHours = new Random();
		Scanner kbi = new Scanner(System.in);
		
		final int EMPLOYEES = 5;
		final double OVERTIME_PAY = 1.5;
		double hourlyPay;
		
		int[] workingHours = new int[EMPLOYEES];
		
		System.out.println("\nthe working hours of the " + EMPLOYEES + " employees");
		
		for(int index = 0; index < workingHours.length; index++) {
			System.out.print("\n\temployee #" + (index + 1) + ": ");
			workingHours[index] = randomHours.nextInt(41) + 8;
			System.out.println(workingHours[index]);
		}
		
		System.out.print("\nenter the hourly pay per employee: $");
		hourlyPay = kbi.nextDouble();
		
		System.out.println("\nthe gross pay of the " + EMPLOYEES + " employees:");
		
		for(int index = 0; index < workingHours.length; index++) {
			if(workingHours[index] > 40) {
				hourlyPay *= OVERTIME_PAY;
				System.out.println("\n\tovertime temployee #" + (index + 1) + ": $" + (workingHours[index] * hourlyPay));
			}else {
				System.out.println("\n\tnon-overtime employee #" + (index + 1) + ": $" + (workingHours[index] * hourlyPay));
			}
		}
		
		kbi.close();
	}
}

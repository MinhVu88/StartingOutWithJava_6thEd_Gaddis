package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Scanner;

public class ArrayDemo1 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int EMPLOYEES = 3;
		
		// declare & initialize an integer array instance named workingHours, 
		// whose constructor accepts the value of a constant variable called EMPLOYEES as its argument
		int[] workingHours = new int[EMPLOYEES];
		
		System.out.println("\nthe working hours of the " + EMPLOYEES + " employess");
		
		// get the working hours of the employees
		System.out.print("\nemployee 1: ");
		workingHours[0] = kbi.nextInt();
		
		System.out.print("employee 2: ");
		workingHours[1] = kbi.nextInt();
		
		System.out.print("employee 3: ");
		workingHours[2] = kbi.nextInt();
		
		// display the working hours
		System.out.println("\nthe working hours: " + workingHours[0] + ", " + workingHours[1] + ", " + workingHours[2]);
		
		kbi.close();
	}
}

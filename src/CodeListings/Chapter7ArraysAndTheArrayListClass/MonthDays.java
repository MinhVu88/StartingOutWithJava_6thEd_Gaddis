package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Scanner;

public class MonthDays {
	public static void main(String[] args) {
		// using an initialization list to create an array of references to string objects
		String[] months = {"jan", "feb", "mar", "apr", "may", "june", "july", "august", "sep", "oct", "nov", "dec"};
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int index = 0; index < months.length; index++) {
			System.out.println("\n" + months[index] + " has " + days[index] + " days");
		}
		
		// create an array of uninitialized String references by using the new keyword
		// because they don't reference any objects, by default they're all set to null
		// to utilize an uninitialized array, a value must be assigned to each of its elements
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\n\tthe number of names: ");
		
		int numberOfNames = kbi.nextInt();
		
		kbi.nextLine();
		
		String[] names = new String[numberOfNames];
		
		for(int index = 0; index < names.length; index++) {
			System.out.print("\n\tname #" + (index + 1) + ": ");
			names[index] = kbi.nextLine();
		}
		
		System.out.print("\n\tthe names entered: ");
		
		for(int index = 0; index < names.length; index++) {
			System.out.print(names[index] + " | ");
		}
		
		kbi.close();
	}
}

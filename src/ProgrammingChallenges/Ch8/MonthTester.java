package ProgrammingChallenges.Ch8;

import java.util.Scanner;

public class MonthTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the month name in which you were born: ");
		
		String monthName = kbi.nextLine();
		
		Month dad = new Month(monthName);
		
		System.out.print("\nenter the month number in which your wife was born: ");
		
		int monthNo1 = kbi.nextInt();
		
		Month mom = new Month(monthNo1);
		
		System.out.print("\nenter the month number in which your son was born: ");
		
		int monthNo2 = kbi.nextInt();
		
		Month son = new Month(monthNo2);
		
		System.out.print("\nenter the month number in which your daughter was born: ");
		
		int monthNo3 = kbi.nextInt();
		
		Month daughter = new Month(monthNo3);
		
		System.out.println("\n\tthe month number in which you were born: " + dad.getMonthNumber());
		
		System.out.println("\n\tthe month name in which your wife was born: " + mom.getMonthName());
		
		if(dad.equals(mom)) {
			System.out.println("\n-> you & your wife have the same month of birth");
		}else {
			System.out.println("\n-> you & your wife have the different months of birth");
		}
		
		if(son.greaterThan(daughter)) {
			System.out.println("\n-> your son's month of birth is greater than your daughter's");
		}else {
			System.out.println("\n-> your son's month of birth is less than your daughter's");
		}
		
		if(dad.lessThan(son)) {
			System.out.println("\n-> your month of birth is less than your son's");
		}else {
			System.out.println("\n-> your month of birth is greater than your son's");
		}
		
		if(mom.lessThan(daughter)) {
			System.out.println("\n-> your wife's month of birth is less than your daughter's");
		}else {
			System.out.println("\n-> your wife's month of birth is greater than your daughter's");
		}
		
		kbi.close();
	}

}

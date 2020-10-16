package ProgrammingChallenges.Ch5;
import java.util.Scanner;

/*
- The distance a vehicle travels can be calculated as follows: Distance = Speed * Time

- Write a method named distance that accepts a vehicle’s speed & time as arguments & returns the distance the vehicle has traveled.

- For example, if a train travels 40 miles-per-hour for 3 hours, the distance traveled is 120 miles
 
- and it should display a report similar to the one that follows:

Hour		Distance Traveled
------------------------------
1				40
2				80
3				120

- Input Validation: Do not accept a negative number for speed & do not accept any value less than 1 for time traveled (negative number is not allowed in this program)

- Modify pc2pg263.java to use the method
*/

public class pc9pg315 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		int milesPerHour, hoursTraveled;
		
		System.out.print("\nenter the speed (miles per hour/mph): ");
		milesPerHour = kbi.nextInt();
		
		System.out.print("\nenter the number of hours you've traveled: ");
		hoursTraveled = kbi.nextInt();
		
		while(milesPerHour < 0 && hoursTraveled < 1) {
			System.out.println("\n* invalid input. plz try again");
			
			System.out.print("\nenter the speed (miles per hour/mph): ");
			milesPerHour = kbi.nextInt();
			
			System.out.print("\nenter the number of hours you've traveled: ");
			hoursTraveled = kbi.nextInt();
		}
		
		System.out.println("\nHours                   Distance traveled");
		System.out.println("------------------------------------------");
		
		for(int startingTime = 1; startingTime <= hoursTraveled; startingTime++) {
			System.out.println(startingTime + "                       " + calculateDistance(milesPerHour, startingTime));
		}
		
		kbi.close();
	}
	
	public static int calculateDistance(int s, int h) {
		int d = s * h;
		return d;
	}
}

package ProgrammingChallenges.Ch5;
import java.util.Scanner;

/*
A painting company has determined that for every 115 square feet of wall space, 1 gallon of paint & 8 hours of labor will be required. 

- The company charges $18.00 per hour for labor. 

- Write a program that allows the user to enter the number of rooms to be painted & the price of the paint per gallon. 

- It should also ask for the square feet of wall space in each room. 

- The program should have methods that return the following data:

• The number of gallons of paint required

• The hours of labor required

• The cost of the paint

• The labor charges

• The total cost of the paint job = cost of paint + labor charges

Then it should display the data on the screen
*/

/*
- Given info: 1 gallon & 8 hours of labor = 115 square feet of wall space, $18.00/hour of labor

- User input: number of rooms (nor) & price per gallon of paint (ppgop)) & square feet of wall space per room (sfowspr)

=> total square feet = sfowspr * nor

115 square feet : 	1 gallon
total square feet: 	? gallons

=> total gallons required = total square feet/115

1 gallon: 					8 hours
total gallons required: 	? hours of labor

=> total hours of labor required = total gallons required * 8

=> total paint cost = ppgop * total gallons required

=> total labor charges = $18.00 * total hours of labor required

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

* Calculations:

1/ number of gallons required = total square feet/115

2/ hours of labor required = total gallons required * 8

3/ total paint cost = prgop * total gallons required

4/ total labor charges = $18.00 * total hours of labor required

5/ total cost of paint job = total paint cost + total labor charges
*/

public class pc4pg312 {
	public static void main(String[] args) {
		int numberOfRooms, squareFeetPerRoom;
		double pricePerGallon, hourlyLaborCharges = 18.00;
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("number of rooms: ");
		numberOfRooms = kbi.nextInt();
		
		System.out.print("price per gallon: $");
		pricePerGallon = kbi.nextDouble();
		
		System.out.print("square feet of wall space per room: ");
		squareFeetPerRoom = kbi.nextInt();
		
		int totalSquareFeet = squareFeetPerRoom * numberOfRooms;
		
		System.out.println("\n\tthe total number of gallons of paint required: " + getGallonsQuantity(totalSquareFeet));
		
		System.out.println("\n\tthe total hours of labor: " + getLaborHours(getGallonsQuantity(totalSquareFeet)));
		
		System.out.println("\n\tthe total cost of the paint: $" + getTotalPaintCost(pricePerGallon, getGallonsQuantity(totalSquareFeet)));
		
		System.out.println("\n\tthe total labor charges: $" + getTotalLaborCharges(getLaborHours(getGallonsQuantity(totalSquareFeet)), hourlyLaborCharges));
		
		displayResult(getTotalPaintCost(pricePerGallon, getGallonsQuantity(totalSquareFeet)), 
					  getTotalLaborCharges(getLaborHours(getGallonsQuantity(totalSquareFeet)), hourlyLaborCharges));
		
		kbi.close();
	}
	
	public static void displayResult(double total_paint_cost, double total_labor_charges) {
		System.out.println("\n\tthe total cost of the paint job: $" + calculateTotalCost(total_paint_cost, total_labor_charges));
	}
	
	public static int getGallonsQuantity(int square_feet_per_room) {
		int gallonQuantity = square_feet_per_room / 115;
		return gallonQuantity;
	}
	
	public static int getLaborHours(int total_gallons_required) {
		int laborHours = total_gallons_required * 8;
		return laborHours;
	}
	
	public static double getTotalPaintCost(double price_per_gallon, int gallon_quantity) {
		double totalPaintCost = price_per_gallon * gallon_quantity;
		return totalPaintCost;
	}
	
	public static double getTotalLaborCharges(double total_labor_hours, double hourly_labor_charges) {
		double totalLaborCharges = total_labor_hours * hourly_labor_charges;
		return totalLaborCharges;
	}
	
	public static double calculateTotalCost(double total_paint_cost, double total_labor_charges) {
		double totalPaintJobCost = total_paint_cost + total_labor_charges;
		return totalPaintJobCost;
	}
}

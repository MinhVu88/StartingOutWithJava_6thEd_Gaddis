package challenges.ch8;

import java.util.Scanner;

/*
- The Westfield Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms 

[ To calculate the price, you multiply the area of the floor (width x length) by the price per square foot of carpet ] 

- For example, the area of floor that is 12 feet long & 10 feet wide is 120 square feet 

- To cover that floor with carpet that costs $8 per square foot would cost $960 (12 x 10 x 8 = 960)

- 1st, you should create a class named RoomDimension that has 2 fields: one for the length of the room & one for the width 

- The RoomDimension class should have a method that returns the area of the room (The area of the room is the room�s length multiplied by the room�s width)

- Next you should create a RoomCarpet class that has a RoomDimension object as a field 

- It should also have a field for the cost of the carpet per square foot 

- The RoomCarpet class should have a method that returns the total cost of the carpet

- Figure 8-21 is a UML diagram that shows possible class designs & the relationships among the classes 

- Once you have written these classes, use them in an application that asks the user to enter the dimensions of a room & the price per square foot of the desired carpeting 

- The application should display the total cost of the carpet 
*/

public class WestfieldCarpetCompany {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe width of a room: ");
		
		double width = kbi.nextDouble();
		
		System.out.print("\nthe length of a room: ");
		
		double length = kbi.nextDouble();
		
		RoomDimension d = new RoomDimension(width, length);
		
		System.out.print("\nthe price per square foot: $");
		
		double price = kbi.nextDouble();
		
		RoomCarpet c = new RoomCarpet(price, d);
		
		System.out.println("\n\t-> the total cost: $" + c.totalCost());
		
		kbi.close();
	}

}

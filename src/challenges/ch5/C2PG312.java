package challenges.ch5;
import java.util.Scanner;

/*
- Write a program that asks the user to enter an item�s wholesale cost and its markup percentage.

- It should then display the item�s retail price. For example:

� If an item�s wholesale cost is 5.00 and its markup percentage is 100 percent, then the item�s retail price is 10.00.

� If an item�s wholesale cost is 5.00 and its markup percentage is 50 percent, then the item�s retail price is 7.50.

- The program should have a method named calculateRetail that receives the wholesale cost and the markup percentage as arguments & returns the retail price of the item 
*/

public class C2PG312 {
	public static void main(String[] args) {
		double wholesaleCost; 
		int markupPercent;
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("enter the wholesale cost: $");
		wholesaleCost = kbi.nextDouble();
		
		System.out.println();
		
		System.out.print("enter the markup percentage: ");
		markupPercent = kbi.nextInt();
		
		System.out.println();
		
		System.out.println("the retail price: $" + calculateRetail(wholesaleCost, markupPercent));
		
		kbi.close();
	}
	
	public static double calculateRetail(double wholesale_cost, double markup_percent) {
		double retail_price = wholesale_cost + (wholesale_cost * (markup_percent/100));
		return retail_price;
	}
}

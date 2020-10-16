package ProgrammingChallenges.Ch8;

import java.util.Scanner;

import ProgrammingChallenges.Ch6.RetailItem;

public class CashRegisterTester {

	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe quantity of items being purchased: ");
		
		int quantity = kbi.nextInt();
		
		System.out.print("\nthe price per item: $");
		
		double price = kbi.nextDouble();
		
		RetailItem item = new RetailItem();
		
		item.setPrice(price);
		
		CashRegister sales = new CashRegister(item, quantity);
		
		System.out.println("\nthe sale's subtotal: $" + sales.getSubtotal());
		
		System.out.println("\nthe amount of sales tax: $" + sales.getTax());
		
		System.out.println("\nthe total cost: $" + sales.getTotal());
		
		kbi.close();
	}

}

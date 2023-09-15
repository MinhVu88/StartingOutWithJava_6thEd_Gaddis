package challenges.ch8;

import java.io.IOException;
import java.util.Scanner;

import challenges.ch6.RetailItem;

public class SalesReceiptFileTester {

	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe quantity of items being purchased: ");
		
		int quantity = kbi.nextInt();
		
		System.out.print("\nthe price per item: $");
		
		double price = kbi.nextDouble();
		
		RetailItem item = new RetailItem();
		
		item.setPrice(price);
		
		SalesReceiptFile receipt_0 = new SalesReceiptFile(item, quantity);
		
		kbi.nextLine();
		
		System.out.print("\nthe file name: ");
		
		String fileName = kbi.nextLine();
		
		SalesReceiptFile receipt_1 = new SalesReceiptFile(fileName);
		
		receipt_1.closeFile();
		
		kbi.close();
	}

}

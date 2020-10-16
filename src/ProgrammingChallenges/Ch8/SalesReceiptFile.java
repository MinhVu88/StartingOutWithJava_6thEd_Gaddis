package ProgrammingChallenges.Ch8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import ProgrammingChallenges.Ch6.RetailItem;

/*
- Modify the program you wrote in CashRegister.java to create a file containing a sales receipt 

- The program should ask the user for the quantity of items being purchased and then generate a file with contents similar to the following:

SALES RECEIPT:

Unit Price: $10.00

Quantity: 5

Subtotal: $50.00

Sales Tax: $ 3.00

Total: $53.00
*/

public class SalesReceiptFile {
	private File receipt;
	
	private PrintWriter outputFile;
	
	private RetailItem item;
	
	private int quantity;
	
	public SalesReceiptFile() {}

	/**
	 * @param fileName
	 */
	public SalesReceiptFile(String fileName) throws IOException {
		this.receipt = new File(fileName);
		
		if(!this.receipt.exists() && this.receipt != null) {
			System.out.println("\n" + fileName + " hasn't been created");
			
			outputFile = new PrintWriter(this.receipt);
			
			outputFile.println("SALES RECEIPT:");
			
			for(int line = 1; line <= 5; line++) {
				outputFile.println("unit price: $" + this.item.getPrice());
				
				outputFile.println("quantity: " + this.quantity);
				
				outputFile.println("sub-total: $" + getSubTotal());
				
				outputFile.println("sales tax: $" + getTax());
				
				outputFile.println("total: $" + getTotal());
			}
		}else {
			System.out.println("\n" + fileName + " has been created");
		}
	}	
	
	/**
	 * @param item a reference to/memory address of a RetailItem instance
	 * @param quantity
	 */
	public SalesReceiptFile(RetailItem item, int quantity) {
		this.item = new RetailItem(item);
		
		this.quantity = quantity;
	}
	
	public double getSubTotal() {
		return this.quantity * this.item.getPrice();
	}
	
	public double getTax() {
		return (this.item.getPrice() * 30) / 100;
	}
	
	public double getTotal() {
		return getSubTotal() + getTax();
	}
	
	public void closeFile() {
		this.outputFile.close();
	}

	/**
	 * @return the receipt
	 */
	public File getReceipt() {
		return this.receipt;
	}

	/**
	 * @param receipt the receipt to set
	 */
	public void setReceipt(File receipt) {
		this.receipt = receipt;
	}

	/**
	 * @return the outputFile
	 */
	public PrintWriter getOutputFile() {
		return this.outputFile;
	}

	/**
	 * @param outputFile the outputFile to set
	 */
	public void setOutputFile(PrintWriter outputFile) {
		this.outputFile = outputFile;
	}

	/**
	 * @return the item
	 */
	public RetailItem getItem() {
		return new RetailItem(this.item);
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(RetailItem item) {
		this.item = new RetailItem(item);
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return this.quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

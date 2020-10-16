package ProgrammingChallenges.Ch8;
import ProgrammingChallenges.Ch6.RetailItem;

/*
- Write a CashRegister class that can be used with the RetailItem class that you wrote in Chapter 6’s Programming Challenge 4 (RetailItem.java) 

- The CashRegister class should simulate the sale of a retail item 

- It should have a constructor that accepts a RetailItem object as an argument

- The constructor should also accept an integer that represents the quantity of items being purchased 

- In addition, the class should have the following methods:

• The getSubtotal method should return the subtotal of the sale = the quantity * by the price 

	+ This method must get the price from the RetailItem object that was passed as an argument to the constructor

• The getTax method should return the amount of sales tax on the purchase 

	+ The sales tax rate is 6% of a retail sale

• The getTotal method should return the total of the sale = the subtotal + the sales tax

- Demonstrate the class in a program that asks the user for the quantity of items being purchased and then displays the sale’s subtotal, amount of sales tax and total 
*/

public class CashRegister {
	private RetailItem item;
	
	private int quantity;

	public CashRegister() {}

	/**
	 * @param item a reference to a RetailItem object
	 * @param quantity
	 */
	public CashRegister(RetailItem item, int quantity) {
		this.item = new RetailItem(item);
		
		this.quantity = quantity;
	}
	
	public double getSubtotal() {
		return this.quantity * this.item.getPrice();
	}
	
	public double getTax() {
		return (this.item.getPrice() * 6) / 100;
	}
	
	public double getTotal() {
		return getSubtotal() + getTax();
	}

	/**
	 * @return the item a reference to/memory address of a copy of a RetailItem class's instance
	 */
	public RetailItem getItem() {
		return new RetailItem(this.item);
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(RetailItem item) {
		this.item = new RetailItem(this.item);
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

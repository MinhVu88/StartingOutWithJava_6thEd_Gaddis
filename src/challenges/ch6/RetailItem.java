package challenges.ch6;

/*
- Write a class named RetailItem that holds data about an item in a retail store 

- The class should have the following fields:

� description: The description field references a String object that holds a brief description of the item

� unitsOnHand: The unitsOnHand field is an int variable that holds the number of units currently in inventory

� price: The price field is a double that holds the item�s retail price

- Write a constructor that accepts arguments for each field, appropriate mutator methods that store values in these fields 
& accessor methods that return the values in these fields

- Once you have written the class, write a separate program that creates 3 RetailItem objects & stores the following data in them:

			Description 		Units on Hand 	Price
------------------------------------------------------			
Item #1 	Jacket 				12 				59.95
Item #2 	Designer Jeans 		40 				34.95
Item #3 	Shirt 				20 				24.95
*/

public class RetailItem {
	private String description;
	
	private int unitsOnHand;
	
	private double price;
	
	public RetailItem() {}
	
	/**
	 * a copy constructor (the class that uses/makes copies of the RetailItem class's instances: CashRegister.java - ch8, pc.6, pg. 556)
	 * 
	 * @param anotherRetailItemOject a reference to a copy of a RetailItem instance
	 */
	public RetailItem(RetailItem anotherRetailItemOject) {
		this.description = anotherRetailItemOject.description;
		
		this.unitsOnHand = anotherRetailItemOject.unitsOnHand;
		
		this.price = anotherRetailItemOject.price;
	}

	/**
	 * @param description
	 * @param unitsOnHand
	 * @param price
	 */
	public RetailItem(String description, int unitsOnHand, double price) {
		this.description = description;
		
		this.unitsOnHand = unitsOnHand;
		
		this.price = price;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the unitsOnHand
	 */
	public int getUnitsOnHand() {
		return unitsOnHand;
	}

	/**
	 * @param unitsOnHand the unitsOnHand to set
	 */
	public void setUnitsOnHand(int unitsOnHand) {
		this.unitsOnHand = unitsOnHand;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

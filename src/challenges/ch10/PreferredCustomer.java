package challenges.ch10;

/*
- A retail store has a preferred customer plan where customers can earn discounts on all their purchases 

- The amount of a customer�s discount is determined by the amount of the customer�s cumulative purchases in the store as follows:

	� When a preferred customer spends $500, he or she gets a 5 percent discount on all future purchases

	� When a preferred customer spends $1,000, he or she gets a 6 percent discount on all future purchases

	� When a preferred customer spends $1,500, he or she gets a 7 percent discount on all future purchases

	� When a preferred customer spends $2,000 or more, he or she gets a 10 percent discount on all future purchases

- Design a class named PreferredCustomer, which extends the Customer class 

- The PreferredCustomer class should have fields for the amount of the customer�s purchases & the customer�s discount level 

- Write 1 or more constructors & the appropriate mutator & accessor methods for the class�s fields 

- Demonstrate the class in a simple program
*/

public class PreferredCustomer extends Customer {
	private double expense;
	
	private int discountLevel;
	
	// a no-arg constructor
	public PreferredCustomer() {}

	/**
	 * @param name
	 * @param address
	 * @param phoneNo
	 * @param custNo
	 * @param onMailingList
	 */
	public PreferredCustomer(String name, String address, String phoneNo, String custNo, boolean onMailingList, double expense) {
		super(name, address, phoneNo, custNo, onMailingList);
		
		this.expense = expense;
		
		if(this.expense == 500) {
			this.discountLevel = 5;
		}else if(this.expense == 1000) {
			this.discountLevel = 6;
		}else if(this.expense == 1500) {
			this.discountLevel = 7;
		}else if(this.expense >= 2000) {
			this.discountLevel = 10;
		}
	}

	/**
	 * @param name
	 * @param address
	 * @param phoneNo
	 * @param custNo
	 */
	public PreferredCustomer(String name, String address, String phoneNo, String custNo, double expense) {
		super(name, address, phoneNo, custNo);
		
		this.expense = expense;
		
		if(this.expense == 500) {
			this.discountLevel = 5;
		}else if(this.expense == 1000) {
			this.discountLevel = 6;
		}else if(this.expense == 1500) {
			this.discountLevel = 7;
		}else if(this.expense >= 2000) {
			this.discountLevel = 10;
		}
	}

	/**
	 * @return the expense
	 */
	public double getExpense() {
		return expense;
	}

	/**
	 * @param expense the expense to set
	 */
	public void setExpense(double expense) {
		this.expense = expense;
		
		if(this.expense == 500) {
			this.discountLevel = 5;
		}else if(this.expense == 1000) {
			this.discountLevel = 6;
		}else if(this.expense == 1500) {
			this.discountLevel = 7;
		}else if(this.expense >= 2000) {
			this.discountLevel = 10;
		}
	}

	/**
	 * @return the discountLevel
	 */
	public int getDiscountLevel() {
		return discountLevel;
	}

	/**
	 * @param discountLevel the discountLevel to set
	 */
	public void setDiscountLevel(int discountLevel) {
		this.discountLevel = discountLevel;
	}

	@Override
	public String toString() {
		return super.toString() + "\n\n* His/her expense $" + expense + " & discount level: " + discountLevel + "%";
	}
	
	
}

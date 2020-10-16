package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

public class Stock {
	private String stockTradingSymbol;
	
	private double currentPricePerShare;
	
	// a no-args constructor
	public Stock() {}
	
	/**
	 * @param stockTradingSymbol
	 * @param currentPricePerShare
	 */
	public Stock(String stockTradingSymbol, double currentPricePerShare) {
		this.stockTradingSymbol = stockTradingSymbol;
		
		this.currentPricePerShare = currentPricePerShare;
	}
	
	/**
	 * this constructor uses the "this" keyword to call another constructor in the same class (these 2 constructors must be in the same class)
	 * then passes the value in symbol to stockTradingSymbol as the 1st argument & assigns 0.0 to currentPricePerShare as the 2nd argument
	 * 
	 * @param symbol a reference to a String object
	 */
	public Stock(String symbol) {
		this(symbol, 0.0); // must be the 1st statement in the constructor, otherwise a compiler error will occur
	}
	
	/**
	 * this constructor takes a reference to a Stock instance as an argument
	 * and copies anotherStockInstance's fields to the fields of the instance that's being created
	 * thus it makes the instance that's being created a duplicate of the one that was passed as an argument
	 * 
	 * in a nutshell, this constructor makes a copy of a particular instance of the Stock class (similar to the copy() method)
	 * 
	 * a copy constructor
	 * 
	 * @param anotherStockInstance a reference to a copy of a Stock instance, that's passed to the copy constructor as an argument
	 */
	public Stock(Stock anotherStockInstance) {
		this.stockTradingSymbol = anotherStockInstance.stockTradingSymbol;
		
		this.currentPricePerShare = anotherStockInstance.currentPricePerShare;
	}
	
	/**
	 * @return the stockTradingSymbol
	 */
	public String getStockTradingSymbol() {
		return stockTradingSymbol;
	}

	/**
	 * @param stockTradingSymbol the stockTradingSymbol to set
	 */
	public void setStockTradingSymbol(String stockTradingSymbol) {
		this.stockTradingSymbol = stockTradingSymbol;
	}

	/**
	 * @return the currentPricePerShare
	 */
	public double getCurrentPricePerShare() {
		return currentPricePerShare;
	}

	/**
	 * @param currentPricePerShare the currentPricePerShare to set
	 */
	public void setCurrentPricePerShare(double currentPricePerShare) {
		this.currentPricePerShare = currentPricePerShare;
	}
	
	/**
	 * This method returns a string representing the state of the object (the data that is stored in the object’s fields at any given moment) 
	 * The string will be appropriate for displaying on the screen
	 */
	public String toString() {
		// create & return a string describing the data stored in a stock instance's fields
		return "\n\ttrading symbol: " + this.stockTradingSymbol.toUpperCase() + " & current price per share: $" + this.currentPricePerShare;
	}
	
	/**
	 * this method can access anotherStockInstance's stockTradingSymbol & currentPricePerShare fields directly
	 * because the parameter references a class instance & the method itself is a class member
	 * thus the method is allowed to access anotherStockInstance's private fields
	 * 
	 * @param anotherStockInstance receives a reference to an instance of the Stock class that is passed to the method call as an argument
	 * @return true or false based on the contents stored in the instances
	 */
	public boolean equals(Stock anotherStockInstance) {
		if(this.stockTradingSymbol.equals(anotherStockInstance.stockTradingSymbol) && this.currentPricePerShare == anotherStockInstance.currentPricePerShare) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * this method, when invoked, makes a copy of a particular instance of the Stock class (similar to a copy constructor)
	 * 
	 * @return a reference to a duplicate instance to where the method's called
	 */
	public Stock copy() {
		// create a new Stock instance & initialize it with the same data held by the copied object
		Stock duplicateInstance = new Stock(this.stockTradingSymbol, this.currentPricePerShare);
		
		return duplicateInstance;
	}
}

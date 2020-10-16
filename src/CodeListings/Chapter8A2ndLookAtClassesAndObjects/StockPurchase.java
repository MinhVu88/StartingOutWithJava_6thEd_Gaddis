package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

public class StockPurchase {
	// a field object that purposely references a copied Stock instance & holds memory address of that copy
	private Stock stock;
	
	private int numberOfShares;
	
	public StockPurchase() {}
	
	/**
	 * 
	 * @param stockInstance a reference to a Stock instance
	 * @param numberOfShares
	 */
	public StockPurchase(Stock stockInstance, int numberOfShares) {
		// a Stock instance's memory address is referenced by stockInstance & passed to the constructor as an argument 
		// its memory address is then assigned to the field object stock
		this.stock = new Stock(stockInstance);
		
		this.numberOfShares = numberOfShares;
	}

	/**
	 * @return a copy's reference/memory address of a Stock instance
	 */
	public Stock getStock() {
		return new Stock(stock);
	}

	/**
	 * @return the numberOfShares
	 */
	public int getNumberOfShares() {
		return numberOfShares;
	}
	
	public double getCostOfPurchasedStock() {
		return numberOfShares * stock.getCurrentPricePerShare(); // the Stock class's getCurrentPricePerShare method is called
	}
}

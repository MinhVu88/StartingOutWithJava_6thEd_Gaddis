package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

import java.util.Scanner;

public class StockTrader {

	public static void main(String[] args) {
		int numberOfShares;
		
		Scanner kbi = new Scanner(System.in);
		
		// create a Stock instance with the trading symbol is WYC & the price per share is $369.69
		Stock Weyland_Yutani = new Stock("WYC", 369.69);
		
		System.out.println("\nWYC current price per share: $" + Weyland_Yutani.getCurrentPricePerShare());
		
		System.out.print("\nthe number of shares to buy: ");
		
		numberOfShares = kbi.nextInt();
		
		// create a StockPurchase instance for the transaction
		StockPurchase transaction = new StockPurchase(Weyland_Yutani, numberOfShares);
		
		System.out.println("\ncost of the purchased stock: $" + transaction.getCostOfPurchasedStock());
		
		kbi.close();
	}

}

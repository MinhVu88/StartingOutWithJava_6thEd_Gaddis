package ProgrammingChallenges.Ch5;
import java.util.Scanner;

/*
- Use the method that you wrote for pc10pg315 in a program that calculates the total profit or loss from the sale of multiple stocks 

- The program should ask the user for the number of stock sales & the necessary data for each stock sale 

- It should accumulate the profit or loss for each stock sale & then display the total
*/

public class pc11pg315 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe number of stock sales: ");
		int numberOfStocks = kbi.nextInt();
		
		while(numberOfStocks < 0) {
			System.out.println("\ninvalid input. plz try again");
			System.out.print("\nthe number of stock sales: ");
			numberOfStocks = kbi.nextInt();
		}
		
		double profitPerStockSale = 0.0, lossPerStockSale = 0.0, totalProfit = 0.0, totalLoss = 0.0;
		
		for(int oneStock = 1; oneStock <= numberOfStocks; oneStock++) {
			System.out.println("\n* enter the necessary data for stock sale #" + oneStock + ": ");
			
			System.out.print("\n\tthe number of shares (ns): ");
			int numberOfShares = kbi.nextInt();
			
			System.out.print("\n\tthe purchase price per share (pp): ");
			double purchasePricePerShare = kbi.nextDouble();
			
			System.out.print("\n\tthe purchase commission paid (pc): ");
			double purchaseCommissionPaid = kbi.nextDouble();
			
			System.out.print("\n\tthe sale price per share (sp): ");
			double salePricePerShare = kbi.nextDouble();
			
			System.out.print("\n\tthe sale commission paid (sc): ");
			double saleCommissionPaid = kbi.nextDouble();
			
			double stockValuesPerSale = calculate1StockSale(numberOfShares, purchasePricePerShare, purchaseCommissionPaid, salePricePerShare, saleCommissionPaid);
			
			if(stockValuesPerSale > 0) {
				profitPerStockSale =+ stockValuesPerSale;
				System.out.println("\n-> the profit of stock sales #" + oneStock + ": " + profitPerStockSale);
				totalProfit += profitPerStockSale;
			}else {
				lossPerStockSale =+ stockValuesPerSale;
				System.out.println("\n-> the loss of stock sales #" + oneStock + ": " + lossPerStockSale);
				totalLoss += lossPerStockSale;
			}
		}
		
		System.out.println("\n\t=> the total profit of the stock sales: " + totalProfit);
		System.out.println("\n\t=> the total loss of the stock sales: " + totalLoss);
		
		kbi.close();
	}
	
	public static double calculate1StockSale(int ns, double pp, double pc, double sp, double sc) {
		double stockValues = ((ns * sp) - sc) - ((ns * pp) + pc);
		return stockValues;
	}
}

package challenges.ch5;
import java.util.Scanner;

/*
- The profit from the sale of a stock can be calculated as follows: Profit = ((NS * SP) - SC) - ((NS * PP) + PC)

	+ NS: the number of shares 

	+ PP: the purchase price per share 

	+ PC: the purchase commission paid 

	+ SP: the sale price per share 

	+ SC: the sale commission paid 

- If the calculation yields a positive value, then the sale of the stock resulted in a profit 

- If the calculation yields a negative number, then the sale resulted in a loss

- Write a method that accepts the number of shares, the purchase price per share, 
	the purchase commission paid, the sale price per share & the sale commission paid as arguments
	
- The method should return the profit (or loss) from the sale of stock 

- Demonstrate the method in a program that asks the user to enter the necessary data & displays the amount of the profit or loss
*/

public class C10PG315 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe number of shares (ns): ");
		int numberOfShares = kbi.nextInt();
		
		System.out.print("\nthe purchase price per share (pp): ");
		double purchasePricePerShare = kbi.nextDouble();
		
		System.out.print("\nthe purchase commission paid (pc): ");
		double purchaseCommissionPaid = kbi.nextDouble();
		
		System.out.print("\nthe sale price per share (sp): ");
		double salePricePerShare = kbi.nextDouble();
		
		System.out.print("\nthe sale commission paid (sc): ");
		double saleCommissionPaid = kbi.nextDouble();
		
		double stock_values = calculateStockValues(numberOfShares, purchasePricePerShare, purchaseCommissionPaid, salePricePerShare, saleCommissionPaid);
		
		if(stock_values > 0) {
			System.out.println("\n-> profit: " + stock_values);
		}else {
			System.out.println("\n-> loss: " + stock_values);
		}
		
		kbi.close();
	}
	
	public static double calculateStockValues(int ns, double pp, double pc, double sp, double sc) {
		double stockValues = ((ns * sp) - sc) - ((ns * pp) + pc);
		return stockValues;
	}
}

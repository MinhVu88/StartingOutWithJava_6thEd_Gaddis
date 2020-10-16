package CodeListings.Chapter7ArraysAndTheArrayListClass;
import java.util.Scanner;

// This program uses a 2-dimensional array to calculate the total sales of all the company's divisions quarterly 

public class CorpSales {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		final int QUARTERS = 4;
		
		System.out.print("\nthe number of divisions: ");
		
		int divisions = kbi.nextInt();
		
		double totalSales = 0.0; // accumulator
		
		double[][] sales = new double[divisions][QUARTERS]; // rows: divisions - columns: quarters
		
		// use nested loops to fill the 2-D array with quarterly sales figures for each division
		System.out.println("\nenter the company's quarterly sales figures for each of its divisions in order to calculate the total sales:");
		
		for(int rows = 0; rows < divisions; rows++) {
			for(int cols = 0; cols < QUARTERS; cols++) {
				System.out.print("\n\tdivision #" + (rows + 1) + ", quarter #" + (cols + 1) + ": $");
				
				sales[rows][cols] = kbi.nextDouble();
			}
			
			System.out.println(); // a blank line between divisions
		}
		
		// use nested loops to accumulate the quarterly sales figures
		for(int div = 0; div < divisions; div++) {
			for(int qrt = 0; qrt < QUARTERS; qrt++) {
				totalSales += sales[div][qrt];
			}
		}
		
		System.out.println("\n-> the total sales: $" + totalSales);
		
		kbi.close();
	}
}

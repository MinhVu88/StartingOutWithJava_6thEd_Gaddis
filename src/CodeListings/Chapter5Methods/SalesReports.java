package CodeListings.Chapter5Methods;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

/* description:

- This program reads 30 days of sales amounts from a file & then displays the total sales & average daily sales 

Here’s a brief pseudocode model of the algorithm:

- Ask the user to enter the name of the file

- Get the total of the sales amounts in the file

- Calculate the average daily sales

- Display the total & average daily sales

Instead of writing the entire program in the main method, the algorithm was broken down into the following methods:

• getFileName—This method displays an input dialog box asking the user to enter the name of the file containing 30 days of sales amounts 

The method returns a reference to a String object containing the name entered by the user

• getTotalSales—This method accepts the name of a file as an argument 

The file is opened, the sales amounts are read from it & the total of the sales amounts is accumulated

The method returns the total as a double

• displayResults—This method accepts as arguments the total sales & the average daily sales 

It displays a message dialog box indicating these values
*/

public class SalesReports {
	public static void main(String[] args) throws IOException {
		final int days = 30;
		
		String fileName = getFileName();
		
		double total_sales = getTotalSales(fileName, days);
		
		double average_daily_sales = total_sales / days;
		
		displayResults(total_sales, average_daily_sales);
		
		System.exit(0);
	}
	
	/**
	 The getFileName method prompts the user to enter the name of the file to open
	 @return A reference to a String object containing the name of the file.
	*/
	public static String getFileName() {
		String file_name = JOptionPane.showInputDialog("enter the file name:");
		return file_name;
	}
	
	/**
	 The getTotalSales method opens a file & reads the daily sales amounts, accumulating the total 
	 The total is returned
	 @param filename The name of the file to open.
	 @return The total of the sales amounts.
	*/
	public static double getTotalSales(String file_name, int days) throws IOException {
		double dailySales, totalSales = 0.0; // totalSales is an accumulator
		
		Scanner kb = new Scanner(System.in);
		
		// write data to the file
		PrintWriter outputFile = new PrintWriter(file_name);
		
		for(int day = 1; day <= days; day++) {
			System.out.print("the sales in day " + day + ": ");
			dailySales = kb.nextDouble();
			outputFile.println(dailySales);
		}
		
		outputFile.close();
		kb.close();
		
		// open the file & read data from it
		File file = new File(file_name);
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			dailySales = inputFile.nextDouble();
			totalSales += dailySales;
		}
		
		inputFile.close();
		
		return totalSales;
	}
	
	/**
	 The displayResults method displays the total & average daily sales.
	 @param total The total sales.
	 @param avg The average daily sales.
	*/
	public static void displayResults(double totalSales, double averageDailySales) {
		JOptionPane.showMessageDialog(null, "the total monthly sales: $" + totalSales + " - the average daily sales: $" + averageDailySales);
	}
}

package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

// This program demonstrates how multiple exceptions can be caught with 1 try statement

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class SalesReport {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog("enter the file name:");
		
		int monthCounter = 0;
		
		double salesPerMonth, averageSales, totalSales = 0.0;
		
		File file = new File(fileName);
		
		try {
			PrintWriter outputFile = new PrintWriter(file);
			
			outputFile.println(24987.62); // sales 1 month
			
			outputFile.println(26978.97);
			
			outputFile.println(32589.45);
			
			outputFile.println(31978.47);
			
			outputFile.println(22781.76);
			
			outputFile.println(29871.44);
			
			outputFile.close();
		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		try {
			Scanner inputFile = new Scanner(file);
			
			while(inputFile.hasNext()) {
				salesPerMonth = inputFile.nextDouble();
				
				totalSales += salesPerMonth;
				
				monthCounter++;
			}
			
			inputFile.close();
				
			averageSales = totalSales / monthCounter;
				
			JOptionPane.showMessageDialog(null, "Number of months: " + monthCounter + "\nTotal sales: $" + totalSales + "\nAverage sales: $" + averageSales);
		
		}catch (FileNotFoundException e) {
			// thrown by the Scanner constructor when the file isn't found
			JOptionPane.showMessageDialog(null, fileName + " doesn't exit");
		
		}catch (InputMismatchException e) {
			// thrown by the Scanner class's nextDouble() when a non-numeric value is found
			JOptionPane.showMessageDialog(null, "Non-numeric data found in the file");
		}
		
		System.exit(0);
	}

}

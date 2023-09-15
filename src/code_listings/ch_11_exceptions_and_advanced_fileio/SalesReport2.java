package code_listings.ch_11_exceptions_and_advanced_fileio;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

// This program demonstrates how exception handlers can be used to recover from errors

public class SalesReport2 {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog("enter the file name:");
		
		int monthCounter = 0;
		
		double salesPerMonth, averageSales, totalSales = 0.0;
		
		/*
		File file = new File(fileName);
		
		try {
			PrintWriter outputFile = new PrintWriter(file);
			
			outputFile.println(24987.62); // sales 1 month
			
			outputFile.println(26978.97);
			
			outputFile.println("abcdefg");
			
			outputFile.println(31978.47);
			
			outputFile.println(22781.76);
			
			outputFile.println(29871.44);
			
			outputFile.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		*/
		
		// call openFile() to assign a Scanner instance's reference to inputFile
		Scanner inputFile = openFile(fileName);
		
		// if openFile() returns a null reference, the file is not found/doesn't exist 
		// Then you'll have to pick another filename that makes openFile() no longer returns null
		while(inputFile == null) {
			inputFile = openFile(JOptionPane.showInputDialog(fileName + " doesn't exit. Plz try another filename: "));
		}
		
		// if the file exists, then process the file's contents
		while(inputFile.hasNext()) {
			try {
				salesPerMonth = inputFile.nextDouble();
				
				totalSales += salesPerMonth;
				
				monthCounter++;
			
			}catch (InputMismatchException e) {
				JOptionPane.showMessageDialog(null, "ERROR: Non-numeric value found the file. This value will be skipped");
			
				inputFile.nextLine(); // skip the non-numeric data
			}
		}
		
		inputFile.close();
		
		averageSales = totalSales / monthCounter;
		
		JOptionPane.showMessageDialog(null, "Number of months: " + monthCounter + "\nTotal sales: $" + totalSales + "\nAverage sales: $" + averageSales);
		
		System.exit(0);
	}
	
	/**
	 * this method creates a File instance, named file, to represent fileName passed to it as an argument
	 * 
	 * then it declares a Scanner instance, whose constructor takes file as its argument
	 * 
	 * if fileName doesn't exist, the Scanner instance's reference is returned as null
	 * 
	 * if fileName does exist, the Scanner instance's reference is returned to where the method's called 
	 * 
	 * @param fileName the specified file to open & read
	 * @return a reference to a Scanner instance if the file exists. Otherwise, null is returned
	 */
	private static Scanner openFile(String fileName) {
		Scanner ScannerInstance;
		
		try {
			File file = new File(fileName);
			
			ScannerInstance = new Scanner(file);
		
		} catch (FileNotFoundException e) {
			ScannerInstance = null;
		}
		
		return ScannerInstance;
	}
}

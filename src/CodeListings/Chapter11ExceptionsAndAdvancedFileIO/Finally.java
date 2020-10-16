package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

/*
- the program demonstrates the finally clause, which must appear after all of the catch clauses

- The finally block is 1 or more statements that are always executed after the try block has executed & 
	after any catch blocks have executed if an exception was thrown

- The statements in the finally block execute whether an exception occurs or not
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		try {
			// open the file
			File file = new File("Withdrawals.txt");
			
			Scanner inputFile = new Scanner(file);
			try {
				// read & display the file's contents
				while(inputFile.hasNext()) {
					System.out.println("\n" + inputFile.nextDouble());
				}
			}catch (InputMismatchException e) {
				System.out.println("\ninvalid data found");
			} finally {
				// The finally block closes the file regardless of whether an InputMismatchException occurs
				inputFile.close();
			}
		} catch (FileNotFoundException e) {
			System.out.println("\nWithdrawals.txt doesn't exist");
		}
	}

}

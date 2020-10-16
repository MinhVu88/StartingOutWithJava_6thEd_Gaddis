package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

// This program demonstrates how multiple exceptions can be caught with a single catch clause

/*
- Beginning with Java 7, a catch clause can handle more than 1 type of exception

- This can reduce a lot of duplicated code in a try statement that needs to catch multiple exceptions but perform the same operation for each one
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			File file = new File("Deposit.txt");
			
			Scanner inputFile = new Scanner(file);
			
			while(inputFile.hasNext()) {
				System.out.println("\n" + inputFile.nextDouble());
			}
			
			inputFile.close();
		}
		
		/*
		 - in the catch clause, the exception types are separated by a | symbol (the same symbol for the logical OR operator) 
		 
		 - This means that the clause will catch a NumberFormatException or an IOException
		 
		 - The ability to catch multiple types of exceptions with a single catch clause is known as multi-catch
		 */
		
		catch (FileNotFoundException | InputMismatchException e) {
			System.out.println("\nError while processing the file");
		}
	}

}

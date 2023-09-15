package code_listings.ch_11_exceptions_and_advanced_fileio;

// This program opens a binary file and writes the contents of an int array to the file

import java.io.*;
import java.util.Scanner;

public class WriteBinaryFile {

	public static void main(String[] args) throws IOException {
		int[] numbers = {23, 47, 51, 7, 69, 88, 14};
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		DataOutputStream outputFile = new DataOutputStream(new FileOutputStream(fileName));
		
		for(int index = 0; index < numbers.length; index++) {
			outputFile.writeInt(numbers[index]);
		}		
		
		outputFile.close();
		
		kbi.close();
		
		System.out.println("\n\tdone");
	}

}

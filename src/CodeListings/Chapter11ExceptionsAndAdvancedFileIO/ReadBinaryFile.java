package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadBinaryFile {

	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		DataInputStream inputFile = new DataInputStream(new FileInputStream(fileName));
		
		System.out.print("\nthe numbers in " + fileName + ": ");
		
		boolean endOfFile = false;
		
		while(!endOfFile) {
			try {
				int number = inputFile.readInt();
				
				System.out.print(" " + number);
			} catch (EOFException e) {
				endOfFile = true;
			}
		}
		
		inputFile.close();
		kbi.close();
		
		System.out.println("\n\tdone");
	}

}

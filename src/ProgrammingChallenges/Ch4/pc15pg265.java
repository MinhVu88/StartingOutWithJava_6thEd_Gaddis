package ProgrammingChallenges.Ch4;
import java.util.Scanner;
import java.io.*;

/*
- Write a program that asks the user for the names of 2 files. 

- The 1st file should be opened for reading (inputFile) & the 2nd file should be opened for writing (outputFile) 

- The program should read the contents of the 1st file, change all characters to uppercase & store the results in the 2nd file. 

- The 2nd file will be a copy of the 1st file, except that all the characters will be uppercase. 

- Use Notepad or another text editor to create a simple file that can be used to test the program
*/

public class pc15pg265 {
	
	private static Scanner kbi = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		String fileName1, fileName2; // fileName1: outputFile - fileName2: inputFile
		int theInnerCircle = 5;
		
		System.out.print("- enter file name 1: ");
		fileName1 = kbi.nextLine();
		
		System.out.println();
		
		System.out.print("- enter file name 2: ");
		fileName2 = kbi.nextLine();
		
		File file_0 = new File(fileName1); // lowercase-letter file
		
		System.out.println();
		
		if(!file_0.exists()) {
			System.out.println("\t- " + file_0 + " is non-existent, thus suitable for output\n");
		}
		
		System.out.println("- write the names of the disciples to " + file_0 + ":");
		
		PrintWriter outputFile_0 = new PrintWriter(file_0);
		
		for(int member = 1; member <= theInnerCircle; member++) {
			System.out.print("\n\t- ");
			String members = kbi.nextLine();
			outputFile_0.println("\t\n" + members);
		}
		
		outputFile_0.close();
		
		File file_1 = new File(fileName2); // uppercase-letter file
		
		PrintWriter outputFile_1 = new PrintWriter(file_1);
		
		Scanner inputFile = new Scanner(file_0);
		
		while(inputFile.hasNext()) {
			String uppercaseLetters = inputFile.nextLine().toUpperCase();
			outputFile_1.println("\t\n" + uppercaseLetters);
		}
		
		outputFile_1.close();
		inputFile.close();
	}
}

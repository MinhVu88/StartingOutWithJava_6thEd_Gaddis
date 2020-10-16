package ProgrammingChallenges.Ch4;
import java.util.Scanner;
import java.io.*;

/*
- Write a program that asks the user for the name of a file. 
- The program should display the contents of the file with each line preceded with a line number followed by a colon. 
- The line numbering should start at 1
*/

public class pc14pg265 {
	
	private static Scanner kbi = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		//Scanner kbi = new Scanner(System.in);
		String fileName;
		int lineNumber = 1;
		
		System.out.print("enter the file name: ");
		fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		System.out.println();
		
		if(file.exists()) {
			System.out.println(fileName + " exists");
			//System.exit(0);
		}
		
		System.out.println();
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			System.out.print(lineNumber + ": ");
			String lines = inputFile.nextLine();
			System.out.println(lines);
			lineNumber++;
		}
		//kbi.close();
		inputFile.close();
	}
}

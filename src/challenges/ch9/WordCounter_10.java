package challenges.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
- Write a program that asks the user for the name of a file 

- The program should display the number of words that the file contains
*/

public class WordCounter_10 {

	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n" + fileName + " has been created");
		}else {
			System.out.println("\n" + fileName + " hasn't been created");
		}
		
		PrintWriter outputFile = new PrintWriter(file);
		
		outputFile.println("i am a solitary creature that follows a solitary path"); 
				
		outputFile.close();
		
		Scanner inputFile = new Scanner(file);
		
		String[] words = {};
		
		while(inputFile.hasNext()) {
			words = inputFile.nextLine().split(" ");
		}
		
		inputFile.close();
		
		System.out.println("\nthe total number of words in " + fileName + ": " + words.length);
		
		kbi.close();
	}

}

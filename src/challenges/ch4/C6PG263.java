package challenges.ch4;
import java.util.Scanner;
import java.io.*;

/*
- Write a program that asks the user to enter the name of a file & then asks the user to enter a character 
- The program should count & display the number of times that the specified character appears in the file 
- Use Notepad or another text editor to create a simple file that can be used to test the program
*/

public class C6PG263 {
	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in); 
		
		System.out.print("enter the file name: ");
		String fileName = kbi.nextLine();
		
		System.out.print("the string contents: ");
		String stringContents = kbi.nextLine();
		
		System.out.print("enter a char: ");
		char aChar = kbi.nextLine().charAt(0);
		
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.println(fileName + " doesn't exist yet");
		}
		
		PrintWriter outputFile = new PrintWriter(fileName);
		
		outputFile.print("The string contents: ");
		
		outputFile.println(stringContents);
		
		outputFile.println("----------------------------");
		
		int charTotal = 0;
		
		for(int charCount = 0; charCount < stringContents.length(); charCount++) {
			if(stringContents.charAt(charCount) == aChar) {
				charTotal++;
			}
		}
		
		outputFile.println(aChar + " appears in " + fileName + " " + charTotal + " times");
		
		outputFile.close();
		kbi.close();
	}
}

package CodeListings.Chapter4LoopsAndFiles;
import java.util.Scanner;
import java.io.*;

/* description: 

- The Scanner class’s nextLine method reads a line of input & returns the line as a String
- This program demonstrates how the nextLine method can be used to read a line from a file 
- It asks the user to enter a filename, then displays the 1st line as well as the remaining lines in the file on the console
*/


public class ReadFirstLine {
	public static void main(String[] args) throws IOException {
		// the Scanner class's kb instance is created to read keyboard input
		Scanner kb = new Scanner(System.in);
		
		// the 1st String object, fileName, is created to hold the keyboard input (the name of the file)
		System.out.print("enter the file name: ");
		String fileName = kb.nextLine();
		
		// an object of the File class is created, file, to represent the specific file from which data is read (the file that the user wants to open)
		// file's internal read position is set to the 1st item in it
		// when the 1st item is read, the read position advances to the next one & keeps going until it reaches the last item in file
		File file = new File(fileName);
		
		// the Scanner class's inputFile instance is created to read data from the File class's file object, whose reference is passed to the Scanner class constructor as an argument
		Scanner inputFile = new Scanner(file); 
		
		// the 2nd String object, firstLine, is created to read the 1st line of file
		String firstLine = inputFile.nextLine();
		System.out.println("the 1st line in the file: " + firstLine);
		
		// more String instances are created to read the lines from the file
		String secondLine = inputFile.nextLine();
		System.out.println("the 2nd line in the file: " + secondLine);
		
		String thirdLine = inputFile.nextLine();
		System.out.println("the 3rd line from the file: " + thirdLine);
		
		// close the file
		inputFile.close();
		kb.close();
	}
}

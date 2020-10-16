package CodeListings.Chapter4LoopsAndFiles;
import java.util.Scanner;
import java.io.*;

/* description:

- FileSum2.java shows you how to make sure that a file exists before trying to open it for input/reading data from it 

- But when you are opening a file for output/writing data to it, sometimes you want to make sure the file doesn't exist 

- When you use a PrintWriter object to open a file, the file will be erased if it already exists 

- If you don't want to erase the existing file, you have to check for its existence before creating the PrintWriter object 

- This program shows you how to use the File class’s exists method in this type of situation 

- This is a modification of FileWriteDemo.java
*/

public class FileWriteDemo2 {
	public static void main(String[] args) throws IOException {
		String fileName, friendName;
		int numberOfFriends;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter the file name: ");
		fileName = kb.nextLine();
		
		System.out.print("enter the number of friends: ");
		numberOfFriends = kb.nextInt();
		
		kb.nextLine();
		
		// check the existence of the file to make sure it hasn't been created yet
		File file = new File(fileName);
		if(file.exists()) {
			System.out.println(fileName + " already exists");
			System.exit(0);
		}
		
		PrintWriter outputFile = new PrintWriter(fileName); // open the file for output
		
		for(int i = 1; i <= numberOfFriends; i++) {
			System.out.print("enter the name of friend number " + i + ": ");
			friendName = kb.nextLine(); // get the names from keyboard input
			outputFile.println(friendName); // write the names to the file
		}
		
		outputFile.close();
		kb.close();
		
		System.out.println("\tdata has been written to the file");
	}
}

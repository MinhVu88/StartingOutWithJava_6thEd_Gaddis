package CodeListings.Chapter4LoopsAndFiles;
import java.util.Scanner;
import java.io.*;

/* reminder:   

- Make sure that a file exists before you try to open it for input/reading data from it 
- If you attempt to open a file for input & the file does not exist, the program will throw an exception & halt
*/

/* description: 

- after you create a File object representing the file that you want to open, you can use the File class’s exists method to determine whether the file exists 
- the method returns true if the file exists or false if the file does not exist
- this program is a modification of FileSum.java, which checks for the existence of a file called numbers.txt before the program attempts to open it
*/

public class FileSum2 {
	public static void main(String[] args) throws IOException {
		double total = 0.0; // an accumulator that's initialized to 0.0
		
		File file = new File("number.txt");
		
		// check the existence of number.txt to make sure it was created
		if(!file.exists()) {
			System.out.println("number.txt does not exist");
			System.exit(0); // the system.exit(0) method is called to shut the program down
		}
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			double value = inputFile.nextDouble();
			total += value;
		}
		
		inputFile.close();
		
		System.out.println("the total value in number.txt: " + total);
	}
}

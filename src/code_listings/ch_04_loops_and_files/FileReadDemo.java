package code_listings.ch_04_loops_and_files;
import java.util.Scanner;
import java.io.*;

/* description: this program reads the file that contains the names specified in MyFriends.txt, which is created in FileWriteDemo.java by using the Scanner class's hasNext method */

/* ipo:

- input: the file name
- process:
			+ get the keyboard input for fileName
			+ create instances of the Scanner & File classes for reading keyboard input & reading data from file
			+ use a while loop to check the data quantity in the file & then display the data on the console
			+ the iteration process continues until the loop condition returns false 
- output: the names in the specified file (MyFriends.txt) are displayed on the console
*/

/* pseudocode:

- create a Scanner class's instance: kb
- display "enter the file name: "
- keyboard input: fileName
- create a File class's instance: file
- create another Scanner class's instance: inputFile
- while inputFile.hasNext():
 	+ 
*/

public class FileReadDemo {
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter the file name: ");
		String fileName = kb.nextLine();
		
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		/* The while loop reads all of the lines from the file & displays them 
		 * The loop calls the Scanner object�s hasNext method 
		 * If the method returns true, then the file has more data to read 
		 * In that case, the next line is read from the file & is displayed on the console 
		 * The loop repeats until the hasNext method returns false
		 */
		while(inputFile.hasNext()) {
			String friendName = inputFile.nextLine();
			System.out.println(friendName);
		}
		
		inputFile.close();
		kb.close();
	}
}
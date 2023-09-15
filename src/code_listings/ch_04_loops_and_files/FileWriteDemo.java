package code_listings.ch_04_loops_and_files;
import java.util.Scanner; 
import java.io.*;

/* description:

- This program writes the names of your friends to a file 
- It asks the user to enter the number of his/her friends as well as the file name
*/

/* ipo:

- input: the name of the file, the names of your friends, the number of friends
- process:
	+ get keyboard input for the file name, the names of friends & the number of friends
	+ create instances of the PrintWriter, FileWriter & Scanner classes which use certain methods such as print or println to write or add data to the file
	+ loop thru the number of friends with each iteration asking for their names
- output: a text file that contains the names of the friends that are written or added to it
*/

/* pseudocode:

- declare String var(s): fileName, friendName
- declare int var(s): numberOfFriends
- create a Scanner class object: kb
- display "enter the file name: "
- keyboard input: fileName
- display "enter the number of friends: "
- keyboard input: numberOfFriends
- create a PrintWriter class object: outputFile_0
- for i = 1 to numberOfFriends:
	+ display "enter the name of friend number ", i, ": "
	+ keyboard input: friendName
	+ file input: friendName
- create a FileWriter class object: newFriend
- create another PrintWriter class object: outputFile_1
- append extra data to the file
- close the file
*/

public class FileWriteDemo {
	public static void main(String[] args) throws IOException {
		String fileName, friendName;
		int numberOfFriends;
		
		Scanner kb = new Scanner(System.in); // a Scanner object named kb is created for keyboard input
		
		System.out.print("enter the file name: ");
		fileName = kb.nextLine();
		
		System.out.print("enter the number of friends: ");
		numberOfFriends = kb.nextInt();
		
		kb.nextLine(); // consume the remaining newline character
		
		// a PrintWriter class's object named outputFile_0 is created to write data to the fileName String object, whose reference is passed to the PrintWriter class constructor as an argument
		PrintWriter outputFile_0 = new PrintWriter(fileName);
		
		// The for loop performs an iteration for each friend that the user has, each time asking for the name of a friend 
		// The user�s input is referenced by the friendName variable
		for(int i = 1; i <= numberOfFriends; i++) {
			// get the name (data) as keyboard input
			System.out.print("enter the name of friend number " + i + ": ");
			friendName = kb.nextLine();
			
			// write the name/data to the file by using the println method
			outputFile_0.println(friendName);
		}
		
		// append additional data to the file
		FileWriter newFriend = new FileWriter(fileName, true); // an instance of the FileWriter class is created & accepts 2 arguments: the file name & a boolean value: true
		PrintWriter outputFile_1 = new PrintWriter(newFriend); // a reference to the newFriend object is passed to the PrintWriter class constructor as an argument
		outputFile_1.println("justin");
		
		// close the file
		outputFile_0.close();
		outputFile_1.close();
		kb.close();
		
		System.out.println("\tdata has been written to the file");
	}
}

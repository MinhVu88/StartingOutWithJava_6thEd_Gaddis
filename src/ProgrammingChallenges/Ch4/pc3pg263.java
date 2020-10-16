package ProgrammingChallenges.Ch4;
import java.io.*;
import java.util.Scanner;

/* 
- Modify pc2pg263 so it writes the report to a file (pc3pg263.txt) instead of the screen 
- Open the file in Notepad or another text editor to confirm the output 
*/

public class pc3pg263 {
	public static void main(String[] args) throws IOException {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("enter the file name: ");
		String fileName = kb.nextLine();
		
		int distance;
		
		System.out.print("the speed (miles-per-hour): ");
		int speed = kb.nextInt();
		
		System.out.print("the number of hours you've traveled: ");
		int hoursTraveled = kb.nextInt();
		
		kb.nextLine();
				
		File file = new File(fileName);
		
		if(!file.exists()) {
			System.out.println(fileName + " hasn't been created yet");
		}
		
		PrintWriter outputFile = new PrintWriter(fileName);
		
		outputFile.println("Hour                   Distance Traveled");
		outputFile.println("------------------------------------------");
		
		for(int hour = 1; hour <= hoursTraveled; hour++) {
			outputFile.print(hour + "                              ");
			distance = speed * hour;
			outputFile.println(distance);
		}
		
		outputFile.close();
		kb.close();
	}
}

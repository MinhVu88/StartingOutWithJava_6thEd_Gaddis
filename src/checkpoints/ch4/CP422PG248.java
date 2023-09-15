package checkpoints.ch4;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* description:

- You are opening an existing file (MyName.txt) for new output/writing new data to it 
- How do you open the file without erasing the existing data that has been present there? 
- can you make sure that the new data will be appended to the end of the file�s existing contents? 
*/

public class CP422PG248 {
	public static void main(String[] args) throws IOException {
		File file = new File("MyName.txt");
		
		if(!file.exists()) {
			JOptionPane.showMessageDialog(null, "new data can be appended to MyName.txt as it hasn't been created");
		}
		
		// adding/appending new data to the existing file
		FileWriter newData = new FileWriter(file, true);
		PrintWriter outputFile = new PrintWriter(newData);
		
		outputFile.println("James Gosling");
		outputFile.println("Dennis Ritchie");
		outputFile.println("Bjarne Stroustrup");
		outputFile.println("Guido van Rossum");
		outputFile.println("Brendan Eich");
		
		outputFile.close();
		
		// reading & displaying the old & new data
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			String lines = inputFile.nextLine();
			JOptionPane.showMessageDialog(null, lines);
		}
		
		// close the file
		inputFile.close();
		System.exit(0);
	}
}

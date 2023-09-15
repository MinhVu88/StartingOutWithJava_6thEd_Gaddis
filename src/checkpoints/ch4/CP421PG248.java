package checkpoints.ch4;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* description:

- check the existence of MyName.txt before opening it for input/reading data from it
- if it exists, open it
- read the 1st line from the file & display that line 
- then close the file 
*/

public class CP421PG248 {
	public static void main(String[] args) throws IOException {
		File file = new File("MyName.txt");
		
		if(file.exists()) {
			JOptionPane.showMessageDialog(null, "data can be read from MyName.txt as it exists");
		}
		
		Scanner inputFile = new Scanner(file);
		
		while(inputFile.hasNext()) {
			String line = inputFile.nextLine();
			JOptionPane.showMessageDialog(null, line);
		}
		
		inputFile.close();
		System.exit(0);
	}
}

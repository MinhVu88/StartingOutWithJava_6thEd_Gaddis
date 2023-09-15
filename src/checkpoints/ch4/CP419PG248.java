package checkpoints.ch4;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/* description: 

- opens a file named MyName.txt 
- writes your name to the file
- then closes the file 
*/

public class CP419PG248 {
	public static void main(String[] args) throws IOException {
		String name = JOptionPane.showInputDialog("my name:");
		
		String fileName = JOptionPane.showInputDialog("enter the file name:");
		
		// open & write data to outputFile
		PrintWriter outputFile = new PrintWriter(fileName);
		outputFile.println(name);
		
		// read data from inputFile
		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);
		
		// close the file
		inputFile.close();
		outputFile.close();
		System.exit(0);
	}
}

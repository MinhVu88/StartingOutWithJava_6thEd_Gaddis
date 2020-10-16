package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

// This program demonstrates how a FileNotFoundException exception can be handled

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class OpenFile {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog("enter the file name:");
		
		try {
			File file = new File(fileName);
			
			Scanner inputFile = new Scanner(file);
			
			JOptionPane.showMessageDialog(null, fileName + " has been created");
			
			inputFile.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, fileName + " hasn't been created yet");
		}
		
		JOptionPane.showMessageDialog(null, "done");
		
		System.exit(0);
	}

}

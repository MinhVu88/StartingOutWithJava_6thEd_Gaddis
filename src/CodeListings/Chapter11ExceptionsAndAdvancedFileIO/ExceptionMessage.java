package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExceptionMessage {

	public static void main(String[] args) {
		String fileName = JOptionPane.showInputDialog("enter the file name:");
		
		try {
			File file = new File(fileName);
			
			Scanner inputFile = new Scanner(file);
			
			JOptionPane.showMessageDialog(null, fileName + " has been created");
			
			inputFile.close();
		} catch (FileNotFoundException e) {
			/*
			 * Each exception object has a method named getMessage that can be used to retrieve the default error message for the exception 
			 * 
			 * This is the same message that is displayed when the exception is not handled and the application halts
			 * */
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		JOptionPane.showMessageDialog(null, "done");
		
		System.exit(0);
	}

}

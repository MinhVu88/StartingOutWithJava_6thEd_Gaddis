package code_listings.ch_11_exceptions_and_advanced_fileio;

/*
- If you pass the name of an existing file to the FileOutputStream constructor, it will be erased & a new empty file with the same name will be created 

- Sometimes, however, you want to preserve an existing file and append new data to its current contents 

- The FileOutputStream constructor takes an optional 2nd argument, which must be a boolean value 

- If the argument is true, the file will not be erased if it already exists & new data will be written to the end of the file 

- If the argument is false, the file will be erased if it already exists 

- For example, the following code opens the file MyInfo.dat for output 

- If the file exists, it will not be deleted & any data written to the file will be appended to the existing data

FileOutputStream fstream = new FileOutputStream("MyInfo.dat", true);

DataOutputStream outputFile = new DataOutputStream(fstream);
*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class AppendingData {

	public static void main(String[] args) throws IOException {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		DataOutputStream outputFile = new DataOutputStream(new FileOutputStream(file, true));
		
		outputFile.writeUTF("Adam Jones");
		
		outputFile.writeUTF("Danny Carey");
		
		outputFile.writeUTF("Justin Chancellor");
		
		outputFile.writeUTF("Paul D'amour");
		
		outputFile.close();
		
		System.out.println("\n\tdone");
		
		DataInputStream inputFile = new DataInputStream(new FileInputStream(file));
		
		boolean fileBottom = false;
		
		while(!fileBottom) {
			try {
				String n = inputFile.readUTF();
				
				System.out.println("\n" + n);
			} catch (EOFException e) {
				fileBottom = true;
			}
		}
		
		inputFile.close();
		
		kbi.close();
		
		System.out.println("\n\tdone");
	}

}

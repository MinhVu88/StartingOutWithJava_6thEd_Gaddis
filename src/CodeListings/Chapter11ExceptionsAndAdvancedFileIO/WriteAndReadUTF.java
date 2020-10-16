package CodeListings.Chapter11ExceptionsAndAdvancedFileIO;

/*
- To write a string to a binary file you should use the DataOutputStream class’s writeUTF method 

- This method writes its String argument in a format known as UTF-8 encoding

- Here’s how the encoding works: Just before writing the string, this method writes a 2-byte integer indicating the number of bytes that the string occupies 

- Then it writes the string’s characters in Unicode (UTF stands for Unicode Text Format)

- When the DataInputStream class’s readUTF method reads from the file, it expects the 1st 2 bytes to contain the number of bytes that the string occupies 

- Then it reads that many bytes & returns them as a String
*/

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndReadUTF {

	public static void main(String[] args) throws IOException {
		String name = "Maynard James Keenan";
		
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nenter the file name: ");
		
		String fileName = kbi.nextLine();
		
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println("\n" + fileName + " has been created");
		}else {
			System.out.println("\n" + fileName + " hasn't been created");
		}
		
		//write a string to a binary file
		DataOutputStream outputFile = new DataOutputStream(new FileOutputStream(file));
		
		outputFile.writeUTF(name);
		
		outputFile.close();
		
		System.out.println("\n\tdone");
		
		// read a string from a binary file
		DataInputStream inputFile = new DataInputStream(new FileInputStream(file));
		
		boolean fileBottom = false;
		
		while(!fileBottom) {
			try {
				// the readUTF method will correctly read a string only when the string is written with the writeUTF method
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
